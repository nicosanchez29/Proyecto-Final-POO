package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class InmoSmart {

    //ATRIBUTOS

    private String nombre;
    private String codigo;

    //RELACIONES

    private ArrayList <Usuario> listaUsuarios;
    private ArrayList <Transaccion> listaTransaccion;
    private ArrayList <Inmueble> listaInmuebles;
    private ArrayList <Publicacion> listaPublicaciones;
    private ArrayList <Oferta> listaOfertas;


    public InmoSmart(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaUsuarios = new ArrayList<>();
        this.listaTransaccion = new ArrayList<>();
        this.listaInmuebles = new ArrayList<>();
        this.listaPublicaciones = new ArrayList<>();
        this.listaOfertas = new ArrayList<>();
    }
    hola
}


