package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class LocalComercial extends Inmueble{
    private String tipoNegocio;

    public LocalComercial(String codigo, String direccion, String ciudad, String area, double precio, TipoInmueble tipoInmueble, EstadoInmueble estadoInmueble, SistemaReportes sistemaReportes, ArrayList<Oferta> listaOfertas, Vendedor vendedor, MotorRecomendacion motorRecomendacion, BuscadorInmueble buscadorInmueble, Publicacion publicacion, String tipoNegocio, InmoSmart inmoSmart) {
        super(codigo, direccion, ciudad, area, precio, tipoInmueble, estadoInmueble, sistemaReportes, listaOfertas, vendedor, motorRecomendacion, buscadorInmueble, publicacion, inmoSmart);
        this.tipoNegocio = tipoNegocio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public void setTipoNegocio(String tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }
    //Metodos

    @Override
    public double calcularImpuesto() {
        return 0;
    }

    @Override
    public EstadoInmueble estaDisponible() {
        return null;
    }

    @Override
    public EstadoInmueble cambiarEstado() {
        return null;
    }

    @Override
    public String mostrarDetalles() {
        return "";
    }

}
