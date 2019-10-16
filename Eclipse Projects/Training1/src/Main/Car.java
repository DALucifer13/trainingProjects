package Main;

public class Car extends Vehicle{
	
	public Car() {
		super();
		this.passengers = 0;
	}
	
	public Car(String owner, String make, String model, String plate, int age, boolean tax, boolean mot, int topSpeed, double t060, int passengers) {
		super(topSpeed, t060, age, plate, make, model, owner, tax, mot);
		this.passengers = passengers;
	}

	private int passengers;
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Vroooooom!");
		
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
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
		return "ID: " + this.getId() + "\nThe owner is " + this.getOwner() + ",\nthe car is a(n) " + this.getMake() + " " + this.getModel() + ",\nit's plate is " + this.getPlate() + ", making it " + this.getAge() + " years old,\nthe car " + taxs + " taxed and " + mots + " passed it's MOT,\nits top steed is "+ this.getTopSpeed() + " and it's 0-60 is " + this.getT060() + " seconds,\nit can hold " + this.getPassengers() + " passengers.";
	}
	
	
	
}