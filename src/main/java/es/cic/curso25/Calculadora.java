package es.cic.curso25;

public class Calculadora {
    // Ante la duda, privado. Si no se va a usar, privado.
    private double total;
    public double getTotal() {
        return total;
    }

    public void setTotal (double total){
        this.total = total;
    }
    public void noHagoNada(){
        total = 3;
    }
}
