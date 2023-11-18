package com.upskilljava;

public class SingleTon {

	// Singleton is a class that can have only 1 object
	// Private constructor, it prevents any other class from instantiating
	private SingleTon() {

	}

	private static SingleTon singletonobj = new SingleTon();

	public static SingleTon getInstance() {
		return singletonobj;
	}

	protected static void demo1() {
		System.out.println("Demo I method single class");
	}

	protected static void demo2() {
		System.out.println("Demo II method single class");
	}

	protected static void demo3() {
		System.out.println("Demo III method single class");
	}
}
