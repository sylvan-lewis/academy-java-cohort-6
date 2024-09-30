package com.bptn.course._06_big_coding_challenges;

import java.util.Scanner;

public class Calculator {

		public static void main(String[] args) {
			// takes Inputs from the user named scanner
			Scanner scanner = new Scanner(System.in);
			// for operation output will be a string,
			System.out.println(
					" Press 1 for addition: \n Press 2 for subtraction: \n Press 3 for multiplication: \n Press 4 for division: \n Press 5 for square a number: \n Press 6 for find a square root: \n Press 7 for find the reciprocal: ");
			System.out.print("Enter your choice: ");
			double Calculator = scanner.nextDouble();
			// prompt to make it so second prompt not always pops up

			// made a print for each input order
			System.out.print("Enter the first number: ");
			// put in variable called n1 anFd n2, which is the user input
			double n1 = scanner.nextDouble();
			// make a double if user create an integer
			System.out.print("Enter the second number: ");
			double n2 = scanner.nextDouble();
			// this is to close the scanner
			scanner.close();
			// if output is + then print addition to find sum
			while (true) {
				if (Calculator == (1)) {
					System.out.println(n1 + n2);

				}
				// if output is - then print subtraction to find difference
				if (Calculator == (2)) {
					System.out.println(n1 - n2);


				}
				// if output is * then print multiplication to find product
				if (Calculator == (3)) {
					System.out.println(n1 * n2);


				}
				// if output is / then print division to find quotient
				if (Calculator == (4)) {
					System.out.println(n1 / n2);

				}

				// if output is ** then print the square of the number
				else if (Calculator == (5)) {
					double number = n1;
					double square = number * number;
					System.out.println(square);
			

				}
				// if output is Math.sqrt() then print the square root
				else if (Calculator == 6) {
					double squareRoot = Math.sqrt(n1);
					System.out.println(squareRoot);

				}
				// if output is 1/x then print the reciprocal
				else if (Calculator == (7)) {
					double number = n1;
					double reciprocal = 1 / (number);
					System.out.println(reciprocal);
			

				} else
					System.out.print("Invalid choice! Please make a valid choice.");
			}

		}

	

}


