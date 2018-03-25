package oopChallenge;

public class Main {
	
	public static void main (String[] args) {
		Basic base = new Basic("wheat","beef",2.00);
		Healthy heal = new Healthy ("beef",3.00);
		
		base.setCost(.45, .35, .25, .20, .15, .60);
		base.addLettuce();
		base.addPickle();
		base.addTomatoe();
		base.addKetchup();
		base.addLettuce();
		
		heal.setCost(.40, .50, .35, .25, .15, .60);
		heal.addLettuce();
		heal.addPickle();
		heal.addTomatoe();
		heal.addKetchup();
		heal.addCucumber();
		heal.addOnion();
		heal.addCucumber();
		heal.addOnion();
		
		
	}

}
