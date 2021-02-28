package fr.formation.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;

public class AssertionsTest {

	
	@Test
	public void testTableaux() {
		
		char[] tab1 = {'J', 'a', 'v', 'a'};
		char[] tab2 = "Java".toCharArray();
		
		assertArrayEquals(tab1, tab2);
	}	
	
	@Test
	public void testTableauxVides() {
		
		char[] tab1 = null;
		char[] tab2 = null;
		
		assertArrayEquals(tab1, tab2);
	}
	

	@Test
	public void testNonNul() {
		String s = "chaine";
		assertNotNull(s);
	}
	

	@Test
	public void testNul() {
		String s = null;
		assertNull("La chaine s", s);
	}

	@Test
	public void testSame() {
		String s1 = "A";
		String s2 = new String ("A");
		assertSame("s1 et s2", s1, s2);  // Le test échoue
	}

	@Test
	public void testNotSame() {
		String s1 = "A";
		String s2 = "A";
		assertNotSame("s1 et s2", s1, s2);  // Le test échoue
	}

	@Test
	public void testVrai() {
		String s1 = "A";
		String s2 = "A";
		assertTrue("s1 et s2", s1.equals(s2));  
	}

	@Test
	public void testFaux() {
		String s1 = "B";
		String s2 = "A";
		assertFalse("s1 et s2", s1.equals(s2));  
	}
	
	@Test
	public void testAssertThat1() {
		String s1 = "ABC";
		
		assertThat(s1.toLowerCase(), is("abc"));
	}
	
	@Test
	public void testAssertThatString() {
		String s1 = "ABC";
		
		assertThat(s1, containsString("BC"));  // OK
		assertThat(s1, containsString("bC"));  // fail
	}
	
	
	
	
	@Test
	public void testAssertThat2() {
		List<String> actual = Arrays.asList("a", "b", "c");
		
		assertThat(actual, hasItems("a", "c"));  // ok
		assertThat(actual, hasItems("a", "d"));	 // fail
	}
	
	
	@Test
	public void testAssertThat3() {
		List<String> actual = Arrays.asList("a", "b", "c");
		
		assertThat(actual, anyOf(hasItems("a", "c"), hasItems("a", "d")));	 // ok
	}
	

	@Test
	public void testAssertThat4() {
		List<String> actual = Arrays.asList("a", "b", "c");
		
		assertThat(actual, allOf(hasItems("a", "c"), hasItems("a", "d")));	 // fail
	}
	

	
}
