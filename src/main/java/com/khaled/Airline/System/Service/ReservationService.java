package com.khaled.Airline.System.Service;

import com.khaled.Airline.System.DAO.TicketJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ReservationService {

    @Autowired
    TicketJPA ticketJPA;

}
