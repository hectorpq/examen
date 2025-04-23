package com.example.hrpqmatriculaservice.service.impl;

import com.example.hrpqmatriculaservice.client.CursoClient;
import com.example.hrpqmatriculaservice.client.EstudianteClient;
import com.example.hrpqmatriculaservice.entity.Matricula;
import com.example.hrpqmatriculaservice.repository.MatriculaRepository;
import com.example.hrpqmatriculaservice.service.MatriculaService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

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
        boolean estaActivo = estudianteClient.estaActivo(estudianteId);
        if (!estaActivo) {
            throw new RuntimeException("El estudiante no está activo.");
        }

        int capacidadDisponible = cursoClient.obtenerCapacidadDisponible(cursoId);
        if (capacidadDisponible <= 0) {
            throw new RuntimeException("El curso no tiene capacidad disponible.");
        }

        Matricula matricula = new Matricula();
        matricula.setEstudianteId(estudianteId);
        matricula.setCursoId(cursoId);
        matricula.setCiclo(ciclo);
        matricula.setFechaMatricula(LocalDateTime.now());

        return matriculaRepository.save(matricula);
    }

    @Override
    public List<Matricula> obtenerTodasLasMatriculas() {
        return matriculaRepository.findAll();
    }
}
