package fr.formation.test;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

//Classe dédiée au test de la classe Operation 
public class OperationTest {
	
	private Operation op;
	
	@Before
	public void setUp() throws Exception {
		op = new Operation();
	}

	@Test
	public void testAddition() {
//		assertEquals(14.0, op.addition(8.0, 6.0));
		assertEquals(14.0, op.addition(8.0, 6.0), 0.01);
	}

	@Test
	public void testSoustraction() {
		assertEquals("Probleme de soustraction", 2.0, op.soustraction(8.0, 6.0), 0.001);
	}

	@Test
	public void testChaines() {
		String ch1 = "A";
		String ch2 = "fezjkA".substring(5, 6);
		assertEquals(ch1, ch2);
	}
	
}

