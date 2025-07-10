package es.cic.curso25;

// Aquí habría un main
public class Calculadora {
    // Ante la duda, privado. Si no se va a usar, privado.
    private double total;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor) {
        total += valor;
    }

    public void restar(double valor) {
        total -= valor;
    }

    public void multiplicar(double valor) {
        total *= valor;
    }

    public void dividir(double valor) {
        if (valor == 0)
            throw new ArithmeticException("División por cero");
        else
            total /= valor;
        /*
         * En este caso, si testeamos, dividimos por 0 y da error por la
         * arithmeticexception estaría bien porque es lo que hemos querido
         */
    }
}
