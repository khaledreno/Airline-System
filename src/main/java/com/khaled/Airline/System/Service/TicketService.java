package com.khaled.Airline.System.Service;

import com.khaled.Airline.System.DAO.FlightJPA;
import com.khaled.Airline.System.DAO.TicketJPA;
import com.khaled.Airline.System.Entity.Flight;
import com.khaled.Airline.System.Entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    TicketJPA ticketJPA;

    @Autowired
    FlightJPA flightJPA;

//    @Autowired
//    Ticket ticket;

    public void closeGateFun(int FlightId) {

        LocalTime GateCloseTime;
        Flight flObj = flightJPA.findById(FlightId).orElse(new Flight());
        LocalTime depTimePri = flObj.getDepartureTime();
        GateCloseTime = depTimePri.minusMinutes(30);

        flObj.setGateClosesTime(GateCloseTime);

      // ticketJPA.insertGateCloseTime(GateCloseTime);
       // ticket.setGateCloseTime(GateCloseTime);
       // return GateCloseTime;
    }
}



