package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: non-negative integer and singular noun
		System.out.print("Enter a non-negative integer: ");
		int amt = scanner.nextInt();
		scanner.nextLine(); // Consume newline character

		System.out.print("Enter a singular noun: ");
		String word = scanner.nextLine();

		// Determine plural form based on the amount
		String pluralWord = pluralize(word, amt);

		// Output the result
		System.out.println(amt + " " + pluralWord);
		// Close the scanner
		scanner.close();
	}

	// Method to determine the plural form of a noun
	private static String pluralize(String word, int amt) {
		if (amt == 1) {
			// Singular form
			return word;
		} else {
			// Plural form
			return makePlural(word);
		}
	}

	// Method to make a noun plural
	private static String makePlural(String word) {
		if (word.endsWith("y") && !isVowel(word.charAt(word.length() - 2))) {
			// If word ends with 'y' and the letter before it is not a vowel, replace 'y'
			// with 'ies'
			return word.substring(0, word.length() - 1) + "ies";
		} else if (word.endsWith("s") || word.endsWith("x") || word.endsWith("z") || word.endsWith("ch")
				|| word.endsWith("sh")) {
			// If the word ends with s, x, z, ch, or sh, add 'es'
			return word + "es";
		} else {
			// For all other cases, add 's'
			return word + "s";
		}
	}

	// Helper method to check if a character is a vowel
	private static boolean isVowel(char c) {
		return "aeiou".indexOf(c) != -1;
	}
}