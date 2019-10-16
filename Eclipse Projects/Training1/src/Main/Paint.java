package Main;

public class Paint {

	
	private double price;
	private int volume;
	private String name;
	private int paintPerLitre;
	private int coverage;
	
	
	public Paint() {
		super();
		this.name = "";
		this.volume = 0;
		this.paintPerLitre = 0;
		this.price = 0;
		this.coverage = volume * paintPerLitre;
	}
	
	public Paint(String name, int volume, int paintPerLitre, double price) {
		super();
		this.name = name;
		this.volume = volume;
		this.paintPerLitre = paintPerLitre;
		this.price = price;
		this.coverage = volume * paintPerLitre;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPaintPerLitre() {
		return paintPerLitre;
	}


	public void setPaintPerLitre(int paintPerLitre) {
		this.paintPerLitre = paintPerLitre;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	
	
}
