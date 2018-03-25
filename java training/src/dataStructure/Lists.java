package dataStructure;

import java.util.ArrayList;

public class Lists {
	
	public static void main(String[] args) {
		//create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		//add elements
		cities.add("cleveland");
		cities.add("Toronto");
		cities.add("Goshen");
		cities.add("Louisville");
		cities.add("Goshen");
		
		//iterate the collection
		for( String city:cities) {
			System.out.println(city);
		}
		
		//get the size
		int size = cities.size();
		System.out.println("There are " +size);
		
		//retrieve specific elements
		System.out.println(cities.get(0));
		
		//remove
		cities.remove(0);
		size = cities.size();
		System.out.println("New amount " + size);
		
		for(String city: cities) {
			System.out.println(city);
		}
		
	}

}
