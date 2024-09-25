package com.example.Taller.Inventarios.repository;

import com.example.Taller.Inventarios.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {
}
