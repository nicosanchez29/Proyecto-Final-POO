package co.edu.uniquindio.poo.model;
import java.time.LocalDate;

public class Transaccion {
    private String codigoTransaccion;
    private double valorFinal;
    private LocalDate fechaTransaccion;
    private TipoOperacion tipoOperacion;
    //RELACIONES
    private Inmueble inmueble;
    private Vendedor vendedor;
    private SistemaReputacion sistemaReputacion;
    private Comprador ownedByComprador;

    public Transaccion(String codigoTransaccion, double valorFinal, LocalDate fechaTransaccion, TipoOperacion tipoOperacion, Comprador comprador) {
        this.codigoTransaccion = codigoTransaccion;
        this.valorFinal = valorFinal;
        this.fechaTransaccion = fechaTransaccion;
        this.tipoOperacion = tipoOperacion;
        this.inmueble = null;
        this.vendedor = null;
        this.sistemaReputacion = null;
        this.ownedByComprador = comprador;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public SistemaReputacion getSistemaReputacion() {
        return sistemaReputacion;
    }

    public void setSistemaReputacion(SistemaReputacion sistemaReputacion) {
        this.sistemaReputacion = sistemaReputacion;
    }
}
