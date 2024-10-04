package com.bptn.course._builtin_exceptions_02_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// outer try-catch block

		try {

			int[] nums = { 1, 2, 3, 4, };
			int divisor = 0;
			String text = null;

			// inner try-catch block 1
			try {

				int result = 10 / 0; // critical statement
				System.out.println("The result is: " + result);
			} catch (ArithmeticException e) {
				System.out.println("An arithmetic exception occured:" + e.getMessage());

			}
			// inner try-catch block2
			try {
				System.out.println("The length of string is: " + text.length());// critical statement
			} catch (NullPointerException e) {
				
				System.out.println("An nullpointer exception occured:" + e.getMessage());
			}
			//try catch block 3
			try {
				System.out.println(nums[4]);
			
		}
			catch (NullPointer e) {
				System.out.println("An ArrayIndexOutOfBounds exception occured: " + e.getMessage());

		} 
			
			catch (Exception e) {

				System.out.println("A general Exception occured: " + e.getMessage());
		}
			System.out.println("the statements after the catch block");
		}
		
		
		
}