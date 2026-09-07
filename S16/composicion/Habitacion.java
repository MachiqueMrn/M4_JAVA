package S16.composicion;

public class Habitacion {
    // Atributos
    private String nombreHabitacion;
    private double metrosCuadrados;

    // Constructor
    public Habitacion (String nombreHabitacion, double metrosCuadrados) {
        this.nombreHabitacion = nombreHabitacion;
        this.metrosCuadrados = metrosCuadrados;
    }

    // Método - Habitacion
    public void mostrarInfo() {
        System.out.println(
            "Espacio: " + nombreHabitacion + "." +
          "\nTamaño: " + metrosCuadrados + " m2." 
        );
    }
}
