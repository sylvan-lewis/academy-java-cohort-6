package com.bptn.course._18_java_threads_coding_310;

public class MyThread extends Thread {
    
    SynchronizedPrinter printer;

    // Create a constructor to initialize the printer instance variable.
    public MyThread(SynchronizedPrinter printer) {
    	
    	this.printer = printer;
    }
    // Override the run() method to call printNumbers() method of the printer instance variable.
    	@Override
    	public void run() {
    		
    		this.printer.printNumbers();
    	}
    
    }
