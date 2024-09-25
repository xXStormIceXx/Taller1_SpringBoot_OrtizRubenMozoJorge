package com.example.Taller.Inventarios.service;

import com.example.Taller.Inventarios.model.Movimientos;
import com.example.Taller.Inventarios.repository.MovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientosService {

    @Autowired
    private MovimientosRepository movimientosRepository;

    public List<Movimientos> getAllMovimientos() {
        return movimientosRepository.findAll();
    }

    public Movimientos saveMovimiento(Movimientos movimientos) {
        return movimientosRepository.save(movimientos);
    }
}