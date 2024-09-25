package com.example.Taller.Inventarios.controller;

import com.example.Taller.Inventarios.model.Movimientos;
import com.example.Taller.Inventarios.service.MovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientosController {

    @Autowired
    private MovimientosService movimientosService;

    @GetMapping
    public List<Movimientos> getAllMovimientos() {
        return movimientosService.getAllMovimientos();
    }

    @PostMapping
    public Movimientos createMovimientos(@RequestBody Movimientos movimientos) {
        return movimientosService.saveMovimiento(movimientos);
    }
}