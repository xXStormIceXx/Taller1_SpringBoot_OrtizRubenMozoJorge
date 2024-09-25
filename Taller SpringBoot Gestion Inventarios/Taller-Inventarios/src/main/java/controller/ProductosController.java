package controller;

import model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProductosService;

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

    @PostMapping
    public Productos createProductos(@RequestBody Productos productos) {
        return productosService.createProductos(productos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Productos> getProductosById(@PathVariable int id) {
        return productosService.getProductosById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductos(@PathVariable int id) {
        productosService.deleteProductos(id);
        return ResponseEntity.ok().build();
    }
}

