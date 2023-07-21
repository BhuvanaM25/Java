package com.bhu.assessment;
import java.util.ArrayList; 
public class Airport extends Traveller 
{ 
	private Address address;
	private ArrayList<Flight> flights; 
	private ArrayList<Traveller> travellers; 
	private String source; 
	private String destination; 
	private int availableSeats; 
	public Airport( ) {}
	public Airport(String source, String destination, int availableSeats) 
	{
		super();
		this.source = source;
		this.destination = destination;
		this.availableSeats = availableSeats;
	}
	
	public String getSource() 
	{
		return source;
	}
	public void setSource(String source) 
	{
		this.source = source;
	}
	public String getDestination() 
	{
		return destination;
	}
	public void setDestination(String destination) 
	{
		this.destination = destination;
	}
	public int getAvailabletickets() 
	{
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) 
	{
		this.availableSeats = availableSeats;
	}
	
	public boolean addFlight(Flight flight) 
	{ 
		flights.add(flight);
		return true;
	}
	public boolean searchFlightsBySourceAndDestination(String source,String destination) 
	{ 
		if(flights.contains(source) && flights.contains(destination))
			return true;
		else
			return false; 
	} 
	public void bookTickets(Traveller traveller) 
	{ 
		if(availableSeats==0) 
			System.out.println("Tickets Cannot be Booked!"); 
		else 
			travellers.add(traveller); 
	} 
}

    

	
	
	
	
	
