package com.tyy.domain.simplifyconfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyy.domain.Circle;
import com.tyy.domain.CircleWrapperWithName2;

public class CNamespaceTest {
	
	public static void main(String[]args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tyy/domain/simplifyconfigurations/cConfigurations.xml");
		Circle circle = (Circle)ctx.getBean("myCircle");
		circle.printCircle();
		
		CircleWrapperWithName2 myNamedCircleWrapper = (CircleWrapperWithName2)ctx.getBean("myNamedCircleWrapper2");
		myNamedCircleWrapper.printWrapper();
		
	}

}
