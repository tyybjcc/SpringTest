package com.tyy.domain.prototypeinjection;

public class FruitFactory {
	String factoryName;
	Fruit fruit;	//singleton的FruitFactory Bean需要通过getFruit()方法每次产生一个不同的fruit bean
	public String getFactoryName() {
		return factoryName;
	}
	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
}
