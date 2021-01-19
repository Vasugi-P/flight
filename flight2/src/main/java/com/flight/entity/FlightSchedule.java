package com.flight.entity;

import javax.persistence.Entity;

@Entity
public class FlightSchedule {
	
	private Long scheduleId;
	private Long flightId;
	private String flightDate;		
	private String  departureTime;	
	private String source;	
	private String transit;	
	private String arrival;	
	private String transitDepTime;
	private String destination;
	private String dstArrivalTime;	
	private String travelTime;
	
	
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getTransit() {
		return transit;
	}
	public void setTransit(String transit) {
		this.transit = transit;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getTransitDepTime() {
		return transitDepTime;
	}
	public void setTransitDepTime(String transitDepTime) {
		this.transitDepTime = transitDepTime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDstArrivalTime() {
		return dstArrivalTime;
	}
	public void setDstArrivalTime(String dstArrivalTime) {
		this.dstArrivalTime = dstArrivalTime;
	}
	public String getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}
	
	public FlightSchedule(Long scheduleId, Long flightId, String flightDate, String departureTime, String source,
			String transit, String arrival, String transitDepTime, String destination, String dstArrivalTime,
			String travelTime) {
		super();
		this.scheduleId = scheduleId;
		this.flightId = flightId;
		this.flightDate = flightDate;
		this.departureTime = departureTime;
		this.source = source;
		this.transit = transit;
		this.arrival = arrival;
		this.transitDepTime = transitDepTime;
		this.destination = destination;
		this.dstArrivalTime = dstArrivalTime;
		this.travelTime = travelTime;
	}
	public FlightSchedule() {
		super();
		
	}
	
	
	

}
