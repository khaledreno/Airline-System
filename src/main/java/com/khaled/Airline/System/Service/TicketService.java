package com.khaled.Airline.System.Service;

import com.khaled.Airline.System.DAO.FlightJPA;
import com.khaled.Airline.System.DAO.TicketJPA;
import com.khaled.Airline.System.Entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    TicketJPA ticketJPA;

    @Autowired
    FlightJPA flightJPA;

//use time data type
//    public Integer closeGateFun (int id){
//        Optional<Flight> flObj = flightJPA.findById(id);
//       String depTimePri =  flObj.get().getDepartureTime();
//        int newDepTime = Integer.parseInt(depTimePri);
//        newDepTime = newDepTime - 0030;
//        //////
//        return newDepTime;
    }



