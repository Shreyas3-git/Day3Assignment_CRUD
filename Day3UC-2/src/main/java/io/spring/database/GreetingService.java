package io.spring.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GreetingService 
{
	private List<Greeting> greeting = new ArrayList<>(Arrays.asList(
			new Greeting("1001","Ram","Mumbai","ram@gmail.com"),
			new Greeting("1002","Sham","Pune","sham@gmail"),
			new Greeting("1003","Ramesh","Delhi","ramesh@gmail.com"))); 
			
	public List<Greeting> getAllDetails()
	{
		return greeting;
	}
	
	public Greeting getById(String id,Greeting greet)
	{
		return greeting.stream().filter(i -> greet.getId().equals(id)).findFirst().get();
	}
	
	public void insertRecord(Greeting greet)
	{
		greeting.add(greet);
	}
	
	public void updateRecord(Greeting greet , String id)
	{
		for(int i = 0; i < greeting.size(); i++)
		{
			Greeting gt = greeting.get(i);
			if (gt.getId().equals(id)) 
			{
				greeting.set(i, gt);
			}
		}
	}
	
	public void deleteRecord(String id)
	{
		greeting.remove(id);
	}
}
