package com.bptn.course._06_big_coding_challenges;
import java.util.Scanner;
public class WordEncryption {

	public static void main(String[] args) {
		//Let's declare a is b
		//the encrypted key for b = a
		int key = 1;
		//Input scanner so user can type in console
		Scanner scanner = new Scanner(System.in);
		//inputs default input
		System.out.print("Encrypted word: ");
		//string for given input with scanner attached
		String word = scanner.next();
		System.out.println();
		scanner.close();
		//Every letter of the previous message + 1
		//make a character array that converts to chars to offset each character a clarified amount
		//use a string method to convert toCharArray
		char[] chars = word.toCharArray();
		//use for loop to declare the instructions
		for (char c: chars) {
		//character variable + integer variable
			c += key;
			if(c > 'z') {
				c-=26;
			}
			System.out.print(c);
			
		}
		
		
		
		
		
				

	}

}
