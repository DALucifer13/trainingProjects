package main;

public class Movement {

	
	
	public int SetMovementNs(String direction, int distance, int ns) {
		
		if (direction.equals("north") || direction.equals("n") || direction.equals("North")) {
			System.out.println("Moving north...");
			return ns - distance;
			
		}
		else{

			System.out.println("Moving south...");
			return ns + distance;
		}
			
		
	}
	
	public int SetMovementEw(String direction, int distance, int ew) {
		
	if (direction.equals("east") || direction.equals("e") || direction.equals("East")) {
		System.out.println("Moving east...");
		return ew - distance;
		
	}
	else{

		System.out.println("Moving west...");
		return ew + distance;
	}
	
		
	}
	
}
