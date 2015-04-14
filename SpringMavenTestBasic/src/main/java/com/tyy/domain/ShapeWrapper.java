package com.tyy.domain;

public class ShapeWrapper {
	Shape shape;
	public static String WRAPPERNAME="MY_SHAPE_WRAPPER";
	public ShapeWrapper(Shape shape){
		this.shape=shape;
	}
	public ShapeWrapper(){}
	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void printArea(){
		System.out.println("the area of the shape is: "+shape.area());
	}

}
