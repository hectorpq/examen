package com.example.hrpqmatriculaservice.controller;

import com.example.hrpqmatriculaservice.DTO.MatriculaDetalleDTO;
import com.example.hrpqmatriculaservice.service.MatriculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;

    public MatriculaController(MatriculaService service) {
        this.matriculaService = service;
    }

    @GetMapping
    public ResponseEntity<List<MatriculaDetalleDTO>> listar() {
        return ResponseEntity.ok(matriculaService.obtenerTodasLasMatriculas());
    }

    @PostMapping
    public ResponseEntity<MatriculaDetalleDTO> registrar(@RequestParam Long estudianteId,
                                                         @RequestParam Long cursoId,
                                                         @RequestParam String ciclo) {
        return ResponseEntity.ok(matriculaService.matricularEstudiante(estudianteId, cursoId, ciclo));
    }
}
