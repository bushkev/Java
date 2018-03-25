package polymorphism;

class Mitsubishi extends Car {
	
	public Mitsubishi (String name, int cylinder) {
		super(name, cylinder);
	}
	
	@Override
	public void accelerate () {
		System.out.println("Mitsubishi -> accelerating");
	}
	
	@Override
	public void brake () {
		System.out.println("Mitsubishi -> braking");
	}
	
	@Override
	public void startUp () {
		System.out.println("Mitsubishi -> starting");
	}
}
