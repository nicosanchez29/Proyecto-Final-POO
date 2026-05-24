package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Casa extends Inmueble{
    private int numeroHabitaciones;
    private boolean tieneGaraje;
    //Constructor

    public Casa(String codigo, String direccion, String ciudad, String area, double precio, TipoInmueble tipoInmueble, EstadoInmueble estadoInmueble, SistemaReportes sistemaReportes, ArrayList<Oferta> listaOfertas, Vendedor vendedor, MotorRecomendacion motorRecomendacion, BuscadorInmueble buscadorInmueble, Publicacion publicacion, int numeroHabitaciones, boolean tieneGaraje, InmoSmart inmoSmart) {
        super(codigo, direccion, ciudad, area, precio, tipoInmueble, estadoInmueble, sistemaReportes, listaOfertas, vendedor, motorRecomendacion, buscadorInmueble, publicacion, inmoSmart);
        this.numeroHabitaciones = numeroHabitaciones;
        this.tieneGaraje = tieneGaraje;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
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

    //Metodos

}
