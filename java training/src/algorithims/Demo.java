package algorithims;

public class Demo {
	
	public static void main (String[] args) {
		int[] array = {11, 20, 2, 135, 450, 75, 19, 900};
		int [] sortedArray = {5, 9, 13, 18, 21, 25, 30, 45, 50, 75, 80, 85, 90, 95, 99, 100};
		
		//call linear search
		int pos = algorithims.Search.linearSearch(array, 75) + 1;
		if (pos == 0) System.out.println("The linear target is not in the array.");
		else System.out.println("The linear target is located in position " + pos);
		
		//call binary search
		int posTwo = algorithims.Search.binarySearch(sortedArray, 5, 0, sortedArray.length) +1;
		if (posTwo == 0) System.out.println("The binary target is not in the array.");
		else System.out.println("The binary target is located in position " + posTwo);
		
		Sort.bubbleSort(array);
	}

}
