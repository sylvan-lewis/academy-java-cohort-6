package com.bptn.course._17_java_collections_map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		//declare an object for TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Millie", 3);
		treeMap.put("Jilly", 12);
		treeMap.put("Gille", 23);
		treeMap.put("Willy", 33);
		treeMap.put("Billy", 43);
		treeMap.put("Millie", 53);
		treeMap.put("Silly", null);
		treeMap.put("Nilly", null);
		//treeMap.put(null, 63);
		treeMap.put("Willy", 53);
		
		System.out.println(treeMap);
		//
		//Access an element from TreeMap
		
		System.out.println("Billy's age is: "+ treeMap.get("Billy"));
		
		//Access the first key of the map
		
		System.out.println("Get first key of the map: "+ treeMap.firstKey());
		
		//Access the first entry of the map
		System.out.println("Access the first entry of the map" + treeMap.firstEntry());
		
		
		
		
		
	}

}










//Major key takeaways: 
//1. Does it preserve insertion order? Yes 
//2. Does keys allow null values? No it will not allow null keys
//3. Does values allow null values?  yes values of null value multiple null value similar to list
//4. does keys allow duplicates? If we try to add a key once again it overrides the value rather then creating a new <K, V> pair
//5. does values allow duplicates? yes