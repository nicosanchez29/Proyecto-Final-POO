package co.edu.uniquindio.poo.model;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String identificacion;
    protected String telefono;
    protected String correo;
    protected int puntosReputacion;
    protected CategoriaUsuario categoriaUsuario;

    public Usuario(String id, String nombre, String identificacion, String telefono, String correo, int puntosReputacion, CategoriaUsuario categoriaUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.puntosReputacion = puntosReputacion;
        this.categoriaUsuario = categoriaUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPuntosReputacion() {
        return puntosReputacion;
    }

    public void setPuntosReputacion(int puntosReputacion) {
        this.puntosReputacion = puntosReputacion;
    }
    public abstract double calcularBeneficio();
    public void sumarPuntos(){

    }
    public categoriaUsuario actualizarCategoria(){

    }
    public String mostrarInformacion(){

    }

}
