package com.example.hrpqmatriculaservice.controller;

import com.example.hrpqmatriculaservice.entity.Matricula;
import com.example.hrpqmatriculaservice.service.MatriculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;

    // Constructor para inyección de dependencias
    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    // Endpoint para matricular estudiante
    @PostMapping
    public ResponseEntity<Matricula> matricularEstudiante(@RequestParam Long estudianteId, @RequestParam Long cursoId, @RequestParam String ciclo) {
        Matricula matricula = matriculaService.matricularEstudiante(estudianteId, cursoId, ciclo);
        return ResponseEntity.ok(matricula);
    }

    // Endpoint para obtener todas las matrículas
    @GetMapping
    public ResponseEntity<List<Matricula>> obtenerMatriculas() {
        List<Matricula> matriculas = matriculaService.obtenerTodasLasMatriculas();
        return ResponseEntity.ok(matriculas);
    }
}

