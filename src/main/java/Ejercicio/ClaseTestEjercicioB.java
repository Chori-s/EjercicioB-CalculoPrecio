package com.ejercicio.precio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoPrecioTest {

    @Test
    public void testCalculoPrecioConIVAySinPromo() {
        double resultado = CalculoPrecio.calcularPrecioFinal(100, "general", "nopro");
        assertEquals(121.0, resultado, 0.01);
    }

    @Test
    public void testCalculoPrecioConPromoMitad() {
        double resultado = CalculoPrecio.calcularPrecioFinal(50, "reducido", "mitad");
        assertEquals(27.5, resultado, 0.01);
    }

    @Test
    public void testCalculoPrecioConPromoMeno5() {
        double resultado = CalculoPrecio.calcularPrecioFinal(30, "superreducido", "meno5");
        assertEquals(26.2, resultado, 0.01);
    }

    @Test
    public void testCalculoPrecioConPromo5porc() {
        double resultado = CalculoPrecio.calcularPrecioFinal(200, "general", "5porc");
        assertEquals(228.0, resultado, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTipoIVAInvalido() {
        CalculoPrecio.calcularPrecioFinal(100, "invalido", "nopro");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCodigoPromoInvalido() {
        CalculoPrecio.calcularPrecioFinal(100, "general", "invalido");
    }
}
