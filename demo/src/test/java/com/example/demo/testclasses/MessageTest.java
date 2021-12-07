package com.example.demo.testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.demo.classes.Message;
import com.example.demo.classes.MessageUtils;

public class MessageTest {
	@InjectMocks
	private Message msg;
	
	public MessageUtils messageUtils=new MessageUtils("Hello",msg);
	
	@Test
	public void testPrintMessage()
	{
		assertEquals("Hello", messageUtils.printMessage());
		

}
}
