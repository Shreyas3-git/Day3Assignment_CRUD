package io.spring.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
	@Autowired
	GreetingService greetService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/retrive")
	public List<Greeting> getAllDetails()
	{
		return greetService.getAllDetails();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/retrive/{id}")
	public Greeting findById(@PathVariable String id,@RequestBody Greeting greet)
	{
		return greetService.getById(id, greet);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/insert")
	public void addRecord(@RequestBody Greeting greet)
	{
		greetService.insertRecord(greet);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/update/{id}")
	public void ModifyRecord(@RequestBody Greeting greet,@PathVariable String id)
	{
		greetService.updateRecord(greet, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
	public void removeRecord(@PathVariable String id)
	{
		greetService.deleteRecord(id);
	}
}
