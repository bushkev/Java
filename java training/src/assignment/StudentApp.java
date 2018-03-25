package assignment;

public class StudentApp {
	
	public static void main (String[] args) {
		StudentAccount student1 = new StudentAccount("Kevin", "123456789");
		StudentAccount student2 = new StudentAccount("tom", "987654321");
		
		student1.enroll(4);
		student1.pay(1000);
		student1.showCourses();
	}	
	
}
