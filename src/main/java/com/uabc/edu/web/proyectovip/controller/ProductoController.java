package com.uabc.edu.web.proyectovip.controller;

import com.uabc.edu.web.proyectovip.model.Producto;
import com.uabc.edu.web.proyectovip.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductoController {

    @Autowired
    ProductoService serv;

    @GetMapping("/productos")

    public String mostrarProductos(Model model){
        List<Producto> productos = serv.todos();
        model.addAttribute("producto",productos);
        return "tablaProductos";
    }

    @GetMapping("/agregarP")

    public String registrar(Producto producto){

        return "agregarProducto";
    }

    @GetMapping("/bCategory")

    public String cCategory(){

        return "tablaCategoria";
    }

    @PostMapping("/addproducto")

    public String addProducto(Producto producto, BindingResult result, Model model){
        if(result.hasErrors()){
            return "agregarProducto";
        }

        serv.registrarProducto(producto);

        return "redirect:/productos";
    }

    @GetMapping("/eliminar/{id}")

    public String eliminar(@PathVariable("id")long laID, Model model){
        serv.deleteById(laID);
        model.addAttribute("animal", serv.todos());


        return "redirect:/productos";
    }

    @GetMapping("/editar/{id}")

    public String editar(@PathVariable("id")long id, Model model){
        Producto producto = serv.getProductoID(id);
        model.addAttribute("producto", producto);

        return "update-producto";
    }

    @PostMapping("/actualizar/{id}")

    public String update(@PathVariable("id")long id, Producto producto, BindingResult result){
        if(result.hasErrors()){
            producto.setId(id);
            return "update";
        }

        serv.registrarProducto(producto);
        return "redirect:/productos";
    }


    @PostMapping("/addcategory")

    public String caetgorySubmit(@RequestParam(value = "category") String category, Model model) {


        // System.out.println("Se tiene la categoria> " + category);
        List<Producto> productos = serv.allCategory(category);
        model.addAttribute("producto", productos);

        return "tablaCategoria";
    }


}
