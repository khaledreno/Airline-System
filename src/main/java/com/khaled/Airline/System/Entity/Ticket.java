package com.khaled.Airline.System.Entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Ticket {

    @Id
    @Column(name = "TicketID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TicketID;

    @Column(name = "TicketPrice")
    private int TicketPrice;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "PassengerID",referencedColumnName = "passenger_id")
//    private Passenger passenger;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Class",referencedColumnName = "PlaneClassesVar")
//    private Plane PClass;


//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "SeatNumber",referencedColumnName = "")
@Column(name = "SeatNumber")
private int SeatNumber;

@Column(name = "GateCloseTime")
private LocalTime GateCloseTime;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Gate",referencedColumnName = "GateNumber")
//    private Airport Gate;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "GateCloses",referencedColumnName = "GateClosesTime")
//    private Flight gateClose;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "FlightDate",referencedColumnName = "FlightDate")
//    private Flight FlightDate;



//    public Passenger getPassenger() {
//        return passenger;
//    }
//
//    public void setPassenger(Passenger passenger) {
//        this.passenger = passenger;
//    }

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

//    public Plane getPClass() {
//        return PClass;
//    }
//
//    public void setPClass(Plane PClass) {
//        this.PClass = PClass;
//    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    public LocalTime getGateCloseTime() {
        return GateCloseTime;
    }

   // public void setGateCloseTime(LocalTime gateCloseTime) {
    //    GateCloseTime = gateCloseTime;
   // }

    //    public Airport getGate() {
//        return Gate;
//    }
//
//    public void setGate(Airport gate) {
//        Gate = gate;
//    }

//    public Flight getGateClose() {
//        return gateClose;
//    }
//
//    public void setGateClose(Flight gateClose) {
//        this.gateClose = gateClose;
//    }
//
//    public Flight getFlightDate() {
//        return FlightDate;
//    }
//
//    public void setFlightDate(Flight flightDate) {
//        FlightDate = flightDate;
//    }

//    @Override
//    public String toString() {
//        return "Ticket{" +
//                "TicketID=" + TicketID +
//                ", TicketPrice=" + TicketPrice +
//                ", passenger=" + passenger +
//                ", SeatNumber=" + SeatNumber +
//                ", Gate=" + Gate +
//                ", gateClose=" + gateClose +
//                ", FlightDate=" + FlightDate +
//                '}';
//    }
}
