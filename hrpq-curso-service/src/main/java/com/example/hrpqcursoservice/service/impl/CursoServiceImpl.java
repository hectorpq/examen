package com.example.hrpqcursoservice.service.impl;

import com.example.hrpqcursoservice.entity.Curso;
import com.example.hrpqcursoservice.repository.CursoRepository;
import com.example.hrpqcursoservice.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    @Autowired
    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> findById(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso update(Long id, Curso curso) {
        if (cursoRepository.existsById(id)) {
            curso.setId(id);
            return cursoRepository.save(curso);
        }
        return null; // Si no existe, retornamos null
    }

    @Override
    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }
}
