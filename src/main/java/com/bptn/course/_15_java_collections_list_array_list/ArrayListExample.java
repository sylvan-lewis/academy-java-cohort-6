package com.bptn.course._15_java_collections_list_array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		//1st way of declaring ArrayList
		//ArrayList<Integer> arrayList = new ArrayList <>();

		
				
				
		//2nd way of declaring ArrayList
		List<Integer> arrayList = new ArrayList <>();
				
		//Add values into arrayList
		arrayList.add(100);
		arrayList.add(200);
		arrayList.add(300);
		arrayList.add(300);//ArrayList allows duplicates
		arrayList.add(400);
		arrayList.add(null);//ArrayList allows null values
		arrayList.add(null);//ArrayList allows duplicate null values		
		
		
		System.out.println(arrayList);
		
		//The size of the ArrayList
		System.out.println("The size of the arrayList: " + arrayList.size());
		
		//Access the first element
		System.out.println("The first element is: " + arrayList.get(0));
		
		//Update the element at index 2
		arrayList.set(2,  250);
		
		System.out.println("Updated ArrayList: " + arrayList);
		
		//Can also update null values
		arrayList.set(5,  450);
		
		System.out.println("Updated ArrayList: " + arrayList);
		
		arrayList.add(7,  500);
		
		System.out.println("Updated ArrayList: " + arrayList);

		//remove an element from index 4
		System.out.println("The element remove is: " + arrayList.remove(4));
				
		//The size of the ArrayList
		System.out.println("The size of the arrayList: " + arrayList.size());		
				
				
		//Accessing the elements tradition for-loop
		for(int i=0 ; i< arrayList.size(); i++) {			
			System.out.println(arrayList.get(i));
		}
		
		//Accessing the elements tradition for-each loop
		for(Integer element: arrayList) {
			System.out.println(element);
		}
				
				
				
				
	}

}


// <> diamond operators -> Java Generic's'
// ctrl + shift + o will allow you to declare any type of java.util package

// 1. SOLID principles
// D -> Dependency inversion principle

//We need to rely on Abstraction rather than concrete implementation

//1. The 1st way of declaring is relying on concrete implementation which does not follow dependency Inversion Principle

//2. The 2nd of declaring is relying on Abstraction which follows dip

//3. ArrayList<Integer> arrayList = new ArrayList<>();
//The arrayList object has access to both List methods and any methods specific to the arrayList class
//(like trimToSize() and ensureCapacity()).

//4. List<Integer> arrayList = new ArrayList<>();
//The arrayList object can only call methods in the list interface


