package co.edu.uniquindio.poo.model;

public abstract class Notificacion {
    protected String mensaje;
    protected CanalNotificacion canalNotificacion;
    //RELACIONES
    protected Usuario usuario;

    public Notificacion(String mensaje, CanalNotificacion canalNotificacion, Usuario usuario) {
        this.mensaje = mensaje;
        this.canalNotificacion = canalNotificacion;
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public CanalNotificacion getCanalNotificacion() {
        return canalNotificacion;
    }

    public void setCanalNotificacion(CanalNotificacion canalNotificacion) {
        this.canalNotificacion = canalNotificacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public abstract void enviarNotificacion();
}
