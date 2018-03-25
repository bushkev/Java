package inheritanceChallenge;

public class Main {
	
	public static void main (String [] args) {
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Vehicle("Ford", "F150", 4);
		Car car3 = new Car();
		RaceCar car4 = new RaceCar("Chevrolet","Corvette", 2);
		RaceCar car5 = new RaceCar();
		
		car4.changingGear("down");
		car4.move(24);
		
		car1.setMake("Mazda");
		car1.setModel("3");
		car1.setDoors(4);
		

		car2.changingGear("up");
		car2.move(15);
		car2.changingGear("up");
		car2.move(20);
		car2.changingGear("down");
		car2.changingGear("down");
		car2.move(-35);
		car2.changingGear("down");
		car2.move(10);
		
		car2.steering("left", 35);
		car2.steering("right", 35);
	}

}
