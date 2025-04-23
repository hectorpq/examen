package com.example.hrpqmatriculaservice.service;

import com.example.hrpqmatriculaservice.DTO.MatriculaDetalleDTO;
import java.util.List;

public interface MatriculaService {
    List<MatriculaDetalleDTO> obtenerTodasLasMatriculas();
    MatriculaDetalleDTO matricularEstudiante(Long estudianteId, Long cursoId, String ciclo);
}
