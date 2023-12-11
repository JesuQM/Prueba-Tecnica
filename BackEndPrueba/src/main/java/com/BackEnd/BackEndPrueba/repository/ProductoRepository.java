package com.BackEnd.BackEndPrueba.repository;

import com.BackEnd.BackEndPrueba.model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
