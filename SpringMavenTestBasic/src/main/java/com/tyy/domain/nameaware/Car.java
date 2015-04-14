package com.tyy.domain.nameaware;

import org.springframework.beans.factory.BeanNameAware;


public class Car implements BeanNameAware{
	String beanName;
	//implements method
	public void setBeanName(String beanName){
		this.beanName = beanName;
	}
	String brands;
	
	public String getBrands() {
		return brands;
	}

	public void setBrands(String brands) {
		this.brands = brands;
	}

	public String getBeanName() {
		return beanName;
	}

	public void printBeanInfo(){
		System.out.println("bean name: "+this.beanName);
	}

}
