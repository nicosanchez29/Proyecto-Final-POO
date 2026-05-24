package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Terreno extends Inmueble{
    private boolean tieneServicio;
//constructor
    public Terreno(String codigo, String direccion, String ciudad, String area, double precio, TipoInmueble tipoInmueble, EstadoInmueble estadoInmueble, SistemaReportes sistemaReportes, ArrayList<Oferta> listaOfertas, Vendedor vendedor, MotorRecomendacion motorRecomendacion, BuscadorInmueble buscadorInmueble, Publicacion publicacion, boolean tieneServicio, InmoSmart inmoSmart) {
        super(codigo, direccion, ciudad, area, precio, tipoInmueble, estadoInmueble, sistemaReportes, listaOfertas, vendedor, motorRecomendacion, buscadorInmueble, publicacion, inmoSmart);
        this.tieneServicio = tieneServicio;
    }

    public boolean isTieneServicio() {
        return tieneServicio;
    }

    public void setTieneServicio(boolean tieneServicio) {
        this.tieneServicio = tieneServicio;
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
