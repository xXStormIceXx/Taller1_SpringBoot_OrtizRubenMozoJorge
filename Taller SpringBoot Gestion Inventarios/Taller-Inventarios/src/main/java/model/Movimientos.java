package model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Movimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_movimiento;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Productos productos;

    private int cantidad;
    private String tipo_movimiento;
    private LocalDateTime fecha;

    public int getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public Productos getProducto() {
        return productos;
    }

    public void setProducto(Productos producto) {
        this.productos = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo_movimiento() {
        return tipo_movimiento;
    }

    public void setTipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}