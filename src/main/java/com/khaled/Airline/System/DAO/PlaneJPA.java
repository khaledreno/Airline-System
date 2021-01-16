package com.khaled.Airline.System.DAO;

import com.khaled.Airline.System.Entity.Flight;
import com.khaled.Airline.System.Entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaneJPA  extends JpaRepository<Plane,Integer> {

    List<Plane> findByCapacity(int capacity);

     boolean deleteById(int id);


//    Flight FindByDeparture(String date);
//    Flight FindByManYear(int year);

}
