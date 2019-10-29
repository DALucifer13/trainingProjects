package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.RockPaperScissors;

public class TestRockPaperScissors {
	
	RockPaperScissors rps = new RockPaperScissors();
	
	@Test
	public void testRock1() {
		assertEquals("User should be able to enter choice", "rock breaks scissors, you lose", rps.rockGame(0,0,1));
	}
	
	@Test
	public void testRock2() {
		assertEquals("User should be able to enter choice", "paper covers rock, you win", rps.rockGame(0,1,0));
	}
	
	@Test
	public void testRock3() {
		assertEquals("User should be able to enter choice", "rock bounces off of rock, you tie", rps.rockGame(1,0,0));
	}
	
	@Test
	public void testPaper1() {
		assertEquals("User should be able to enter choice", "scissors cuts paper, you win", rps.paperGame(0,0,1));
	}
	
	@Test
	public void testPaper2() {
		assertEquals("User should be able to enter choice", "paper hit each other, doing no damage, you draw", rps.paperGame(0,1,0));
	}
	
	@Test
	public void testPapaer3() {
		assertEquals("User should be able to enter choice", "paper covers rock, you lose", rps.paperGame(1,0,0));
	}
	
	@Test
	public void testScissors1() {
		assertEquals("User should be able to enter choice", "scissors jam each other, you draw", rps.scissorsGame(0,0,1));
	}
	
	@Test
	public void testScissors2() {
		assertEquals("User should be able to enter choice", "scissors cuts paper, you lose", rps.scissorsGame(0,1,0));
	}
	
	@Test
	public void testScissors3() {
		assertEquals("User should be able to enter choice", "rock breaks scissors, you win", rps.scissorsGame(1,0,0));
	}
	
	

}
