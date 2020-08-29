package com.uabc.edu.web.proyectovip.repository;

import com.uabc.edu.web.proyectovip.model.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadoRepository extends CrudRepository<Empleado, Long> {
}
