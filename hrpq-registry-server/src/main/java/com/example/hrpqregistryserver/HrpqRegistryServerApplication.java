package com.example.hrpqregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HrpqRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrpqRegistryServerApplication.class, args);
    }

}
