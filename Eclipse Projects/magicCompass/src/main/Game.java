package main;

import java.util.Random;
import java.util.Scanner;

public class Game {

	Compass cm = new Compass();
	Opening op = new Opening();
	Ending ed = new Ending();
	Random rand = new Random();
	Message msg = new Message();
	Movement move = new Movement();
	
	public void play() {
		
		String direction = "";
		Scanner scan2 = new Scanner(System.in);
		
		op.PrintOpening();
		
		while(true) {
			int distance = 1;
			System.out.println("You are " + cm.getDist() + " meters away from your destination");
			System.out.println("Enter a direction, north, south, east or west: \n");
			String input1 = scan2.nextLine();
			if(input1.contains(" ")) {
				String []in = input1.split(" ");
				direction = in[0];
				distance = Integer.parseInt(in[1]);	
			}
			else {
				direction = input1;
				
			}
			
			move.SetMovement(direction, distance);
			
			int chance = rand.nextInt(100);
			if (chance == 69) {
				System.out.println("An unexpected encounter!!!");
				cm.setCompassNorthSouth(move.pl.getPlayerNorthSouth());
				cm.setCompassEastWest(move.pl.getPlayerEastWest());
			}
			
			if (cm.getCompassNorthSouth() == move.pl.getPlayerNorthSouth() && cm.getCompassEastWest() == move.pl.getPlayerEastWest()) {
				String message = msg.GetMessage();
				System.out.println(message + "\n");
								
				if (message.contains("Portal")){
					System.out.println("You Escaped!!!");
					System.out.println(ed.Loot());
					break;
					}
				else if (message.contains("BOOM")){
					System.out.println("\nYou lose the game");
					System.out.println(ed.LostLoot());
					break;
					}
				else {
					cm.setCompassNorthSouth(rand.nextInt(30)-15);
					cm.setCompassEastWest(rand.nextInt(30)-15);
					
				}
			}
		}
		scan2.close();
	}
			
}
