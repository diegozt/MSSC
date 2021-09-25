package com.dazt.gatewaymssc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class GatewayMsscApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMsscApplication.class, args);
    }

//    @Bean
//    public RouteLocator gateway(RouteLocatorBuilder rlb) {
//        return
//            rlb.routes()
//                .route(route ->
//                    route.path("/USER-MSSC")
//                    .uri("lb://USER-MSSC"))
//                .route(route ->
//                    route.path("/DEPARTMENT-MSSC")
//                            .uri("lb://DEPARTMENT-MSSC"))
//                .build();
//
//    }
}
