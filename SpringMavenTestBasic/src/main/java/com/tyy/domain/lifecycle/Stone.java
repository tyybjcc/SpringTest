package com.tyy.domain.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * 可以认为实现接口的优先级比设置init-method和destroy-method优先级高，所以优先执行
 * 实现接口的方法不容易出错，应尽可能使用实现接口的处理方式
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
		System.out.println("Initializing接口的afterProperties方法调用");
		count++;
	}
	
	//可以任意命名，需要再xml中配置
	public void initMethod(){
		System.out.println("init method");
	}
	
	//模拟bean的使用过程
	public void deal(){
		System.out.println("Stone name: "+this.name+", number count: "+Stone.count+";" );
	}
	
	public void destroy(){
		System.out.println("Disposable接口的destroy方法调用");
		count--;
	}
	
	public void destroyMethod(){
		System.out.println("destroy method");
	}

}
