package main;

public class Coins {
	
	public void money(double input) {
		
		int fiftysN = 0;
		fiftysN = (int) input / 50;
		input = input - (fiftysN * 50);
		
		int twentiesN = 0;
		twentiesN = (int) input / 20;
		input = input - (twentiesN * 20);
		
		int tensN = 0;
		tensN = (int) input / 10;
		input = input - (tensN * 10);
		
		int fivesN = 0;
		fivesN = (int) input / 5;
		input = input - (fivesN * 5);
		
		int onesN = 0;
		onesN = (int) input / 1;
		input = input - (onesN * 1);
		
		int fiftys = 0;
		fiftys =  (int) (input / 0.5);
		input = input - (fiftys * 0.5);
		
		int twenties = 0;
		twenties =  (int) (input / 0.2);
		input = input - (twenties * 0.2);
		
		int tens = 0;
		tens =  (int) (input / 0.1);
		input = input - (tens * 0.1);
		
		int fives = 0;
		fives =  (int) (input / 0.05);
		input = input - (fives * 0.05);
		
		int ones = 0;
		ones =  (int) (input / 0.01);
		input = input - (ones * 0.01);
		
		System.out.println("Your change is: " + fiftysN + " fifty pound note(s)");
		System.out.println("Your change is: " + twentiesN + " twenty pound note(s)");
		System.out.println("Your change is: " + tensN + " ten pound note(s)");
		System.out.println("Your change is: " + fivesN + " five pound note(s)");
		System.out.println("Your change is: " + onesN + " one pound coin(s)");
		System.out.println("Your change is: " + fiftys + " fifty pence piec(s)");
		System.out.println("Your change is: " + twenties + " twenty pence piec(s)");
		System.out.println("Your change is: " + tens + " ten pence piec(s)");
		System.out.println("Your change is: " + fives + " five pence piec(s)");
		System.out.println("Your change is: " + ones + " one pence piec(s)");
		
	}

}