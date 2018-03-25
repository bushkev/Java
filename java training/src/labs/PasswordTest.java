package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordTest {
	
	public static void main (String[] args) {
		String[] passwords = new String[13];
		String password = null;
		
		Scanner userIn = new Scanner(System.in);
		System.out.println("insert filename to be Checked: ");
		String filename = userIn.nextLine();
		userIn.close();
		
		File file = new File(filename);
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			for (int i =0 ; i<passwords.length ; i++) {
				passwords[i] = in.readLine();
			}
			in.close();
		}catch (FileNotFoundException e){
			System.out.println("ERROR: File not found.");
		}catch (IOException e) {
			System.out.println("ERROR: Could not read file.");
		}
		
		for (int j = 0 ; j< passwords.length ; j++){
			password = passwords[j];
			try{
				if (LetterCheck(password)== false ) {
					throw new LetterException(password);
				}
				if (NumberCheck(password)== false ) {
					throw new NumberException(password);
				}
				if (SpecialCheck(password)== false ) {
					throw new SpecialException(password);
				}
			}catch (LetterException e) {
				System.out.println("ERROR: No letter in password.");
				System.out.println(e.toString());
			}catch (NumberException e) {
				System.out.println("ERROR: No number in password.");
				System.out.println(e.toString());
			}catch (SpecialException e) {
				System.out.println("ERROR: No special character in password.");
				System.out.println(e.toString());
			}
		}
	}
	
	public static boolean LetterCheck(String in) {
		Pattern letter = Pattern.compile("[a-zA-Z]");
		Matcher hasletter = letter.matcher(in);
		
		return hasletter.find();
	}
	
	public static boolean NumberCheck(String in) {
		Pattern number = Pattern.compile("[0-9]");
		Matcher hasNumber = number.matcher(in);
		
		return hasNumber.find();
	}
	
	public static boolean SpecialCheck(String in) {
		Pattern special = Pattern.compile("[^a-zA-Z0-9]");
		Matcher hasSpecial = special.matcher(in);
		
		return hasSpecial.find();
	}
}	

class NumberException extends Exception {
	String var;
	NumberException (String var) {
		this.var = var;
	}
	public String toString (){
		return "NumberException: " + var;
	}
}

class LetterException extends Exception {
	String var;
	LetterException (String var) {
		this.var = var;
	}
	public String toString (){
		return "LetterException: " + var;
	}
}
	
class SpecialException extends Exception {
	String var;
	SpecialException (String var) {
		this.var = var;
	}
	public String toString (){
		return "SpecialException: " + var;
	}
}