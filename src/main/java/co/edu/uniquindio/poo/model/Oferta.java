package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Oferta {
    private String codigoOferta;
    private double valorOferta;
    private LocalDate fechaOferta;
    private EstadoOferta estadoOferta;
    //RELACIONES
    private Inmueble inmueble;
    private Comprador ownedByComprador;
    public Oferta(String codigoOferta, double valorOferta, LocalDate fechaOferta, EstadoOferta estadoOferta, Comprador comprador) {
        this.codigoOferta = codigoOferta;
        this.valorOferta = valorOferta;
        this.fechaOferta = fechaOferta;
        this.estadoOferta = estadoOferta;
        this.inmueble = null;
        this.ownedByComprador = comprador;
    }

    public String getCodigoOferta() {
        return codigoOferta;
    }

    public void setCodigoOferta(String codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    public double getValorOferta() {
        return valorOferta;
    }

    public void setValorOferta(double valorOferta) {
        this.valorOferta = valorOferta;
    }

    public LocalDate getFechaOferta() {
        return fechaOferta;
    }

    public void setFechaOferta(LocalDate fechaOferta) {
        this.fechaOferta = fechaOferta;
    }

    public EstadoOferta getEstadoOferta() {
        return estadoOferta;
    }

    public void setEstadoOferta(EstadoOferta estadoOferta) {
        this.estadoOferta = estadoOferta;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Comprador getOwnedByComprador() {
        return ownedByComprador;
    }

    public void setOwnedByComprador(Comprador ownedByComprador) {
        this.ownedByComprador = ownedByComprador;
    }
}
