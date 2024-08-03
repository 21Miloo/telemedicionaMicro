package com.telemedicina.microservice.personas.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*      CREATE TABLE personas(
        id SERIAL PRIMARY KEY,
        nombre VARCHAR(100) NOT NULL,
        apellido VARCHAR(100) NOT NULL,
        correo VARCHAR(100) NOT NULL UNIQUE
        );

   */
@Data // <-- Anotación de Lombok para generar automáticamente los getters y setters.
@Entity
@Builder
@NoArgsConstructor // <-- Anotación de Lombok para generar automáticamente un constructor sin argumentos.
@AllArgsConstructor // <-- Anotación de Lombok para generar automáticamente un constructor con todos los argumentos.
@Table(name = "personas") // <-- Nombre de la tabla en la base de datos.

public class Persona {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nombre;
private String apellido;
@Column(unique = true)
private String correo;
















}
