package com.Airline.Flight.Service;

import com.Airline.Flight.Model.Flights;
import com.Airline.Flight.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flights> getFlightsBySourceDestinationAndDate(String source, String destination, String departureDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(departureDate, formatter);

        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atTime(23, 59, 59);

        return flightRepository.findBySourceAndDestinationAndDepartureDateTimeBetween(source, destination, startOfDay, endOfDay);
    }
}
