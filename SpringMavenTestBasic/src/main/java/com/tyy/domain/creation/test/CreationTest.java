package com.tyy.domain.creation.test;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyy.domain.creation.*;

public class CreationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//��̬��������ģʽ
		Cat cat = (Cat)ctx.getBean("cat");
		cat.printAnimal();
		
		Chinese chinese = (Chinese)ctx.getBean("chinese");
		American american = (American)ctx.getBean("american");
		

	}

}
