package com.BackEnd.BackEndPrueba.service;

import com.BackEnd.BackEndPrueba.model.Persona;
import com.BackEnd.BackEndPrueba.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {

    Usuario newUsuario(Usuario newUsuario);
    Iterable<Usuario> getAll();

    Usuario modifyUsuario(Usuario usuario);
    Boolean deleteUsuario(Integer idUsuario);



}
