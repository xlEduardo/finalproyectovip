package com.uabc.edu.web.proyectovip.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombreE")
    private String nombreE;

    @Column(name = "apellidoP")
    private String apellidoP;

    @Column(name = "apellidoM")
    private String apellidoM;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "puesto")
    private String puesto;

    @Column(name = "edad")
    private String edad;

    public Empleado(){

    }

    public Empleado(String nombreE, String apellidoP, String apellidoM, String telefono, String puesto, String edad){
        this.nombreE = nombreE;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
        this.telefono = telefono;
        this.puesto = puesto;
        this.edad = edad;
    }
}
