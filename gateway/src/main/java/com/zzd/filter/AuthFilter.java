package com.zzd.filter;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 鉴权
 * @author 张振栋
 */
@Slf4j
@Data
@Component
public class AuthFilter implements GlobalFilter, Ordered {

    @Autowired
    private NacosDiscoveryProperties nacosDiscoveryProperties;

    @Autowired
    ThreadLocal<ServerWebExchange> serverWebExchangeThreadLocal;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        System.out.println(nacosDiscoveryProperties);
        log.info("AuthFilter....");
        System.out.println("AuthFilter....");

        serverWebExchangeThreadLocal.set(exchange);
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
