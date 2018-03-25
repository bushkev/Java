package dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		//implement map interfaces
		Map<Integer,String> hMap = new TreeMap<Integer,String>();
		mapUtil(hMap);
		
	}
	
	public static void mapUtil (Map<Integer,String> map) {
		//add key value pairs
		map.put(101, "Steve");
		map.put(501, "Roger");
		map.put(32, "Jenifer");
		map.put(315, "Mika");
		map.put(750, "Kelly");
		
		//Expose / access element
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		
		//Iterate through map of key-value pairs
		for (int key: map.keySet()) {
			System.out.println("Key: " + key + " value is " + map.get(key));
		}
		
	}

}
