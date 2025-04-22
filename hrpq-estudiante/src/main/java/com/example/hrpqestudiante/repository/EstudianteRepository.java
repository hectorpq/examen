package com.example.hrpqestudiante.repository;

import com.example.hrpqestudiante.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    // Puedes agregar métodos personalizados si lo necesitas, por ejemplo:
    Estudiante findByDni(String dni);
}
