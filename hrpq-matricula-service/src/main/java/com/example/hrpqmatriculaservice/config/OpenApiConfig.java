package com.example.hrpqmatriculaservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title("Servicio de Matrícula")
                        .version("1.0")
                        .description("API para gestionar la matrícula de estudiantes a cursos"));
    }
}
