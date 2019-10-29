package main;

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
	
	public double divex(int num1, int num2) throws DivideByZeroException {
				
		double num1d = num1;
		double num2d = num2;
		try {
			if (num2 == 0 && num1 != 0) {
				throw new DivideByZeroException("");
			}
			else if(num1 == 0 && num2 != 0) {
				throw new BadDivException("You will allways get zero woth this type of input");
			}
			else if(num1 == 0 && num2 == 0) {
				throw new BadMathException("");
			}
			else {
				return num1d / num2d;
			}
			
		}
		catch(DivideByZeroException dbze) {
			System.out.println(dbze + "Big Bang");
		}
		catch(BadDivException bde) {
			System.out.println(bde);
		}
		catch(BadMathException bme) {
			return 1;
		}
		catch(Exception e) {
			System.out.println(e + " Oops");
		}
		return 0;
		
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
