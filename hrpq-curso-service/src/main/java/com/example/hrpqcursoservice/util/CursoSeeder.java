package com.example.hrpqcursoservice.util;

import com.example.hrpqcursoservice.entity.Curso;
import com.example.hrpqcursoservice.repository.CursoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CursoSeeder implements CommandLineRunner {

    private final CursoRepository cursoRepository;

    public CursoSeeder(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public void run(String... args) {
        if (cursoRepository.count() == 0) {
            Curso c1 = new Curso(null, "Matemática Básica", "Curso introductorio de matemáticas", "Lun-Mie 08:00-10:00", 30, "MAT101", "I");
            Curso c2 = new Curso(null, "Programación I", "Introducción a la programación en Java", "Mar-Jue 10:00-12:00", 25, "PRO101", "I");
            Curso c3 = new Curso(null, "Comunicación", "Técnicas de comunicación efectiva", "Vie 08:00-11:00", 40, "COM101", "I");
            Curso c4 = new Curso(null, "Física General", "Principios fundamentales de la física", "Lun-Mie 14:00-16:00", 35, "FIS101", "II");
            Curso c5 = new Curso(null, "Programación II", "Estructuras de datos y algoritmos", "Mar-Jue 12:00-14:00", 25, "PRO102", "II");
            Curso c6 = new Curso(null, "Cálculo I", "Funciones, límites y derivadas", "Lun-Mie 10:00-12:00", 30, "MAT102", "II");
            Curso c7 = new Curso(null, "Base de Datos I", "Modelo relacional y SQL", "Mar-Jue 14:00-16:00", 30, "BD101", "III");
            Curso c8 = new Curso(null, "Sistemas Operativos", "Conceptos y diseño de SO", "Vie 13:00-16:00", 20, "SO101", "III");
            Curso c9 = new Curso(null, "Redes de Computadoras", "Fundamentos de redes y protocolos", "Lun-Mie 16:00-18:00", 25, "NET101", "IV");
            Curso c10 = new Curso(null, "Ingeniería de Software", "Ciclo de vida del software y UML", "Mar-Jue 08:00-10:00", 25, "ISW101", "IV");

            cursoRepository.save(c1);
            cursoRepository.save(c2);
            cursoRepository.save(c3);
            cursoRepository.save(c4);
            cursoRepository.save(c5);
            cursoRepository.save(c6);
            cursoRepository.save(c7);
            cursoRepository.save(c8);
            cursoRepository.save(c9);
            cursoRepository.save(c10);

            System.out.println("Cursos insertados correctamente.");
        } else {
            System.out.println("Los cursos ya existen, no se insertaron datos.");
        }
    }
}
