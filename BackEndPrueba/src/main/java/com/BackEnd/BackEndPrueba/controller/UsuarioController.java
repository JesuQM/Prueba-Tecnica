package com.BackEnd.BackEndPrueba.controller;

import com.BackEnd.BackEndPrueba.model.Persona;
import com.BackEnd.BackEndPrueba.model.Usuario;
import com.BackEnd.BackEndPrueba.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})

public class UsuarioController {

    private final UsuarioService usuarioService;
    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService=usuarioService;
    }

    @PostMapping("/registrar")
    public Usuario newUsuario(@RequestBody Usuario newUsuario){
        return this.usuarioService.newUsuario(newUsuario);
    }

    @GetMapping("/listaUsuarios")
    public Iterable<Usuario> getAll(){

        return usuarioService.getAll();
    }
    @PostMapping("/actualizarUsuario")
    public Usuario modifyUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.modifyUsuario(usuario);
    }

    @PostMapping("/{id}")
    public boolean deletUsuario (@PathVariable(value = "id") Integer idUsuario){
        return this.usuarioService.deleteUsuario(idUsuario);

    }




}
