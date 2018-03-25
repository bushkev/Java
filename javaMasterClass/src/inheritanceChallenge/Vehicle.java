package inheritanceChallenge;

public class Vehicle {
	protected String make;
	protected String model;
	private int doors;
	protected int gear;
	private int currentSpeed;
	
	Vehicle () {
		make = null;
		model = null;
		gear = 0;
		currentSpeed = 0;
	}
	
	Vehicle (String make, String model, int doors){
		this.make = make;
		this.model = model;
		gear = 0;
		currentSpeed = 0;
		doors(doors);
		System.out.println(doors + " door " + make + " " + model + " vehicle created.");
	}
	
	private void doors (int doors) {
		if (doors > 1 && doors < 5){
			this.doors = doors;
		}else 
			System.out.println("ERROR: \"" + doors + "\" invalid number.");
	}
		
	void move (int speed) {
		if (speed > 0) {
			currentSpeed += speed;
		System.out.println(model + " is moving at a speed of " + currentSpeed + " mph.");
		}else if (speed < 0) {
			currentSpeed += speed;
		System.out.println(model + " is moving at a speed of " + currentSpeed + " mph.");
		}else 
			System.out.println(model + " is moving at a speed of " + currentSpeed + " mph.");
	}
	
	void changingGear (String change) {
		if (change.toLowerCase().equals("up")) {
			gear ++;
		}else if (change.toLowerCase().equals("down")) {
				gear --;
		}else 
			System.out.println("ERROR: \""+ change +"\" invalid command.");
		switch (gear){
			case 0: 
				System.out.println(model + " is in neutral.");
				break;
			case 1: 
				System.out.println(model + " is in 1st gear.");
				break;
			case 2: 
				System.out.println(model + " is in 2nd gear.");
				break;
			case 3: 
				System.out.println(model + " is in 3rd gear.");
				break;
			case 4: case 5:
				System.out.println(model + " is in " + gear + "th gear.");
				break;
			case -1:	
				System.out.println(model + " is in reverse.");
				break;
			case -2:
				gear = -1;
				System.out.println(model + " is in reverse.");
				break;
			case 6:
				gear = 5;
				System.out.println(model + " is in 5th gear.");
				break;
		}
	}
	
	void steering (String direction, int degree) {
		if (direction.toLowerCase().equals("right") || direction.toLowerCase().equals("left"))
			System.out.println(model + " is turning " + direction + " " + degree + " degrees.");
		else 
			System.out.println("ERROR: \"" +direction + "\" invalid command.");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
		if (this.model == null) {
			System.out.println("Make " + make + " set, please specify model.");
		}else
			System.out.println(make + " " + model + " set.");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
		if (this.make == null) {
			System.out.println("Model " + model + " set, please specify make.");
		}else
			System.out.println(make + " " + model + " set.");
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		doors(doors);
		System.out.println(make + " " + model + " doors set to " + doors + ".");
	}

	
}
