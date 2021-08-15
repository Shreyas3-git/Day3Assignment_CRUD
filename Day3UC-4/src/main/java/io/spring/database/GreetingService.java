package io.spring.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService 
{
	@Autowired
	private GreetingRepository greetRepo;
	private List<Greeting> greet = new ArrayList<>(Arrays.asList(
								new Greeting("1001","shreyas","satara","shreyas@gmail.com")));
	public List<Greeting> getData()
	{
		List<Greeting> greet = new ArrayList<>();
		greetRepo.findAll().forEach(greet :: add);
		return greet;
	}
	
	public Greeting getById(Greeting greet,String id)
	{
		return greetRepo.findById(id).orElse(null);
	}
	
	public void insertRecord(Greeting greet)
	{
		greetRepo.save(greet);
	}
	
	public void updateRecord(Greeting greet,String id)
	{
		greetRepo.save(greet);
	}
	
	public void deleteRecord(String id)
	{
		greetRepo.deleteById(id);
	}
}
