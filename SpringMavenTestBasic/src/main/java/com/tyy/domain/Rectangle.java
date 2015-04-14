package com.tyy.domain;

public class Rectangle implements Shape{
	double width;
	double height;
	public Rectangle(){}
	
	public Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	
	
	
	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}

	//实现接口不应该使用@Override annotation
	//@Override
	public double area(){
		return this.width*this.height;
	}

}
