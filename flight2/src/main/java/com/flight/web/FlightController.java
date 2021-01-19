package com.flight.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;
import com.flight.DTO.Response;
import com.flight.entity.Flight;
import com.flight.entity.FlightSchedule;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService fs;
	
	@PostMapping(value="flight-monitor/flights")
	public ResponseEntity<Response>addFlight(@RequestBody FlightDto flightDto)throws FlightNotFoundException{
		Flight flight=fs.addFlight(flightDto);
		Response res=new Response();
		   res.setStatusCode("201");
		    res.setMessage("Flight  added successfully ");
		    res.setFlightRes(flight);
		return new ResponseEntity<Response>(res,HttpStatus.CREATED);
	}
	
	@PostMapping(value="flight-monitor/flig/schedules")
	public ResponseEntity<Response>createFlightSchedule(@RequestBody AddFlightDto addFlight)throws FlightScheduleNotFoundException{	
		FlightSchedule sch=fs.createFlightSchedule(addFlight);
		Response res=new Response();
		   res.setStatusCode("201");
		    res.setMessage("Flight schedule added successfully ");
		    res.setFlightSchedule(sch);
		return new ResponseEntity<Response>(res,HttpStatus.CREATED);
	}

}
