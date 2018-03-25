package arrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanIn = new Scanner(System.in);
	
	public static void main (String[] args) {
		int[] myArray;
		int[] sortArray;
		
		myArray = getArray(5);
		sortArray =sortArray(myArray);
		printArray(sortArray);
		
		scanIn.close();
	}
		
	public static int[] getArray(int number) {
		int[] array = new int[number];
		
		System.out.println("enter " + number + " numbers, each number followed by enter.");
		for (int i=0 ; i< number; i++) {
			array[i] = scanIn.nextInt();
		}
		return array;
	}
		
	public static void printArray(int[] array) {
		for (int i = 0 ; i < array.length; i++) {
			System.out.println("variable at position " + (i +1) + " is " + array [i] );
		}
	}
		
	private static int[] sortArray (int [] array) {
		int[] sortArray = Arrays.copyOf(array, array.length);
		boolean done = true;
		
//		for(int i =0; i< array.length; i++) {
//			sortArray[i] = array[i];
//		}
		while (done){
			done = false;
			for (int i =0; i<sortArray.length-1; i++) {
				if(sortArray[i] < sortArray[i+1]) {
					int temp = sortArray[i];
					sortArray[i] = sortArray[i+1];
					sortArray[i+1] = temp;
					done = true;
				}
			}
		}
		return sortArray;
	}
}
