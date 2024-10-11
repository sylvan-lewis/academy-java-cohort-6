package com.bptn.course._18_java_threads;

public class MyRunnable implements Runnable {

	@Override
		
		public void run() {
			
		for(

	int i=0;i<100;i++) {

	System.out.println(i);
	try {
	Thread.sleep(1000);
	}catch(InterruptedException e) {
		System.out.println("Interuppted exception has ocurred: "+ e.getMessage());
	}
		}
}

	public static void main(String[] args) {

		
		
		//step 2. create an object of MyRunnable(class that implements the runnable interface)
		MyRunnable myObj = new MyRunnable();
		
		Thread thread = new Thread(myObj);
		
		thread.start();
		
	}

}
//Steps to create a thread using Runnable Interface
//Step 1: Create a class that implements runnable interface
//step 2: create an object of MyRunnable(class that implements the runnable interface)
//Step 3: create an object from the Thread class and pass the object created in Step 2 into the constructor
//Start thread using the start()

//sleep() -> is a static method
//throws:
//illegalargumentException - if value of millis is negative
//interruptedException - if any thread has interrupted the current thread.
//the Interrupted status of the current thread is cleared when this exception is thrown
//

