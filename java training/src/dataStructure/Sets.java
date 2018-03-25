package dataStructure;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// define the collection
		Set<String> animals = new HashSet<String>() ;
		
		//add elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Monkey");
		animals.add("Tiger");
		animals.add("Deer");
		
		System.out.println(animals.size() + " " + animals);
		
		animals.add("Goose");
		animals.add("Tiger");
		animals.add("Deer");
		
		System.out.println(animals.size() + " " + animals);
		
		//creat a new set that we can use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("Pig");
		farmAnimals.add("Cat");
		farmAnimals.add("Horse");
		farmAnimals.add("Cow");
		farmAnimals.add("Dog");
		
		System.out.println(farmAnimals);
		//what is the intersection between 2 sets
		//1. copy existing set into a new set.
		Set<String> intersection = new HashSet<String>(animals);
		System.out.println(intersection);
		//2. retain only the elements that are also in the other set.
		intersection.retainAll(farmAnimals);
		System.out.println("The intersection set is: "+ intersection);;
		
		//what is the union
		Set<String> union = new HashSet<String>(farmAnimals);
		union.addAll(animals);
		System.out.println("the Union " + union);
		
		//what is differnce? In animals but not in farmAnimals 
		Set<String> different = new HashSet<String>(animals);
		different.removeAll(farmAnimals);
		System.out.println("difference is " + different);
		
		//difference 2. in farm animals but not animals
		Set<String> differentOther = new HashSet<String>(farmAnimals);
		differentOther.removeAll(animals);
		System.out.println("difference 2 is " + differentOther);		
	}

}
