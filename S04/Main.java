package S04;

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto de tipo persona, indicando que tiene 25 años
        Persona p = new Persona("Eric", 25);
        // Mostramos los datos de la persona
        p.mostrarDatos();
        // Modificamos la edad de la persona a 30 años
        p.setEdad(30);
        // Mostramos los datos de la persona con la edad actualizada
        System.out.println("Después de 5 años, ahora " + p.getNombre() + " tiene " + p.getEdad() + " años.");
    }
}
