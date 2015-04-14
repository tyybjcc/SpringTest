package com.tyy.domain.creation;

public class Cat implements Animal {
	final static String name = "Cat";
	//不要声明为public，因为我们只希望通过静态工厂方法模式创建，所以隐藏Cat的构造器
	protected Cat(){}

	public void printAnimal() {
		// TODO Auto-generated method stub
		System.out.println(Cat.name+" created!");
	}

}
