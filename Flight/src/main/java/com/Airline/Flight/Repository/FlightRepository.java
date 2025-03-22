package com.Airline.Flight.Repository;

import com.Airline.Flight.Model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flights, Integer> {
    List<Flights> findBySourceAndDestinationAndDepartureDateTimeBetween(
            String source,
            String destination,
            LocalDateTime startOfDay,
            LocalDateTime endOfDay
    );
}
