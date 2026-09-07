package S17;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    // Atributo
    private String nombre;

    // Declaración de ArrayList
    private List<Jugador> listaJugadores; 

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
    }

    // Método que añade a los jugadores a la lista
    public void fichajeJugador(Jugador nuevoJugador) {
        listaJugadores.add(nuevoJugador);
        System.out.println("⚽ " + nuevoJugador.getNJugador() + " ha sido fichado.");
                        //  ⚽ Carlos Machique ha sido fichado.
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
                        //  Equipo: GEN14
        for (Jugador j : listaJugadores) {
            System.out.println(">> Jugador: " + j.getNJugador());
        }
    }
}