package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String identificacion;
    protected String telefono;
    protected String correo;
    protected int puntosReputacion;
    protected CategoriaUsuario categoriaUsuario;
    //Relaciones
    protected ArrayList<Notificacion> listaNotificaciones;
    protected SistemaReputacion sistemaReputacion;
    protected SistemaReportes sistemaReportes;
    protected InmoSmart ownedByInmoSmart;

    public Usuario(String id, String nombre, String identificacion, String telefono, String correo, int puntosReputacion, CategoriaUsuario categoriaUsuario, ArrayList<Notificacion> listaNotificaciones, SistemaReputacion sistemaReputacion, SistemaReportes sistemaReportes, InmoSmart ownedByInmoSmart) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.puntosReputacion = puntosReputacion;
        this.categoriaUsuario = categoriaUsuario;
        this.listaNotificaciones = listaNotificaciones;
        this.sistemaReputacion = sistemaReputacion;
        this.sistemaReportes = sistemaReportes;
        this.ownedByInmoSmart = ownedByInmoSmart;
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

    public CategoriaUsuario getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
    }

    public ArrayList<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(ArrayList<Notificacion> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }

    public SistemaReputacion getSistemaReputacion() {
        return sistemaReputacion;
    }

    public void setSistemaReputacion(SistemaReputacion sistemaReputacion) {
        this.sistemaReputacion = sistemaReputacion;
    }

    public SistemaReportes getSistemaReportes() {
        return sistemaReportes;
    }

    public void setSistemaReportes(SistemaReportes sistemaReportes) {
        this.sistemaReportes = sistemaReportes;
    }

    public InmoSmart getOwnedByInmoSmart() {
        return ownedByInmoSmart;
    }

    public void setOwnedByInmoSmart(InmoSmart ownedByInmoSmart) {
        this.ownedByInmoSmart = ownedByInmoSmart;
    }

    public abstract double calcularBeneficio();
    public abstract void sumarPuntos();
    public abstract CategoriaUsuario actualizarCategoria();
    public abstract String mostrarInformacion();

}
