package com.tyy.domain.creation;

public class AnimalFactory {
	//��̬��������ģʽ
	public static Animal getAnimal(String type){
		if(Cat.name.equalsIgnoreCase( type.trim() )){
			return new Cat();
		}
		else if(Dog.name.equalsIgnoreCase( type.trim() )){
			return new Dog();
		}
		return null;
	}
	
	//��̬��������ģʽ����
	public static void main(String[]args){
		Animal cat = AnimalFactory.getAnimal("cat");
		cat.printAnimal();
		Animal dog = AnimalFactory.getAnimal("dog");
		dog.printAnimal();
	}

}
