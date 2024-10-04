package com.bptn.course._builtin_exceptions_01_checked_exceptions;

import java.io.FileNotFoundException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
	try {
		readFile("Result.txt");
	} catch (FileNotFoundException e) {
		
		System.out.println("An error occured: " + e.getMessage());
	}	
		
	}

	//create a method which reads a file
	public static void readFile(String fileName) throws FileNotFoundException{
		
		//create an object of FileReader
		
		FileReader fileReader = new FileReader(fileName);
	}
	
	public static void callMethod() throws FileNotFoundException{
		readFile("result.txt");
	}
}

//FileNotFoundException is a checked exception where the Java compiler wants you to deal with it

//When we call a method which has a checked exception in the method signature
//Java compiler gives you two options
//1st option- to surround it with a try/catch
//2nd option- add it again in the throws of the method signature

//try {




