package com.BackEnd.BackEndPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.BackEnd.BackEndPrueba.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

    
}