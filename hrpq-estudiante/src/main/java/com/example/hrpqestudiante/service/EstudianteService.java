package com.example.hrpqestudiante.service;

import com.example.hrpqestudiante.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {

    List<Estudiante> obtenerTodos();

    Optional<Estudiante> obtenerPorId(Long id);

    Estudiante registrar(Estudiante estudiante);

    Estudiante actualizar(Long id, Estudiante estudiante);

    void eliminar(Long id);
}
