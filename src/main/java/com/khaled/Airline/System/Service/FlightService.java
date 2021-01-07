package com.khaled.Airline.System.Service;

import com.khaled.Airline.System.DAO.FlightJPA;
import com.khaled.Airline.System.DAO.PlaneJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    FlightJPA flightJPA;

}
