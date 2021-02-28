package fr.formation.test;

import org.junit.Test;

//Classe dédiée au test de la classe Operation 
public class ExceptionTest {
	
	

	
	@Test(expected = ArithmeticException.class)
	public void testException1() {
		division(4,0);
	}

	
	@Test(expected = ArithmeticException.class)
	public void testException2() {
		division(4,1);
	}
	
	
	private double division(double num, double denom) throws ArithmeticException {
		if (denom == 0.0) 
			throw new ArithmeticException("Denom égal à 0");
		else
			return num / denom;
	}
	
}

