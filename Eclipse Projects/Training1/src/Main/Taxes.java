package Main;

public class Taxes {
	
	public double payReturn(double pay) {
		if (pay < 15000) {
			return pay;
		}
		else if(pay < 20000) {
			return (pay * 0.9);
		}
		else if(pay < 30000) {
			return (pay * 0.85);
		}
		else if(pay < 50000) {
			return (pay * 0.8);
		}
		else {
			return (pay * 0.75);
		}
	}
	
	public double taxReturn(double tax) {
		if (tax < 15000) {
			return 0;
		}
		else if(tax < 20000) {
			return (tax * 0.1);
		}
		else if(tax < 30000) {
			return (tax * 0.15);
		}
		else if(tax < 50000) {
			return (tax * 0.2);
		}
		else {
			return (tax * 0.25);
		}
	}
}
