package com.BackEnd.BackEndPrueba.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackEnd.BackEndPrueba.model.Persona;
import com.BackEnd.BackEndPrueba.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
    private final PersonaRepository personaRepository;
    @Autowired
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona newPersona(Persona newPersona){
        return personaRepository.save(newPersona);
    }


    public Iterable<Persona> getAll(){
        return this.personaRepository.findAll();
    }

    public Persona modifyPersona (Persona persona){

        Optional<Persona> personaEncontrada = this.personaRepository.findById(persona.getNumDocumento());
            if(personaEncontrada != null) {
                personaEncontrada.get().setTipoDocumento(persona.getTipoDocumento());
                personaEncontrada.get().setNombre(persona.getNombre());
                personaEncontrada.get().setApellido(persona.getApellido());
                personaEncontrada.get().setCorreoElectronico(persona.getCorreoElectronico());
                personaEncontrada.get().setCelular(persona.getCelular());
                return this.newPersona(personaEncontrada.get());
            }
            return null;
    }
    public Boolean deletePersona (Long idPersona){
        this.personaRepository.deleteById(idPersona);
        return true;
    }


}
