package com.dazt.serviceregistrymssc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryMsscApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryMsscApplication.class, args);
    }

}
