package main;

public class App {
	
	
	public static void main(String[] args) {
		Library lib = new Library();
		lib.populate();
		lib.printItems();
		lib.printMembers();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		lib.checkOutItem(2, 1);
		lib.checkOutItem(2, 2);
		lib.checkOutItem(2, 1);
		lib.checkOutItem(2, 4);
		lib.printItems();
		lib.printMembers();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		lib.checkInItem(2, 1);
		lib.checkInItem(2, 2);
		lib.checkInItem(2, 1);
		lib.checkInItem(2, 4);
		lib.printItems();
		lib.printMembers();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		lib.updatePerson(2, new Member("Harry", 15, "98765432109", "harrysEmail"));
		lib.updateItem(1, new Book("Harry Potter", "JKRowling", "1/1/01", 70, 37));
		lib.printItems();
		lib.printMembers();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		lib.removeItem(5);
		lib.removePerson(1);
		lib.printItems();
		lib.printMembers();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		
		int print = highestFactor(42, 56);
		System.out.println(print);
	}
	
	
	
	
	public static int highestFactor(int num1, int num2) {
		int factor = 0;
		for(int i = 1; i <= Math.min(num1, num2); i++) {
			int num3 = Math.max(num1, num2) % i;
			int num4 = Math.min(num1, num2) % i;
			if(num3 == 0 && num4 == 0) {
				factor = i;
			}
		}
		return factor;
	}
	
	
	
	
	
	
	
	public static String reverse(String str) {
		String output = "";
		for(int i = 0; i < str.length(); i++) {
			output = output + str.charAt(str.length() - 1 - i);
		}
		return output;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
