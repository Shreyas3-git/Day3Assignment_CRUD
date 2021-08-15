package io.spring.database;

import java.util.ArrayList;
import java.util.Arrays;
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
//	@Autowired
	private Greeting greet;
	
	private List<Greeting> greeting = new ArrayList<>(Arrays.asList(
			new Greeting("1001","Ram","Mumbai","ram@gmail.com"),
			new Greeting("1002","Sham","Pune","sham@gmail"),
			new Greeting("1003","Ramesh","Delhi","ramesh@gmail.com"))); 
			
	@RequestMapping(method = RequestMethod.GET,value = "/retrive")
	public List<Greeting> getData()
	{
		return greeting;
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/update/{id}")
	public void updateRecord(@PathVariable String id,@RequestBody Greeting g)
	{
		for(int i = 0; i < greeting.size(); i++)
		{
			Greeting gt = greeting.get(i);
			if (gt.getId().equals(id)) 
			{
				greeting.set(i, g);
			}
		}
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/insert")
	public void addRecord(@RequestBody Greeting gt)
	{
		greeting.add(gt);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/delete{id}")
	public void deleteRecord(@RequestBody Greeting gt)
	{
		greeting.remove(gt);
	}
}
