package S07.Ejemplo;

public class Notificacion { 
    // Método 01
    void enviar() {
        System.out.println("La notificación del sistema ha sido enviada.");
    }
    // Sobrecarga del método 01
    void enviar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}
