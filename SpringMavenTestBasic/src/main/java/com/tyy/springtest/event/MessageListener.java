package com.tyy.springtest.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MessageListener implements ApplicationListener{
	/**
	 * declare bean in applicationContext.xml
	 */
	public void onApplicationEvent(ApplicationEvent evt) {
		if(evt instanceof MessageEvent) {
			MessageEvent messageEvt = (MessageEvent)evt;
			System.out.println("Message: id="+messageEvt.getMessageId()+", content="+messageEvt.getMessageContent());
		}else{
			System.out.println("Event type:"+evt.getClass().getName());
		}
	}

}
