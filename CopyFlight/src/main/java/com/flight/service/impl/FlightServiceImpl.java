package com.flight.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dto.FlightDto;
import com.flight.dto.FlightScheduleDto;
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
	private FlightRepo frepo;
	
	@Autowired
	private FlightScheduleRepo fsrepo;

	@Override
	public Flight addFlight(FlightDto flightDto) throws FlightNotFoundException {
		Flight flight=new Flight(flightDto.getFlightId(),flightDto.getAirlineName(),flightDto.getFlight(),flightDto.getFlightCode());
		return frepo.save(flight);
	}

	@Override
	public FlightSchedule createFlightSchedule(FlightScheduleDto flightScheduleDto)
			throws FlightScheduleNotFoundException {
		FlightSchedule fs=new FlightSchedule(flightScheduleDto.getScheduleId(),flightScheduleDto.getFlightId(),flightScheduleDto.getFlightDate(),
				flightScheduleDto.getSource(),flightScheduleDto.getTransit(),flightScheduleDto.getTransitDepTime(),flightScheduleDto.getDestination(),
				flightScheduleDto.getDepartureTime(),flightScheduleDto.getDstArrivalTime(),flightScheduleDto.getTravelTime());
		return fsrepo.save(fs);
	}

}
