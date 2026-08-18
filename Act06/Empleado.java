package Act06;

public class Empleado {
    // Encapsulamiento
    private String nombre;
    private String numeroEmpleado;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, String numeroEmpleado, double salarioBase) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.salarioBase = salarioBase;
    }

    // Método
    public String obtenerIdentificacion() {
        return "Nombre: " + this.nombre + " | No. Empleado: " + this.numeroEmpleado;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
}
