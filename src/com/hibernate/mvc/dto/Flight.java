package com.hibernate.mvc.dto;

public class Flight {
	private int flightNumber;
	private Airport departure;
	private Airport arrival;
	private int durationInMinutes;
	
	
	public Flight() {}


	public int getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}


	public Airport getDeparture() {
		return departure;
	}


	public void setDeparture(Airport departure) {
		this.departure = departure;
	}


	
	  public Airport getArrival() { return arrival; }
	  
	  
	  public void setArrival(Airport arrival) { this.arrival = arrival; }
	  
	 
	public int getDurationInMinutes() {
		return durationInMinutes;
	}


	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	
	
	
}
