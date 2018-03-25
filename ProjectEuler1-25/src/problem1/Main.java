package problem1;

public class Main {
	
	public static void main(String[] args) {
		int sumThree = 0;
		int sumFive = 0;
		
		//add all multiples of 3 together, except the multiples of 5. and store the answer in a variable.
		for(int i = 3; i < 1000; i += 3) {
			if (i % 5 != 0) {
				sumThree += i;
			}
		}
		
		//add all multiples of 5 together, and store the answer in a variable.
		for(int i = 5; i < 1000; i += 5) {
				sumFive += i;
			}
		
		System.out.println(sumThree + sumFive);
	}

}
