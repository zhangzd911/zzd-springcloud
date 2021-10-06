package com.zzd.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.RetryGatewayFilterFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.retry.*;

import java.util.function.Predicate;

@Slf4j
@Component
public class MyRetryGatewayFilterFactory extends RetryGatewayFilterFactory {

	public MyRetryGatewayFilterFactory() {
		super();
	}

	@Override
	public GatewayFilter apply(RetryConfig retryConfig) {
		retryConfig.validate();

		Repeat<ServerWebExchange> statusCodeRepeat = null;
		if (!retryConfig.getStatuses().isEmpty() || !retryConfig.getSeries().isEmpty()) {
			Predicate<RepeatContext<ServerWebExchange>> repeatPredicate = context -> {
				ServerWebExchange exchange = context.applicationContext();
				if (exceedsMaxIterations(exchange, retryConfig)) {
					return false;
				}

				HttpStatus statusCode = exchange.getResponse().getStatusCode();
				boolean retryableStatusCode = retryConfig.getStatuses().contains(statusCode);

				if (!retryableStatusCode && statusCode != null) {
					retryableStatusCode = retryConfig.getSeries().stream().anyMatch(series -> statusCode.series().equals(series));
				}

				HttpMethod httpMethod = exchange.getRequest().getMethod();
				boolean retryableMethod = retryConfig.getMethods().contains(httpMethod);

				return retryableMethod && retryableStatusCode;
			};

			statusCodeRepeat = Repeat.onlyIf(repeatPredicate).doOnRepeat(context -> reset(context.applicationContext()));
		}

		Retry<ServerWebExchange> exceptionRetry = null;
		if (!retryConfig.getExceptions().isEmpty()) {
			Predicate<RetryContext<ServerWebExchange>> retryContextPredicate = context -> {
				if (exceedsMaxIterations(context.applicationContext(), retryConfig)) {
					return false;
				}

				for (Class<? extends Throwable> clazz : retryConfig.getExceptions()) {
					if (clazz.isInstance(context.exception())) {
						return true;
					}
				}
				return false;
			};
			exceptionRetry = Retry.onlyIf(retryContextPredicate).doOnRetry(context -> reset(context.applicationContext())).retryMax(retryConfig.getRetries());
		}

		return apply(retryConfig.getRouteId(), statusCodeRepeat, exceptionRetry);
	}

}
