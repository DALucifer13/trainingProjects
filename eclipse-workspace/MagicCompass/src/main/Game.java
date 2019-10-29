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
	Distance dist = new Distance();
	Player pl = new Player();
	
	public void play() {
		
		String direction = "";
		Scanner scan2 = new Scanner(System.in);
		
		op.PrintOpening();
		
		while(true) {
			int distance = 1;
			System.out.println("You are " + dist.getDistance(pl.getPlayerNorthSouth(), pl.getPlayerEastWest(), cm.getCompassNorthSouth(), cm.getCompassEastWest()) + " meters away from your destination");
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
			
			
			
			int movement = 0;
			
			if (direction.equals("north") || direction.equals("n") || direction.equals("North")) {
				movement = move.SetMovementNs(direction, distance, pl.getPlayerNorthSouth());
				pl.setPlayerNorthSouth(movement);
			}
			else if (direction.equals("south") || direction.equals("s") || direction.equals("South")) {
				movement = move.SetMovementNs(direction, distance, pl.getPlayerNorthSouth());
				pl.setPlayerNorthSouth(movement);
			}
			else if (direction.equals("east") || direction.equals("e") || direction.equals("East")) {
				movement = move.SetMovementEw(direction, distance, pl.getPlayerEastWest());
				pl.setPlayerEastWest(movement);
			}
			else if (direction.equals("west") || direction.equals("w") || direction.equals("West")) {
				movement = move.SetMovementEw(direction, distance, pl.getPlayerEastWest());
				pl.setPlayerEastWest(movement);
			}
			else if (direction.equals("exit")) {
				System.out.println("Thank you for playing!");
				scan2.close();
				System.exit(0);
			}
			else {
				System.out.println("Invalid input\n");
			}
			
			
			
			
			int chance = rand.nextInt(100);
			if (chance == 69) {
				System.out.println("An unexpected encounter!!!");
				String message = msg.GetMessage();
				System.out.println(message + "\n");
			}
			
			
			
			
			
			if (dist.getDistance(pl.getPlayerNorthSouth(), pl.getPlayerEastWest(), cm.getCompassNorthSouth(), cm.getCompassEastWest()) == 0) {
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
