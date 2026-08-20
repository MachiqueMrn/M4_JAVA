package S08.A1;

public class Contenido {
    
    // Atributos
    protected String titulo;
    protected int duracion;

    // Constructor
    public Contenido(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    void mostrarInfo() {
        System.out.println(
            "> Titulo: " + titulo + 
          "\n> Duración: " + duracion + " minutos."
        );
    }
}
