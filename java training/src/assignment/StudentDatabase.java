package assignment;

class StudentAccount {
	
	private String name;
	private static int id = 1000;
	private String ssn;
	private String phone;
	private String city;
	private String state;
	private double balance = 0;
		
	public StudentAccount (String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		id++;
		newEmail();
		userId();
	}
	
	public void newEmail(){
		String email= name + "@.coolSchool.edu";
		System.out.println("Your new email address is: " + email);		
	}
	
	public void userId() {
		int random = 1000 + (int) (Math.random() * 8001 + 1000);
		String userId = id + "" + random + ssn.substring(5);
		System.out.println(userId);
	}
	
	public void enroll (int courses) {
		balance = courses * 500;
		System.out.println("You enrolled in " + courses + " courses.\nYou now have a balance of: " + balance);
		
	}
	
	public void pay(double amount) {
		balance -= amount;
		System.out.println("Thank you for you payment.");
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Your balance owed is: " + balance);
	}
	
	public void showCourses(){
		System.out.println("You are not currently enrolled in any course.");
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString(){
		return "not sure what you want this override to do";
	}
}