package com.example.hrpqmatriculaservice.repository;

import com.example.hrpqmatriculaservice.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    boolean existsByEstudianteIdAndCursoId(Long estudianteId, Long cursoId);
}
