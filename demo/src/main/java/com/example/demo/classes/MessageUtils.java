package com.example.demo.classes;

public class MessageUtils {

	private final String message;
	
	public MessageUtils(String message) {
		this.message=message;
	}
	
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
}
