package com.khaled.Airline.System.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flight_id ;

//    @NotBlank
//    @Column(name = "FlightFrom")
//    private String FlightFrom;
@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
        CascadeType.REFRESH})
@JoinColumn(name = "AirportCountryFrom")
    private Airport FlightFrom;


//    @NotBlank
//    @Column(name = "FlightTo")
//    private String FlightTo;
@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
        CascadeType.REFRESH})
@JoinColumn(name = "AirportCountryTo")
    private Airport FlightTo;


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
        return flight_id;
    }

    public void setFlight_no(int flight_no) {
        this.flight_id = flight_no;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        TicketPrice = ticketPrice;
    }

    public Airport getFlightFrom() {
        return FlightFrom;
    }

    public void setFlightFrom(Airport flightFrom) {
        FlightFrom = flightFrom;
    }


    public Airport getFlightTo() {
        return FlightTo;
    }

    public void setFlightTo(Airport flightTo) {
        FlightTo = flightTo;
    }



    public int getSeatsLeft() {
        return SeatsLeft;
    }

    public void setSeatsLeft(int seatsLeft) {
        SeatsLeft = seatsLeft;
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
