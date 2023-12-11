package com.BackEnd.BackEndPrueba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Persona {
    @Column
    private String tipoDocumento;
    @Id
    private Long numDocumento;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String correoElectronico;

    @Column
    private  Long celular;


}
