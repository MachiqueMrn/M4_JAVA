package S08.A1;

public class Serie extends Contenido{
    
    // Atributo
    private int temporadas;

    // Constructor
    public Serie (String titulo, int duracion, int temporadas) {
        super(titulo, duracion);
        this.temporadas = temporadas;
    }

    @Override
    void mostrarInfo() {
        System.out.println(
            "Titulo: " + titulo + 
          "\n   > Duración: " + duracion + " minutos." +
          "\n   > Temporadas: " + temporadas
        );
    }
}
