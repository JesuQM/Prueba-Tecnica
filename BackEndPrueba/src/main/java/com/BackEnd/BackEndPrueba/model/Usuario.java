package com.BackEnd.BackEndPrueba.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Usuario {
    @Id
    private  int idUsuario;

    @Column
    private String nombreUsuario;

    @Column
    private String apellidoUsuario;

    @Column
    private String usuarioName;

    @Column
    private String password;


}
