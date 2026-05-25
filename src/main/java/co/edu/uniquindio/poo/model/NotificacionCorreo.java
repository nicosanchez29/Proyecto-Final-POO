package co.edu.uniquindio.poo.model;

public class NotificacionCorreo extends Notificacion {
    public NotificacionCorreo(String mensaje, CanalNotificacion canalNotificacion, Usuario usuario) {
        super(mensaje, canalNotificacion, usuario);
    }
    @Override
    public void enviarNotificacion() {

    }
}
