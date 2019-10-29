package main;

public class Book extends LibraryItem{

	private int chapters;
	
	public Book() {
		super();
		this.chapters = 1;
	}
	
	public Book(String name, String author, String date, int maxStock, int chapters) {
		super(name, author, date, maxStock);
		this.chapters = chapters;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.getId() + "\nName: " + this.getName() + "\nAuthor: " + this.getAuthor() + "\nChapters: " + this.getChapters() + "\nDate published: " + this.getDate() + "\n" + this.getStock() + " / " + this.getMaxStock() + " left";
		
	}
	
}
