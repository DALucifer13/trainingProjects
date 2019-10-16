package main;

public class Movement {

	Player pl = new Player();
	
	public void SetMovement(String direction, int distance) {
		if (direction.equals("north") || direction.equals("n") || direction.equals("North")) {
			pl.setPlayerNorthSouth(pl.getPlayerNorthSouth() - distance);
			System.out.println("Moving north...");
		}
		else if (direction.equals("south") || direction.equals("s") || direction.equals("North")) {
			pl.setPlayerNorthSouth(pl.getPlayerNorthSouth() + distance);
			System.out.println("Moving south...");
		}
		else if (direction.equals("east") || direction.equals("e") || direction.equals("East")) {
			pl.setPlayerEastWest(pl.getPlayerEastWest() - distance);
			System.out.println("Moving east...");
		}
		else if (direction.equals("west") || direction.equals("w") || direction.equals("West")) {
			pl.setPlayerEastWest(pl.getPlayerEastWest() + distance);
			System.out.println("Moving west...");
		}
		else if (direction.equals("exit")) {
			System.out.println("Thank you for playing!");
			System.exit(0);
		}
		else {
			System.out.println("Invalid input\n");
		}
	}
	
}
