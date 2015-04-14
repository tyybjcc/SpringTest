package com.tyy.domain.creation;

public class AnimalFactory {
	//静态工厂方法模式
	public static Animal getAnimal(String type){
		if(Cat.name.equalsIgnoreCase( type.trim() )){
			return new Cat();
		}
		else if(Dog.name.equalsIgnoreCase( type.trim() )){
			return new Dog();
		}
		return null;
	}
	
	//静态工厂方法模式测试
	public static void main(String[]args){
		Animal cat = AnimalFactory.getAnimal("cat");
		cat.printAnimal();
		Animal dog = AnimalFactory.getAnimal("dog");
		dog.printAnimal();
	}

}
