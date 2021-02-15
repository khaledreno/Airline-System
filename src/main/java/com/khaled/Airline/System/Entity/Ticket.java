package com.khaled.Airline.System.Entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @Column(name = "TicketID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TicketID;

    @Column(name = "TicketPrice")
    private int TicketPrice;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PassengerName")
    private Passenger passenger;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Class")
    private Flight PClass;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SeatNumber")
    private Flight SeatNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Gate")
    private Flight Gate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GateCloses")
    private Flight gateCloseTime;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FlightDate")
    private Flight FlightDate;



    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getTicketID() {
        return TicketID;
    }

    public void setTicketID(int ticketID) {
        TicketID = ticketID;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        TicketPrice = ticketPrice;
    }
}
