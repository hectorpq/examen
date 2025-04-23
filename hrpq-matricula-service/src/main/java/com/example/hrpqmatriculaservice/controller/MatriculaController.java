package com.example.hrpqmatriculaservice.controller;

import com.example.hrpqmatriculaservice.entity.Matricula;
import com.example.hrpqmatriculaservice.service.MatriculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @PostMapping
    public ResponseEntity<Matricula> matricularEstudiante(@RequestParam Long estudianteId, @RequestParam Long cursoId, @RequestParam String ciclo) {
        Matricula matricula = matriculaService.matricularEstudiante(estudianteId, cursoId, ciclo);
        return ResponseEntity.ok(matricula);
    }
}
