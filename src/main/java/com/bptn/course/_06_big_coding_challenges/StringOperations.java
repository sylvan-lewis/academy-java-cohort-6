package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

class StringOperations {
	public static void main(String[] args) {
		int choice;
		// Declare and initialize scanner
		Scanner scanner = new Scanner(System.in);
		do {
			// Display the menu
			System.out.println("…String Menu…");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to Reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison");
			System.out.println("Press 5 to Calculate the Length of String");
			System.out.println("Press 0 to Exit");
			System.out.print("Enter the option: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				// Palindrome Check
				System.out.print("Enter a string: ");
				String palindromeInput = scanner.nextLine();
				boolean isPalindrome = isPalindrome(palindromeInput);
				if (isPalindrome) {
					System.out.println(isPalindrome + " is a palindrome");
				} else {
					System.out.println(isPalindrome + " is not a palindrome");
				}
				break;

			case 2:
				// Reverse a String
				System.out.print("Enter a string to reverse: ");
				String reverseInput = scanner.nextLine();
				String reversedString = reverseString(reverseInput);
				System.out.println("Reversed String: " + reversedString);
				break;

			case 3:
				// Concatenate two Strings
				System.out.print("Enter the first string: ");
				String firstString = scanner.nextLine();
				System.out.print("Enter the second string: ");
				String secondString = scanner.nextLine();
				String concatenatedString = firstString + secondString;
				System.out.println("Concatenated String: " + concatenatedString);
				break;

			case 4:
				// String Comparison
				System.out.print("Enter the first string: ");
				String str1 = scanner.nextLine();
				System.out.print("Enter the second string: ");
				String str2 = scanner.nextLine();
				boolean areEqual = str1.equals(str2);
				System.out.println("The entered strings are equal: " + areEqual);
				break;

			case 5:
				// Calculate the Length of a String
				System.out.print("Enter a string: ");
				String lengthInput = scanner.nextLine();
				int length = lengthInput.length();
				System.out.println("Length of String: " + length);
				break;

			case 0:
				System.out.println("Exiting the program.");
				break;

			default:
				System.out.println("Invalid option. Please try again.");
			}
			System.out.println(); // Print a new line for better readability
		} while (choice != 0);

		scanner.close();
	}

	// Method to check if a string is a palindrome
	private static boolean isPalindrome(String str) {
		String reversed = reverseString(str);
		return str.equalsIgnoreCase(reversed);
	}

	// Method to reverse a string
	private static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
