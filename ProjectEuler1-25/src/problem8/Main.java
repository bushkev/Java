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


public class Main {

	public static void main(String[] args) {
		String filename = "C:\\Users\\kevin\\workspace\\files\\numbers.txt";
		int num = 13;					//amount of numbers to read
		long horProd;					//highest horizontal product
		List<String> lineStr = new ArrayList<String>();
		List<Integer> lineInt = new ArrayList<Integer>();
				
		lineStr.addAll(readLine(filename));
		lineInt = convertList(lineStr);
		horProd = horLineCheck (lineInt, num);
		System.out.println(horProd);
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
		
	// receive list with a line of String type in each elements and convert the Strings  to int. Then return list of int numbers, In one long continuous line.
	public static List<Integer> convertList (List <String> lines) {
		List<Integer> tempList = new ArrayList<Integer>();

		for (int i = 0; i< lines.size(); i++) {
			String line = null;
			line = lines.get(i);
						
			for (int j = 0 ; j< line.length(); j++) {
				tempList.add(Integer.valueOf(line.substring(j,j+1)));
			}			
		}
		return tempList;
	}
	
	/* receive a list and a number of amount of adjacent numbers to check. 
	 * check each set of numbers for highest horizontal adjacent multiples based on check number imported. and return the highest overall. */
	public static long horLineCheck (List<Integer> tempList, int checkAmt) {
		long prod;
		long bigProd = 0;
		
		for (int i = 0; i < tempList.size() - (checkAmt -1) ; i++) {
			prod = 1;
				
			for(int j = i ; j < (i+checkAmt) ; j++) {
				prod *= tempList.get(j);
				if (prod ==0) break;
			} 
			if (prod > bigProd) bigProd = prod;
		} 
		return bigProd;
	}
	
}
