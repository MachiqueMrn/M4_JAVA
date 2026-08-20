package S07.Ejemplo;

public class NotiEmail extends Notificacion {
    @Override
    void enviar() {
        System.out.println("El Email ha sido enviado al usuario.");
    }
}
