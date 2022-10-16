package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import co.edu.uptc.classes.*;

class TestCalificacion {

	@Test
	void testExcelente() {
		System.out.println("Inicio de la prueba de calificación para el nivel Excelente :D");
		Calificacion calificacion = new Calificacion();
		String resultado = calificacion.calificacion(10, 9, 8);
		assertEquals("Excelente", resultado);
	}
	
	@Test
	void testBuena() {
		System.out.println("Inicio de la prueba de calificación para el nivel Buena :)");
		Calificacion calificacion = new Calificacion();
		String resultado = calificacion.calificacion(8, 8, 8);
		assertEquals("Buena", resultado);
	}
	
	@Test
	void testAceptable() {
		System.out.println("Inicio de la prueba de calificación para el nivel Aceptable :|");
		Calificacion calificacion = new Calificacion();
		String resultado = calificacion.calificacion(7, 7, 7);
		assertEquals("Aceptable", resultado);
	}
	
	@Test
	void testReprobado() {
		System.out.println("Inicio de la prueba de calificación para el nivel Reprobado :(");
		Calificacion calificacion = new Calificacion();
		String resultado = calificacion.calificacion(1, 5, 3);
		assertEquals("Reprobado", resultado);
	}

}
