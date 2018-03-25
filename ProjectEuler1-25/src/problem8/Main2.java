package problem8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* I had to rework this whole Class because I needed to find the adjacent horizontal numbers only (instead of vertical and diagonal as well). 
 * However the issue came in that the problem wanted me to look at the block of numbers as a continuous line.
 * That is why there is 2 mains with this problem. I didn't want to throw away all my work. */

public class Main2 {

	public static void main(String[] args) {
		String filename = "C:\\Users\\kevin\\workspace\\files\\numTest.txt";
		int num = 13;					//amount of numbers to read
		long horProd;					//highest horizontal product
		long vertProd;					//highest vertical product
		long diagProd;					//highest diagonal product
		List<String> lineStr = new ArrayList<String>();
		int[][] arrOfNum2D;
		
		lineStr.addAll(readLine(filename));
		arrOfNum2D = convertList(lineStr);
		horProd = horLineCheck(arrOfNum2D, num);
		vertProd = vertLineCheck(arrOfNum2D, num);
		diagProd = diagLineCheck(arrOfNum2D, num);
		
		System.out.println(horProd + " is the highest horizontal product.");
		System.out.println(vertProd + " is the highest vertical product.");
		System.out.println(diagProd + " is the highest diagonal product.");
		
	}
	
	//read and store numbers as string from the text line by line and return as an array list
	public static List <String> readLine (String filename) {
		File file = new File (filename);
		List<String> tempList = new ArrayList<String>();
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String tempLine;
			while ((tempLine = br.readLine()) != null) {
				tempList.add(tempLine);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO exception");
			e.printStackTrace();
		}
		return tempList;
	}
		
	/* receive list with a line of String type in each elements and convert the Strings  to int;
	 * then store the newly converted in separate elements of an array; then store those arrays into another array and return the 2d Array.*/
	public static int[][] convertList (List <String> lines) {
		int[][] temp2dArr = new int[lines.size()][];
		int[] temp1dArr;

		for (int i = 0; i< lines.size(); i++) {
			String line = null;
			line = lines.get(i);
			temp1dArr = new int[line.length()];
						
			for (int j = 0 ; j< line.length(); j++) {
				temp1dArr[j] = Integer.valueOf(line.substring(j,j+1));
			}
			temp2dArr [i] = temp1dArr;
		}
		return temp2dArr;
	}
	
	/* receive a 2d array and a number of amount of adjacent numbers to check. 
	 * check each inner array one at a time for highest horizontal adjacent multiples based on check number imported.
	 * compare the product of each line against other outer array lines and return the highest overall. */
	public static long horLineCheck (int[][] arr2D, int checkAmt) {
		long prod;
		long bigProd = 0;
		
		for (int[] lines:arr2D) {
			for (int i = 0 ; i< lines.length - (checkAmt -1); i++) {
				prod = 1;
				
				for(int j = i ; j < (i+checkAmt) ; j++) {
					prod *= lines[j];
					if (prod ==0) break;
				}
				if (prod > bigProd) bigProd = prod;
			}
		} 
		return bigProd;
	}
	
	/* receive a 2d array and a number of amount of adjacent numbers to check. 
	 * check each inner array one at a time for highest vertical adjacent multiples based on check number imported.
	 * compare the product of each line against other outer array lines and return the highest overall. */
	public static long vertLineCheck (int[][] arr2D, int checkAmt) {
		long prod;
		long bigProd = 0;
		
		for (int i =0; i< arr2D[0].length; i++) {
			for(int j = 0; j< (arr2D.length-(checkAmt-1)); j++) {
				prod = 1;
				
				for(int k = j; k< ( j+ checkAmt); k++) {
					prod *= arr2D[k][i];
					if (prod ==0) break;
				}
				if (prod > bigProd) bigProd = prod;
			}
		}
		return bigProd;
	}
	
	//check the diagonal of lines
	public static long diagLineCheck (int[][] arr2D, int checkAmt) {
		long prod;
		long bigProd = 0;
		
		for(int i = 0; i< (arr2D.length-(checkAmt-1)) ; i++) {
			for(int j = 0; j< (arr2D[i].length -(checkAmt -1)) ; j++) {
				prod = 1;
				for (int k = 0; k < checkAmt ; k++) {
					prod *=	arr2D[i+k][j+k];
					if (prod ==0) {
						break;
					}
				}
				if (prod > bigProd) bigProd = prod;	
			}
		}
		//check opposite direction diagonal
		for(int i = 0; i< (arr2D.length-(checkAmt-1)) ; i++) {
			for(int j = (arr2D[i].length-1); j > (checkAmt -1) ; j--) {
				prod = 1;
				for (int k = 0; k < checkAmt ; k++) {
					prod *=	arr2D[i+k][j-k];
					if (prod ==0) {
						break;
					}
				}
				if (prod > bigProd) bigProd = prod;	
			}
		}
		return bigProd;
	}
}
