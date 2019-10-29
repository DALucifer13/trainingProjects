package main;

public class Distance {

	public double getDistance(int pns, int pew, int cns, int cew){
		int ns = Math.abs(cns - pns);
		int ew = Math.abs(cew - pew);
		dist = Math.hypot(ns, ew);
		return dist;
	}
	
	private double dist;
	

	public void setDist(double dist) {
		this.dist = dist;
	}
	
}
