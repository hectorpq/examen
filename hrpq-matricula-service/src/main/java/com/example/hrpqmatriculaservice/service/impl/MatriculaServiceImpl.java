package com.example.hrpqmatriculaservice.service.impl;

import com.example.hrpqmatriculaservice.client.CursoClient;
import com.example.hrpqmatriculaservice.entity.Matricula;
import com.example.hrpqmatriculaservice.repository.MatriculaRepository;
import com.example.hrpqmatriculaservice.service.MatriculaService;
import com.example.hrpqmatriculaservice.client.EstudianteClient;
import org.springframework.stereotype.Service;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    private final MatriculaRepository matriculaRepository;
    private final EstudianteClient estudianteClient;
    private final CursoClient cursoClient;

    public MatriculaServiceImpl(MatriculaRepository matriculaRepository, EstudianteClient estudianteClient, CursoClient cursoClient) {
        this.matriculaRepository = matriculaRepository;
        this.estudianteClient = estudianteClient;
        this.cursoClient = cursoClient;
    }

    @Override
    public Matricula matricularEstudiante(Long estudianteId, Long cursoId, String ciclo) {
        // Verificar que el estudiante está activo
        if (!estudianteClient.validarEstudianteActivo(estudianteId)) {
            throw new RuntimeException("El estudiante no está activo.");
        }

        // Verificar la capacidad del curso
        if (!cursoClient.verificarCapacidadCurso(cursoId)) {
            throw new RuntimeException("El curso no tiene capacidad suficiente.");
        }

        // Registrar la matrícula
        Matricula matricula = new Matricula(null, estudianteId, cursoId, ciclo, null);
        return matriculaRepository.save(matricula);
    }
}
