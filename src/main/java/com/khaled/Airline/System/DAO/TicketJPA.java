package com.khaled.Airline.System.DAO;

import com.khaled.Airline.System.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;

@Repository
public interface TicketJPA extends JpaRepository<Ticket,Integer> {
     boolean deleteById(int id);
     //void SetGateCloseTime(LocalTime time);


}
