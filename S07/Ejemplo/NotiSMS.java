package S07.Ejemplo;

public class NotiSMS extends Notificacion{
    @Override
    void enviar() {
        System.out.println("El SMS ha sido enviado al número registrado.");
    }
}
