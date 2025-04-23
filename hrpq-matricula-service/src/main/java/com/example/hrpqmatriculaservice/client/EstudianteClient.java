package com.example.hrpqmatriculaservice.client;

import com.example.hrpqmatriculaservice.DTO.EstudianteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hrpq-estudiante-service")
public interface EstudianteClient {
    @GetMapping("/estudiantes/{id}")
    EstudianteDTO obtenerPorId(@PathVariable Long id);
}