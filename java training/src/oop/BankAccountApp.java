package oop;

public class BankAccountApp {
	
	public static void main (String[] args) {
		
	BankAccount acc1 = new BankAccount();
	acc1.accountNumber = "01234567";
	
	acc1.setName ("Roger Hue");
	System.out.println(acc1.getName());
	
	acc1.setSsn("123456789");
	System.out.println(acc1.getSsn());
	
	acc1.balance = 10000;
	
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.withdraw(2000);
	
	System.out.println(acc1.toString());
	
	/*
	BankAccount acc2 = new BankAccount("Checking Account");
	acc2.accountNumber = "01345634";
	
	BankAccount acc3 = new BankAccount("Savings Account", 5000);
	acc3.accountNumber = "01454567";
	acc3.checkBalance();
	
	CDAccount cd1 = new CDAccount();
	cd1.balance = 3000;
	cd1.name = "Juan";
	cd1.accountType = "CD Account";
	cd1.interestRate = "4.5";
	System.out.println(cd1.toString());
	cd1.compound();
	*/
	
	}
}
