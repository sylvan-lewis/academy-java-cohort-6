package com.bptn.course._builtin_exceptions_02_unchecked_exceptions;

public class Class1 {
	void method() {

		// outer try-catch block
		try {

			// inner try-catch block
			try {

				int[] arr = { 1, 2, 3, 4 };

				System.out.println(arr[0]); // this will not fail
				System.out.println(arr[5]); // critical statement

			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException occured");
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");

		}

	}

	// main() method to run the program
	public static void main(String args[]) {
		Main nestedTryBlockSolutionObject = new Main();
		nestedTryBlockSolutionObject.method();
	}
}
