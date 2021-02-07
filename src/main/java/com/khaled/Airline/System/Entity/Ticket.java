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
    @JoinColumn(name = "PassngerName")
    private Passenger passenger;

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
