package Act06;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos
        Gerente gerente = new Gerente("Juan Ramirez", "JR-001", 25000.00, 5000.00);
        Vendedor vendedor = new Vendedor("Laura Terrazas", "LT-002", 85000.00, 7.5);

        System.out.println("\n======= Gerente =======");
        System.out.println(gerente.obtenerIdentificacion());
        gerente.asignarNuevoBono(8000);

        System.out.println("\n======= Vendedor =======");
        System.out.println(vendedor.obtenerIdentificacion());
        vendedor.registrarVentaExitosa();
        vendedor.registrarVentaExitosa();
        vendedor.registrarVentaExitosa();
        vendedor.registrarVentaExitosa();
        vendedor.registrarVentaExitosa();
        System.out.println("\n");
    }
}
