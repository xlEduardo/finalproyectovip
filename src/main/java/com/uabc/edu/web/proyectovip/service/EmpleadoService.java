package com.uabc.edu.web.proyectovip.service;

import com.uabc.edu.web.proyectovip.model.Empleado;
import com.uabc.edu.web.proyectovip.model.Producto;
import com.uabc.edu.web.proyectovip.repository.empleadoRepository;
import com.uabc.edu.web.proyectovip.repository.productoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {


    @Autowired
    empleadoRepository repo;

    //Agregar Producto
    public Empleado registrarEmpleado(Empleado empleado){
        Empleado empleadoSaved = repo.save(empleado);

        return empleadoSaved;
    }

    //Borrar por ID
    public void deleteById(long id){
        Empleado empleado = repo.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Invalid user Id:" + id));

        repo.delete(empleado);
    }

    //Obetener producto por ID
    public Empleado getEmpleadoID(long id){

        return repo.findById(id).get();
    }

    //Lista de productos
    public List<Empleado> todos(){
        List<Empleado> actualList = new ArrayList<Empleado>();
        repo.findAll().forEach(actualList::add);
        return actualList;
    }

}
