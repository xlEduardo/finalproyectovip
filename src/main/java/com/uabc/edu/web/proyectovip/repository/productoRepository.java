package com.uabc.edu.web.proyectovip.repository;

import com.uabc.edu.web.proyectovip.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productoRepository extends CrudRepository<Producto, Long> {

       List<Producto> findByCategory(String category);
}
