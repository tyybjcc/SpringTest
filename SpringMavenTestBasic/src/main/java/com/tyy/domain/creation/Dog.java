package com.tyy.domain.creation;

public class Dog implements Animal {
	final static String name = "Dog";
	//
	protected Dog(){}
	public void printAnimal() {
		// TODO Auto-generated method stub
		System.out.println(Dog.name+" created!");
	}

}
