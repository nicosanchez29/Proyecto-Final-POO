package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Vendedor extends Usuario implements iPublicador{
    //RELACIONES
    private ArrayList<Inmueble> listaInmuebles;
    private ArrayList<Publicacion> listaPublicaciones;
    private ArrayList<Transaccion> listaTransacciones;

    public Vendedor(String id, String nombre, String identificacion, String telefono, String correo, int puntosReputacion, CategoriaUsuario categoriaUsuario, ArrayList<Notificacion> listaNotificaciones, SistemaReputacion sistemaReputacion, SistemaReportes sistemaReportes, InmoSmart ownedByInmoSmart, ArrayList<Inmueble> listaInmuebles, ArrayList<Publicacion> listaPublicaciones, ArrayList<Transaccion> listaTransacciones) {
        super(id, nombre, identificacion, telefono, correo, puntosReputacion, categoriaUsuario, listaNotificaciones, sistemaReputacion, sistemaReportes, ownedByInmoSmart);
        this.listaInmuebles = listaInmuebles;
        this.listaPublicaciones = listaPublicaciones;
        this.listaTransacciones = listaTransacciones;
    }

    public ArrayList<Inmueble> getListaInmuebles() {
        return listaInmuebles;
    }

    public void setListaInmuebles(ArrayList<Inmueble> listaInmuebles) {
        this.listaInmuebles = listaInmuebles;
    }

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public ArrayList<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    @Override
    public double calcularBeneficio() {
        return 0;
    }

    @Override
    public void sumarPuntos() {

    }

    @Override
    public CategoriaUsuario actualizarCategoria() {
        return null;
    }

    @Override
    public String mostrarInformacion() {
        return "";
    }
}
