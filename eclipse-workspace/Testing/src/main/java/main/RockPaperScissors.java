package main;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	int gamesWon = 0;
	int gamesLost = 0;
	int gamesTied = 0;
	double rockCount = 0;
	double paperCount = 0;
	double scissorCount = 0;
	
	
	public void playGame() {
		boolean player = true;
		while(player) {
			
			System.out.println("Enter rock, paper or scissors");
			String input = sc.nextLine();
			
			String output = gameFunction(input);
			System.out.println(output);
			
			
			
			System.out.println("\nDo you want to play again, yes or no");
			String sin = sc.nextLine();
			if (sin.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		sc.close();
		gameEnd();
		
	}
		
	
	public String gameFunction(String input) {
		
		int rock = 0;
		int paper = 0;
		int scissors = 0;
		String output;
		
		if(input.equalsIgnoreCase("rock")) {
			rock = 1;
		}
		else if(input.equalsIgnoreCase("paper")) {
			paper = 1;
		}
		else if(input.equalsIgnoreCase("scissors")) {
			scissors = 1;
		}
		else {
			System.out.println("Input Error, try again");
			System.exit(0);
		}
		
		int gameChoice = (rand.nextInt(3));
		System.out.println(gameChoice);
		if (gameChoice == 0) {
			output = rockGame(rock, paper, scissors);
		}
		else if (gameChoice == 1) {
			output = paperGame(rock, paper, scissors);
		}
		else if(gameChoice == 2){
			output = scissorsGame(rock, paper, scissors);
		}
		else {
			output = "oopsitbroke";
		}
		
		return output;
	}
	
	
	
	
	public String rockGame(int rock, int paper, int scissors){
		rockCount++;
		if (rock == 1) {
			rockCount++;
			gamesTied++;
			return "rock bounces off of rock, you tie";
		}
		else if (paper == 1) {
			paperCount++;
			gamesWon++;
			return "paper covers rock, you win";
		}
		else if (scissors == 1) {
			scissorCount++;
			gamesLost++;
			return "rock breaks scissors, you lose";
		}
		else {
			return "game error";
		}
	}

	public String paperGame(int rock, int paper, int scissors){
		paperCount++;
		if (rock == 1) {
			rockCount++;
			gamesLost++;
			return "paper covers rock, you lose";
		}
		else if (paper == 1) {
			paperCount++;
			gamesTied++;
			return "paper hit each other, doing no damage, you draw";
		}
		else if (scissors == 1) {
			scissorCount++;
			gamesWon++;
			return "scissors cuts paper, you win";
		}
		else {
			return "game error";
		}
	}
	
	public String scissorsGame(int rock, int paper, int scissors){
		scissorCount++;
		if (rock == 1) {
			rockCount++;
			gamesWon++;
			return "rock breaks scissors, you win";
		}
		else if (paper == 1) {
			paperCount++;
			gamesLost++;
			return "scissors cuts paper, you lose";
		}
		else if (scissors == 1) {
			scissorCount++;
			gamesTied++;
			return "scissors jam each other, you draw";
		}
		else {
			return "game error";
		}
	}
	
	public void gameEnd() {
		double rockPerc = (rockCount / (paperCount + scissorCount)*100) / 3 ;
		double paperPerc = (paperCount / (rockCount + scissorCount)*100) / 3 ;
		double scissorPerc = (scissorCount / (paperCount + rockCount)*100) / 3 ;
		int gamesTotal = (gamesWon + gamesLost + gamesTied);
		String maxHand = "";
		double maxPerc = 0;
		if (rockCount >= (paperCount + scissorCount)) {
			maxHand = maxHand + "Rock\n";
			maxPerc = rockPerc;
		}
		else if (paperCount >= (rockCount + scissorCount)) {
			maxHand = maxHand + "Paper\n";
			maxPerc = paperPerc;
		}
		else if (scissorCount >= (rockCount + paperCount)) {
			maxHand = maxHand + "Scissors\n";
			maxPerc = scissorPerc;
		}
		

		System.out.println("Thank you for playing.\nYou won " + gamesWon + " games\nYou lost "
				+ "" + gamesLost + " games\nYou tied " + gamesTied + " games "
						+ "for a total of " + gamesTotal + " games."
				+ "\n" + maxHand + "was played the most this game, being played " + maxPerc + "% of the time");
		
	}
	
}
