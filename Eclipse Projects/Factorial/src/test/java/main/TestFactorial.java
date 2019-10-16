package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestFactorial {

	private Factorial fact = new Factorial();
	
	
	@Test
	public void successTest() {
		assertEquals("Does not return proper result", "5!", fact.run(120));
	}
	
	@Test
	public void failTest() {
		assertEquals("Returns a number followed by an exclimation point", "NONE", fact.run(150));
	}
	
	@Test
	public void largeSuccessTest() {
		assertEquals("Does not return proper result", "11!", fact.run(39916800));
	}
	
	@Test
	public void largeFailTest() {
		assertEquals("Returns a number followed by an exclimation point", "NONE", fact.run(40000000));
	}
	
	
}
