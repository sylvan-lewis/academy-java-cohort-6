package com.bptn.course._11_access_modifiers._01_package_a;

public class ClassA {

	// declare a private variable
	private int privateVar;

	// declare a public variable
	public int publicVar;

	// declare a default variable
	int defaultVar;

	// declare a protected variable
	protected int protectedVar;

	// declare a private method
	private void privateMethod() {
		System.out.println("This is a private method");
	}

	// declare a public method
	public void publicMethod() {
		System.out.println("This is a public method");

	}

	// declare a default method
	private void defaultMethod() {
		System.out.println("This is a default method");

	}

	// declare a protected method
	private void protectedMethod() {
		System.out.print("This is a protected method");

	}

	public static void main(String[] args) {
		// create an object of ClassA
		ClassA myObj = new ClassA();

		// Yes we can access the private method within the same class
		myObj.privateMethod();

		// yes we can access the private variable within the same class
		System.out.println("Accessing private variable" + myObj.privateVar);

		// Yes we can access the default method within the same class
		myObj.defaultMethod();

		// yes we can access the default variable within the same class
		System.out.println("Accessing default variable" + myObj.defaultVar);

		// Yes we can access the protected method within the same class
		myObj.protectedMethod();

		// yes we can access the protected variable within the same class
		System.out.println("Accessing protected variable" + myObj.protectedVar);

		// Yes we can access the public method within the same class
		myObj.publicMethod();

		// yes we can access the public variable within the same class
		System.out.println("Accessing public variable" + myObj.publicVar);

	}

}

//Major key takeaways
//1. We can access the private variable and method within the same class
//2. We can access the default variable and method within the same class
//3. We can access the protected variable and method within the same class
//4. We can access the public variable and method within the same class
