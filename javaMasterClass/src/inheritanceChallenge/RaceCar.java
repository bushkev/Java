package inheritanceChallenge;

public class RaceCar extends Car{
	
	protected RaceCar() {
	}

	protected RaceCar(String make, String model, int doors) {
		super(make, model, doors);
	}

	@Override
	void changingGear(String change) {
				
		if (change.toLowerCase().equals("up") &&
				(gear >=5)) {
			gear ++;
		}else if (change.toLowerCase().equals("down") &&
					(gear == 6)) {
				gear --;
		}
		switch (gear) {
		case 6: 
			System.out.println(super.model + " is in 6th gear.");
			break;
		case 7:
			gear = 6;
			System.out.println(super.model + " is in 6th gear.");
			break;
		}
		if (gear <5 ) super.changingGear(change);
	}
	
	
}
