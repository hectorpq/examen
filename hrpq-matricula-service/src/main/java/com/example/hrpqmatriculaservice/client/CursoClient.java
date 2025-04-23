package com.example.hrpqmatriculaservice.client;

import com.example.hrpqmatriculaservice.DTO.CursoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hrpq-curso-service")
public interface CursoClient {
    @GetMapping("/cursos/{id}")
    CursoDTO obtenerPorId(@PathVariable Long id);
}