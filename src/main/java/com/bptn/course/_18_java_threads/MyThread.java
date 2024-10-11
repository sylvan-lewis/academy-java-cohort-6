package com.bptn.course._18_java_threads;

class A extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<100; i++)
			System.out.println("Hi Java");
	}
}
	
class B extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<100; i++)
			System.out.println("Hello Java");
	}
}


public class MyThread {

	public static void main(String[] args) {
		
		//Create an object of class A
		
		A myObj =new A();
		
		myObj.start();
		
		
		B myObj1 =new B();
		
		myObj1.start();
		
		System.out.println("Main thread");
	}

}

//Key takeaways
//1. class A and B are runninng within the context of the main thread, hence it is not executed as a separate thread
//2. Class A and B are extending Thread class
//3. the start() method executes it as a separate thread
//4. Its not recommended to call the run method directly because it runs within the context of the main thread


