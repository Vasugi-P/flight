package com.flight.service.Impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;
import com.flight.entity.Flight;
import com.flight.entity.FlightSchedule;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.repo.FlightRepo;
import com.flight.repo.FlightScheduleRepo;
import com.flight.service.FlightService;


@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightScheduleRepo repo;
	
	@Autowired
	private FlightRepo repo1;
	

	@Override
	public Flight addFlight(FlightDto flightDto) throws FlightNotFoundException{
		Flight flight=new Flight(flightDto.getFlightId(),flightDto.getAirlineName(),flightDto.getFlight(),
				flightDto.getFlightCode());
		return repo1.save(flight);
		
	}

	@Override
	public FlightSchedule createFlightSchedule(AddFlightDto addFlightDto) throws FlightScheduleNotFoundException {
		FlightSchedule schedule= new FlightSchedule(addFlightDto.getScheduleId(),addFlightDto.getFlightId(),
				addFlightDto.getFlightDate(),addFlightDto.getDepartureTime(),addFlightDto.getSource(),addFlightDto.getArrival(),
				addFlightDto.getTransit(),addFlightDto.getTransitDepTime(),addFlightDto.getDestination(),addFlightDto.getDstArrivalTime(),
				addFlightDto.getTravelTime());				
		return repo.save(schedule);
	}
}