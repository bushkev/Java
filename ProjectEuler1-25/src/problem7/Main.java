package problem7;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int pPos = 10001; 	// position of the prime number
		int pNum;
		List<Integer> pList = new ArrayList<Integer>();	// list of prime numbers.
		
		//finding prime numbers here
		
		for (int i = 1; ; i ++ ) {
			int count = 0;
			for (int j = i; j >= 1 ; j --) {
				if (i%j == 0) count ++;
			}
			if (count == 2) {
				pList.add(i);
			}
			if (pList.size() == pPos) {
				pNum = pList.get(pPos-1);
				break;
			}
		} 
		System.out.println(pList.size());
		System.out.println(pNum);
		
	}

}
