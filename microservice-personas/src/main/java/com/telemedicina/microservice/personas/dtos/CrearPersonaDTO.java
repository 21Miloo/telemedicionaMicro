package com.telemedicina.microservice.personas.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Clase que representa el objeto de transferencia de datos para la 'CREACION' de una persona. (Es exclusivamene para la creación de una persona ya que no contiene el id

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CrearPersonaDTO {

    private String nombre;
    private String apellido;
    private String correo;


}
