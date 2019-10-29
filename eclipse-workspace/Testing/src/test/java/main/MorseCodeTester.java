package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MorseCodeTester {
	private MorseCodeTranslator m = new MorseCodeTranslator();
	
	@Test
	public void test() {
		assertEquals("Test should return a", "a", m.translateToString(".-"));
	}
	
	@Test
	public void test2() {
		assertEquals("Test should return z", "z", m.translateToString("--.."));
	}
	
	@Test
	public void test3() {
		assertEquals("Test should return l", "l", m.translateToString(".-.."));
	}
	
	@Test
	public void test4() {
		assertEquals("Test should return hello", "hello", m.translateToString(".... . .-.. .-.. ---"));
	}

	@Test
	public void test5() {
		assertEquals("Test should return hello world", "hello world", m.translateToString(".... . .-.. .-.. --- / .-- --- .-. .-.. -.."));
	}
}
