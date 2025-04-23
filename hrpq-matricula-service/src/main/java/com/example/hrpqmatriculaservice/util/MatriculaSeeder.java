package com.example.hrpqmatriculaservice.util;

import com.example.hrpqmatriculaservice.entity.Matricula;
import com.example.hrpqmatriculaservice.repository.MatriculaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MatriculaSeeder {

    private final MatriculaRepository matriculaRepository;

    public MatriculaSeeder(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    @PostConstruct
    public void seed() {
        // Verifica si ya hay registros en la base de datos antes de insertar
        if (matriculaRepository.count() == 0) {
            insertarMatricula(12L, 1L, "2024-I");
            insertarMatricula(13L, 2L, "2024-I");
            insertarMatricula(14L, 3L, "2024-I");
            insertarMatricula(16L, 4L, "2024-II");
            insertarMatricula(17L, 5L, "2024-II");
        }
    }

    private void insertarMatricula(Long estudianteId, Long cursoId, String ciclo) {
        // Verificar si la matrícula ya existe
        if (matriculaRepository.existsByEstudianteIdAndCursoId(estudianteId, cursoId)) {
            System.out.println("Estudiante con ID " + estudianteId + " ya está matriculado en el curso con ID " + cursoId);
        } else {
            Matricula nuevaMatricula = new Matricula(estudianteId, cursoId, ciclo, LocalDateTime.now());
            matriculaRepository.save(nuevaMatricula);
            System.out.println("Matrícula insertada para el estudiante con ID " + estudianteId + " en el curso con ID " + cursoId);
        }
    }
}
