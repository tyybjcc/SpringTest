package com.tyy.domain.aware;

import java.util.Locale;

import org.springframework.context.*;


/**
 * Spring���bean��ʼ����Ὣ������applicationContext������bean
 * ��ˣ�������Ҫͨ��spring context������bean,��Ҫʵ��ApplicationContextAware
 * @author tyy
 *
 */
public class SpringAware implements ApplicationContextAware{
	private ApplicationContext ctx;
	
	//ʵ�ֽӿڷ���
	public void setApplicationContext(ApplicationContext ctx) {
		this.ctx = ctx;
	}
	
	/**
	 * ����ctx��������ʻ�
	 * 
	 */
	public void sayHi(String name){
		System.out.println(				//��ʱ����			//�����Ĭ�ϵĵ���
				ctx.getMessage("hello", new String[]{name} , Locale.getDefault(Locale.Category.FORMAT) )
				);
	}

}
