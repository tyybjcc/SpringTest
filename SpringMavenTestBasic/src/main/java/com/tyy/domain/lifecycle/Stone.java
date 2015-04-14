package com.tyy.domain.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * ������Ϊʵ�ֽӿڵ����ȼ�������init-method��destroy-method���ȼ��ߣ���������ִ��
 * ʵ�ֽӿڵķ��������׳���Ӧ������ʹ��ʵ�ֽӿڵĴ���ʽ
 * @author tyy
 *
 */
public class Stone implements InitializingBean,DisposableBean{
	private static int count=0;
	String name;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Stone.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void afterPropertiesSet() {
		System.out.println("Initializing�ӿڵ�afterProperties��������");
		count++;
	}
	
	//����������������Ҫ��xml������
	public void initMethod(){
		System.out.println("init method");
	}
	
	//ģ��bean��ʹ�ù���
	public void deal(){
		System.out.println("Stone name: "+this.name+", number count: "+Stone.count+";" );
	}
	
	public void destroy(){
		System.out.println("Disposable�ӿڵ�destroy��������");
		count--;
	}
	
	public void destroyMethod(){
		System.out.println("destroy method");
	}

}
