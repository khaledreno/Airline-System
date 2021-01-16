package com.khaled.Airline.System.DAO;

import com.khaled.Airline.System.Entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerJPA extends JpaRepository<Passenger,Integer> {

 //   Passenger findByPhone(String phone);
   // Passenger findBynational_id(int id);
  boolean deleteById(int id);



}
