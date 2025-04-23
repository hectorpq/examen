package com.example.hrpqmatriculaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrpqMatriculaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrpqMatriculaServiceApplication.class, args);
	}

}
