package polymorphism;

public class Chevrolette extends Car {

	public Chevrolette (String name, int cylinder) {
		super(name, cylinder);
	}
	
	@Override	
	public void accelerate () {
		System.out.println("Chevrolette -> accelerating");
	}

	@Override
	public void brake () {
		System.out.println("Chevrolette -> braking");
	}
	
	@Override
	public void startUp () {
		System.out.println("Chevrolette -> starting");
	}
}
