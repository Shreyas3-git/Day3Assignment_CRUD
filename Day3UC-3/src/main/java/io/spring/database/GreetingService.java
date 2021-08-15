package io.spring.database;

import org.springframework.stereotype.Service;

@Service
public class GreetingService 
{
	public String messageOne(String fname)
	{
		return "Hello" +fname;
	}
}
