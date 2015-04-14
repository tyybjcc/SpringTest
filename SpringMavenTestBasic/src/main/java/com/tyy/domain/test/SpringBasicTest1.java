package com.tyy.domain.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.tyy.domain.*;
import com.tyy.domain.lifecycle.Stone;
import com.tyy.domain.nameaware.Car;
import com.tyy.domain.prototypeinjection.Fruit;
import com.tyy.domain.prototypeinjection.FruitFactory;



public class SpringBasicTest1 {
	public static void main(String[]args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ShapeWrapper wrapper = (ShapeWrapper)context.getBean("myShapeWrapper");
		wrapper.printArea();
		
		ShapeWrapper wrapper2 = (ShapeWrapper)context.getBean("myShapeWrapper2");
		wrapper2.printArea();
		
		SomeCircle someCircle = (SomeCircle)context.getBean("mySomeCircle");
		someCircle.printArray();
		
		SomeCircle someCircle2 = (SomeCircle)context.getBean("mySomeCircle2");
		someCircle2.printList();
		
		SomeCircle someCircle3 = (SomeCircle)context.getBean("mySomeCircle3");
		someCircle3.printMap();
		
		SomeCircle someCircle4 = (SomeCircle)context.getBean("mySomeCircle4");
		someCircle4.printSet();
		
		SomeCircle someCircle5 = (SomeCircle)context.getBean("mySomeCircle5");
		someCircle5.printProperties();
		
		SomeCircle someCircle6 = (SomeCircle)context.getBean("mySomeCircle7");
		someCircle6.getMyCircle().printCircle();
		
		//别名 <bean name=""...
		System.out.println("\nbean-name&alias-test----");
		Circle myCircle = (Circle)context.getBean("#circle1");
		myCircle.printCircle();
		Circle myCircle2 = (Circle)context.getBean("$circle1");
		myCircle.printCircle();
		if(myCircle == myCircle2){
			System.out.println("#circle1 == $circle1");	//结果证明不同别名(name属性)取得的bean是同一个
		}else{
			System.out.println("#circle1 != $circle1");
		}
		
		//<alias name="beanName" alias="aliasName">
		Circle myCircleAlias = (Circle)context.getBean("myCircle3Alias");
		myCircleAlias.printCircle();
		if(myCircleAlias == myCircle) {
			System.out.println("myCircle == myCircleAlias");
		}else{
			System.out.println("myCircle != myCircleAlias");
		}
		
		
		//<bean scope="singleton|prototype|request|session|globeSession"...
		//default scope is singleton
		System.out.println("\nbean-scope-test----");
		Circle circleGet1 = (Circle)context.getBean("myCircle3");
		circleGet1.printCircle();
		circleGet1.setRadius(1);
		Circle circleGet2 = (Circle)context.getBean("myCircle3");
		circleGet2.printCircle();
		//if set scope="prototype"
		Circle circle4Get1 = (Circle)context.getBean("myCircle4");
		circle4Get1.printCircle();
		circle4Get1.setRadius(10);
		Circle circle4Get2 = (Circle)context.getBean("myCircle4");
		circle4Get2.printCircle();
		//if set scope="request"
		//Circle circleGetRequest = (Circle)context.getBean("myCircle5");
		//must use in web environment. Otherwise, will cause IllegalStateException(message: no scope registered for scope 'request');
		
		
		System.out.println("\nabstract-bean-parent-bean----");
		Circle circleParent = (Circle)context.getBean("myCircle6");
		circleParent.printCircle();
		SomeCircle someCircleParent = (SomeCircle)context.getBean("mySomeCircle8");
		someCircleParent.getMyCircle().printCircle();
		
		
		System.out.println("\nfactory-bean----");
		String s=(String)context.getBean("myFactoryBean");
		System.out.println(s);
		//要获取beanFactory本身，使用如下方法
		System.out.println(context.getBean("&myFactoryBean"));	//com.tyy.domain.factorybean.ObjectStaticFieldFactory@5a7d7d9a
		
		
		System.out.println("\nbean-name-aware----");
		Car myCar = (Car)context.getBean("myCar");
		myCar.printBeanInfo();
		
		
		System.out.println("\nbean-lifecycle----");
		Stone stone = (Stone)context.getBean("myStone");
		Stone stone2 = (Stone)context.getBean("myStone");
		stone.deal();
		stone2.deal();
		//应用优雅地关闭（或正常地关闭）
		//context.registerShutdownHook();
		
		
		//Singleton Bean成员Prototype化
		FruitFactory fruitFactory = (FruitFactory)context.getBean("myFruitFactory");
		//通过fruitFactory可以每次获取一个prototype的Fruit Bean, 和直接从context.getBean("fruit")效果相同
		Fruit fruit1 = fruitFactory.getFruit();
		Fruit fruit2 = fruitFactory.getFruit();
		Fruit fruit3 = (Fruit)context.getBean("fruit");
		Fruit fruit4 = (Fruit)context.getBean("fruit");
		fruit1.printInfo();
		fruit2.printInfo();
		fruit3.printInfo();
		fruit4.printInfo();
		
		
		System.out.println("\nspecial-bean----");
		//PropertyPathFactoryBean
		Circle circleFromProperty = (Circle)context.getBean("circleFromProperty");
		circleFromProperty.printCircle();
		//FieldRetrievingFactoryBean
		String fieldWrapperStaticName = (String)context.getBean("fieldWrapperStaticName");
		System.out.println(fieldWrapperStaticName);
		//MethodInvokingFactoryBean
		String nameString = (String)context.getBean("nameString");
		String nameString1 = (String)context.getBean("nameString");
		System.out.println(nameString);
		System.out.println(nameString1);
		String nameStringWithParams1 = (String)context.getBean("nameStringWithParams");
		String nameStringWithParams2 = (String)context.getBean("nameStringWithParams");
		System.out.println(nameStringWithParams1);
		System.out.println(nameStringWithParams2);
		
		
	}

}
