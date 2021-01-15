package com.khaled.Airline.System.DAO;

import com.khaled.Airline.System.Entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportJPA extends JpaRepository<Airport,Integer> {
     boolean deleteById(int idf);

}
