package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Comprador extends Usuario implements iOperadorCompra {
    private ArrayList<Transaccion> listaTransacciones;
    private ArrayList<Oferta> listaOfertas;
    private HistorialBusqueda historialBusqueda;

    public Comprador(String id, String nombre, String identificacion, String telefono, String correo, int puntosReputacion, CategoriaUsuario categoriaUsuario, ArrayList<Notificacion> listaNotificaciones, SistemaReputacion sistemaReputacion, SistemaReportes sistemaReportes, InmoSmart ownedByInmoSmart, ArrayList<Transaccion> listaTransacciones, ArrayList<Oferta> listaOfertas, HistorialBusqueda historialBusqueda) {
        super(id, nombre, identificacion, telefono, correo, puntosReputacion, categoriaUsuario, listaNotificaciones, sistemaReputacion, sistemaReportes, ownedByInmoSmart);
        this.listaTransacciones = listaTransacciones;
        this.listaOfertas = listaOfertas;
        this.historialBusqueda = historialBusqueda;
    }

    public ArrayList<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public ArrayList<Oferta> getListaOfertas() {
        return listaOfertas;
    }

    public void setListaOfertas(ArrayList<Oferta> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }

    public HistorialBusqueda getHistorialBusqueda() {
        return historialBusqueda;
    }

    public void setHistorialBusqueda(HistorialBusqueda historialBusqueda) {
        this.historialBusqueda = historialBusqueda;
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
