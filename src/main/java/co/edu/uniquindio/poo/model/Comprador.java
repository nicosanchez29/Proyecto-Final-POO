package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Comprador extends Usuario implements iOperadorCompra {
    private ArrayList<Transaccion> listaTransacciones;
    private ArrayList<Oferta> listaOfertas;
    private HistorialBusqueda historialBusqueda;

    public Comprador(String id, String nombre, String identificacion, String telefono, String correo, int puntosReputacion, CategoriaUsuario categoriaUsuario, SistemaReputacion sistemaReputacion, SistemaReportes sistemaReportes, InmoSmart ownedByInmoSmart) {
        super(id, nombre, identificacion, telefono, correo, puntosReputacion, categoriaUsuario, sistemaReputacion, sistemaReportes, ownedByInmoSmart);
        this.listaTransacciones = new ArrayList<>();
        this.listaOfertas = new ArrayList<>();
        this.historialBusqueda = null;
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

