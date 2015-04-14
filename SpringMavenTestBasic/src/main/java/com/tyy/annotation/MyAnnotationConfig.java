package com.tyy.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import com.tyy.domain.*;


@Configuration
public class MyAnnotationConfig {
	//int radius = 5;
	@Value("5") int radius;	//也可以使用上面的方式
	
	@Bean(name="circle1")
	public Circle Circle(){
		Circle c = new Circle();
		c.setRadius(radius);
		return c;
	}

}
