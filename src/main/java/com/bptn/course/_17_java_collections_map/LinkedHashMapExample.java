package com.bptn.course._17_java_collections_map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

		
		linkedHashMap.put("Millie", 3);
		linkedHashMap.put("Jilly", 12);
		linkedHashMap.put("Gille", 23);
		linkedHashMap.put("Willy", 33);
		linkedHashMap.put("Billy", 43);
		linkedHashMap.put("Millie", 53);
		linkedHashMap.put("Silly", null);
		linkedHashMap.put("Nilly", null);
		linkedHashMap.put(null, 63);
		linkedHashMap.put("Willy", 55);
		
		System.out.println(linkedHashMap);
		
		//accessing the value in LinkedHashMap
		System.out.println("Millie's age is "+ linkedHashMap.get("Millie"));
		
		//Loop over the linked Hash Map using entrySet() method
		for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println("Name: "+ entry.getKey() + "Age: "+ entry.getValue());		
		}
		
		//accessing the map using iterator
		Iterator<Map.Entry<String, Integer>> it= linkedHashMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<String, Integer> entry= it.next();
			
			System.out.println("Name: "+ entry.getKey() + " Age: "+ entry.getValue());
			
			
		}
		
		
		
		
	}

}




//Major key takeaways: 
//1. Does it preserve insertion order? Yes 
//2. Does keys allow null values? It allows max one null value
//3. Does values allow null values?  yes values of null value multiple null value similar to list
//4. does keys allow duplicates? If we try to add a key once again it overrides the value rather then creating a new <K, V> pair
//5. does values allow duplicates? yes
