package com.example.hrpqmatriculaservice.repository;

import com.example.hrpqmatriculaservice.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
    // Aquí puedes añadir métodos personalizados si es necesario
}
