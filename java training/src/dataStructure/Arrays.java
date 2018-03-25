package dataStructure;

public class Arrays {
	
	public static void main (String[] args) {
		String[][] users = { 
				{"a","b","c"},
				{"d", "e", "f"},
				{"g", "h", "i"}
			};
		
		for(String[] what : users) {
				for(String other:what) {
					System.out.print(other);
				}
			}
		
	}
}
