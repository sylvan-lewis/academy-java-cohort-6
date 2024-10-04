package com.bptn.course._11_access_modifiers._01_package_b;

import com.bptn.course._11_access_modifiers._01_package_a.ClassA;

public class ClassB {

	public static void main(String[] args) {

		ClassA myObj = new ClassA();

		// Yes public variables and methods can be accessed outside the class and in a
		// different package
		// No private variables and methods can not be accessed outside the class and in a
		// different package
		// No default variables and methods can be accessed outside the class and in a
		// different package
		// No protected variables and methods can be accessed outside the class and in a
		// different package

		// No we cannot access the private method
		//myObj.privateMethod();

		// package
		//System.out.println("Accessing private variable" + myObj.privateVar);

		// package
		//myObj.defaultMethod();

		// package
		//System.out.println("Accessing default variable" + myObj.defaultVar);

		//myObj.publicMethod();

		// package
		//System.out.println("Accessing public variable" + myObj.publicVar);

		// package
		//myObj.protectedMethod();

		// package
		//System.out.println("Accessing protected variable" + myObj.protectedVar);
		
		ClassB myObj1= new ClassB(); //create an object of ClassB
		myObj1.protectedMethod();
		
		
		System.out.println("Accessing protected variable: " + myObj1.protectedVar);
		
		
		
		
		
	}

}
