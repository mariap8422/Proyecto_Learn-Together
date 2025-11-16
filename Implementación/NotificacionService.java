import java.util.Queue;
import java.util.LinkedList;

public class NotificacionService {
    private Queue<Notificacion> notificaciones;

    public NotificacionService() {
        this.notificaciones = new LinkedList<>();
    }

    public void enviarNotificacion(String mensaje) {
        notificaciones.add(new Notificacion(mensaje));
    }

    public Notificacion siguienteNotificacion() {
        return notificaciones.poll();
    }
}