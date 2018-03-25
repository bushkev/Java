package basics;

public class FactSum {
	public static void main (String [] args) {
		System.out.println(fact(3));
		System.out.println(sum(6));
	}
	
//write a function that computes factorial. *hint: use recursion.
	public static int fact(int n){
		if (n == 0) {
			return 1;
		}
		else return (n * fact(n-1));
	}

//write a function that takes a value n and returns the sum of 1 to n.
	public static int sum(int n){
		if (n == 0) {
			return 0;
		}
		else return (n + sum(n-1));
	}
}