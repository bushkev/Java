package polymorphism;

public class Car {
	private int wheels;
	private boolean engine;
	private int cylinder;
	private String name;
	
	Car (String name, int cylinder) {
		this.name = name;
		this.cylinder = cylinder;
		engine = true;
		wheels = 4;		
	}

	public int getCylinder() {
		return cylinder;
	}

	public String getName() {
		return name;
	}
	
	public void accelerate () {
		System.out.println("car -> accelerating");
	}
	
	public void brake () {
		System.out.println("car -> braking");
	}
	
	public void startUp () {
		System.out.println("car -> starting");
	}
}