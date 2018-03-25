package problem4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main (String[] args) {
		int bigPal;
		int sRanOne = 100;				// starting number for range 1
		int eRanOne = 999;				// ending number for range 1
		int ranOne = eRanOne - sRanOne +1;		// array size for 1
		int sRanTwo = 100;				// starting number for range 2
		int eRanTwo = 999;					// ending number for range 1
		int ranTwo = eRanTwo - sRanTwo +1;		// array size for 2
		
		int[] arrOne;					//first number array
		int[] arrTwo;					//second number array
		
		arrOne = Arrays.copyOf(setArray(sRanOne,eRanOne,ranOne),ranOne);
		arrTwo = Arrays.copyOf(setArray(sRanTwo,eRanTwo,ranTwo),ranTwo);
		bigPal = mult(arrOne, ranOne, arrTwo, ranTwo);
		if (bigPal == 0 ) System.out.println("No palindromic numbers numbers in that range.");
		else	System.out.println("The largest palindromic number in that set is " + bigPal);
	}
		
	//insert numbers into range
	public static int[] setArray (int start, int stop, int range) {
		int [] tempArr = new int[range];
		for (int i=0; i < range; i++) {
			
			tempArr[i] = start;
			if (start < stop) {
				start ++;
			}
		}
		return tempArr;
	}
	
	//multiplies number ranges together then calls function to check and sort, and then returns biggest number.
	public static int mult (int[] arrOne, int ranOne, int[] arrTwo, int ranTwo) {
		int product;
		List<Integer> palList = new ArrayList<Integer>();     // list to hold palindromic numbers
		
		for ( int i = ranOne-1; i >= 0 ; i--)	{
			for ( int j = ranTwo-1; j >= 0; j--) {
				product = arrOne[i] * arrTwo[j];
				if(isPal(product)) {
					palList.add(product);
				}
			}
		}
		if (palList.size() == 0) return 0;
		return bigNum(palList);
	}
	
	//tests for palindromic number
	public static boolean isPal (int num) {
		String temp = String.valueOf(num);
		StringBuilder rev = new StringBuilder(temp);			
		return (temp.equals(rev.reverse().toString()));
	}
	
	//find highest number
		public static int bigNum (List<Integer> list) {
			int num  = list.get(0);
			for (int i =1; i< list.size() -1; i++) {
				if (num < list.get(i)) {
					num = list.get(i);
				}
			}
			return num;
		}
}
