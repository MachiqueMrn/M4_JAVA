package S05;

public class Perro extends Animal {

    // Declaración de atributos propios
    private String raza;
    
    // Constructor de la clase Animal
    public Perro(String nombre, int edad, String raza) {
        // Llamado del constructor de la clase padre
        super(nombre, edad);
        this.raza = raza;
    }

    // Sobreescritura del metodo heredado
    @Override
    void sonido(){
        System.out.println(nombre + " ladra: ¡Guau!");
    }

    // Método propio
    void moverCola() {
        System.out.println(nombre + " de raza " + raza + " tiene " + edad + " años de edad y mueve la cola felizmente.");
    }
}