package com.bptn.course._15_java_collections_list_array_list_codio;

import java.util.List;
import java.util.ArrayList;

public class Test {

	public static void printEvenElements(ArrayList<Integer> list) {

		for (int i = 0; i < list.size; i++) {
			if (list.get(i) % 2 == 0) {
				System.out.print(list.get [i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		// instantiate ArrayList and fill with Integers
		ArrayList<Integer> values = new ArrayList<Integer>();
		int[] nums = { 1, 44, 7, 9, -16, 3, 2 };
		for (int i = 0; i < nums.length; i++) {
			values.add(nums[i]);
		}
		System.out.println("Expected output: 44, -16, 2,");
		System.out.print("Your output: ");
		printEvenElements(values);
		System.out.println();
	}
}
