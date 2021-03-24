package com.khaled.Airline.System.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "flight")
public class Flight {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int flight_id ;


@Column(name = "Departure")
private String FlightFrom;

@Column(name = "Arrival")
private String FlightTo;

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
    @Column(name = "TicketPrice",columnDefinition = "integer default 0")
    private int TicketPrice;

    @Column(name = "SeatsLeft",columnDefinition = "integer default 0")
    private int SeatsLeft;

    @JsonFormat(pattern = "hh:mm")
    private LocalTime GateClosesTime;


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

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }


    public LocalDate getFlightDate() {
        return FlightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        FlightDate = flightDate;
    }

    public LocalTime getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        DepartureTime = departureTime;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        TicketPrice = ticketPrice;
    }

    public int getSeatsLeft() {
//        return SeatsLeft-p.getCapacity();
        return SeatsLeft;

    }

    public void setSeatsLeft(int seatsLeft) {
        SeatsLeft = seatsLeft;
    }

    public LocalTime getGateClosesTime() {
        return GateClosesTime;
    }

    public void setGateClosesTime(LocalTime gateClosesTime) {
        GateClosesTime = gateClosesTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flight_id=" + flight_id +
                ", FlightDate=" + FlightDate +
                ", ArrivalTime=" + ArrivalTime +
                ", DepartureTime=" + DepartureTime +
                ", TicketPrice=" + TicketPrice +
                ", SeatsLeft=" + SeatsLeft +
                ", GateClosesTime=" + GateClosesTime +
                '}';
    }
}



//    @OneToOne(mappedBy = "PClass", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private Ticket ticket;
//
//    @OneToOne(mappedBy = "SeatNumber", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private Ticket seat;
//
//    @OneToOne(mappedBy = "gateCloseTime", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private Ticket gateTicket;
//
//    @OneToOne(mappedBy = "FlightDate", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private Ticket flightTicketDate;



//@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
//        CascadeType.REFRESH})
//@JoinColumn(name = "Departure")
//    private Airport FlightFrom;


//@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
//        CascadeType.REFRESH})
//@JoinColumn(name = "Arrival")
//    private Airport FlightTo;

//  @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
//     CascadeType.REFRESH})

//    public Airport getFlightFrom() {
//        return FlightFrom;
//    }
//
//    public void setFlightFrom(Airport flightFrom) {
//        FlightFrom = flightFrom;
//    }

//    public Airport getFlightTo() {
//        return FlightTo;
//    }
//
//    public void setFlightTo(Airport flightTo) {
//        FlightTo = flightTo;
//    }