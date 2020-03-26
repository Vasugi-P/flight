package com.flight.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.flight.dto.FlightDto;
import com.flight.dto.FlightScheduleDto;
import com.flight.dto.ResponseDto;
import com.flight.dto.ResponseSch;
import com.flight.entity.Flight;
import com.flight.entity.FlightSchedule;
import com.flight.entity.FlightType;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.service.FlightService;
import com.flight.web.FlightController;

@RunWith(MockitoJUnitRunner.class)
public class FlightControllerTest {
	
	@Mock
	FlightService flightService;
	
	@InjectMocks
	FlightController flightController;
	
	FlightScheduleDto add=null;
	FlightDto flight=null;
	FlightSchedule fs=null;
	
	@Test
	public void testAddFlightSchedule()throws FlightScheduleNotFoundException{
		fs=new FlightSchedule();
		fs.setScheduleId(100L);
		fs.setFlightId(1L);
		fs.setDepartureTime("10:00 PM");
		fs.setDestination("Mumbai");
		fs.setDstArrivalTime("02:00 AM");
		fs.setFlightDate("10/03/2020");
		fs.setFlightId(1L);
		fs.setSource("BLR");
		fs.setTransit("Direct");
		fs.setTransitDepTime("09:00 PM");
		fs.setTravelTime("1 HR");
		
		add=new FlightScheduleDto();
		add.setScheduleId(100L);
		add.setFlightId(1L);
		add.setDepartureTime("10:00 PM");
		add.setDestination("Mumbai");
		add.setDstArrivalTime("02:00 AM");
		add.setFlightDate("10/03/2020");
		add.setFlightId(1L);
		add.setSource("BLR");
		add.setTransit("Direct");
		add.setTransitDepTime("09:00 PM");
		add.setTravelTime("1 HR");
		
		
		Mockito.when(flightService.createFlightSchedule(add)).thenReturn(fs);
		ResponseEntity<ResponseSch> response=flightController.createFlightSchedule(add);
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
		
	}
	
	@Test
	public void testAddFlight()throws FlightNotFoundException{
		Flight ft=new Flight();
		ft.setFlightId(100L);
		ft.setAirlineName("AirIndia");
		ft.setFlight(FlightType.domestic);
		ft.setFlightCode("A09");
		
		FlightDto flight=null;
		flight=new FlightDto();
		flight.setFlightId(100L);
		flight.setAirlineName("AirIndia");
		flight.setFlight(FlightType.domestic);
		flight.setFlightCode("A09");
		
		
		Mockito.when(flightService.addFlight(flight)).thenReturn(ft);
		ResponseEntity<ResponseDto> response=flightController.addFlight(flight);
		assertEquals(HttpStatus.CREATED,response.getStatusCode());
		
	}

}
