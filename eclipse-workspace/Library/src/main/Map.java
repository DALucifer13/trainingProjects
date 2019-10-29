package main;

public class Map extends LibraryItem{

	private int zoom;
	
	public Map() {
		super();
		this.zoom = 1;
	}
	
	public Map(String name, String author, String date, int maxStock, int zoom) {
		super(name, author, date, maxStock);
		this.zoom = zoom;
	}

	public int getZoom() {
		return zoom;
	}

	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.getId() + "\nName: " + this.getName() + "\nAuthor: " + this.getAuthor() + "\nZoom: " + this.getZoom() + "\nDate published: " + this.getDate() + "\n" + this.getStock() + " / " + this.getMaxStock() + " left";
		
	}
	
}
