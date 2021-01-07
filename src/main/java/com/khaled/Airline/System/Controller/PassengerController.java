package com.khaled.Airline.System.Controller;

import com.khaled.Airline.System.DAO.PassengerJPA;
import com.khaled.Airline.System.Entity.Passenger;
import com.khaled.Airline.System.Exceptions.GeneralException;
import com.khaled.Airline.System.Exceptions.PassengerException;
import com.khaled.Airline.System.Service.PassengerService;
import com.khaled.Airline.System.Service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @Autowired
    PassengerJPA passengerJPA;

    @GetMapping
    public ResponseEntity<?> findAllPassengers() {
        List<Passenger> passengers = passengerJPA.findAll();
        return new ResponseEntity<>(passengers, null, HttpStatus.OK);
    }

        @GetMapping("/{id}")
        public Optional<Passenger> findPassengerByID(@PathVariable int id){
            Passenger p = passengerJPA.findById(id).orElse(null);
            if (p == null){
                throw new GeneralException(PassengerException.CANNOT_FIND_PASSENGER);
        }
            return passengerJPA.findById(id);

    }

    @PostMapping
    public ResponseEntity<?> addPassenger(@RequestBody Passenger p){
        passengerJPA.save(p);
        return new ResponseEntity<>(p,null,HttpStatus.CREATED);
    }

    @PutMapping
    public Passenger updatePassenger(@RequestBody Passenger p){
        passengerJPA.save(p);
        return p;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePassenger(@PathVariable int id){

    boolean isRemoved = passengerJPA.deleteById(id);
if (!isRemoved){
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
return new ResponseEntity<>(id,HttpStatus.OK);


    }

}
