package com.telemedicina.microservice.personas.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Este DTO es el que se va a usar para hacer las operaciones de CRUD, menos 'CREAR'.

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDTO {

        private Long id;
        private String nombre;
        private String apellido;
        private String correo;

}
