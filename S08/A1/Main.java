package S08.A1;

public class Main {
    public static void main(String[] args) {
        Pelicula p = new Pelicula("SpiderMan: Brand New Day", 145, "Destin Daniel Cretton");
        Serie s = new Serie("The Big Bang Theory", 22, 12);

        System.out.println("=".repeat(60));
        System.out.println("Pelicula de estreno");
        System.out.println("=".repeat(60));
        p.mostrarInfo();
        System.out.println("=".repeat(60));
        System.out.println("Serie favorita");
        System.out.println("=".repeat(60));
        s.mostrarInfo();
        System.out.println("=".repeat(60));

    }
}
