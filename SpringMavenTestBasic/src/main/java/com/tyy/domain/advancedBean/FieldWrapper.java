package com.tyy.domain.advancedBean;

//符合FieldRetrievingFactoryBean的调用规范，用来测试FieldRetrievingFactoryBean
public class FieldWrapper {
	//访问控制符设定为public，不应该通过getter和setter访问
	public static String name = "MyFieldWrapper";
	public int fields;
	public FieldWrapper(){
		fields = 12;
	}
}
