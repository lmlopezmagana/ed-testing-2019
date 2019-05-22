package calculadora.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculadora.Calculadora;

public class CalculadoraTest {

	static Calculadora calculadora;

	@BeforeClass
	public static void primero() {
		System.out.println("primero()");
		calculadora = new Calculadora();
	}
	
	@AfterClass
	public static void ultimo() {
		System.out.println("Agradecida y emocionada solo puedo decir gracias por venir");
	}

	
	@Before
	public void antes() {
		System.out.println("antes()");
	}
	
	@After
	public void despues() {
		System.out.println("despues()");
	}
	
	
	
	@Test 
	public void testSumaNegativoYPositivo() {
		System.out.println("testSumaNegativoYPositivo()");
		assertEquals(-1, calculadora.sum(-3, 2));
	}
	
	@Test
	public void testSumaNegativos() {
		System.out.println("testSumaNegativos()");
		assertEquals(-2, calculadora.sum(-1, -1));
	}
	
}
