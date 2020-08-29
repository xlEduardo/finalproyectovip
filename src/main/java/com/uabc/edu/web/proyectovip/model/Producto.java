package com.uabc.edu.web.proyectovip.model;

import lombok.Data;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idp")
    private long id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "category")
    private String category;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "cantidad")
    private String cantidad;

    @Column(name = "precio")
    private String precio;

    @Column(name = "cont")
    private String cont;


    public Producto() {

    }

    public Producto(String marca, String nombre, String category, String cantidad, String precio, String cont, String fecha){
        this.marca = marca;
        this.nombre = nombre;
        this.category = category;
        this.cantidad = cantidad;
        this.cont = cont;
        this.fecha = fecha;
        this.precio = precio;
    }


}
