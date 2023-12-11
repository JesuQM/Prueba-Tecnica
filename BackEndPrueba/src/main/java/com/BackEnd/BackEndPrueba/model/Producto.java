package com.BackEnd.BackEndPrueba.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Producto {
    @Id

    private int id;
    @Column
    private  String nombreProducto;
    @Column
    private float precio;
    @Column
    private int cantidad;

}
