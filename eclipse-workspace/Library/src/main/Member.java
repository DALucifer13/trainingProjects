package main;

public class Member {
	private String name;
	private int age;
	private String number;
	private String email;
	private int id;
	private int bookCount;
	
	public Member(String name, int age, String number, String email) {
		
		this.name = name;
		this.age = age;
		this.number = number;
		this.email = email;
		this.bookCount = 0;
		
	}
	
	public Member(String name, int age, String number) {
		
		this.name = name;
		this.age = age;
		this.number = number;
		this.email = "";
		this.bookCount = 0;
	}
	
	public Member(String name, int age) {
		
		this.name = name;
		this.age = age;
		this.number = "";
		this.email = "";
		this.bookCount = 0;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int memberCount) {
		this.id = memberCount;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
		
	
	@Override
	public String toString() {
		return "ID: " + this.getId() + "\nName: " + this.getName() + "\nAge: " +this.getAge() + "\nPhone number: " + this.getNumber() + "\nEmail: " + this.getEmail() + "\nNumber of books borrowed: " + this.getBookCount();
		
	}
	
	
	
}
