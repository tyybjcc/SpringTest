package com.tyy.domain.prototypeinjection;

public class Fruit {
	static int fruitNoCount=0;
	int thisNo;
	
	public Fruit(){
		thisNo = Fruit.fruitNoCount++;
	}
	
	public void printInfo(){
		System.out.println("fruit info: No."+this.thisNo);
	}
}
