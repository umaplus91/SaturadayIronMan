package com.upskilljava;

public class MultithreadingUse extends Thread {

	public void run() {
		try {
			System.out.println("thread Number # " + Thread.currentThread().getId() + " is Runnig");
		} catch (Exception e) {
			System.out.println("Exception is caught");
			e.printStackTrace();
		}
	}
}
