package algorithims;

public class Sort {

	public static void bubbleSort(int dataSet[]) {
		boolean test;
		do {
			test = false;
			for(int i =0; i<dataSet.length -1 ; i++) {
				if (dataSet[i] > dataSet[i+1]) {
					int temp = dataSet[i];
					dataSet[i] = dataSet[i+1];
					dataSet[i+1] = temp;
					test = true;
				}
			}
		}while (test);
		for(int i : dataSet) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
