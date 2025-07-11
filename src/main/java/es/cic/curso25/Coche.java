package es.cic.curso25;

public class Coche extends Vehiculo {



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
