package main;

public class Competition {
	

	
	public String pupCompetition(int input){
				
		String result = "";
		
		for ( int i = 1; i <= 100; i++) {
			if (input > 0 && input <= 100) {
				if (input != i) {				
					if (i == 11) {
						result = result + "11th, ";
					}
					else if (i == 12) {
						result = result + "12th, ";
					}
					else if (i == 13) {
						result = result + "13th, ";
					}
					else if (i == 99) {
						if (input == 100) {
							result = result + i + "th";
						}
						else {
							result = result + i + "th, ";
						}
					}
					else if(i == 100) {
						result = result + i + "th";
					}
					else if ((i % 10 == 1)) {
						result = result + i +  "st, ";
					}
					else if ((i % 10 == 2)) {
						result = result + i +  "nd, ";
					}
					else if ((i % 10 == 3)) {
						result = result + i +  "rd, ";
					}
					else {
						result = result + i + "th, ";
					}
				}
			}
			else {
				result = "invalid number";
			}
		}
		return result;
	}
}