package com.bptn.course.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class DeleteDuplicates {

  /*
   * This method deletes duplicates from an unsorted ArrayList.
   * @param nums the sorted ArrayList with duplicates
   * @return a sorted ArrayList without duplicates
   */
  public static List<Integer> deleteDuplicates(List<Integer> nums) {

    // Check if the list is null or empty, and return an empty list if so
    if (nums == null || nums.size() == 0) {
      return new ArrayList<>(); 

    }

    // Implement the bigger details of your algorithm here...
    // Hashset to manage elements
    Set<Integer> uniqueSet = new HashSet<>();

    for (Integer num : nums) {
      uniqueSet.add(num);
    }
    // return sortedAndUnique arraylist
    List<Integer> result = new ArrayList<>(uniqueSet);
    Collections.sort(result);

    return result;
  }

  public static void main(String[] args) {
    // Initialize a sample sorted ArrayList with duplicate values
    List<Integer> nums 
 = new ArrayList<>();
    nums.add(1);
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(3);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    nums.add(5);

    // Call the deleteDuplicates method with the sample list as argument
    List<Integer> result = deleteDuplicates(nums);

    // Print the result to the console
    System.out.println(result);

  }
}