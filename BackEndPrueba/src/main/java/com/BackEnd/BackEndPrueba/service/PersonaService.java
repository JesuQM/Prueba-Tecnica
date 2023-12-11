package com.BackEnd.BackEndPrueba.service;

import org.springframework.stereotype.Service;

import com.BackEnd.BackEndPrueba.model.Persona;

@Service
public interface PersonaService {

    Persona newPersona(Persona newPersona);
    Iterable<Persona> getAll();
    Persona modifyPersona (Persona persona);
    Boolean deletePersona(Long idPersona);



}
