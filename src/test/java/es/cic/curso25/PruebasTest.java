package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class PruebasTest {

    @Test
    void lanzame() {
        boolean valor = true;
        char letra = 'e';

        Coche miCoche2 = new Coche();
        Object miCoche = miCoche2;

        Camion miCamioncito = new Camion();

        miCamioncito.meterCarga();

        GruaDelPuerto teodoro = new GruaDelPuerto();

        teodoro.meterCarga();

        Object referencia = teodoro;
        referencia.toString();
        referencia = miCamioncito;
        referencia.toString();
    }

    public void acelerarRemotamente(Camion camion, int incremento) {
        camion.acelerar(incremento);

    }
}
