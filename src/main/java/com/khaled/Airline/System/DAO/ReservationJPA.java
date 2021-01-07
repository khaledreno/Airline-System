package com.khaled.Airline.System.DAO;

import com.khaled.Airline.System.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationJPA extends JpaRepository<Reservation,Integer> {
    public boolean deleteById(int idf);



}
