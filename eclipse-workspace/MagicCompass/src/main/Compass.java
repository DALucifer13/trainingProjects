package main;

import java.util.Random;

public class Compass {
	
	Random rand = new Random();
	
	private int compassNorthSouth = (rand.nextInt(30)-15);
	private int compassEastWest = (rand.nextInt(30)-15);
	

	public int getCompassNorthSouth() {
		return compassNorthSouth;
	}

	public void setCompassNorthSouth(int ns) {
		this.compassNorthSouth = ns;
	}

	public int getCompassEastWest() {
		return compassEastWest;
	}

	public void setCompassEastWest(int ew) {
		this.compassEastWest = ew;
	}
	
}
