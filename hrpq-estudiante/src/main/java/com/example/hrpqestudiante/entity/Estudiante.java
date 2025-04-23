package com.example.hrpqestudiante.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false, unique = true)
    private String dni;

    @Column(nullable = false)
    private String correo;

    @Column
    private String telefono;

    @Column
    private String direccion;

    @Column(nullable = false)
    private String carrera;  // Nueva propiedad

    @Column(nullable = false)
    private String estado;   // Nueva propiedad (activo, inactivo, etc.)

    @Column(name = "ciclo_actual", nullable = false)
    private Integer cicloActual;  // Nueva propiedad

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCicloActual() {
        return cicloActual;
    }

    public void setCicloActual(Integer cicloActual) {
        this.cicloActual = cicloActual;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombres + '\'' +
                ", apellido='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", carrera='" + carrera + '\'' +
                ", estado='" + estado + '\'' +
                ", cicloActual=" + cicloActual +
                '}';
    }
}
