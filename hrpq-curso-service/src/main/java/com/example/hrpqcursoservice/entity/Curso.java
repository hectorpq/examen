package com.example.hrpqcursoservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String horario;

    @Column(nullable = false)
    private int capacidad;

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(nullable = false)
    private String ciclo;

    // Constructores
    public Curso() {}

    public Curso(Long id, String nombre, String descripcion, String horario, int capacidad, String codigo, String ciclo) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horario = horario;
        this.capacidad = capacidad;
        this.codigo = codigo;
        this.ciclo = ciclo;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", horario='" + horario + '\'' +
                ", capacidad=" + capacidad +
                ", codigo='" + codigo + '\'' +
                ", ciclo='" + ciclo + '\'' +
                '}';
    }
}
