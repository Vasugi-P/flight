package com.flight.dto;

import com.flight.entity.FlightType;

public class FlightDto {
	
	private Long flightId;
	private String airlineName;
	private FlightType flight;
	private String flightCode;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public FlightType getFlight() {
		return flight;
	}
	public void setFlight(FlightType flight) {
		this.flight = flight;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	
	

}
