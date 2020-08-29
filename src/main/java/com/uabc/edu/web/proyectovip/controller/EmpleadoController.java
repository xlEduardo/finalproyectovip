package com.uabc.edu.web.proyectovip.controller;

import com.uabc.edu.web.proyectovip.model.Empleado;
import com.uabc.edu.web.proyectovip.model.Producto;
import com.uabc.edu.web.proyectovip.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpleadoController {


    @Autowired
    EmpleadoService serv;

    @GetMapping("/empleados")
    public String mostrarEmpleados(Model model){
        List<Empleado> empleados = serv.todos();
        model.addAttribute("empleado",empleados);
        return "tablaEmpleados";
    }

    @GetMapping("/agregarE")
    public String registrar(Empleado empleado){

        return "agregarEmpleado";
    }

    @PostMapping("/addempleado")
    public String addEmpleado(Empleado empleado, BindingResult result, Model model){
        if(result.hasErrors()){
            return "agregarEmpleado";
        }

        serv.registrarEmpleado(empleado);

        return "redirect:/empleados";
    }

    @GetMapping("/eliminarE/{id}")

    public String eliminar(@PathVariable("id")long laID, Model model){
        serv.deleteById(laID);
        model.addAttribute("empleado", serv.todos());

        return "redirect:/empleados";
    }

    @GetMapping("/editarE/{id}")

    public String editar(@PathVariable("id")long id, Model model){
        Empleado empleado = serv.getEmpleadoID(id);
        model.addAttribute("empleado", empleado);

        return "update-empleado";
    }

    @PostMapping("/actualizarE/{id}")

    public String update(@PathVariable("id")long id, Empleado empleado, BindingResult result){
        if(result.hasErrors()){
            empleado.setId(id);
            return "update-empleado";
        }

        serv.registrarEmpleado(empleado);
        return "redirect:/empleados";
    }


}
