

public class TelefonoMovil implements Recargable {
    private String marca;

    public TelefonoMovil(String marca) {
        this.marca = marca;
    }
    
    @Override
    public void iniciarCarga() {
        System.out.println("Conectando cable USB-C... Cargando batería del telefono " + marca + ".");
    }
}