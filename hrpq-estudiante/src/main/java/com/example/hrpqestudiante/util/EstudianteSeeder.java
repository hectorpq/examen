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
        // Eliminar todos los estudiantes (opcional)
        // estudianteRepository.deleteAll();

        if (estudianteRepository.count() == 0) { // Verifica si la tabla está vacía
            // Crear 10 objetos de estudiantes con el constructor adecuado
            Estudiante e1 = new Estudiante();
            e1.setNombres("Carlos");
            e1.setApellidos("Pérez García");
            e1.setDni("12345678");
            e1.setCorreo("carlos.perez@example.com");
            e1.setTelefono("987654321");
            e1.setDireccion("Av. Los Héroes 123");

            Estudiante e2 = new Estudiante();
            e2.setNombres("Luis");
            e2.setApellidos("Ramírez Soto");
            e2.setDni("87654321");
            e2.setCorreo("luis.ramirez@example.com");
            e2.setTelefono("912345678");
            e2.setDireccion("Jr. Amazonas 456");

            Estudiante e3 = new Estudiante();
            e3.setNombres("Jorge");
            e3.setApellidos("Quispe Huamán");
            e3.setDni("11223344");
            e3.setCorreo("jorge.quispe@example.com");
            e3.setTelefono("934567890");
            e3.setDireccion("Av. El Sol 789");

            Estudiante e4 = new Estudiante();
            e4.setNombres("Andrés");
            e4.setApellidos("Valdivia Torres");
            e4.setDni("99887766");
            e4.setCorreo("andres.valdivia@example.com");
            e4.setTelefono("965432189");
            e4.setDireccion("Calle Lima 321");

            Estudiante e5 = new Estudiante();
            e5.setNombres("Martín");
            e5.setApellidos("Gómez Lazo");
            e5.setDni("44556677");
            e5.setCorreo("martin.gomez@example.com");
            e5.setTelefono("923456781");
            e5.setDireccion("Pasaje Arequipa 654");

            Estudiante e6 = new Estudiante();
            e6.setNombres("Renato");
            e6.setApellidos("Suárez Castañeda");
            e6.setDni("55667788");
            e6.setCorreo("renato.suarez@example.com");
            e6.setTelefono("954321789");
            e6.setDireccion("Jirón Tacna 159");

            Estudiante e7 = new Estudiante();
            e7.setNombres("Fernando");
            e7.setApellidos("Lozano Díaz");
            e7.setDni("77889900");
            e7.setCorreo("fernando.lozano@example.com");
            e7.setTelefono("987123456");
            e7.setDireccion("Av. Grau 200");

            Estudiante e8 = new Estudiante();
            e8.setNombres("Ricardo");
            e8.setApellidos("Morales Pinto");
            e8.setDni("88990011");
            e8.setCorreo("ricardo.morales@example.com");
            e8.setTelefono("943216789");
            e8.setDireccion("Calle Ayacucho 108");

            Estudiante e9 = new Estudiante();
            e9.setNombres("Iván");
            e9.setApellidos("Palacios Ruiz");
            e9.setDni("99001122");
            e9.setCorreo("ivan.palacios@example.com");
            e9.setTelefono("987654312");
            e9.setDireccion("Urbanización La Paz 777");

            Estudiante e10 = new Estudiante();
            e10.setNombres("Oscar");
            e10.setApellidos("Vásquez Ríos");
            e10.setDni("10101010");
            e10.setCorreo("oscar.vasquez@example.com");
            e10.setTelefono("951753468");
            e10.setDireccion("Av. Universitaria 999");

            // Guardar en la base de datos
            estudianteRepository.save(e1);
            estudianteRepository.save(e2);
            estudianteRepository.save(e3);
            estudianteRepository.save(e4);
            estudianteRepository.save(e5);
            estudianteRepository.save(e6);
            estudianteRepository.save(e7);
            estudianteRepository.save(e8);
            estudianteRepository.save(e9);
            estudianteRepository.save(e10);

            System.out.println("Datos de estudiantes insertados correctamente.");
        } else {
            System.out.println("Los estudiantes ya existen, no se insertaron datos.");
        }
    }
}
