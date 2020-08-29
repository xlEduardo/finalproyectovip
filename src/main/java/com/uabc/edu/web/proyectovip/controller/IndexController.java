package com.uabc.edu.web.proyectovip.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")

    public String inicio() {

        return "index";
    }

    @GetMapping("/index")

    public String index() {

        return "index";
    }

    @GetMapping("/aProducto")
    public String aPapitas(){

        return "agregarProducto";
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }



}
