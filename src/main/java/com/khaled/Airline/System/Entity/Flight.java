package com.khaled.Airline.System.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flight_no ;

    @NotBlank
    @Column(name = "FlightFrom")
    private String FlightFrom;

    @NotBlank
    @Column(name = "FlightTo")
    private String FlightTo;

    @NotBlank
    @Column(name = "DepartureTime")
    private String DepartureTime;

    @NotBlank
    @Column(name = "ArrivalTime")
    private String ArrivalTime;

    @NotBlank
    @Column(name = "TicketPrice")
    private int TicketPrice;

//    @Column(name = "plane")
//    private Plane plane;
    @NotBlank
    @Column(name = "SeatsLeft")
    private int SeatsLeft;

    public int getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        TicketPrice = ticketPrice;
    }

    public String getFlightFrom() {
        return FlightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        FlightFrom = flightFrom;
    }

    public String getFlightTo() {
        return FlightTo;
    }

    public void setFlightTo(String flightTo) {
        FlightTo = flightTo;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

//    public Plane getPlane() {
//        return plane;
//    }
//
//    public void setPlane(Plane plane) {
//        this.plane = plane;
//    }

    public int getSeatLeft() {
        return SeatsLeft;
    }

    public void setSeatLeft(int seatLeft) {
        SeatsLeft = seatLeft;
    }
}
