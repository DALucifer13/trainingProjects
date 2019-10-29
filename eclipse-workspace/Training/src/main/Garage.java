package main;

import java.util.LinkedList;


public class Garage {
	int garageCount = 0;
	
	
	LinkedList<Vehicle> garage = new LinkedList<Vehicle>();
	
	
	public Garage() {
		
	}
	
	
	public void addVehicle(Vehicle v) {
		garageCount++;
		v.setId(garageCount);
		garage.add(v);
		
	}
	
	public void removeVehicle(Vehicle v) {
		LinkedList<Vehicle> rmv = new LinkedList<Vehicle>();
		for (Vehicle e : garage) {
			if(e.getId() == v.getId()) {
				rmv.add(v);
			}
		}
			garage.removeAll(rmv);
	}
	
	public void removeVehicle(int id) {
		LinkedList<Vehicle> rmv = new LinkedList<Vehicle>();
		for (Vehicle v : garage) {
			if(v.getId() == id) {
				rmv.add(v);
			}
		}
			garage.removeAll(rmv);
	}
	
	
	public void removeVehicleType(Class<?> clazz) {
		// TODO Auto-generated method stub
		LinkedList<Vehicle> rmv = new LinkedList<Vehicle>();
		for (Vehicle v : garage) {
			if(v.getClass() == (clazz)) {
				rmv.add(v);
			}
		}
			garage.removeAll(rmv);
		
	}
	
	
	public void removeVehicleAll() {
		// TODO Auto-generated method stub
		
			garage.removeAll(garage);
		
	}
	
	public void printGarage() {
		
		for(Vehicle v : garage) {
			int bill = (v.getAge() * 50);
			System.out.println(v + "\nThe bill will be: �" + bill + "\n\n");
		}	
		
	}
	
	public void populate() {

		addVehicle(new Car("Kyle", "Renault", "Clio", "SA55 HMV", 14, true, true, 120, 20.67, 2));
		addVehicle(new Van("Max", "RV", "Motorhome", "1234567", 30, true, false, 80, 90, 60));
		addVehicle(new Bike("Harry", "Custom", "Bike", "9876543", 3, false, false, 999, 1, 0));
					
	}


	
	
	
	
}