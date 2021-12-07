package com.example.demo.classes;

public class MessageUtils {

	private final String message;
	private final Message msg;
	
	public MessageUtils(String message,Message msg) {
		this.message=message;
		this.msg=msg;
	}
	
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
}
