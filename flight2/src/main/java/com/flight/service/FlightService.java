package com.flight.service;



import com.flight.DTO.AddFlightDto;

import com.flight.DTO.FlightDto;
import com.flight.entity.Flight;
import com.flight.entity.FlightSchedule;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;

public interface FlightService {
		
	public Flight addFlight(FlightDto flightDto)throws FlightNotFoundException;

	public FlightSchedule createFlightSchedule(AddFlightDto addFlightDto)throws FlightScheduleNotFoundException;
}
