package com.khaled.Airline.System.Controller;

import com.khaled.Airline.System.DAO.FlightJPA;
import com.khaled.Airline.System.Entity.Flight;
import com.khaled.Airline.System.Exceptions.FlghtException;
import com.khaled.Airline.System.Exceptions.GeneralException;
import com.khaled.Airline.System.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightJPA flightJPA;

//    @DeleteMapping("/{id}")
//    public String deleteFlight(@PathVariable int id){
//    Optional<Flight> flight = flightJPA.findById(id);
//    if (flight == null){
//        throw new RuntimeException("this note is not found");
//    }
//    flightJPA.deleteById(id);
//    return " deleted ";
//    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFlight(@PathVariable int id){

        boolean isRemoved = flightJPA.deleteById(id);


        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addFlight(@RequestBody Flight f){
        flightJPA.save(f);
        return new ResponseEntity<>(f,null,HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findAllFlights(){
        List<Flight>flights = flightJPA.findAll();
        return new ResponseEntity<>(flights,null, HttpStatus.FOUND);

    }

    @GetMapping("/{id}")
    public Optional<Flight> findFlighByid(@PathVariable int id ){
        Flight f = flightJPA.findById(id).orElse(null);
        if (f == null){
            throw new GeneralException(FlghtException.CANNOT_FIND_FLIGHT);
        }
    return flightJPA.findById(id);
    }

    @PutMapping
    public Flight updateFlight(@RequestBody Flight f){
        flightJPA.save(f);
        return f;
    }


}
