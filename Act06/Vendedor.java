package Act06;

public class Vendedor extends Empleado {
    private double porcentajeComision;
    private int ventasExitosas;

    public Vendedor(String nombre, String numeroEmpleado, double salarioBase, double porcentajeComision) {
        // Constructor de Empleado
        super(nombre, numeroEmpleado, salarioBase);
        this.porcentajeComision = porcentajeComision;
        this.ventasExitosas = 0;
    }

    // Método propio
    public void registrarVentaExitosa() {
        this.ventasExitosas++;
        System.out.println("  -> [Vendedor] " + getNombre() + " registró una venta. Ventas realizadas: " + this.ventasExitosas);
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }
}
