package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.PrivateKey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CocheTest {

    private Coche cut;
    /*
     * Existen beforeEach y BeforeAll.
     * El primero ejecuta la función antes de cada test, y el segundo lo ejecuta
     * antes de pasar todos los test seguidos.
     * En este caso creamos la variable fuera por el entorno de variables.
     */

    @BeforeEach
    public void setUp() {
        cut = new Coche();
    }

    @Test
    void testAcelerar() {
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(223);
        assertEquals(34 + 223, velocidadFinal, "Error: la velocidad no coincide");

    }

    @Test
    void testFrenar() {

        cut.acelerar(50);
        int velocidadFinal = cut.frenar(30);
    
            assertEquals(50-30, velocidadFinal,"Error: la velocidad tras el frenado no coincide");
    }
    


    @Test
    void testGetConsumo() {
        cut.acelerar(50);

        double consumoActual = cut.getConsumo();
        assertEquals(2.15, consumoActual, "El consumo no coincide");
    }

    @Test
    void testGetVelocidad() {

        cut.acelerar(50);

        double velocidadFinal = cut.getVelocidad();
        assertEquals(50, velocidadFinal, "La velocidad no coincide");
    }
    // Por lo general, getters y setters no se testean
}
