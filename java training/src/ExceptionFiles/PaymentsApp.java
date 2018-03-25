package ExceptionFiles;

import java.util.Scanner;

public class PaymentsApp {
	
	public static void main (String[] args) {
		double payment = 0;
		boolean posPay = true;
		
		do{
			
			System.out.print("enter the payment amount: ");
			
			Scanner in = new Scanner(System.in);
			payment = in.nextDouble();
			in.close();
			try{
				if(payment < 0 ){
					throw new NegativePaymentException(payment);
				}
				else {
					posPay = true;
				}
			}catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again.");
				posPay = false;
			}
		} while(!posPay);
		
		System.out.println("Thank you for your payment of $" + payment);
		
	}

}
