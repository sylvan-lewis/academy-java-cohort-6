package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Declaration of targetNumber
		int targetNumber = 23;
		// this is for user guess
		int userGuess;
		do	{
			System.out.println("guess: ");
			userGuess = scanner.nextInt();
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Please enter a number between 1 and 100.");
			} else if (userGuess < targetNumber) {
				System.out.println("Too low! Try again.");
			} else if (userGuess > targetNumber) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Congratulations! You guessed the number correctly!");
				break;
			}
		}while (true);
		scanner.close();
	}

}
