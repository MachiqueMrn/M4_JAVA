package S04;

public class Persona {
    
    // Declaración de atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método get
    public String getNombre() {
        return nombre;
    }

    // Método get
    public int getEdad() {
        return edad;
    }

    // Método set
    public int setEdad(int nuevaEdad) {
        return edad = nuevaEdad;
    }

    // Método normal
    void mostrarDatos() {
        System.out.println("=".repeat(20));
        System.out.println("ACTIVIDAD ENCAPSULAMIENTO");
        System.out.println("=".repeat(20));
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
        System.out.println("=".repeat(20));
    }
}