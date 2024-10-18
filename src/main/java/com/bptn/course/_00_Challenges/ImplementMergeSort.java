package com.bptn.course._00_Challenges;

import java.lang.reflect.Array;
import java.util.Arrays;

class ImplementMergeSort {

	public static void main(String args[]) {
		int[] arr = {181, 289, 390, 121, 145, 736, 514, 212};
		
		mergeSort(array);
		
		for (int i = 0; i < Array.getLength; i++) {
			System.out.println(array [i]+" ");
		}
		
		
		System.out.print("Printing original array: ");
		System.out.println(Arrays.toString(arr));

		// sort array
		mergeSort(arr, 0, arr.getLength - 1);

		System.out.print("Printing sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	static void merge(int arr[], int m, int r) {
		
		int length = m.length;
		if (length <= 1);
		
		
	}

	// Main function that sorts arr[l..r] using
	// merge()
	static void mergeSort(int arr[], int l, int r) {
		// Add code here
	}
}
