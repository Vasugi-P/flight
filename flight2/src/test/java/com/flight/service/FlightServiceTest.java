package com.flight.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Optional;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;
import com.flight.entity.Flight;
import com.flight.entity.FlightSchedule;
import com.flight.entity.FlightType;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.repo.FlightRepo;
import com.flight.repo.FlightScheduleRepo;
import com.flight.service.Impl.FlightServiceImpl;


@RunWith(MockitoJUnitRunner.Silent.class)
public class FlightServiceTest {
	
	@Mock
	private FlightRepo flightrepo;
	
	@Mock
	private FlightScheduleRepo flightScRepo;
	
	@InjectMocks
	private FlightServiceImpl flightService;
	
	
	
	
	
	AddFlightDto add;
	FlightSchedule sch=null;
	Flight flight=null;
	FlightDto dto=null;
	@Test
	public void testAddFlightSchedule()throws FlightScheduleNotFoundException{
		sch=new FlightSchedule();
		sch.setScheduleId(100L);
		sch.setFlightId(1L);
		sch.setArrival("Delhi");
		sch.setDepartureTime("10:00 PM");
		sch.setDestination("Mumbai");
		sch.setDstArrivalTime("02:00 AM");
		sch.setFlightDate("10/03/2020");
		sch.setFlightId(1L);
		sch.setSource("BLR");
		sch.setTransit("Direct");
		sch.setTransitDepTime("09:00 PM");
		sch.setTravelTime("1 HR");
		
		add=new AddFlightDto();
		add.setScheduleId(100L);
		add.setFlightId(1L);
		add.setArrival("Delhi");
		add.setDepartureTime("10:00 PM");
		add.setDestination("Mumbai");
		add.setDstArrivalTime("02:00 AM");
		add.setFilghtDate("10/03/2020");
		add.setFlightId(1L);
		add.setSource("BLR");
		add.setTransit("Direct");
		add.setTransitDepTime("09:00 PM");
		add.setTravelTime("1 HR");
		
		Mockito.when(flightScRepo.save(sch)).thenReturn(sch);
		Mockito.when(flightScRepo.findById(1L)).thenReturn(Optional.of(sch));
		FlightSchedule res=flightService.createFlightSchedule(add);
		assertEquals(sch.getTransit(),res.getTransit());
		
	}
	
	@Test
	public void addFlightTest()throws FlightNotFoundException {
		flight=new Flight();
		flight.setFlightId(100L);
		flight.setAirlineName("Airline");
		flight.setFlight(FlightType.business);
		flight.setFlightCode("K07");
		flight.setFlightId(100L);
		
		dto=new FlightDto();
		dto.setFlightId(100L);
		dto.setAirlineName("Airline");
		dto.setFlight(FlightType.business);
		dto.setFlightCode("K07");
		
		Mockito.when(flightrepo.save(flight)).thenReturn(flight);
		Mockito.when(flightrepo.findById(100L)).thenReturn(Optional.of(flight));
		Flight response=flightService.addFlight(dto);
		assertNotEquals(flight.getAirlineName(), response.getAirlineName());
			
		
	}
	
	
	

}
