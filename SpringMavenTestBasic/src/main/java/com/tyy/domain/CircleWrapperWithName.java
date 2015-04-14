package com.tyy.domain;

public class CircleWrapperWithName {
	Circle circle;
	String name;
	
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printWrapper(){
		System.out.println("CircleWrapperWithName:");
		System.out.println("\tname: "+this.name);
		System.out.print("\tcircle: ");
		this.circle.printCircle();
	}

}
