package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreditCardApp {
	
	public static void main (String[] args) {
		String filename;
		String infoLine;
		double balance = 0;
		double temp;
		System.out.println("Enter the name of the file to read: ");
		Scanner in = new Scanner(System.in);
		filename = in.nextLine();
		in.close();
				
		List<String[]> info = new ArrayList<String[]>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while((infoLine = br.readLine()) != null){
				String[] line = infoLine.split(",");
				info.add(line);
			}
			br.close();
			
		for(String[] account: info){
			temp = Double.parseDouble(account[3]);
			if ((account[1].equals("CREDIT")) || (account[1].equals("FEE" ))) {
				balance += temp;
			}else balance -= temp;
		}
		if(balance > 0) {
			System.out.printf("Balance of %.2f still due.\n%%10 late fee charged to account.\n", balance);
			balance = (balance * 1.1);
			System.out.printf("New balance due is %.2f\n", balance);	
		}else if (balance ==0) {
			System.out.println("Thank you for your payment.\nYour balance is now 0.");
		}else {
			System.out.println("Thank you for your payment.");
			System.out.printf("You have a balance of %.2f",balance);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
