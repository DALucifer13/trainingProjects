package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjactTest {
	
	private Blackjack black = new Blackjack();
	
	@Test
	public void testHighestWins() {

		assertEquals("Highest number did not win", 21, black.play(16, 21));
		
	}
	
	@Test	
	public void testOneBust() {

		assertEquals("Player has gone bust, but still won", 21, black.play(22, 21));
		
	}
	
	@Test	
	public void testTwoBust() {

		assertEquals("Player has gone bust, but still won", 21, black.play(21, 22));
		
	}
	
	@Test	
	public void testBothBust() {

		assertEquals("Players have gone bust, but we didn't get zero", 0, black.play(22, 22));
		
	}


}