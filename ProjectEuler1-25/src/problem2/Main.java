package problem2;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int temp = 0;
		int evenSum = 2;
		
		/* add 2 numbers together, the add the second number and the sum together, repeat until you get to a number that is less than the test number and store in a variable. 
		 * then while finding the original number, every even number is added together in a separate variable.*/
		while (temp < 4000000) {
			temp = a + b;
			if (temp >= 4000000) {
				temp -= a;
				break;
			}else if (temp % 2 == 0 ) {
				evenSum += temp;
			}
			a= b;
			b = temp;
		}
		System.out.println(evenSum);
	}
}
