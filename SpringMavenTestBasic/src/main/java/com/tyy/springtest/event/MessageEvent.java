package com.tyy.springtest.event;

import org.springframework.context.ApplicationEvent;

public class MessageEvent extends ApplicationEvent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int messageId;
	String messageContent;
	public MessageEvent(Object source) {
		super(source);
	}
	public MessageEvent(Object source, int messageId, String messageContent) {
		super(source);
		this.messageId=messageId;
		this.messageContent=messageContent;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
