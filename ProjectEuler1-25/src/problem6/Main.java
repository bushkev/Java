package problem6;

public class Main {
	
	public static void main (String[] args) {
		
		int start = 1;							//first number in range
		int stop = 100;							//last number in range
		int addSq;								//the sum of the square of the numbers
		int sqAdd;								//the square of the sum of the numbers
		int dif;								//the difference of the 2 equations.
		int range = stop - start +1;			//amount of numbers in range
		int[] numArr = new int[range];			//the array that holds the number range
		
		//initialize array with numbers
		for (int i =0 ; i < range ; i++) {
			numArr [i] = start;
			if (start < stop) start ++;
		}
		
		addSq = addSq(numArr,range);
		sqAdd = sqAdd(numArr,range);
		dif = sqAdd - addSq;
		System.out.println(dif);
		
	}
	
	public static int addSq(int[] Arr, int range) {
		int temp = 0;
		for (int i = 0 ; i < range ; i++) {
			temp += Math.pow(Arr[i],2) ;
		}
		return temp;
	}
	
	public static int sqAdd (int[] Arr, int range) {
		int temp = 0;
		for (int i = 0 ; i < range ; i++) {
			temp += Arr[i];
		}
		return (int) Math.pow(temp,2);
	}
}
