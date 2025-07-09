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

    public void restar(double valor){
        total-=valor;
    }

    public void multiplicar(double valor){
        total*=valor;
    }

    public void dividir(double valor){
        if(valor == 0)
            throw new Error("No dividas por 0");
        else total/=valor;
    }
}
