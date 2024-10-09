package com.bptn.course._15_java_collections_list_linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		//creating object of LinkedList
		LinkedList<String> colors= new LinkedList<>();
		
		// add elements to the list
		colors.addFirst("red");
		
		//Use overloaded method which adds index 
		//colors.add"orange");
		//colors.add("yellow");
		//colors.add("green");
		//colors.add("blue");
		
		//add elements to the end of the list
		colors.addLast("purple");
		
		System.out.println("LinkedList after adding colors: "+ colors);

		//Remove element from the beginning of the list
		
		colors.removeFirst();
		
		//Remove element from the end of the list
		
		colors.removeLast();
		
		System.out.println("LinkedList after removing colors: "+ colors);
		
		colors.add("orange");
		colors.add("yellow");
		colors.add("green");
		colors.add("blue");
		
		
		System.out.println("LinkedList after adding colors: "+ colors);
		
		//Remove an element from index 1
		
		colors.remove(1);
		
		System.out.println("LinkedList after removing element at index 1: "+ colors);
		
		//add an element at index 1
		
		colors.add(1, "red");
		
		System.out.println("LinkedList after adding element at index 1: "+ colors);
		
		
		//Access an element at index 2
		
		System.out.println("Access an element at index 2: "+ colors.get(2));
		
		
		colors.add(null);
		
		System.out.println("Updated LinkedList : "+ colors);
		
		//Access elements in the LinkedList using a for-loop
		for(int i=0; i<colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		
		//Access elements in the LinkedList using for-each loop
		for(String element : colors) {
			System.out.println(element);
		}

		System.out.println("Accessing the elements using Iterator");
		
		Iterator<String> it= colors.iterator();
		
		while(it.hasNext()) {
			System.out.println("Accessing next element using Iterator: "+ it.next());
			
			
		}
		
		//Remove an element
		
		System.out.println("Removing an element using Iterator");
		
		Iterator<String> iterator= colors.iterator();
		
		while(iterator.hasNext()) {
			String color= iterator.next();
			if(color.equals("purple")) {
				iterator.remove();
				System.out.println("The color is remove successfully");
			}
		}
		
		//Adds an element using ListInterator(sub interface of iterator)
		ListIterator<String> listIterator= colors.listIterator();
		while(listIterator.hasNext()) {
			
			String color = listIterator.next();
			
			if(color.equals("orange")) {
				
				listIterator.add("black");
				System.out.println("The color is added successfully");
			}
		}
		System.out.println("LinkedList after adding color: "+ colors);
		
	}

}

//1. LinkedList's can have duplicates
//2. Linkedlist's can preserve insertion order
//3. LinkedList can also have null values
//4. You can use elements from a collection using an iterator while looping through it.
