package co.edu.uptc.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import co.edu.uptc.classes.*;

class TestCalificacion {

	@Test
	void testExcelente() {
		System.out.println("Inicio de la prueba de calificación para el nivel Excelente ");
		Calificacion calificacion = new Calificacion();
		String resultado = calificacion.calificacion(10, 9, 8);
		assertEquals(resultado, "Excelente");
	}

}
