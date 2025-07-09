package es.cic.curso25;

import org.junit.jupiter.api.Test;
/* Zona de importaciones. Se importa toda esa linea acabada en "Test" para que el programa sepa a donde está apuntando */

public class CalculadoraTest {
    @Test
    public void testLanzar() {
        Calculadora c = new Calculadora();
        Calculadora d = c;
        c.setTotal(3);
        //d apunta AL MISMO SITIO QUE C. si C.total es 3, D.total TAMBIÉN es 3
        c = new Calculadora();
        c.setTotal(4.5);
        
    } 
    
}
