package S06;

public class Celular extends Dispositivo {
    
    // Declaración de atributos
    private String sistemaOp;
    private int almacenamiento;

    // Constructor propio
    public Celular(String marca, String modelo, String sistemaOp, int almacenamiento) {
        // Constructor de clase padre
        super(marca, modelo);
        // Inicialización de atributos propios
        this.sistemaOp = sistemaOp;
        this.almacenamiento = almacenamiento;
    }

    // Métodos propios
    void mostrarDetalles() {
        mostrarInfo();
        System.out.println("Sistema Operativo: " + sistemaOp + "\nAlmacenamiento: " + almacenamiento + " GB.");
    }

    void tomarFoto() {
        System.out.println("El " + marca + " " + modelo + " ha tomado una foto.");
    }
}
