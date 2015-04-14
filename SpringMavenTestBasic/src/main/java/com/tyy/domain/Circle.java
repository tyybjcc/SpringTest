package com.tyy.domain;

public class Circle implements Shape {
	double radius;
	public Circle(){}
	
	public Circle(double radius){
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area(){
		return Math.PI*radius*radius;
	}
	
	public void printCircle(){
		System.out.println("Circle: radius "+this.radius);
	}
	
}
