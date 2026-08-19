package S07.Sobrecarga;

public class Calculadora {
    
    // 01. Sobrecarga de 2 enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // 02. Sobrecarga de 2 números con decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // 03. Sobrecarga de 3 número enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
