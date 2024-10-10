package com.bptn.course._17_java_collections_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		// create an object
		Map<String, Integer> hashMap = new HashMap<>();

		// Declaring Key and Value --> K = String V= Value

		hashMap.put("Millie", 3);
		hashMap.put("Jilly", 12);
		hashMap.put("Gille", 23);
		hashMap.put("Willy", 33);
		hashMap.put("Billy", 43);
		hashMap.put("Millie", 53);
		hashMap.put("Silly", null);
		hashMap.put("Nilly", null);
		hashMap.put(null, 63);

		System.out.println(hashMap);

		// keyset() -> return Set view of the keys
		for (String key : hashMap.keySet()) {
			System.out.println("Name: " + key + "Age: " + hashMap.get(key));
		}

		// Retrieve the age of John and print it to the console
		System.out.println("Age of John is: " + hashMap.get("John"));

		// Update value of existing key
		hashMap.replace("Willy", 33);

		System.out.println("The new age of Jane is: " + hashMap.get("Willy"));

		// Check if key is present in the map using containsKey (Object k) method

		if (hashMap.containsKey("Willy")) {
			System.out.println("The key is existing in the map");
		} else {
			System.out.println("The key is not existing in the map");
		}

		// putIfAbsent (Object k, Object v) is used to add a key-value pair if a key
		hashMap.putIfAbsent("Willy", 22);//Doesnt override age 33 for willy
		
		System.out.println(hashMap);
		
		//Iterating through the HashMap using entrySet() method
		for(Map.Entry<String, Integer> entry:hashMap.entrySet()) {
			System.out.println("Name: "+ entry.getKey() + " Age: "+ entry.getValue());
		}
		
		
		
		// does not exist in the map

	}

}

//Major key takeaways: 
//1. Does it preserve insertion order? No
//2. Does keys allow null values? yes 1 maximum value
//3. Does values allow null values? yes values can consist of null value (- multiple null values similar to a list behaves)
//4. does keys allow duplicates? If we try to add a key once again it overrides the value rather then creating a new <K, V> pair
//5. does values allow duplicates? Yes
//6. We cannot have duplicate keys
