package com.example.hrpqmatriculaservice.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long estudianteId;
    private Long cursoId;
    private String ciclo;

    private LocalDateTime fechaMatricula;

    public Matricula() {
        this.fechaMatricula = LocalDateTime.now();
    }

    public Matricula(Long id, Long estudianteId, Long cursoId, String ciclo, LocalDateTime fechaMatricula) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.cursoId = cursoId;
        this.ciclo = ciclo;
        this.fechaMatricula = fechaMatricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public LocalDateTime getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDateTime fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", estudianteId=" + estudianteId +
                ", cursoId=" + cursoId +
                ", ciclo='" + ciclo + '\'' +
                ", fechaMatricula=" + fechaMatricula +
                '}';
    }
}

