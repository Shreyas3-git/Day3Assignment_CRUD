package io.spring.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController 
{
	@Autowired
	private GreetingService greetService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/message")
	public String getMessage(@PathVariable String fname)
	{
		return greetService.messageOne(fname);
	}
}
