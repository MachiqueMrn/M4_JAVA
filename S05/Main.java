package S05;

public class Main {
    public static void main(String[] args) {
        
        Animal miAnimal = new Animal("Animal", 5);
        System.out.println("=".repeat(20));
        miAnimal.sonido();
        System.out.println("=".repeat(20));
        Perro miPerro = new Perro("Oddie", 10, "Schnauzer");
        miPerro.sonido();
        System.out.println("=".repeat(20));
        miPerro.moverCola();
        System.out.println("=".repeat(20));
    }
}