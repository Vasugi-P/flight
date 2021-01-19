package com.flight.DTO;

import com.flight.entity.Flight;
import com.flight.entity.FlightSchedule;

public class Response {
	
	private String statusCode;
	 private String message;
	 
	 private Flight flightRes;
	 
	 private FlightSchedule flightSchedule;
	 
	 

	public FlightSchedule getFlightSchedule() {
		return flightSchedule;
	}

	public void setFlightSchedule(FlightSchedule flightSchedule) {
		this.flightSchedule = flightSchedule;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Flight getFlightRes() {
		return flightRes;
	}

	public void setFlightRes(Flight flightRes) {
		this.flightRes = flightRes;
	}
	 
	 
 
	
	
}

 
 

