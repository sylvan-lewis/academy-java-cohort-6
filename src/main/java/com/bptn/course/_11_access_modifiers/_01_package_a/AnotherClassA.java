package com.bptn.course._11_access_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {
		// create an object of ClassA
		ClassA myObj = new ClassA();

		// No we cannot access the private method
		myObj.privateMethod();

		// no we can access the private variable outside the class but in the same
		// package
		System.out.println("Accessing private variable" + myObj.privateVar);

		// Yes we can access the default method outside the class but in the same
		// package
		myObj.defaultMethod();

		// yes we can access the default variable outside the class but in the same
		// package
		System.out.println("Accessing default variable" + myObj.defaultVar);

		// Yes we can access the public method outside the class but in the same package
		myObj.publicMethod();

		// yes we can access the public variable outside the class but in the same
		// package
		System.out.println("Accessing public variable" + myObj.publicVar);

		// Yes we can access the protected method outside the class but in the same
		// package
		myObj.protectedMethod();

		// yes we can access the protected variable outside the class but in the same
		// package
		System.out.println("Accessing protected variable" + myObj.protectedVar);

	}

}

//major key takeaways
//1. We can not access the private variable and method outside the class but in the same package
//2. We can access the default variable and method outside the class but in the same package
//3. We can access the protected variable and method outside the class but in the same package
//4. We can access the public variable and method outside the class but in the same package
