package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashExample {

	public static void main(String[] args) {
		
		//Create LinkedHashSet object
		Set<String> linkedHashSet = new LinkedHashSet <>();

		linkedHashSet.add("apple");
		linkedHashSet.add("cherry");
		linkedHashSet.add("blueberries");
		linkedHashSet.add("orange");
		linkedHashSet.add("mango");
		linkedHashSet.add("strawberries");
		linkedHashSet.add(null);
		linkedHashSet.add("apple");//does it allow duplicates
		
		System.out.println("The LinkedHashSet is: "+ linkedHashSet);
		
		
		
		
		
	}

}
//1. Insertion order -- yes
//2. It allows null values? -- yes
//3. It allows duplicates? -- No
//4. Underlying implementation -- shows data in the form of a Hash Table and doubly LinkedList
//5. LinkedHashSet is not indexed
