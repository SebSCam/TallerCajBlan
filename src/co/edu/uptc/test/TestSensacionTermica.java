package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import co.edu.uptc.classes.SensacionTermica;

public class TestSensacionTermica {
    @DisplayName("1. Prueba de un numero < 10")
	@Test
	void testMenorDiez() {
		SensacionTermica termica = new SensacionTermica();
		String resultado = termica.sensacionTermica(2);
		assertEquals("Hace mucho fr�o.", resultado);
	}
    @DisplayName("2. Prueba de un numero 10<=n<15")
	@Test
	void testMenorQuince() {
		SensacionTermica termica = new SensacionTermica();
		String resultado = termica.sensacionTermica(12);
		assertEquals("Hace poco fr�o.", resultado);
	}
    @DisplayName("3. Prueba de un numero 15<=n<25")
	@Test
	void testMenorVeinticinco() {
		SensacionTermica termica = new SensacionTermica();
		String resultado = termica.sensacionTermica(24);
		assertEquals("Hace una temperatura normal.", resultado);
	}
    @DisplayName("4. Prueba de un numero 25<=n<30")
	@Test
	void testMenorTreinta() {
		SensacionTermica termica = new SensacionTermica();
		String resultado = termica.sensacionTermica(28);
		assertEquals("Hace poco calor.", resultado);
	}
    @DisplayName("5. Prueba de un numero >= 30")
	@Test
	void testMayorTreinta() {
		SensacionTermica termica = new SensacionTermica();
		String resultado = termica.sensacionTermica(32);
		assertEquals("Hace mucho calor.", resultado);
	}
}
