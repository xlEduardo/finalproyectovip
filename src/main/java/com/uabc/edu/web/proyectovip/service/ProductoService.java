package com.uabc.edu.web.proyectovip.service;

import com.uabc.edu.web.proyectovip.model.Producto;
import com.uabc.edu.web.proyectovip.repository.productoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    productoRepository repo;

    //Agregar Producto
    public Producto registrarProducto(Producto producto){
        Producto productoSaved = repo.save(producto);

        return productoSaved;
    }

    //Borrar por ID
    public void deleteById(long id){
        Producto producto = repo.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Invalid user Id:" + id));

        repo.delete(producto);
    }

    //Obetener producto por ID
    public Producto getProductoID(long id){

        return repo.findById(id).get();
    }

    //Lista de productos
    public List<Producto> todos(){
        List<Producto> actualList = new ArrayList<Producto>();
        repo.findAll().forEach(actualList::add);
        return actualList;
    }

    //Lista por categoria
    public List<Producto> allCategory(String category){

        return repo.findByCategory(category);
    }
}
