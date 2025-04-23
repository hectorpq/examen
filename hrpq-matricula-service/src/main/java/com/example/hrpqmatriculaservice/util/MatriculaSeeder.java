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
        if (matriculaRepository.count() == 0) {
            Matricula m1 = new Matricula(1L, 101L, "2024-I", LocalDateTime.now());
            Matricula m2 = new Matricula(2L, 102L, "2024-I", LocalDateTime.now());
            Matricula m3 = new Matricula(3L, 103L, "2024-I", LocalDateTime.now());

            matriculaRepository.save(m1);
            matriculaRepository.save(m2);
            matriculaRepository.save(m3);
        }
    }
}
