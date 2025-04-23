package com.example.hrpqmatriculaservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "hrpq-curso-service")
public interface CursoClient {

    @GetMapping("/cursos/{id}/capacidad-disponible")
    int obtenerCapacidadDisponible(@PathVariable("id") Long id);
}
