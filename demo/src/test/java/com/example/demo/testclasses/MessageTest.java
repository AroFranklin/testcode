package com.example.demo.testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.classes.MessageUtils;

public class MessageTest {
	public MessageUtils messageUtils=new MessageUtils("Hello");
	
	@Test
	public void testPrintMessage()
	{
		assertEquals("Hello", messageUtils.printMessage());
		

}
}
