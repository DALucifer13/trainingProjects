package Main;

public class Results {
	
	int physics;
	int chemistry;
	int biology;
	int total;
	int percentage;
	int phyp;
	int chep;
	int biop;
	int failcount = 0;
	
	public void results() {
		total = physics + chemistry + biology;
		System.out.println("Your Physics score is: " + physics);
		System.out.println("Your Chemistry score is: " + chemistry);
		System.out.println("Your Biology score is: " + biology);
		System.out.println("Your Total score is: " + total);
		
	}
	
	public void percentage() {
		phyp = (physics * 100) / 150;
		chep = (chemistry * 100) / 150;
		biop = (biology * 100) / 150;
		percentage = (total * 100) / 450;
		System.out.println("Your Total percentage is: " + percentage);
		
	}
	
	public void passOrNot() {
		if (phyp < 60 ) {
			failcount++;
		}
		if (chep < 60 ) {
			failcount++;
		}
		if (biop < 60 ) {
			failcount++;
		}
		if (percentage < 60 || failcount > 0) {
			System.out.println("You Fail!!!");
			System.out.println("You Failed " + failcount + " subjects");
		}
		else {
			System.out.println("You Pass!!!");
		}
	}
}
