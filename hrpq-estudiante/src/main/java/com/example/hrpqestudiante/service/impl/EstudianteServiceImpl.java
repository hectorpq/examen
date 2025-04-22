package com.example.hrpqestudiante.service.impl;

import com.example.hrpqestudiante.entity.Estudiante;
import com.example.hrpqestudiante.repository.EstudianteRepository;
import com.example.hrpqestudiante.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> obtenerPorId(Long id) {
        return estudianteRepository.findById(id);
    }

    @Override
    public Estudiante registrar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante actualizar(Long id, Estudiante estudiante) {
        Optional<Estudiante> existente = estudianteRepository.findById(id);
        if (existente.isPresent()) {
            Estudiante actualizado = existente.get();
            actualizado.setNombres(estudiante.getNombres());
            actualizado.setApellidos(estudiante.getApellidos());
            actualizado.setDni(estudiante.getDni());
            actualizado.setCorreo(estudiante.getCorreo());
            actualizado.setTelefono(estudiante.getTelefono());
            actualizado.setDireccion(estudiante.getDireccion());
            return estudianteRepository.save(actualizado);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }
}
