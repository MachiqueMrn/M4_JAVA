package S16.composicion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("    CONSTRUCTORA GEN14");
        System.out.println("=".repeat(50));

        System.out.println(">> Ingrese la dirección de la nueva casa: ");
        String direccion = sc.nextLine();

        System.out.println(">> Ingrese el nombre del espacio: ");
        String nombreHab = sc.nextLine();

        System.out.println(">> Ingrese los metros cuadrados de la habitación: ");
        double metros = sc.nextDouble();

        Casa miCasa = new Casa(direccion, nombreHab, metros);

        System.out.println("=".repeat(50));
        System.out.println("    RESUMEN DE CONSTRUCCIÓN");
        System.out.println("=".repeat(50));

        miCasa.mostrarInfo();

        sc.close();
    }
}