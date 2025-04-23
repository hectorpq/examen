package com.example.hrpqmatriculaservice.util;


import com.example.hrpqmatriculaservice.entity.Matricula;
import com.example.hrpqmatriculaservice.repository.MatriculaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MatriculaSeeder implements CommandLineRunner {

    private final MatriculaRepository repository;

    public MatriculaSeeder(MatriculaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            Matricula m1 = new Matricula(null, 1L, 101L, "2025-I", LocalDateTime.now());
            Matricula m2 = new Matricula(null, 2L, 102L, "2025-I", LocalDateTime.now());
            repository.save(m1);
            repository.save(m2);
        }
    }
}
