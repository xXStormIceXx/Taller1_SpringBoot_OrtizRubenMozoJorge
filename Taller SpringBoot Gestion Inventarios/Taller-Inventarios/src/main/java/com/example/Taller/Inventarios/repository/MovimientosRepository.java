package com.example.Taller.Inventarios.repository;

import com.example.Taller.Inventarios.model.Movimientos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientosRepository extends JpaRepository<Movimientos, Integer> {
}