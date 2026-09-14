package S16.composicion;

public class Casa {
    
    // Atributos
    private String direccion;
    private Habitacion habPrincipal;

    // Constructor
    public Casa(String direccion, String nombreHabitacion, double metrosCuadrados) {
        this.direccion = direccion;
        this.habPrincipal = new Habitacion(nombreHabitacion, metrosCuadrados);
    }

    // Método
    public void mostrarInfo() {
        System.out.println("Casa ubicada en: " + direccion + ".");
        habPrincipal.mostrarInfo();
    }
}