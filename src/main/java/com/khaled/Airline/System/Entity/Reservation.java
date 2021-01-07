package com.khaled.Airline.System.Entity;

import javax.persistence.*;

@Entity
public class Reservation {

    @Id
    @Column(name = "ReservationID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservationID;

    @Column(name = "TicketPrice")
    private int TicketPrice;

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int reservationID) {
        ReservationID = reservationID;
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        TicketPrice = ticketPrice;
    }
}
