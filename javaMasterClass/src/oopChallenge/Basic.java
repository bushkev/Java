package oopChallenge;

import java.util.Scanner;

public class Basic {
	private String roll;
	private String meat;
	private double price;
	private double lettuce;
	private double tomatoe;
	private double pickle;
	private double ketchup;
	private double onion;
	private double cucumber;
	private int addCount;
	private boolean maxAdd;
	
	public Basic(String roll, String meat, double price) {
		this.roll = roll;
		this.meat = meat;
		this.price = price;
		addCount = 0;
		maxAdd = true;
	}
	
	public void setCost(double lettuce, double tomatoe, double pickle, double ketchup, double onion, double cucumber) {
		this.onion = onion;
		this.cucumber = cucumber;
		this.lettuce = lettuce;
		this.tomatoe = tomatoe;
		this.pickle = pickle;
		this.ketchup = ketchup;
	}
	public void addLettuce() {
		addCount();
		if(maxAdd) {
			price += lettuce;
			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
		}else {
			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
			System.out.printf("final price is %.2f.\n ", price);
		}
	}
	
	public void addTomatoe() {
		addCount();
		if(maxAdd) {
			price += tomatoe;
			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
		}else {
			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
			System.out.printf("final price is %.2f.\n ", price);
		}
	}
	
	public void addPickle() {
		addCount();
		if(maxAdd) {
			price += pickle;
			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
		}else {
			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
			System.out.printf("final price is %.2f.\n ", price);
		}	
	}
	
	public void addKetchup() {
		addCount();
		if(maxAdd) {
			price += ketchup;
			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
		}else {
			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
			System.out.printf("final price is %.2f.\n ", price);
		}
	}
	
	public void addOnion() {
		addCount();
		if(maxAdd) {
			price += onion;
			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
		}else {
			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
			System.out.printf("final price is %.2f.\n ", price);
		}	
	}
	
	public void addCucumber() {
		addCount();
		if(maxAdd) {
			price += cucumber;
			System.out.printf("Your current price is %.2f with %s ingerdients.\n", price, addCount);
		}else {
			System.out.println("You have reach the max amount of " + addCount + " ingredients.");	
			System.out.printf("final price is %.2f.\n ", price);
		}	
	}
	protected void addCount() {
		if(addCount < 4){
			addCount ++;
		}else maxAdd = false;
	}
	
	public int getAddCount() {
		return addCount;
	}

	public void setAddCount(int addCount) {
		this.addCount = addCount;
	}
	
	public boolean isMaxAdd() {
		return maxAdd;
	}

	public void setMaxAdd(boolean maxAdd) {
		this.maxAdd = maxAdd;
	}
}
