package S14;

public abstract class Suscripcion {

    // Atributos
    protected String nombreSocio;
    protected int meses;

    // Constructor
    public Suscripcion (String nombreSocio, int meses) {
        this.nombreSocio = nombreSocio;
        this.meses = meses;
    }

    // Método abstracto
    public abstract double calcularTotal();
}