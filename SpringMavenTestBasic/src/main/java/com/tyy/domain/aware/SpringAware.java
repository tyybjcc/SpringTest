package com.tyy.domain.aware;

import java.util.Locale;

import org.springframework.context.*;


/**
 * Spring完成bean初始化后会将其自身（applicationContext）传给bean
 * 因此，对于需要通过spring context操作的bean,需要实现ApplicationContextAware
 * @author tyy
 *
 */
public class SpringAware implements ApplicationContextAware{
	private ApplicationContext ctx;
	
	//实现接口方法
	public void setApplicationContext(ApplicationContext ctx) {
		this.ctx = ctx;
	}
	
	/**
	 * 调用ctx，例如国际化
	 * 
	 */
	public void sayHi(String name){
		System.out.println(				//临时数组			//虚拟机默认的地区
				ctx.getMessage("hello", new String[]{name} , Locale.getDefault(Locale.Category.FORMAT) )
				);
	}

}
