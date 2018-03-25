package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {
	
	public static void main (String[] args) {
		
		String filename = "C:\\Users\\kevin\\workspace\\files\\PhoneNumber.txt";
		File file = new File(filename);
		String [] phoneNums= new String [6];
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader (new FileReader(file));
			for (int i =0 ; i< phoneNums.length; i++){
				phoneNums[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file.");
		}
		
		for (int i =0 ; i< phoneNums.length; i++){
			phoneNum = phoneNums[i];
			try {
				if (phoneNum.length() != 10) {
					throw new TenDigitException(phoneNums[i]);
				}
				if (phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")) {
					throw new AreaCodeException(phoneNums[i]);
				}
				for (int n=0; n< phoneNums[i].length() ; n++) {
					if (phoneNum.substring(n, n+1).equals("9")) {
						if (phoneNums[i].substring(n+1,n+3).equals("11")) {
							throw new EmergencyException(phoneNums[i]);
						}
					}
				}
				System.out.println(phoneNum);
			} catch (TenDigitException e) {
				System.out.println("ERROR: Phone number is not 10 digits long.");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("ERROR: Phone number has invalid area code.");
				System.out.println(e.toString());	
			} catch (EmergencyException e) {
				System.out.println("ERROR: Phone numer contains unathorized 911 sequence.");
				System.out.println(e.toString());
			}
		}
	}

}

class TenDigitException extends Exception{
	String num;
	
	TenDigitException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return "TenDigitException: " + num;
	}
	
}

class AreaCodeException extends Exception{
	String num;
	
	AreaCodeException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return "AreaCodeException: " + num;
	}
}

class EmergencyException extends Exception{
	String num;
	
	EmergencyException(String num) {
		this.num = num;
	}
	
	public String toString() {
		return "EmergencyException: " + num;
	}
}