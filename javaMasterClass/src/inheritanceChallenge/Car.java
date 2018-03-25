package inheritanceChallenge;

public class Car extends Vehicle{
	
	protected Car() {
	}

	protected Car(String make, String model, int doors) {
		super(make, model, doors);
	}

	void changingGear(String change) {
		super.changingGear(change);
	}
	
	
	
}
