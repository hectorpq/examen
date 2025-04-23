package com.example.hrpqcursoservice.repository;

import com.example.hrpqcursoservice.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

    // Aquí puedes agregar consultas personalizadas si las necesitas en el futuro
}
