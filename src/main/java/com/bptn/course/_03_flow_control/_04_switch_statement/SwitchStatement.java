package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner;
public class SwitchStatement {
		    public static void main(String[] args) {

		        int inputNumber = 1234, reversedValue = 0;
		// FREEZE CODE END
		    Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        // Loop to reverse the digits of the input number
		        while (inputNumber > 0){
		         // Get the last digit of the input number
		        int digit = inputNumber % 10;
		         // Update the reversed value
		        reversedValue = reversedValue * 10 + digit;
		        // Remove the last digit from inputNumber
		        inputNumber /= 10;
		        }
		        scanner.close();
		         
		        System.out.print("Reversed Number: ");
		// FREEZE CODE BEGIN

		// FREEZE CODE END
	}

}
