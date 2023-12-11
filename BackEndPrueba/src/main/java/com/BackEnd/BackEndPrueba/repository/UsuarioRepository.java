package com.BackEnd.BackEndPrueba.repository;

import com.BackEnd.BackEndPrueba.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
