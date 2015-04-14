package com.tyy.domain.creation;

public class PersonFactory {
	public Person createPerson(String name){
		if(American.name.equalsIgnoreCase(name.trim())){
			return new American();
		}
		else if(Chinese.name.equalsIgnoreCase(name.trim())){
			return new Chinese();
		}
		return null;
	}
	
	//����ʵ����������ģʽ
	public static void main(String[]args){
		PersonFactory pFactory = new PersonFactory();
		Person chinese = pFactory.createPerson("chinese");
		chinese.sayHello();
		Person american = pFactory.createPerson("american");
		american.sayHello();
	}

}
