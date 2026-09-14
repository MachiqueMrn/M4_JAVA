package S20;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fallas ex = new Fallas();
        boolean salir = false;

        while (!salir) {
            System.out.println("=".repeat(60));
            System.out.println("    MENÚ DE EXCEPCIONES");
            System.out.println("=".repeat(60));
            System.out.println(
                "[1] FileNotFoundException.\n" +
                "[2] ArithmeticException.\n" +
                "[3] IndexOutOfBoundsException.\n" +
                "[4] NullPointerException.\n" +
                "[5] StackOverflowError.\n" +
                "[6] Salir del menú.\n\n" +
                "SELECCIONA LA EXCEPCIÓN QUE DESEAS VER:"
            );

            try {
                int op = sc.nextInt();
                sc.nextLine();

                if (op == 1) {
                    ex.exFaltaArchivo();
                } else if (op == 2) {
                    System.out.println("Ingresa el divisor (0):");
                    int divisor = sc.nextInt();
                    sc.nextLine();
                    ex.exDivisionPorCero(50, divisor);
                } else if (op == 3) {
                    ex.exFueraRango();
                } else if (op == 4) {
                    ex.exObjetoNulo();
                } else if (op == 5) {
                    ex.exStackOverflow();
                } else if (op == 6) {
                    salir = true;
                    System.out.println("\nCerrando menú de excepciones...");
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[⚠️ InputMismatchException] >> Ingresaste letras donde iba un número.");
                sc.nextLine();
            } catch (FileNotFoundException e) {
                System.out.println("\n[⚠️ FileNotFoundException] >> Java intentó leer el archivo, pero no existe.");
            } catch (ArithmeticException e) {
                System.out.println("\n[⚠️ ArithmeticException] >> Las leyes de las matemáticas dicen que no debes dividir entre 0.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\n[⚠️ ArrayIndexOutOfBoundsException] >> Te saliste de los limites de la lista o arreglo.");
            } catch (NullPointerException e) {
                System.out.println("\n[⚠️ NullPointerException] >> Intentaste hacer una acción con un objeto que tiene valor nulo.");
            } catch (StackOverflowError e) {
                System.out.println("\n[⚠️ StackOverflowError] >> ¡Error Crítico! La memoria del sistema colapsó." + 
                                   "\nEl sistema sigue funcionando, porque el 'Catch' encapsuló el error.");
            }
        }
        sc.close();
    }
}