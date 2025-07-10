package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
/* Zona de importaciones. Se importa toda esa linea acabada en "Test" para que el programa sepa a donde está apuntando */

public class CalculadoraTest {

    Calculadora cut = new Calculadora();
    double valorActual;
    // cut = ClassUnderTest

    @Test
    public void testSumar() {

        cut.sumar(5.6);

        valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.001);
        /* Delta es la variacion que le permitimos porque existen decimales muy largos y
        ueden tener pequeñas diferencias */

        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual, 0.000001);
    }

    @Test
    public void testRestar() {

        // ahora mismo el valor está a 0
        cut.restar(6);
        // El valor pasa a ser -6
        valorActual = cut.getTotal();
        // valorActual debería ser -6. Usamos el get porque es privado
        assertEquals(-6, valorActual, 0.000001);
    }

    @Test
    public void testMultiplicar() {

        cut.sumar(5);
        cut.multiplicar(5);
        // Sumamos primero 5 para que no multiplique por 0 y poder revisar que funciona
        
        valorActual = cut.getTotal();
        // Recogemos el total como siempre

        assertEquals(25, valorActual);
        // Por último comparamos
    }
    
    @Test
    public void testDividir() {

        cut.sumar(10);
        cut.dividir(5);

        valorActual = cut.getTotal();

      assertThrows(ArithmeticException.class, 
      ()->cut.dividir(0));
        // Tenemos que usar esa sintaxis para poder 

        assertEquals(2, valorActual);
    }
}
