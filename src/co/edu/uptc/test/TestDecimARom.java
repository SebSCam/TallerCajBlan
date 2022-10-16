package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.ConvertirDecimalesARomanos;

class TestDecimARom {

	@DisplayName("1. Prueba de el numero cero")
	@Test
	void testCero() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(0);
		assertEquals("", resultado);
	}
	@DisplayName("2. Prueba de un numero con unidades")
	@Test
	void testUnidades() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(5);
		assertEquals("V", resultado);
	}
	
	@DisplayName("3. Prueba de un numero con decimas")
	@Test
	void testDecimas() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(15);
		assertEquals("XV", resultado);
	}
	
	@DisplayName("4. Prueba de un numero con centenas")
	@Test
	void testCentenas() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(135);
		assertEquals("CXXXV", resultado);
	}
	
	@DisplayName("5. Prueba de un numero con milesimas")
	@Test
	void testMilesimas() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(1635);
		assertEquals("MDCXXXV", resultado);
	}
	/*
	@DisplayName("5. Prueba de un numero con diezmilesimas")
	@Test
	void testdiezMilesimas() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(10635);
		assertEquals("XDCXXXV", resultado);
	}*/
	
	
}
