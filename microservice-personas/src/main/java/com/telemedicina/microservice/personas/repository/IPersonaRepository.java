package com.telemedicina.microservice.personas.repository;

import com.telemedicina.microservice.personas.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;



// Esta interfaz extiende de JpaRepository, que es una interfaz de Spring Data JPA que nos permite hacer operaciones CRUD

public interface IPersonaRepository extends JpaRepository <Persona, Long>{

    Optional<Persona> findByCorreo(String correo);

}
// Esta interfaz tendra un metodo que nos permitira buscar una persona por su correo. Extiende de JPA porque no