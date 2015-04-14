package com.tyy.springtest.event.test;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyy.springtest.event.MessageEvent;

public class EventTest {
	public static void main(String[]args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageEvent event = new MessageEvent("forTest",1,"No.1 message");
		context.publishEvent(event);
		
	}

}
