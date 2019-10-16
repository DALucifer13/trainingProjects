package Main;

public class Unique {
	int total;
	
	public int unid(int num1, int num2, int num3) {
		if (num1 == num2 && num1 == num3) {
			total = 0;
		}
		else if (num1 == num2) {
			total = num3;
		}
		else if (num1 == num3) {
			total = num2;
		}
		else if (num2 == num3) {
			total = num1;
		}
		else {
			total = num1 + num2 + num3;
		}
		
		return total;
	}
	
}
