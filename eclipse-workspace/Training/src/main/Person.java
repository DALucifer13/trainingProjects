package main;

public class Person {
	String name;
	int age;
	String job;

	public Person(String name, int age, String job) {
		
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		this.job = "Unemployed";
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public String toString(){
		  return name + " " + age + " " + job;  
		 }
}
