package com.tyy.domain.advancedBean;

public class TestMethodBean {
	static int count=0;
	
	public String generateNameString(){
		return "name"+count++;
	}
	
	public String generateNameStringWithParams(String param1, String param2){
		return "name"+param1+param2+count++;
	}
	
	public static void main(String[]args){
		TestMethodBean b = new TestMethodBean();
		for(int i=0;i<5;i++){
			System.out.println(b.generateNameString());
		}
	}

}
