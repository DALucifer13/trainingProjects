package main;

public class Magazine extends LibraryItem{

	private int stories;
	
	public Magazine() {
		super();
		this.stories = 1;;
	}
	
	public Magazine(String name, String author, String date, int maxStock, int stories) {
		super(name, author, date, maxStock);
		this.stories = stories;
	}

	public int getStories() {
		return stories;
	}

	public void setStories(int stories) {
		this.stories = stories;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.getId() + "\nName: " + this.getName() + "\nAuthor: " + this.getAuthor() + "\nStories: " + this.getStories() + "\nDate published: " + this.getDate() + "\n" + this.getStock() + " / " + this.getMaxStock() + " left";
		
	}
	
}
