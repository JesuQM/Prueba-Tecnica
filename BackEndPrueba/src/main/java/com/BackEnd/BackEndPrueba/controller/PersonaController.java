package com.BackEnd.BackEndPrueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.BackEnd.BackEndPrueba.model.Persona;
import com.BackEnd.BackEndPrueba.service.PersonaService;


@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class PersonaController {
    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    @PostMapping("/nuevo")
    public Persona newPerson(@RequestBody Persona newPerson){
        return this.personaService.newPersona(newPerson);
    }

    @GetMapping("/mostrar")
    public Iterable<Persona> getAll(){

        return personaService.getAll();
    }
    @PostMapping("/update")
    public Persona updatePerson(@RequestBody Persona persona){

        return this.personaService.modifyPersona(persona);
    }

    @PostMapping("/{id}")
    public boolean deletPersona (@PathVariable(value = "id") Long id){
        return this.personaService.deletePersona(id);

    }



}
