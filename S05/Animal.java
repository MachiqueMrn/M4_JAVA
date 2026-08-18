package S05;

public class Animal {
    
    // Declaración de atributos
    protected String nombre;
    protected int edad;

    // Constructor de la clase
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método
    void sonido() {
        System.out.println(nombre + " hizo un sonido. " + nombre + " tiene " + edad + " años de edad.");
    }
}