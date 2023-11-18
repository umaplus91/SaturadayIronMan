 package com.upskilljava;

public class MultiThreading {
	
	/* Multithreading is Java feature that allow concurrent execution of 2 or more parts of a program.
	 * Threads can be created by using 2 mechanisms:
	 * 1.Extending the Thread class
	 * 2.Implementing the Runnable Interface
	 */

	public static void main(String[] args) {
		
		int n = 2;
		for(int i = 0 ; i < n; i++) {
			MultithreadingUse obj = new MultithreadingUse();
			obj.start();
			
			Thread obj2 = new Thread(new MultiThreadingRunnable());
			obj2.start();
		}
		

	}

}
