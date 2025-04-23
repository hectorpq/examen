package com.example.hrpqcursoservice.service;

import com.example.hrpqcursoservice.entity.Curso;
import java.util.List;
import java.util.Optional;

public interface CursoService {

    List<Curso> findAll();

    Optional<Curso> findById(Long id);

    Curso save(Curso curso);

    Curso update(Long id, Curso curso);

    void deleteById(Long id);
}
