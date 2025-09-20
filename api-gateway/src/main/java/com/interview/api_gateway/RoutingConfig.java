package com.interview.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("panel-api", r -> r.path("/panel/**")
                        .uri("lb://PANEL-API"))
                .route("candidate-api", r -> r.path("/candidate/**")
                        .uri("lb://CANDIDATE-API"))
                .build();
    }
}
