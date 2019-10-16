package Main;

import java.util.LinkedList;

public class Shop {

	LinkedList<Paint> pnt = new LinkedList<Paint>();
	
	public void addPaint(Paint p) {		
		pnt.add(p);
	}
	
	public void cheapest() {
		double cheapest = 1000;
		String cheapestName = "";
		for(Paint p : pnt) {
			double cpl = (p.getPrice() / p.getVolume());
			if (cpl <= cheapest) {
				
					cheapestName = p.getName();
					cheapest = cpl;
				
			}
			else if (cpl == cheapest){
					cheapestName = cheapestName + ", " + p.getName();
					cheapest = cpl;
				}
					
				
			}
			System.out.println(cheapestName + " is the cheapest at: " + cheapest + " per litre");
		}
	
		
	
	
	public void leastWaste(int w) {
		double mostWaste = 0;
		String wasteName = "";
		for(Paint p : pnt) {
			double wastept1 = (double) w / p.getCoverage();
			double waste = wastept1 - ((int)wastept1);
			if (waste >= mostWaste) {
				if (wasteName == "") {
					wasteName = p.getName();
				}
				else {
					wasteName = wasteName + ", " + p.getName();
				}
				mostWaste = waste;
				
			}
		}
		System.out.println(wasteName + " has the most waste at: " + mostWaste + "% of a can");
	}
	
}
