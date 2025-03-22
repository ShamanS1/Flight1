package com.Airline.Flight.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "Airline", nullable = false)
    private String airline;

    @Column(name = "Source", nullable = false)
    private String source;

    @Column(name = "Source Name", nullable = false)
    private String sourceName;

    @Column(name = "Destination", nullable = false)
    private String destination;

    @Column(name = "Destination Name", nullable = false)
    private String destinationName;

    @Column(name = "Departure Date & Time", nullable = false)
    private LocalDateTime departureDateTime;

    @Column(name = "Arrival Date & Time", nullable = false)
    private LocalDateTime arrivalDateTime;

    @Column(name = "Duration (hrs)", nullable = false)
    private Double duration;

    @Column(name = "Stopovers", nullable = false)
    private String stopovers;

    @Column(name = "Aircraft Type", nullable = false)
    private String aircraftType;

    @Column(name = "Class", nullable = false)
    private String travelClass;

    @Column(name = "Booking Source", nullable = false)
    private String bookingSource;

    @Column(name = "Base Fare (BDT)", nullable = false)
    private Double baseFareBDT;

    @Column(name = "Tax & Surcharge (BDT)", nullable = false)
    private Double taxSurchargeBDT;

    @Column(name = "Total Fare (BDT)", nullable = false)
    private Double totalFareBDT;

    @Column(name = "Seasonality", nullable = false)
    private String seasonality;

    @Column(name = "Days Before Departure", nullable = false)
    private Integer daysBeforeDeparture;

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getSourceName() { return sourceName; }
    public void setSourceName(String sourceName) { this.sourceName = sourceName; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDestinationName() { return destinationName; }
    public void setDestinationName(String destinationName) { this.destinationName = destinationName; }

    public LocalDateTime getDepartureDateTime() { return departureDateTime; }
    public void setDepartureDateTime(LocalDateTime departureDateTime) { this.departureDateTime = departureDateTime; }

    public LocalDateTime getArrivalDateTime() { return arrivalDateTime; }
    public void setArrivalDateTime(LocalDateTime arrivalDateTime) { this.arrivalDateTime = arrivalDateTime; }
}
