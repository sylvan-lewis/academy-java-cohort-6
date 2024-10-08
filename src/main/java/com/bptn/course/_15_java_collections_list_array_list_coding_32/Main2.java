package com.bptn.course._15_java_collections_list_array_list_coding_32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main (String[] args) {
		
		String [] cars = {"Volvo","Honda","Ford"};
		
		List<String> newList = new ArrayList<>(Arrays.asList(cars));
		
		System.out.println("the converted arraylist is: "+ newList);
		
		
	}
	
	


	
	
	
	
	
	
}
