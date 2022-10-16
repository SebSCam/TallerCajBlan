package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.ConvertirDecimalesARomanos;

class TestDecimARom {

	@Test
	
	void testCero() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(0);
		assertEquals("", resultado);
	}
	
	void testDecimas() {
		ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();
		String resultado = conversor.convertirDecARomanos(5);
		assertEquals("v", resultado);
	}

}
