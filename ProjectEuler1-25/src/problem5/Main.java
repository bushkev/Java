package problem5;

public class Main {

	public static void main(String[] args) {
		
		int start = 1;							//starting number
		int stop = 20;							//ending number
		int range = (stop - start) +1;			//range of numbers
		int number = 1;							//number to check
		boolean found = true;					//boolean to trigger when number is found
		int[] numArr = new int[range];			//array to hold numbers
		
		//initialize array with numbers
		for (int i =0 ; i < range ; i++) {
			numArr [i] = start;
			if (start < stop) start ++;
		}
		
		//find which number can be divided by all numbers in the range.
		while (found) {
				found = isDiv(number, numArr, range);
				if (found) number++;
		}System.out.println(number);
	}
	
	//function to test numbers are divisible.
	public static boolean isDiv (int num, int[] arr, int range) {
		int count = 0;
		for (int i = 0; i < range ; i++) {
			if (num % arr[i] == 0) count ++;
			else return true;
		}
		if (count == range) return false;
		return true;
	}
}
