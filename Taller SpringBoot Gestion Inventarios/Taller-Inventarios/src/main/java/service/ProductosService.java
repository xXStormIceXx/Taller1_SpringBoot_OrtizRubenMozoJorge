package service;

import model.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepository;

    public List<Productos> getAllProductos() {
        return productosRepository.findAll();
    }

    public Productos createProductos(Productos productos) {
        return productosRepository.save(productos);
    }

    public Optional<Productos> getProductosById(int id) {
        return productosRepository.findById(id);
    }

    public void deleteProductos(int id) {
        productosRepository.deleteById(id);
    }
}

