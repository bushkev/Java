package basics;

public class Weather {
	public static void main(String[] args){
		int temp = 45;
		String sunCondition = "Overcast";
		
		if (temp > 80){
			System.out.println("It's pleasent wear shorts and t=shirt.");
		}
		else if ((temp > 60) && (sunCondition == "Sunny")){
			System.out.println("It's a little cooler perhaps wear a long sleeve shirt and jeans.");
			System.out.println("Wear a hat to keep sun out of your eyes.");
		}
		else if ((temp > 50) || (sunCondition == "Overcast")){
			System.out.println("This is a cool day, be sure to wear warmer clothes.");
		}
		else {
			System.out.println("looks like a cold day. Bring a sweater.");
		}
		System.out.println("The program is ending.");
	}
}
