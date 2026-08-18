package Act06;

public class Gerente extends Empleado{
    private double bonoProductividad;

    public Gerente(String nombre, String numeroEmpleado, double salarioBase, double bonoProductividad) {
        // Constructor de Empleado
        super(nombre, numeroEmpleado, salarioBase);
        this.bonoProductividad = bonoProductividad;
    }

    // Método propio
    public void asignarNuevoBono(double monto) {
        this.bonoProductividad = monto;
        System.out.println("  -> [Gerente] Se ha actualizado el bono de " + getNombre() + " a: $" + this.bonoProductividad);
    }

    public double getBonoProductividad() {
        return bonoProductividad;
    }
}
