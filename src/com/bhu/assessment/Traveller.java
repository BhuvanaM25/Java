package com.bhu.assessment;
import java.time.LocalDate;
public class Traveller
{
	private String Name;
	private long mobile;
	private String flightId;
	private String email;
	private LocalDate date;
	public Traveller() {}
	public Traveller(String name, long mobile, String flightId, String email, LocalDate date) 
	{
		super();
		Name = name;
		this.mobile = mobile;
		this.flightId = flightId;
		this.email = email;
		this.date = date;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	public long getMobile() 
	{
		return mobile;
	}
	public void setMobile(long mobile) 
	{
		this.mobile = mobile;
	}
	public String getFlightId() 
	{
		return flightId;
	}
	public void setFlightId(String flightId) 
	{
		this.flightId = flightId;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public LocalDate getDate() 
	{
		return date;
	}
	public void setDate(LocalDate date) 
	{
		this.date = date;
	}

}
