package co.edu.uniquindio.poo.model;

public class NotificacionWhatsapp extends Notificacion{
    public NotificacionWhatsapp(String mensaje, CanalNotificacion canalNotificacion, Usuario usuario) {
        super(mensaje, canalNotificacion, usuario);
    }
    @Override
    public void enviarNotificacion() {

    }
}
