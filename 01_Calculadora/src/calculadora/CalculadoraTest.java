package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		int resultado = Calculadora.suma(3, 2);
		int esperado = 5;
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testResta() {
		int resultado = Calculadora.resta(3, 2);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

}
