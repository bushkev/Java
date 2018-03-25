package polymorphism;

public class Ford extends Car{

	public Ford (String name, int cylinder) {
		super(name, cylinder);
	}
	
	@Override
	public void accelerate () {
		System.out.println("Ford -> accelerating");
	}
	
	@Override
	public void brake () {
		System.out.println("Ford -> braking");
	}
	
	@Override
	public void startUp () {
		System.out.println("Ford -> starting");
	}
}
