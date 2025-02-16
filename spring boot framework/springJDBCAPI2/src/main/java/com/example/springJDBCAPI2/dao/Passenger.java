package com.example.springJDBCAPI2.dao;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Passenger {

	
	private int pid;
	private String arrival;
	private String dateOfJourney;
	private String name;
	private String departure;
	
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("passenger bean is created");
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public Passenger(int pid, String arrival, String dateOfJourney, String name, String departure) {
		super();
		this.pid = pid;
		this.arrival = arrival;
		this.dateOfJourney = dateOfJourney;
		this.name = name;
		this.departure = departure;
	}
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", arrival=" + arrival + ", dateOfJourney=" + dateOfJourney + ", name=" + name
				+ ", departure=" + departure + "]";
	}
	
	
}
