package com.tyy.domain.creation;

public class American implements Person{
	public final static String name ="American";
	protected American(){}
	public void sayHello(){
		System.out.println("Hello, I'm "+name);
	}
	
}
