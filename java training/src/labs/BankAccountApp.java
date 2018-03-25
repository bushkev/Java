package labs;

public class BankAccountApp {
	
	public static void main (String [] args){
		BankAccount acc1 = new BankAccount("456789123", 1000);
//		BankAccount acc2 = new BankAccount("125578885", 2000);
//		BankAccount acc3 = new BankAccount("789234567", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}

}

class BankAccount implements IInterest {
	private static int id = 1000; //internal ID
	private String accountNumber; // ID + random 2 digit number + first 2 of ssn.
	private static final String routingNumber = "0045400657";
	private String name;
	private String ssn;
	private double balance;
	
	
	public BankAccount(String ssn, double initDeposit){
		balance = initDeposit;
		this.ssn = ssn;
		id++;
		setAccountNumber();
		
	}
	
	private void setAccountNumber () {
		int random = (int) (Math.random() * 100);
		accountNumber = id + "" + random + ssn.substring(0, 2);
		System.out.println("Your account number: " + accountNumber);
	}
	
	public void setName (String name) {
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill (double amount) {
		System.out.println("Paying bill: "+ amount);
		balance = balance - amount;
		showBalance();
	}
	
	public void makeDeposit (double amount) {
		System.out.println("Making deposit: " + amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance () {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
	balance = balance * (1 + rate / 100);
	showBalance();
	}
	
	@Override
	public String toString () {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
}