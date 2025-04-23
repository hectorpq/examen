package com.example.hrpqmatriculaservice.DTO;

import java.time.LocalDateTime;

public class MatriculaDetalleDTO {
    private Long id;
    private String nombreEstudiante;
    private String nombreCurso;
    private String ciclo;
    private LocalDateTime fechaMatricula;

    public MatriculaDetalleDTO(Long id, String nombreEstudiante, String nombreCurso, String ciclo, LocalDateTime fechaMatricula) {
        this.id = id;
        this.nombreEstudiante = nombreEstudiante;
        this.nombreCurso = nombreCurso;
        this.ciclo = ciclo;
        this.fechaMatricula = fechaMatricula;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombreEstudiante() { return nombreEstudiante; }
    public void setNombreEstudiante(String nombreEstudiante) { this.nombreEstudiante = nombreEstudiante; }
    public String getNombreCurso() { return nombreCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }
    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
    public LocalDateTime getFechaMatricula() { return fechaMatricula; }
    public void setFechaMatricula(LocalDateTime fechaMatricula) { this.fechaMatricula = fechaMatricula; }
}
