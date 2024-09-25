package com.example.Taller.Inventarios.service;

import com.example.Taller.Inventarios.model.Productos;
import com.example.Taller.Inventarios.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository productoRepository;

    public List<Productos> getAllProductos() {
        return productoRepository.findAll();
    }

    public Productos getProductoById(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

    public Productos saveProducto(Productos producto) {
        return productoRepository.save(producto);
    }

    public void deleteProducto(Integer id) {
        productoRepository.deleteById(id);
    }
}