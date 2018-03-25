package basics;

public class ArrayFun {
	public static void main(String[] args){
	int[] array = { 2, 4, 10, 1, 7 };
	double[] arrayB = { 2, 4, 10, 1, 7 };
	
	System.out.println(min(array));
	System.out.println(max(array));
	System.out.println(avg(arrayB));
}

	public static int min(int [] a){
		int length = a.length;
		int minValue = a[0];
		
		for (int i = 1; i < length ; i++ ){
			if (minValue > a[i] ) {
				minValue = a[i];
			}
			
		}
		return minValue;
	}
	
	public static int max(int [] a){
		int length = a.length;
		int maxValue = a[0];
		
		for (int i = 1; i < length ; i++ ){
			if (maxValue < a[i] ) {
				maxValue = a[i];
			}
			
		}
		return maxValue;
	}
	
	public static double avg(double [] a){
		int length = a.length;
		double sum = 0;
		
		for (int i = 0; i < length ; i++) {
			sum += a[i];
		}
		
		return sum / length;
	}

}
