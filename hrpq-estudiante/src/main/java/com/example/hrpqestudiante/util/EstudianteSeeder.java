package com.example.hrpqestudiante.util;

import com.example.hrpqestudiante.entity.Estudiante;
import com.example.hrpqestudiante.repository.EstudianteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudianteSeeder implements CommandLineRunner {

    private final EstudianteRepository estudianteRepository;

    public EstudianteSeeder(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public void run(String... args) {
        insertarSiNoExiste("12345678", "Carlos", "Pérez García", "carlos.perez@example.com", "987654321", "Av. Los Héroes 123", "Ingeniería de Sistemas", "activo", 3);
        insertarSiNoExiste("87654321", "Luis", "Ramírez Soto", "luis.ramirez@example.com", "912345678", "Jr. Amazonas 456", "Derecho", "activo", 4);
        insertarSiNoExiste("11223344", "Jorge", "Quispe Huamán", "jorge.quispe@example.com", "934567890", "Av. El Sol 789", "Administración de Empresas", "activo", 2);
        insertarSiNoExiste("99887766", "Andrés", "Valdivia Torres", "andres.valdivia@example.com", "965432189", "Calle Lima 321", "Arquitectura", "inactivo", 5);
        insertarSiNoExiste("44556677", "Martín", "Gómez Lazo", "martin.gomez@example.com", "923456781", "Pasaje Arequipa 654", "Medicina", "activo", 1);
        insertarSiNoExiste("55667788", "Renato", "Suárez Castañeda", "renato.suarez@example.com", "954321789", "Jirón Tacna 159", "Ingeniería Electrónica", "activo", 3);
        insertarSiNoExiste("77889900", "Fernando", "Lozano Díaz", "fernando.lozano@example.com", "987123456", "Av. Grau 200", "Contabilidad", "activo", 4);
        insertarSiNoExiste("88990011", "Ricardo", "Morales Pinto", "ricardo.morales@example.com", "943216789", "Calle Ayacucho 108", "Marketing", "activo", 2);
        insertarSiNoExiste("99001122", "Iván", "Palacios Ruiz", "ivan.palacios@example.com", "987654312", "Urbanización La Paz 777", "Ingeniería Civil", "inactivo", 6);
        insertarSiNoExiste("10101010", "Oscar", "Vásquez Ríos", "oscar.vasquez@example.com", "951753468", "Av. Universitaria 999", "Psicología", "activo", 1);
    }

    private void insertarSiNoExiste(String dni, String nombres, String apellidos, String correo, String telefono, String direccion, String carrera, String estado, int cicloActual) {
        if (estudianteRepository.findByDni(dni) == null) {
            Estudiante e = new Estudiante();
            e.setDni(dni);
            e.setNombres(nombres);
            e.setApellidos(apellidos);
            e.setCorreo(correo);
            e.setTelefono(telefono);
            e.setDireccion(direccion);
            e.setCarrera(carrera);
            e.setEstado(estado);
            e.setCicloActual(cicloActual);
            estudianteRepository.save(e);
            System.out.println("Insertado: " + nombres + " " + apellidos);
        } else {
            System.out.println("Ya existe: " + nombres + " " + apellidos);
        }
    }
}


