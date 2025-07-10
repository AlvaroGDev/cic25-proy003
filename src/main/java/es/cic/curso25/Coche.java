package es.cic.curso25;

public class Coche {

    public static final double CONSUMO_INSTANTANEO = 4.3;
    private Calculadora calculadora = new Calculadora();
    private int velocidad;

    public int getVelocidad() {
        return this.velocidad;
    }

    public double getConsumo() {

        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(CONSUMO_INSTANTANEO);
        return this.calculadora.getTotal();

        /*
         * En este caso, como calculadora.sumar recibe UN DOBLE, no habría que hacer la
         * conversión
         * Pasamos a 0, concretamente a 0.0 (un double)
         * Sumamos la velocidad actual
         * Dividimos entre 100 y multiplicamos por el consumo
         * Devolvemos el total
         * Es exactamente lo mismo de antes pero utilizando los métodos de otro objeto
         */

        /*
         * return velocidad / 100.0 * CONSUMO_INSTANTANEO;
         * Es importante poner el .0 para tomarlo como un número con decimales.
         * Al hacer una division de un entero entre un decimal, daria 0
         * Porque 50/100 daria 0.5, y un entero lo redondearía en 0
         * Otra opción posible: castear velocidad en un double. -> (double)velocidad /
         * 100 * consumo_instantaneo
         */
    }

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

    public int frenar(int decrementoVelocidad) {

      this.calculadora.limpiar(); //Lo llevamos a 0 porque en una calculadora, antes de hacer operaciones, lo reiniciamos
       this.calculadora.restar(decrementoVelocidad);((this.velocidad)); //Le sumamos la velocidad actual
       this.calculadora.restar(decrementoVelocidad); //Le sumamos el incremento

       this.velocidad= (int)Math.round(calculadora.getTotal());
        if (this.velocidad < 0)
            throw new ArithmeticException("Error: La velocidad no puede ser menor que 0");

        return this.velocidad;
    }

}
