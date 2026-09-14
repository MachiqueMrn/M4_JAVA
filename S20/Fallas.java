package S20;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Fallas {
    
    // Checked Exception -> "throws"
    public void exFaltaArchivo() throws FileNotFoundException {
        System.out.println(">> Buscando archivo [Acta de calificaciones.xls] en el disco duro.");
        FileReader lector = new FileReader("Acta de calificaciones.xls");
    }

    // Unchecked
    public void exFueraRango() {
        System.out.println(">> Accediendo a la posición 10 de un arreglo de 3 espacios...");
        int[] numeros = {15, 68, 93};
        int valor = numeros[10];
    }

    // Unchecked
    public void exDivisionPorCero(int a, int b) {
        System.out.println(">> Calculando la división...");
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }

    // Unchecked
    public void exObjetoNulo() {
        System.out.println(">> Intentando leer un dato que no existe...");
        String textoVacio = null;
        int longitud = textoVacio.length();
    }

    // Error critico
    public void exStackOverflow() {
        exStackOverflow();
    }
}
