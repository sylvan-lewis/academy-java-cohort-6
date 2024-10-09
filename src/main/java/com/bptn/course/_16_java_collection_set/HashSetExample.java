package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//Create an object of HashSet
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple");// It allows duplicates ?
		hashSet.add(null);//It allows null values
		
		System.out.println("The HashSet of fruits: "+ hashSet );
		

	}

}


//1. Insertion order -- No will not preserve the order
//2. It allows null values? -- Allows only 1 null value maximum
//3. It allows duplicates? -- No
//4. Underlying implementation -- shows data in the form of a Hash Table
//5. HashSet is not indexed, No