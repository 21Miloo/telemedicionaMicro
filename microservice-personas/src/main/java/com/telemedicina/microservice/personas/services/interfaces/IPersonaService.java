package com.telemedicina.microservice.personas.services.interfaces;
import java.util.List;

import com.telemedicina.microservice.personas.dtos.CrearPersonaDTO;
import com.telemedicina.microservice.personas.dtos.PersonaDTO;


public interface IPersonaService {

    List<PersonaDTO> findAll();

    PersonaDTO findById(Long id);

    PersonaDTO save(CrearPersonaDTO personaDTO);

    PersonaDTO update(PersonaDTO personaDTO);

    boolean delete(Long id);



}
