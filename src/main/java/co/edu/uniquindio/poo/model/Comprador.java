package co.edu.uniquindio.poo.model;

public class Comprador extends Usuario {
    public Comprador(String id, String nombre, String identificacion, String telefono, String correo, int puntosReputacion, CategoriaUsuario categoriaUsuario){
super(id, nombre, identificacion, telefono, correo, puntosReputacion, categoriaUsuario);
    }

    @Override
    public double calcularBeneficio() {
        return 0;
    }

}
