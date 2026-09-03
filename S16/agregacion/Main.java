package S16.agregacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("    SISTEMA DE FICHAJES");
        System.out.println("=".repeat(50));

        System.out.println("> Ingresa el nombre del jugador:");
        String nombreJugador = sc.nextLine();

        System.out.println("> Ingresa la posición del jugador:");
        String posicion = sc.nextLine();

        // Objeto Jugador
        Jugador jugador = new Jugador(nombreJugador, posicion);

        System.out.println("\n> Ingresa el nombre del Club que lo contrará:");
        String nombreClub = sc.nextLine();

        // Objeto Club
        Club club = new Club(nombreClub, jugador);

        System.out.println("\n");
        System.out.println("=".repeat(50));
        System.out.println("    RESUMEN DE CONTRATACIÓN");
        System.out.println("=".repeat(50));
        club.mostrarInfo();

        sc.close();
    }
}
