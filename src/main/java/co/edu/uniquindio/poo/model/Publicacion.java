package co.edu.uniquindio.poo.model;
import java.time.LocalDate;

public class Publicacion {
    private String codigoPulbicacion;
    private LocalDate fechaPublicacion;
    private String descripcion;
    private boolean activa;

    public Publicacion(String codigoPulbicacion, LocalDate fechaPublicacion, String descripcion, boolean activa) {
        this.codigoPulbicacion = codigoPulbicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.descripcion = descripcion;
        this.activa = activa;
    }

    public String getCodigoPulbicacion() {
        return codigoPulbicacion;
    }

    public void setCodigoPulbicacion(String codigoPulbicacion) {
        this.codigoPulbicacion = codigoPulbicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
