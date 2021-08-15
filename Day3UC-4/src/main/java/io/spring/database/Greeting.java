package io.spring.database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greet_tbl")
public class Greeting 
{
	@Id
	private String id;
	private String fname;
	private String address;
	private String email;
	
	public Greeting(String id, String fname, String address, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.address = address;
		this.email = email;
	}
	
	public Greeting()
	{
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
