package es.cic.curso25;

public class Vehiculo {

    protected Calculadora calculadora = new Calculadora();
    protected int velocidad;
    public static final double CONSUMO_INSTANTANEO = 4.3;
    

    public int acelerar(int incrementoVelocidad) {

        this.calculadora.limpiar(); // Lo llevamos a 0 porque en una calculadora, antes de hacer operaciones, lo
                                    // reiniciamos
        this.calculadora.sumar((this.velocidad)); // Le sumamos la velocidad actual
        this.calculadora.sumar(incrementoVelocidad); // Le sumamos el incremento

        this.velocidad = (int) Math.round(calculadora.getTotal());

        if (this.velocidad > 300)
            throw new ArithmeticException("Error:Por seguridad la velocidad no debe pasar de 300");

        return this.velocidad;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public double getConsumo() {

        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);
        return this.calculadora.getTotal();
    }

    public int frenar(int decrementoVelocidad) {

        this.calculadora.limpiar(); // Lo llevamos a 0 porque en una calculadora, antes de hacer operaciones, lo
                                    // reiniciamos
        this.calculadora.restar(decrementoVelocidad); // Le sumamos la velocidad actual
        this.calculadora.restar(decrementoVelocidad); // Le sumamos el incremento

        this.velocidad = (int) Math.round(calculadora.getTotal());
        if (this.velocidad < 0)
            throw new ArithmeticException("Error: La velocidad no puede ser menor que 0");

        return this.velocidad;
    }

}
