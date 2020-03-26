package com.flight.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.entity.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long>{

}
