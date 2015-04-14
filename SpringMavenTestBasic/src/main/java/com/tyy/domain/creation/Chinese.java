package com.tyy.domain.creation;

public class Chinese implements Person{
	public final static String name = "Chinese";
	protected Chinese(){}
	public void sayHello() {
		System.out.println("Hello, I'm "+name);
	}

}
