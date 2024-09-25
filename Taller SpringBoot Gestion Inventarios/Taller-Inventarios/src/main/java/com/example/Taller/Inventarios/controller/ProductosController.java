package com.example.Taller.Inventarios.controller;

import com.example.Taller.Inventarios.model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Taller.Inventarios.service.ProductosService;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping
    public List<Productos> getAllProductos() {
        return productosService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Productos getProductosById(@PathVariable Integer id) {
        return productosService.getProductoById(id);
    }

    @PostMapping
    public Productos createProductos(@RequestBody Productos productos) {
        return productosService.saveProducto(productos);
    }

    @PutMapping("/{id}")
    public Productos updateProductos(@PathVariable Integer id, @RequestBody Productos producto) {
        Productos existingProducto = productosService.getProductoById(id);
        if (existingProducto != null) {
            existingProducto.setNombre_producto(producto.getNombre_producto());
            existingProducto.setDescripcion(producto.getDescripcion());
            existingProducto.setPrecio(producto.getPrecio());
            existingProducto.setStock(producto.getStock());
            return productosService.saveProducto(existingProducto);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteProductos(@PathVariable Integer id) {
        productosService.deleteProducto(id);
    }
}