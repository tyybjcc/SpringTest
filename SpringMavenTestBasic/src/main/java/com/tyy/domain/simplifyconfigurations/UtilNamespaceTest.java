package com.tyy.domain.simplifyconfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
import java.util.Map.Entry;

import com.tyy.domain.Circle;
import com.tyy.domain.ObjectCollections;

public class UtilNamespaceTest {
	
	public static void main(String[]args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tyy/domain/simplifyconfigurations/utilConfigurations.xml");
		Set mySet = (Set)ctx.getBean("values.set");
		for(Object obj : mySet){
			System.out.println(obj);
		}
		
		System.out.println("print map:");
		Map myMap = (Map)ctx.getBean("values.map");
		for(Entry<String,Object> entry : (Set<Entry<String,Object>>)myMap.entrySet()){
			System.out.print("key: "+entry.getKey()+", value: ");
			//instanceof Circle, 没有.class， 如果有.class， 则变成了Class的实例！
			if(entry.getValue() instanceof com.tyy.domain.Circle){
				((Circle)entry.getValue()).printCircle();
			}else{
				System.out.println(entry.getValue());
			}
		}
		
		//util:constant获取static型变量的值进行注入
		System.out.println("\nconstant:");
		Object constant = ctx.getBean("values.constant");
		System.out.println(constant);
		
		//properties
		System.out.println("\nproperties");
		Properties properties = (Properties)ctx.getBean("values.properties");
		System.out.println("print properties");
		for(Entry entry : properties.entrySet()){
			System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
		}
		
		ObjectCollections myCollection = (ObjectCollections)ctx.getBean("myCollections");
		
	}

}
