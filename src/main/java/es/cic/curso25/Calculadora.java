package es.cic.curso25;

public class Calculadora {
    // Ante la duda, privado. Si no se va a usar, privado.
    private double total;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor) {
        total += valor;
    }
}
