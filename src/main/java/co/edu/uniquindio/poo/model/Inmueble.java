package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Inmueble {
    //atributos
    protected String codigo;
    protected String direccion;
    protected String ciudad;
    protected String area;
    protected double precio;
    protected TipoInmueble tipoInmueble;
    protected EstadoInmueble estadoInmueble;
    //Relaciones
    protected SistemaReportes sistemaReportes;
    protected ArrayList<Oferta> listaOfertas;
    protected Vendedor vendedor;
    protected MotorRecomendacion motorRecomendacion;
    protected BuscadorInmueble buscadorInmueble;
    protected Publicacion publicacion;
    protected InmoSmart ownedByInmoSmart;

    public Inmueble(String codigo, String direccion, String ciudad, String area, double precio, TipoInmueble tipoInmueble, EstadoInmueble estadoInmueble, InmoSmart inmoSmart) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.area = area;
        this.precio = precio;
        this.tipoInmueble = tipoInmueble;
        this.estadoInmueble = estadoInmueble;
        this.sistemaReportes = null;
        this.listaOfertas = new ArrayList<>();
        this.vendedor = null;
        this.motorRecomendacion = null;
        this.buscadorInmueble = null;
        this.publicacion = null;
        this.ownedByInmoSmart = inmoSmart;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(TipoInmueble tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public EstadoInmueble getEstadoInmueble() {
        return estadoInmueble;
    }

    public void setEstadoInmueble(EstadoInmueble estadoInmueble) {
        this.estadoInmueble = estadoInmueble;
    }

    public SistemaReportes getSistemaReportes() {
        return sistemaReportes;
    }

    public void setSistemaReportes(SistemaReportes sistemaReportes) {
        this.sistemaReportes = sistemaReportes;
    }

    public ArrayList<Oferta> getListaOfertas() {
        return listaOfertas;
    }

    public void setListaOfertas(ArrayList<Oferta> listaOfertas) {
        this.listaOfertas = listaOfertas;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public MotorRecomendacion getMotorRecomendacion() {
        return motorRecomendacion;
    }

    public void setMotorRecomendacion(MotorRecomendacion motorRecomendacion) {
        this.motorRecomendacion = motorRecomendacion;
    }

    public BuscadorInmueble getBuscadorInmueble() {
        return buscadorInmueble;
    }

    public void setBuscadorInmueble(BuscadorInmueble buscadorInmueble) {
        this.buscadorInmueble = buscadorInmueble;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public InmoSmart getOwnedByInmoSmart() {
        return ownedByInmoSmart;
    }

    public void setOwnedByInmoSmart(InmoSmart ownedByInmoSmart) {
        this.ownedByInmoSmart = ownedByInmoSmart;
    }

    public abstract double calcularImpuesto();
    public abstract EstadoInmueble estaDisponible();
    public abstract EstadoInmueble cambiarEstado();
    public abstract String mostrarDetalles();
}

