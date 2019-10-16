package main;

import java.util.Random;

public class Compass {
	
	Random rand = new Random();
	Player pl = new Player();
	
	private int compassNorthSouth = (rand.nextInt(30)-15);
	private int compassEastWest = (rand.nextInt(30)-15);
	private double dist;
	

	public double getDist() {
		int ns = Math.abs(getCompassNorthSouth() - pl.getPlayerNorthSouth());
		int ew = Math.abs(getCompassEastWest() - pl.getPlayerEastWest());
		dist = Math.hypot(ns, ew);
		System.out.println(pl.getPlayerNorthSouth());
		System.out.println(pl.getPlayerEastWest());
		return dist;
	}

	public void setDist(double dist) {
		this.dist = dist;
	}

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
