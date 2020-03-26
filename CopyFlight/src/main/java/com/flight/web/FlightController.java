package com.flight.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dto.FlightDto;
import com.flight.dto.FlightScheduleDto;
import com.flight.dto.ResponseDto;
import com.flight.dto.ResponseSch;
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
	public ResponseEntity<ResponseDto>addFlight(@RequestBody FlightDto flightDto)throws FlightNotFoundException{
		Flight flight=fs.addFlight(flightDto);
		ResponseDto res=new ResponseDto();
		   res.setStatusCode("201");
		    res.setMessage("Flight  added successfully ");
		    res.setFlightRes(flight);
		return new ResponseEntity<ResponseDto>(res,HttpStatus.CREATED);
	}
	
	@PostMapping(value="flight-monitor/flight/schedules")
	public ResponseEntity<ResponseSch>createFlightSchedule(@RequestBody FlightScheduleDto FlightSch)
			throws FlightScheduleNotFoundException{	
		FlightSchedule sch=fs.createFlightSchedule(FlightSch);
		ResponseSch ress=new ResponseSch();	
		ress.setMessage("Flight schedule added successfully");
		ress.setStatusCode("201");
		ress.setFlightSchedule(sch);
		return new ResponseEntity<ResponseSch>(ress,HttpStatus.CREATED);
		
		

	}
	

}
