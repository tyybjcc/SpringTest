package com.tyy.domain.prototypeinjection;

public class FruitFactory {
	String factoryName;
	Fruit fruit;	//singleton��FruitFactory Bean��Ҫͨ��getFruit()����ÿ�β���һ����ͬ��fruit bean
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
