package S14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Suscripcion socio = null;

        System.out.println("=".repeat(60));
        System.out.println("    Sistema de Cobro del Gym");
        System.out.println("=".repeat(60));

        System.out.println("\nEscribe el nombre del Socio: ");
        String nombre = sc.nextLine();

        System.out.println("\nEscribe la cantidad de meses a pagar: ");
        int meses = sc.nextInt();

        System.out.println("\nSeleccione el tipo de plan:");
        System.out.println("1. Plan básico.");
        System.out.println("2. Plan premium.");
        System.out.println("Opción: ");
        int op = sc.nextInt();

        if (op == 1) {
            socio = new PlanBasico(nombre, meses);
        } else if (op == 2) {
            System.out.println("\nIngrese el cargo único por uso de Spa:");
            double cargoSpa = sc.nextDouble();
            socio = new PlanPremium(nombre, meses, cargoSpa);
        } else {
            System.out.println("\nOpción no válida.");
        }

        if (socio != null) {
            System.out.println("\n");
            System.out.println("=".repeat(60));
            System.out.println("    Resumen de pago");
            System.out.println("=".repeat(60));
            System.out.println("Socio: " + nombre);
            System.out.println("Total a pagar: " + socio.calcularTotal());
        }

        sc.close();
    }
}
