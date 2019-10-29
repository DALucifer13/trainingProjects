package main;

public class Bike extends Vehicle{
	
	public Bike() {
		super();
		this.crashCount = 0;
	}
	
	public Bike(String owner, String make, String model, String plate, int age, boolean tax, boolean mot, int topSpeed, double t060, int crashCount) {
		super(topSpeed, t060, age, plate, make, model, owner, tax, mot);
		this.crashCount = crashCount;
	}
	
	private int crashCount;
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("*Zip*!");
		
	}

	public int getCrashCount() {
		return crashCount;
	}

	public void setCrashCount(int crashCount) {
		this.crashCount = crashCount;
	}
	
	public String toString() {
		String taxs;
		String mots;
		if (isTax()) {
			taxs = "is";
		}
		else {
			taxs = "is not";
		}
		if (isMot()) {
			mots = "has";
		}
		else {
			mots = "has not";
		}
		return "ID: " + this.getId() + "\nThe owner is " + this.getOwner() + ",\nthe bike is a(n) " + this.getMake() + " " + this.getModel() + ",\nit's plate is " + this.getPlate() + ", making it " + this.getAge() + " years old,\nthe bike " + taxs + " taxed and " + mots + " passed it's MOT,\nits top steed is "+ this.getTopSpeed() + " and it's 0-60 is " + this.getT060() + " seconds,\nit has had " + this.getCrashCount() + " crashes.";
	}
}