package oop;

public class BankAccount {
	String accountNumber;
	static final String routingNumber = "0123456";
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	BankAccount() {
		System.out.println("new account created");
	}
	
	BankAccount(String accountType) {
		System.out.println("new account: " + accountType);
	}
	
	BankAccount (String accountType, double initDeposit) {
		System.out.println("new account: " + accountType);
		System.out.println("Initail deposit of: " + initDeposit);
		String errMsg = null;
		if (initDeposit < 1000) {
			errMsg = "ERROR: Minimum deposit must be more than $1000.";
			
			}
		else {
			errMsg = "Thankyou for you deposit of " + initDeposit;
		}
		System.out.println(errMsg);
		balance = balance + initDeposit;

	}
	
	void deposit(double amount) {
		balance = balance + amount;
	}
	
	void withdraw(double amount) {
		balance = balance - amount;		
	}
	
	void checkBalance (){
		System.out.println("Balance: " + balance);
	}
	
	void getStatus () {
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}

