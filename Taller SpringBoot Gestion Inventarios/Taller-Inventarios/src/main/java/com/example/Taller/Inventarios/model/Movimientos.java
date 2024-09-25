package com.example.Taller.Inventarios.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_movimiento;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Productos productos;

    private int cantidad;

    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo_movimiento;

    private LocalDateTime fecha;

    // Getters y Setters

    public Integer getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(Integer id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProducto(Productos productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoMovimiento getTipo_movimiento() {
        return tipo_movimiento;
    }

    public void setTipo_movimiento(TipoMovimiento tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public enum TipoMovimiento {
        ENTRADA, SALIDA
    }

}