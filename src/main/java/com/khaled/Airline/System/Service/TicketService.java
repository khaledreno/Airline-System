package com.khaled.Airline.System.Service;

import com.khaled.Airline.System.DAO.FlightJPA;
import com.khaled.Airline.System.DAO.TicketJPA;
import com.khaled.Airline.System.Entity.Flight;
import com.khaled.Airline.System.Entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    TicketJPA ticketJPA;

    @Autowired
    FlightJPA flightJPA;

@NonNull
    public LocalTime closeGateFun(int FlightId) {

        LocalTime GateCloseTime;
        Optional<Flight> flObj = flightJPA.findById(FlightId);
        LocalTime depTimePri = flObj.orElse(null).getDepartureTime(); //nonnull reasn .getDepartureTime
        GateCloseTime = depTimePri.minusMinutes(30);

     //   flObj.set(GateCloseTime);
     //   flightJPA.save(flObj);


        return GateCloseTime;
    }
}



