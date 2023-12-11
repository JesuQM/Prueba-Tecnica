package com.BackEnd.BackEndPrueba.controller;

import com.BackEnd.BackEndPrueba.model.Producto;
import com.BackEnd.BackEndPrueba.service.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"})
public class ProductoController {
    private final ProductoService productoService;
    @Autowired
    public ProductoController(ProductoService productoService){
        this.productoService=productoService;
    }

    @PostMapping("/nuevoProducto")
    public Producto newProduct(@RequestBody Producto newProduct){

        return this.productoService.newProducto(newProduct);
    }

    @GetMapping("/listaProducto")
    public Iterable<Producto> getAllProducto(){

        return productoService.getAllProduct();
    }
    @GetMapping("/listaProducto/{id}")
    public Optional<Producto> getId(@PathVariable(value = "id")Integer id){
        return productoService.getId(id);
    }
    @PostMapping("/modificarProducto")
    public Producto modifycarProducto(@RequestBody Producto producto){
        return this.productoService.modificarProducto(producto);
    }
    @PostMapping("/{id}")
    public boolean deletProducto(@PathVariable(value = "id")Integer id){
       return this.productoService.deleteProducto(id);

    }

}

