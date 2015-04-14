package com.tyy.domain;

public class CircleWrapperWithName2 {
	Circle circle;
	String name;

	public CircleWrapperWithName2(String name, Circle circle){
		this.circle = circle;
		this.name = name;
	}
	
	public void printWrapper(){
		System.out.println("CircleWrapperWithName:");
		System.out.println("\tname: "+this.name);
		System.out.print("\tcircle: ");
		this.circle.printCircle();
	}

}
