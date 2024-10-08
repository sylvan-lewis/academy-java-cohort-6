package com.bptn.course._15_java_collections_list_array_list_coding34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
        
	       List<String> nameList = new ArrayList<String>();

	       nameList.add("Robert");
	       nameList.add("Samson");
	       nameList.add("Alex");
	       nameList.add("William");
	       
	       System.out.println("Elements of List: " + nameList);
	       
	       //Declare an array whose length is equals to size of the ArrayList
	       String[] output = new String [nameList.size()];
	       
	       output = nameList.toArray(output);
	       
	       //Print the elements int he array
	       
	       System.out.println("Elements of array: " + Arrays.toString(output));
	       
	       
	       
	       
	}

}
