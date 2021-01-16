package com.khaled.Airline.System.DAO;

import com.khaled.Airline.System.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightJPA extends JpaRepository<Flight,Integer> {


     boolean deleteById(int id);
}
