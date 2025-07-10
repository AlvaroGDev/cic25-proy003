package es.cic.curso25;

public class Coche {

    public final double CONSUMO_INSTANTANEO = 4.3;
    private int velocidad;

    public int getVelocidad() {
        return this.velocidad;
    }

    public double getConsumo() {

        return velocidad / 100.0 * CONSUMO_INSTANTANEO;
        /*
         * Es importante poner el .0 para tomarlo como un número con decimales.
         * Al hacer una division de un entero entre un decimal, daria 0
         * Porque 50/100 daria 0.5, y un entero lo redondearía en 0
         * Otra opción posible: castear velocidad en un double. -> (double)velocidad / 100 * consumo_instantaneo
         */
    }

    public int acelerar(int incrementoVelocidad) {

        this.velocidad += incrementoVelocidad;

        if (this.velocidad > 300)
            throw new ArithmeticException("Error:Por seguridad la velocidad no debe pasar de 300");

        return this.velocidad;
    }

    public int frenar(int decrementoVelocidad) {

        this.velocidad -= decrementoVelocidad;

        if (this.velocidad < 0)
            throw new ArithmeticException("Error: La velocidad no puede ser menor que 0");

        return this.velocidad;
    }

}
