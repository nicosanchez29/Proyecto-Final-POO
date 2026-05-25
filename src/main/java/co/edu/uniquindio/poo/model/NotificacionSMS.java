package co.edu.uniquindio.poo.model;

public class NotificacionSMS extends Notificacion{
    public NotificacionSMS(String mensaje, CanalNotificacion canalNotificacion, Usuario usuario) {
        super(mensaje, canalNotificacion, usuario);
    }

    @Override
    public void enviarNotificacion() {

    }
}
