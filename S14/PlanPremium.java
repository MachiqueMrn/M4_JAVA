package S14;

public class PlanPremium extends Suscripcion {
    // Atributo
    private double cargoSpa;

    // Llamamos al constructor de la clase padre (Suscripcion)
    public PlanPremium (String nombreSocio, int meses, double cargoSpa) {
        super(nombreSocio, meses);
        this.cargoSpa = cargoSpa;
    }

    // Sobreescribir método abstracto
    @Override
    public double calcularTotal() {
        return (meses * 600.0) + cargoSpa;
    }
}
