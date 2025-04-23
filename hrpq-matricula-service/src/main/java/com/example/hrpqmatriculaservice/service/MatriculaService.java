package com.example.hrpqmatriculaservice.service;

import com.example.hrpqmatriculaservice.entity.Matricula;

import java.util.List;

public interface MatriculaService {

    // Registra una nueva matrícula
    Matricula matricularEstudiante(Long estudianteId, Long cursoId, String ciclo);

    // Devuelve todas las matrículas existentes
    List<Matricula> obtenerTodasLasMatriculas();
}

