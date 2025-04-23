package com.example.hrpqmatriculaservice.service.impl;

import com.example.hrpqmatriculaservice.DTO.*;
import com.example.hrpqmatriculaservice.client.CursoClient;
import com.example.hrpqmatriculaservice.client.EstudianteClient;
import com.example.hrpqmatriculaservice.entity.Matricula;
import com.example.hrpqmatriculaservice.repository.MatriculaRepository;
import com.example.hrpqmatriculaservice.service.MatriculaService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    private final MatriculaRepository matriculaRepository;
    private final EstudianteClient estudianteClient;
    private final CursoClient cursoClient;

    public MatriculaServiceImpl(MatriculaRepository repo, EstudianteClient ec, CursoClient cc) {
        this.matriculaRepository = repo;
        this.estudianteClient = ec;
        this.cursoClient = cc;
    }

    @Override
    public List<MatriculaDetalleDTO> obtenerTodasLasMatriculas() {
        return matriculaRepository.findAll().stream().map(m -> {
            EstudianteDTO est = estudianteClient.obtenerPorId(m.getEstudianteId());
            CursoDTO cur = cursoClient.obtenerPorId(m.getCursoId());
            return new MatriculaDetalleDTO(m.getId(), est.getNombres(), cur.getNombre(), m.getCiclo(), m.getFechaMatricula());
        }).collect(Collectors.toList());
    }

    @Override
    public MatriculaDetalleDTO matricularEstudiante(Long estudianteId, Long cursoId, String ciclo) {
        EstudianteDTO estudiante = estudianteClient.obtenerPorId(estudianteId);
        if (!estudiante.isActivo()) throw new RuntimeException("Estudiante inactivo");

        CursoDTO curso = cursoClient.obtenerPorId(cursoId);
        if (curso.getCapacidad() <= 0) throw new RuntimeException("Curso sin capacidad");

        Matricula matricula = new Matricula(estudianteId, cursoId, ciclo, LocalDateTime.now());
        Matricula guardada = matriculaRepository.save(matricula);

        return new MatriculaDetalleDTO(guardada.getId(), estudiante.getNombres(), curso.getNombre(), guardada.getCiclo(), guardada.getFechaMatricula());
    }
}
