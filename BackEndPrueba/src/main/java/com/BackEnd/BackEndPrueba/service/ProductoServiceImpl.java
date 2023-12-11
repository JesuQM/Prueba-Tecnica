package com.BackEnd.BackEndPrueba.service;

import com.BackEnd.BackEndPrueba.model.Producto;

import com.BackEnd.BackEndPrueba.repository.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductoServiceImpl implements ProductoService {
    private final ProductoRepository productoRepository;
    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository){
        this.productoRepository=productoRepository;
    }
    public Producto newProducto(Producto newPoducto){
        return productoRepository.save(newPoducto);
    }

    public Iterable<Producto> getAllProduct() {
        return this.productoRepository.findAll();
    }



    public Optional<Producto> getId(Integer id) {
        return this.productoRepository.findById(id);
    }

    public Producto modificarProducto(Producto producto){
        Optional<Producto> productoEncontrado =this.productoRepository.findById(producto.getId());
        if(productoEncontrado!=null){
            productoEncontrado.get().setId(producto.getId());
            productoEncontrado.get().setNombreProducto(producto.getNombreProducto());
            productoEncontrado.get().setPrecio(producto.getPrecio());
            productoEncontrado.get().setCantidad(producto.getCantidad());
            return this.newProducto(productoEncontrado.get());
        }
        return null;
    }

    public Boolean deleteProducto(Integer id){
        this.productoRepository.deleteById(id);
        return true;
    }

}
