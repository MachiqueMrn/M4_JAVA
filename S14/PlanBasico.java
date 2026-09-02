package S14;

public class PlanBasico extends Suscripcion{
    // Llamamos al constructor de la clase padre (Suscripcion)
    public PlanBasico (String nombreSocio, int meses) {
        super(nombreSocio, meses);
    }

    // Sobreescribir método abstracto
    @Override
    public double calcularTotal() {
        return meses * 400.0; // Tarifa por mes
    }
}