package Main;

public class Calculator {
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int min(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public double div(double num1, double num2) {
		return num1 / num2;
	}
	
	public int mix1(int num1, int num2, boolean tf1) {
		if (tf1 == true) {
			return num1 + num2;
		}
		else {
			return num1 * num2;
		}
	}
	
	public void mashup(int num1) {
		if (num1 > 2000) {
			System.out.println("A");
			if (num1 > 6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if (num1 > 4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if (num1 > 100) {
				System.out.println("3");
				if (num1 > 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if (num1 > 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
				
			}
		}
	}
}
