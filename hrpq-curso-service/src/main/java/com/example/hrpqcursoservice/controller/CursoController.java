package com.example.hrpqcursoservice.controller;

import com.example.hrpqcursoservice.entity.Curso;
import com.example.hrpqcursoservice.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Obtener todos los cursos
    @GetMapping
    public List<Curso> getAllCursos() {
        return cursoService.findAll();
    }

    // Obtener un curso por ID
    @GetMapping("/{id}")
    public ResponseEntity<Curso> getCursoById(@PathVariable("id") Long id) {
        Optional<Curso> curso = cursoService.findById(id);
        if (curso.isPresent()) {
            return ResponseEntity.ok(curso.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Crear un nuevo curso
    @PostMapping
    public ResponseEntity<Curso> createCurso(@RequestBody Curso curso) {
        Curso newCurso = cursoService.save(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCurso);
    }

    // Actualizar un curso existente
    @PutMapping("/{id}")
    public ResponseEntity<Curso> updateCurso(@PathVariable("id") Long id, @RequestBody Curso curso) {
        Curso updatedCurso = cursoService.update(id, curso);
        if (updatedCurso != null) {
            return ResponseEntity.ok(updatedCurso);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Eliminar un curso por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurso(@PathVariable("id") Long id) {
        if (cursoService.findById(id).isPresent()) {
            cursoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
