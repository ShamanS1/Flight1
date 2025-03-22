package com.Airline.Flight.Controller;

import com.Airline.Flight.Model.Flights;
import com.Airline.Flight.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/search/{source}/{destination}/{departureDate}")
    public List<Flights> searchFlights(
            @PathVariable String source,
            @PathVariable String destination,
            @PathVariable String departureDate) {
        return flightService.getFlightsBySourceDestinationAndDate(source, destination, departureDate);
    }
}
