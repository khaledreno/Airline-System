package com.khaled.Airline.System.Service;

import com.khaled.Airline.System.DAO.PlaneJPA;
import com.khaled.Airline.System.DAO.ReservationJPA;
import com.khaled.Airline.System.Entity.Plane;
import com.khaled.Airline.System.Exceptions.GeneralException;
import com.khaled.Airline.System.Exceptions.PlaneException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class PlaneService {

    @Autowired
    PlaneJPA planeJPA;

//    public Plane GetPlaneCapacity
    public int getCapacityById (int id){
        Plane plane = planeJPA.findById(id).orElse(null);
        if(plane == null){
            throw  new GeneralException(PlaneException.CANNOT_FIND_PLANE);
        }
        return plane.getCapacity();
    }

}
