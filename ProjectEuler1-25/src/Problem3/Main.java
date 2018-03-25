package Problem3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		int pNum = 10000; 	// max prime number range
		List<Integer> pList = new ArrayList<Integer>();	// list of prime numbers.
		List<Integer> fList = new ArrayList<Integer>(); // list of factors.
		double gNum = 600851475143d; // given number.

		//finding prime numbers here
			for (int i = 1; i<= pNum ; i ++ ) {
				int count = 0;
				for (int j = i; j >= 1 ; j --) {
					if (i%j == 0) count ++;
				}
				if (count == 2) {
					pList.add(i);
				}
			} 

		// finding factors here
		while (gNum != 1) {
			for (int i = 0; i < pList.size() ; i ++) {
				if (gNum % pList.get(i) == 0) {
					gNum /= pList.get(i);
					fList.add(pList.get(i));
				}
			}for (int i = 0; i< fList.size(); i++){
			System.out.println(fList.get(i));
			}
		}
	}
}
