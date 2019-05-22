package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculadoraParametro {

	@Parameters
	public static Iterable<Object[]> getData() {
		return Arrays.asList(
					new Object[][] {
						{3, 1, 4}, 
						{2, 3, 5},  
						{-1, 1, 0} 
					}
				);
	}
	
	private int a, b, exp;
	
	public CalculadoraParametro(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	@Test
	public void testAdd() {
		assertEquals(exp, Calculadora.suma(a, b));
	}
}
