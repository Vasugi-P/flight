package com.flight.dto;

import com.flight.entity.Flight;
public class ResponseDto {

	private String statusCode;
	private String message;

	private Flight flightRes;

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
