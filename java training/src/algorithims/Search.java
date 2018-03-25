package algorithims;

public class Search {
	
	public static int linearSearch(int[] dataSet, int target) {
		for(int i = 0; i<dataSet.length ; i++) {
			if (dataSet[i] == target) {
				return i + 1;
			}
		}
		return -1;
	}
	
	public static int binarySearch (int[] dataSet, int target, int start, int end) {
		int middle = (int) Math.floor((start+end)/2);
		int midValue = dataSet[middle];
		int count = 0;
		
		for (int i= 0; i< dataSet.length; i++){
			if (dataSet[i] != target) count ++;
		}
		if (count == dataSet.length) return -1;
		
		if (midValue < target) {
			start = middle +1;
			return binarySearch(dataSet, target, start, end);
			
		}else if (midValue > target) {
			end = middle -1;
			return binarySearch(dataSet, target, start, end);
		}
		return middle;
	}

}
