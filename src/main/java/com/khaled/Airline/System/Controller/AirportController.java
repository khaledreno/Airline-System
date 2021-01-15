package com.khaled.Airline.System.Controller;

import com.khaled.Airline.System.DAO.AirportJPA;
import com.khaled.Airline.System.DAO.PlaneJPA;
import com.khaled.Airline.System.Entity.Airport;
import com.khaled.Airline.System.Entity.Plane;
import com.khaled.Airline.System.Exceptions.AirportException;
import com.khaled.Airline.System.Exceptions.GeneralException;
import com.khaled.Airline.System.Exceptions.PlaneException;
import com.khaled.Airline.System.Service.AirportService;
import com.khaled.Airline.System.Service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    AirportService airportService;

    @Autowired
    AirportJPA airportJPA;

    @GetMapping
    public ResponseEntity<?> findAllAirports(){
        List<Airport> airports = airportJPA.findAll();
        return new ResponseEntity<>(airports,null,HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public Optional<Airport> getAirportById(@PathVariable int id){
        Airport a = airportJPA.findById(id).orElse(null);
    if (a == null){
        throw new GeneralException(AirportException.CANNOT_FIND_FLIGHT);
    }
    return airportJPA.findById(id);
    }

    @PostMapping
    public ResponseEntity<?> addAirport(@RequestBody Airport a){
        airportJPA.save(a);
        return new ResponseEntity<>(a,null,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateAirport(@RequestBody Airport a){
        airportJPA.save(a);
        return new ResponseEntity<>(a,null,HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAirportByID(@PathVariable int id){
        boolean isRemoved = airportJPA.deleteById(id);

        if (!isRemoved){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @GetMapping("/capacity")
//    public ResponseEntity<?> getAirportsByCapacity(@PathVariable int capacity){
//        return new ResponseEntity<>(airportJPA.findByCapacity(capacity),null,HttpStatus.FOUND);
    }



