package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
/* Zona de importaciones. Se importa toda esa linea acabada en "Test" para que el programa sepa a donde está apuntando */

public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora cut = new Calculadora();
        //cut = ClassUnderTest

        cut.sumar(5.6);

        double valorActual = cut.getTotal();
        assertEquals(5.6,valorActual,0.001); 
        //Delta es la variacion que le permitimos porque existen decimales muy largos y pueden tener pequeñas diferencias

        cut.sumar(3.4);
        valorActual = cut.getTotal();

        assertEquals(9, valorActual,0.000001);
    } 
    
}

