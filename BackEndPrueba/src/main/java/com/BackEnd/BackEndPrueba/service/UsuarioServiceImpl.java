package com.BackEnd.BackEndPrueba.service;

import com.BackEnd.BackEndPrueba.controller.UsuarioController;
import com.BackEnd.BackEndPrueba.model.Persona;
import com.BackEnd.BackEndPrueba.model.Usuario;
import com.BackEnd.BackEndPrueba.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }


    public Usuario newUsuario(Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }
    public Iterable<Usuario> getAll(){
        return this.usuarioRepository.findAll();
    }

    public Usuario modifyUsuario(Usuario usuario) {
        Optional<Usuario> usuarioEncotrado = this.usuarioRepository.findById(usuario.getIdUsuario());
        if(usuarioEncotrado != null) {
            usuarioEncotrado.get().setIdUsuario(usuario.getIdUsuario());
            usuarioEncotrado.get().setNombreUsuario(usuario.getNombreUsuario());
            usuarioEncotrado.get().setApellidoUsuario(usuario.getApellidoUsuario());
            usuarioEncotrado.get().setUsuarioName(usuario.getUsuarioName());
            usuarioEncotrado.get().setPassword(usuario.getPassword());
            return this.newUsuario(usuarioEncotrado.get());
        }

        return null;
    }

    public Boolean deleteUsuario(Integer idUsuario) {
        this.usuarioRepository.deleteById(idUsuario);
        return true;
    }
}
