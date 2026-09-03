package S16.agregacion;

public class Club {
    // Atributos
    private String nombreClub;

    // Relación de agregación
    private Jugador jugadorEstrella;

    // Constructor
    public Club (String nombreClub, Jugador jugadorEstrella) {
        this.nombreClub = nombreClub;
        this.jugadorEstrella = jugadorEstrella;
    }

    // Método - Club
    public void mostrarInfo() {
        System.out.println(
            "Club: " + nombreClub
        );
        System.out.println(
            "Fichaje Estrella: " + jugadorEstrella.getNombre() + " (" + jugadorEstrella.getPosicion() + "). "
        );
    }
}
