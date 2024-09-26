package com.bptn.course._05_strings;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		//Check for user input
		System.out.println("Enter the string to check for palindrome: ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();{
		String reverseInput = "";

		//Store the reverse of the input string in another variable
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverseInput += inputString.charAt(i);
		}
		//Compare the values of the variables
		if (inputString.toLowerCase().equals(reverseInput.toLowerCase())) {
			System.out.println("Input string is palindrome");
		} else {
			System.out.println("Input string is not palindrome");
		}
		//Scanner was not closed in this instance scanner must always be closed
		scanner.close();}
	}
}
