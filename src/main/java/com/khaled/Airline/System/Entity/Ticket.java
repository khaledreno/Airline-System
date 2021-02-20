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
    @JoinColumn(name = "PassengerName",referencedColumnName = "passenger_id")
    private Passenger passenger;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Class",referencedColumnName = "PlaneClassesVar")
    private Plane PClass;

//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "SeatNumber",referencedColumnName = "")
    private int SeatNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Gate",referencedColumnName = "GateNumber")
    private Airport Gate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GateCloses",referencedColumnName = "GateClosesTime")
    private Flight gateClose;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FlightDate",referencedColumnName = "FlightDate")
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
