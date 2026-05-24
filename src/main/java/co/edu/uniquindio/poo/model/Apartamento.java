package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Apartamento extends Inmueble {
    private int piso;
    private double administracion;

    public Apartamento(String codigo, String direccion, String ciudad, String area, double precio, TipoInmueble tipoInmueble, EstadoInmueble estadoInmueble, SistemaReportes sistemaReportes, ArrayList<Oferta> listaOfertas, Vendedor vendedor, MotorRecomendacion motorRecomendacion, BuscadorInmueble buscadorInmueble, Publicacion publicacion, int piso, double administracion) {
        super(codigo, direccion, ciudad, area, precio, tipoInmueble, estadoInmueble, sistemaReportes, listaOfertas, vendedor, motorRecomendacion, buscadorInmueble, publicacion);
        this.piso = piso;
        this.administracion = administracion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public double getAdministracion() {
        return administracion;
    }

    public void setAdministracion(double administracion) {
        this.administracion = administracion;
    }

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
