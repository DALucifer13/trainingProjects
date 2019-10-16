package Main;

public class Iteration {

	public void iteration1() {
		
		for(int a = 100; a <= 200; a++) {
			System.out.println("A");
		}
		
	}
	
	public void iteration2() {
		
		for(int a = 100; a <= 200; a++) {
			if(a % 2 == 0){
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
		}
		
		
	}
	
	public void iteration3(){
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println(j + 1);
			}
			
		}
	}
	
	public void iteration4(int num1){
		
		for(int i = 0; i < num1; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println(j + 1);
			}
			
		}
	}
	
	public void iteration5() {
		
		String number;
		for(int i = 1; i <= 100; i++) {
			if (i == 100) {
				 number = "one-hundred";
			}
			else {
				if (i < 20) {
					if (i == 1){
						 number = "one";
					}
					else if (i == 2) {
						 number = "two";
					}
					else if (i == 3) {
						 number = "three";
					}
					else if (i == 4) {
						 number = "four";
					}
					else if (i == 5) {
						 number = "five";
					}
					else if (i == 6) {
						 number = "six";
					}
					else if (i == 7) {
						 number = "seven";
					}
					else if (i == 8) {
						 number = "eight";
					}
					else if (i == 9) {
						 number = "nine";
					}
					else if (i == 10) {
						 number = "ten";
					}
					else if (i == 11) {
						 number = "eleven";
					}
					else if (i == 12) {
						 number = "twelve";
					}
					else if (i == 13) {
						 number = "thirteen";
					}
					else if (i == 14) {
						 number = "fourteen";
					}
					else if (i == 15) {
						 number = "fifteen";
					}
					else if (i == 16) {
						 number = "sixteen";
					}
					else if (i == 17) {
						 number = "seventeen";
					}
					else if (i == 18) {
						 number = "eighteen";
					}
					else {
						 number = "nineteen";
					}
					}
					else {
					
						int num2 = i / 10;
						int num3 = i % 10;		
						
						if (num2 == 2) {
							 number = "twenty";
						}
						else if (num2 == 3) {
							 number = "thirty";
						}
						else if (num2 == 4) {
							 number = "forty";
						}
						else if (num2 == 5) {
							 number = "fifty";
						}
						else if (num2 == 6) {
							 number = "sixty";
						}
						else if (num2 == 7) {
							 number = "seventy";
						}
						else if (num2 == 8) {
							 number = "eighty";
						}
						else {
							 number = "ninety";
						}
						
						if (num3 == 1) {
							 number = number + "-one";
						}
						else if (num3 == 2) {
							 number = number + "-two";
						}
						else if (num3 == 3) {
							 number = number + "-three";
						}
						else if (num3 == 4) {
							 number = number + "-four";
						}
						else if (num3 == 5) {
							 number = number + "-five";
						}
						else if (num3 == 6) {
							 number = number + "-six";
						}
						else if (num3 == 7) {
							 number = number + "-seven";
						}
						else if (num3 == 8) {
							 number = number + "-eight";
						}
						else if (num3 == 9) {
							 number = number + "-nine";
						}
						else {
							
						}
				
					}
				}
				System.out.println(number);
			}
		
		
		
	}
	
}
