package com.bptn.course._16_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		// Create an object of TreeSet
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("mango");
		treeSet.add("apple");
		treeSet.add("orange");
		treeSet.add("banana");
		treeSet.add("pineapple");
		
		treeSet.add("mango"); //Doesnt add duplicates
		
		//treeSet.add(null); //doesnt allow null values
		
		System.out.println("TreeSet is : "+ treeSet);
		
		
		
		

	}

}


//1. Insertion order Natural ascending order
//2. It allows null values? No null values it throws NullPointerException
//3. It allows duplicates? No duplicates 
//4. Underlying implementation 
//5. Is TreeSet Indexed?



