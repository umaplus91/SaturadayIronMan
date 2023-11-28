package com.upskilljava;

public class SingleTonUse {

	public static void main(String[] args) {
		SingleTon obj = SingleTon.getInstance();
		obj.demo1();
		obj.demo2();
		obj.demo3();

	}

}
//New