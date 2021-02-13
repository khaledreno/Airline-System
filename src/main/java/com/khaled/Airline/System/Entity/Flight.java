package com.khaled.Airline.System.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flight_id ;

    @OneToOne(mappedBy = "PClass", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Ticket x;



@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
        CascadeType.REFRESH})
@JoinColumn(name = "AirportCountryFrom")
    private Airport FlightFrom;


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


    public int getSeatLeft() {
        return SeatsLeft;
    }

    public void setSeatLeft(int seatLeft) {
        SeatsLeft = seatLeft;
    }




}
