package Main;

public class Van extends Vehicle{
	
	public Van() {
		super();
		this.percentFull = 0;
	}
	
	public Van(String owner, String make, String model, String plate, int age, boolean tax, boolean mot, int topSpeed, double t060, int percentFull) {
		super(topSpeed, t060, age, plate, make, model, owner, tax, mot);
		this.percentFull = percentFull;
	}
	
	private int percentFull;

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bruuum!");
		
	}

	public double getPercentFull() {
		return percentFull;
	}

	public void setPercentFull(int percentFull) {
		this.percentFull = percentFull;
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
		return "ID: " + this.getId() + "\nThe owner is " + this.getOwner() + ",\nthe van is a(n) " + this.getMake() + " " + this.getModel() + ",\nit's plate is " + this.getPlate() + ", making it " + this.getAge() + " years old,\nthe van " + taxs + " taxed and " + mots + " passed it's MOT,\nits top steed is "+ this.getTopSpeed() + " and it's 0-60 is " + this.getT060() + " seconds,\nit is " + this.getPercentFull() + "% full.";
	}
}
