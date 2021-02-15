package com.khaled.Airline.System.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flight_id ;

    @OneToOne(mappedBy = "PClass", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Ticket ticket;

    @OneToOne(mappedBy = "SeatNumber", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Ticket seat;

    @OneToOne(mappedBy = "gateCloseTime", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Ticket gateTicket;

    @OneToOne(mappedBy = "FlightDate", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Ticket flightTicketDate;



@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
        CascadeType.REFRESH})
@JoinColumn(name = "Departure")
    private Airport FlightFrom;


@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
        CascadeType.REFRESH})
@JoinColumn(name = "Arrival")
    private Airport FlightTo;

    @NotBlank
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate FlightDate;

    @NotBlank
    @JsonFormat(pattern = "hh:mm")
    private LocalTime ArrivalTime;

    @NotBlank
    @JsonFormat(pattern = "hh:mm")
    private LocalTime DepartureTime;


    @NotBlank
    @Column(name = "TicketPrice")
    private int TicketPrice;

    @NotBlank
    @Column(name = "SeatsLeft")
    private int SeatsLeft;


    public LocalDate getFlightDate() {
        return FlightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        FlightDate = flightDate;
    }


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

    public int getSeatLeft() {
        return SeatsLeft;
    }

    public void setSeatLeft(int seatLeft) {
        SeatsLeft = seatLeft;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getSeat() {
        return seat;
    }

    public void setSeat(Ticket seat) {
        this.seat = seat;
    }

    public Ticket getGateTicket() {
        return gateTicket;
    }

    public void setGateTicket(Ticket gateTicket) {
        this.gateTicket = gateTicket;
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

    public LocalTime getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        DepartureTime = departureTime;
    }

    public LocalTime getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        ArrivalTime = arrivalTime;
    }
}
