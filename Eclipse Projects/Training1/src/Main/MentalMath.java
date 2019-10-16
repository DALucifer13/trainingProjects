package Main;

public class MentalMath {

	
	public int splitNJoin(int num1) {
		if (num1 <10) {
		return num1;
		}
		else {
		int num2 = num1 / 10;
		int num3 = num1 % 10;
		return num2 + num3;
		}
	}
	
	public int splitNJoin2(int num1) {
		int num2 = num1 / 10;
		int num3 = num1 % 10;
		return num2 + num3;
	}
	
	public int splitNJoin3(int num1) {
		if (num1 <10) {
		return num1;
		}
		else {
		int num2 = num1 / 100;
		int ex1 = num1 % 100;
		int num3 = ex1 / 10;
		int num4 = ex1 % 10;		
		return num2 + num3 + num4;
		}
	}
	
	public int splitNJoin4(int num1) {
		if (num1 <10) {
		return num1;
		}
		else {
		int num2 = num1 / 1000;
		int ex1 = num1 % 1000;	
		int num3 = ex1 / 100;
		int ex2 = ex1 % 100;
		int num4 = ex2 / 10;
		int num5 = ex2 % 10;		
		return num2 + num3 + num4 + num5;
		}
	}
}
