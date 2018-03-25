package polymorphism;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car("Random",6);
		car.accelerate();
		car.brake();
		car.startUp();
		
		Ford f150 = new Ford("F150",8);
		f150.accelerate();
		f150.brake();
		
		Chevrolette corvette = new Chevrolette("corvette", 10);
		corvette.startUp();
	}

}
