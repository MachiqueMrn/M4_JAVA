import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Estación de Carga Pública ======");

        System.out.println("Ingrese la marca del telefono #1: ");
        String mt1 = sc.nextLine();
        TelefonoMovil tm1 = new TelefonoMovil(mt1);

        System.out.println("Ingrese la marca del telefono #2: ");
        String mt2 = sc.nextLine();
        TelefonoMovil tm2 = new TelefonoMovil(mt2);

        /*System.out.println("Ingrese el modelo del Auto: ");
        String ma = sc.nextLine();
        AutoElectrico ae = new AutoElectrico(ma);*/

        System.out.println("====== Iniciando suministro de energía ======");
        tm1.iniciarCarga();
        tm2.iniciarCarga();

        sc.close();
    }
}
