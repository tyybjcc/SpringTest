package com.tyy.domain.creation;

public class Cat implements Animal {
	final static String name = "Cat";
	//��Ҫ����Ϊpublic����Ϊ����ֻϣ��ͨ����̬��������ģʽ��������������Cat�Ĺ�����
	protected Cat(){}

	public void printAnimal() {
		// TODO Auto-generated method stub
		System.out.println(Cat.name+" created!");
	}

}
