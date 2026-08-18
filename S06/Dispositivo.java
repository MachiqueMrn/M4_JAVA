package S06;

public class Dispositivo {
    
    // Declaración de atributos
    protected String marca;
    protected String modelo;

    // Constructor
    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos
    void encender() {
        System.out.println("El dispositivo " + marca + " " + modelo + " se ha encendido." );
    }

    void mostrarInfo() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo);
    }
}
