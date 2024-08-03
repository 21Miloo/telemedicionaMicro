package com.telemedicina.microservice.personas.services.imp;

import com.telemedicina.microservice.personas.dtos.CrearPersonaDTO;
import com.telemedicina.microservice.personas.dtos.PersonaDTO;
import com.telemedicina.microservice.personas.repository.IPersonaRepository;
import com.telemedicina.microservice.personas.services.interfaces.IPersonaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements IPersonaService {

    private final IPersonaRepository personaRepository;
    private ModelMapper modelMapper;

    @Autowired // Inyección de dependencias por constructor. Asegura la inmutabilidad por seguridad.
    public PersonaServiceImpl(IPersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public List<PersonaDTO> findAll() {
        return this.personaRepository.findAll().stream().map(model -> modelMapper.map(model, PersonaDTO.class)).collect(Collectors.toList());
    }

    @Override
    public PersonaDTO findById(Long id) {
        return null;
    }

    @Override
    public PersonaDTO save(CrearPersonaDTO personaDTO) {
        return null;
    }

    @Override
    public PersonaDTO update(PersonaDTO personaDTO) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
