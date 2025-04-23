package com.example.hrpqmatriculaservice.service;

import com.example.hrpqmatriculaservice.entity.Matricula;

public interface MatriculaService {
    Matricula matricularEstudiante(Long estudianteId, Long cursoId, String ciclo);
}
