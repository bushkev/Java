package oopChallenge;

public class Healthy extends Basic{
//	private double onion;
//	private double cucumber;
	
	

	public Healthy(String meat, double price) {
		super("Brown Rye Bread", meat, price);
	}

//	public void setCost(double lettuce, double tomatoe, double pickle, double ketchup, double onion, double cucumber) {
//		this.onion = onion;
//		this.cucumber = cucumber;
//		super.setCost(lettuce, tomatoe, pickle, ketchup);
//	}

//	public void addOnion() {
//		addCount();
//		if(maxAdd) {
//			price += onion;
//			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
//		}else {
//			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
//			System.out.printf("final price is %.2f.\n ", price);
//		}	
//	}
//	
//	public void addCucumber() {
//		addCount();
//		if(maxAdd) {
//			price += cucumber;
//			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
//		}else {
//			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
//			System.out.printf("final price is %.2f.\n ", price);
//		}	
//	}

	@Override
	protected void addCount() {
		int addCount = getAddCount();
		if(getAddCount() < 6){
			addCount ++;
			setAddCount(addCount);
		}else setMaxAdd(false);
	}
}
