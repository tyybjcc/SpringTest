package com.tyy.domain.factorybean;

import java.lang.reflect.Field;

import org.springframework.beans.factory.FactoryBean;

public class ObjectStaticFieldFactory implements FactoryBean<Object>{
	private String targetClass;
	private String targetField;
	public String getTargetClass() {
		return targetClass;
	}
	public void setTargetClass(String targetClass) {
		this.targetClass = targetClass;
	}
	public String getTargetField() {
		return targetField;
	}
	public void setTargetField(String targetField) {
		this.targetField = targetField;
	}
	
	public Object getObject() throws Exception {
		Class clazz = Class.forName(this.targetClass);
		Field field = clazz.getField(this.targetField);
		//只能用来获取静态成员变量
		return field.get(null);
	}
	public Class getObjectType(){
		return Object.class;
	}
	public boolean isSingleton(){
		return false;
	}

}
