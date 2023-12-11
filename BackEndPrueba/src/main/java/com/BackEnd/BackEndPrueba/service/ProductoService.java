package com.BackEnd.BackEndPrueba.service;

import com.BackEnd.BackEndPrueba.model.Producto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ProductoService {

    Producto newProducto(Producto newProducto);

    Iterable<Producto> getAllProduct();
    Optional<Producto> getId(Integer idProducto);
    Producto modificarProducto(Producto producto);
    Boolean deleteProducto(Integer idProducto);
}

