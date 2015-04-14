package com.tyy.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import com.tyy.domain.Circle;

public class AnnotationConfigApplicationContextTest {
	
	public static void main(String[]args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(com.tyy.annotation.MyAnnotationConfig.class);
		
		Circle c = (Circle)ctx.getBean("circle1");
		c.printCircle();
	}

}
