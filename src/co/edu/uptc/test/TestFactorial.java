package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.Factorial;

class TestFactorial {

	@DisplayName("1. Prueba de el numero cero")
	@Test
	void testCero() {
		Factorial factorial = new Factorial();
		double resultado = factorial.factorial(0);
		assertEquals(1.0, resultado);
	}
	
	@DisplayName("2. Prueba de un numero mayor que 0 y menor a diez")
	@Test
	void testMenorDiez() {
		Factorial factorial = new Factorial();
		double resultado = factorial.factorial(5);
		assertEquals(120.0, resultado);
	}
	
	@DisplayName("3. Prueba de un numero mayor a diez")
	@Test
	void testMayorDiez() {
		Factorial factorial = new Factorial();
		double resultado = factorial.factorial(12);
		assertEquals(479001600.0, resultado);
	}
	
	@DisplayName("4. Prueba de un numero menor a cero")
	@Test
	void testMenorCero() {
		Factorial factorial = new Factorial();
		double resultado = factorial.factorial(-6);
		assertEquals(-720, resultado);
	}

}
