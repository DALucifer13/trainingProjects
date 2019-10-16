package Main;

public abstract class Vehicle {
	
	
	public Vehicle() {
		super();
		this.topSpeed = 0;
		this.t060 = 0;
		this.age = 0;
		this.plate = "unknown";
		this.make = "unknown";
		this.model = "unknown";
		this.owner = "unknown";
		this.tax = false;
		this.mot = false;
		this.id = 0;
	}
	
	
	public Vehicle(int topSpeed, double t060, int age, String plate, String make, String model, String owner, boolean tax,
			boolean mot) {
		super();
		this.topSpeed = topSpeed;
		this.t060 = t060;
		this.age = age;
		this.plate = plate;
		this.make = make;
		this.model = model;
		this.owner = owner;
		this.tax = tax;
		this.mot = mot;
	}

	private int id;
	private int topSpeed;
	private double t060;
	private int age;
	private String plate;
	private String make;
	private String model;
	private String owner;
	private boolean tax;
	private boolean mot;
	
	public void turnOn() {
		System.out.println("Vroom");
	}
	public void turnOff() {
		System.out.println("Chug Chug Chug");
	}
	public void crash() {
		System.out.println("*Smash*");
	}
	public abstract void drive();
	
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	public double getT060() {
		return t060;
	}
	public void setT060(double t060) {
		this.t060 = t060;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isTax() {
		return tax;
	}
	public void setTax(boolean tax) {
		this.tax = tax;
	}
	public boolean isMot() {
		return mot;
	}
	public void setMot(boolean mot) {
		this.mot = mot;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}