package main;

public abstract class LibraryItem {

	private String name;
	private String author;
	private String date;
	private int stock;
	private int maxStock;
	private int id;
	
	
	public LibraryItem() {
		super();
		this.name = "";
		this.author = "";
		this.date = "";
		this.maxStock = 0;
		this.stock = this.maxStock;
	}
	
	public LibraryItem(String name, String author, String date, int maxStock) {
		super();
		this.name = name;
		this.author = author;
		this.date = date;
		this.maxStock = maxStock;
		this.stock = this.maxStock;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public int getMaxStock() {
		return maxStock;
	}


	public void setMaxStock(int maxStock) {
		this.maxStock = maxStock;
	}
	
	
}
