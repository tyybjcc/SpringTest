package com.tyy.domain.simplifyconfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyy.domain.Circle;
import com.tyy.domain.CircleWrapperWithName;

public class PNamespaceTest {
	
	public static void main(String[]args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tyy/domain/simplifyconfigurations/pConfigurations.xml");
		Circle circle = (Circle)ctx.getBean("myCircle");
		circle.printCircle();
		
		CircleWrapperWithName myNamedCircleWrapper = (CircleWrapperWithName)ctx.getBean("myNamedCircleWrapper");
		myNamedCircleWrapper.printWrapper();
		
	}

}
