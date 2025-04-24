package com.example.hrpqgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class HrpqGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrpqGatewayServerApplication.class, args);
    }

}
