package Main;

public class BlackJack {
	int out1 = 0;
	int out2 = 0;
	
public int jack(int num1, int num2) {
	
	if (num1 > 21) {
		num1 = 0;
	}
	if (num2 > 21) {
		num2 = 0;;
	}
	return Math.max(num1, num2);
}



}
