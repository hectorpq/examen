package com.example.hrpqmatriculaservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hrpq-estudiante-service")
public interface EstudianteClient {

    @GetMapping("/estudiantes/{id}/activo")
    boolean validarEstudianteActivo(@PathVariable("id") Long estudianteId);
}
