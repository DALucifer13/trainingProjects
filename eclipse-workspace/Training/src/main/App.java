package main;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) throws DivideByZeroException {
		// TODO Auto-generated method stub
			
		App run = new App();
		//run.test1();
		//run.test21();
		//run.test22();
		//run.test23();
		//run.test24();
		//run.test31();
		//run.test41();
		//run.test42();
		//run.test51();
		//run.test61();
		//run.test71();
		//run.test81();
		//run.test82();
		//run.test83();
		//run.test84();
		//run.test91();
		//run.test101();
		//run.test102();
		//run.test111();
		//run.test121();
		//run.test131();
		//run.test141();
		run.test151();
		}
	
	
	public void test151() {
		
	}
	
	public void test141() throws DivideByZeroException {
		Calculator cl = new Calculator();
		double output = cl.divex(0, 0);
		System.out.println(output);
		
	}
	
	public void test131() {
	int cover = 1000;
	
	Shop sho = new Shop();
	sho.addPaint(new Paint("CheapoMaX", 21, 10, 19.99));
	sho.addPaint(new Paint("ThatOneWithTheDog", 40, 12, 34.38));
	sho.addPaint(new Paint("AverageJoes", 16, 11, 17.99));
	sho.addPaint(new Paint("DuluxourousPaints", 10, 22, 25.00));
	sho.cheapest();
	sho.leastWaste(cover);
	}
	
	public void test121() {
		Garage gar = new Garage();
		gar.populate();
		gar.addVehicle(new Car("Chris", "Hyundai", "Santa Fe", "PX53 DCu", 16, true, true, 140, 12.23, 3));
		gar.printGarage();
		gar.removeVehicleType(Car.class);
		gar.printGarage();
		gar.removeVehicleType(Bike.class);
		gar.printGarage();
		gar.removeVehicleType(Van.class);
		gar.printGarage();
		gar.populate();
		gar.printGarage();
		gar.removeVehicleAll();
		gar.printGarage();
	}
	
	public void test111() {
		
		Coins change = new Coins();
		
		double input = 137.93;
		change.money(input);
		
	}
	
	public void test102() {
		
		String nameSearch = "Kyle";
		
		LinkedList<Person> people = new LinkedList<Person>();
		people.add(new Person("Kyle", 20, "Trainee"));
		people.add(new Person("Harry", 14, "Teacher"));
		people.add(new Person("Zelretch", 300, "Unrepentant Troll"));
		for(Person p : people) {
			String name = p.getName();
			if (nameSearch == name) {
				System.out.println(p);
			}
			
		}
	}
	
	public void test101() {
		LinkedList<Person> people = new LinkedList<Person>();
		people.add(new Person("Kyle", 20, "Trainee"));
		people.add(new Person("Harry", 14, "Teacher"));
		people.add(new Person("Zelretch", 300, "Unrepentant Troll"));
		for(Person p : people) {
			String name = p.getName();
			int age = p.getAge();
			String job = p.getJob();
			System.out.println(name + " " + age + " " + job);
		}
	}
	
	public void test91() {
		
		Iteration iter = new Iteration();
		
		int num1 = 3;
		
		iter.iteration1();
		iter.iteration2();
		iter.iteration3();
		iter.iteration4(num1);
		iter.iteration5();
	}
	
	public void test81() {
		
		MentalMath snj = new MentalMath();
		
		int num1 = 7;
		int output = snj.splitNJoin(num1);
		System.out.println(output);
	}
	
	public void test82() {
		
		MentalMath snj = new MentalMath();
		
		int num1 = 47;
		int output = snj.splitNJoin2(num1);
		System.out.println(output);
	}
	
	public void test83() {
		
		MentalMath snj = new MentalMath();
		
		int num1 = 935;
		int output = snj.splitNJoin3(num1);
		System.out.println(output);
	}
	
	
	
	public void test84() {
		
		MentalMath snj = new MentalMath();
		
		int num1 = 9354;
		int output = snj.splitNJoin4(num1);
		System.out.println(output);
	}
	
	public void test71() {
		
		Taxes tax = new Taxes();
		
		double pay = 50000;
		double output1 = tax.payReturn(pay);
		double output2 = pay - output1;
		double output3 = tax.taxReturn(pay);
		System.out.println("Your pay after taxes is: " + output1);
		System.out.println("Your taxes cost you: " + output2 + " so says method 1");
		System.out.println("Your taxes cost you: " + output3 + " so says method 2");
		
	}
	
	public void test61() {
		
		Unique solo = new Unique();
		
		int num1 = 10;
		int num2 = 7;
		int num3 = 15;
		int output = solo.unid(num1, num2, num3);
		System.out.println(output);
		
	}
	
	public void test51() {
		
		BlackJack twentyOne = new BlackJack();
		
		int num1 = 19;
		int num2 = 21;
		int output = twentyOne.jack(num1, num2);
		System.out.println(output);
	}
	
	public void test42() {

		Calculator math = new Calculator();
		
		int num1 = 6010;
		math.mashup(num1);
	}
	
	public void test41() {
		
		Calculator math = new Calculator();
		
		boolean tf1 = true;
		int num1 = 8;
		int num2 = 4;
		int output = math.mix1(num1, num2, tf1);
		System.out.println(output);
	}

	
	public void test31() {
		
		Results test = new Results();
		
		test.physics = 60;
		test.chemistry = 60;
		test.biology = 60;
		test.results();
		test.percentage();
		test.passOrNot();
		
	}
	
	
	public void test21() {
		
		Calculator math = new Calculator();
		
		int num1 = 8;
		int num2 = 4;
		int add = math.add(num1, num2);
		System.out.println(add);
	}
	
	public void test22() {
		
		Calculator math = new Calculator();
		
		int num1 = 8;
		int num2 = 4;
		int min = math.min(num1, num2);
		System.out.println(min);
	}
	
	public void test23() {
		
		Calculator math = new Calculator();
		
		int num1 = 8;
		int num2 = 4;
		int mul = math.mul(num1, num2);
		System.out.println(mul);
	}
	
	public void test24() {
		
		Calculator math = new Calculator();
		
		double num1 = 8;
		double num2 = 4;
		double div = math.div(num1, num2);
		System.out.println(div);
	}
	
public void test1() {
		
		Printer print = new Printer();
		
		System.out.println("Hello World 1");
		String input1 = "Hello World";
		System.out.println(input1 + " 2");
		print.printout(input1);
		String output1 = print.printret(input1);
		System.out.println(output1);
	}
	
	
}