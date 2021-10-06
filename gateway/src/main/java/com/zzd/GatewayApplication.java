package com.zzd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);

    }

    @Bean
    public ThreadLocal<ServerWebExchange> serverWebExchangeThreadLocal(){
        return new ThreadLocal<ServerWebExchange>();
    }
}
