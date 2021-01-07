package com.khaled.Airline.System.Controller;

import com.khaled.Airline.System.DAO.ReservationJPA;
import com.khaled.Airline.System.Entity.Reservation;
import com.khaled.Airline.System.Exceptions.GeneralException;
import com.khaled.Airline.System.Exceptions.ReservationException;
import com.khaled.Airline.System.Service.PlaneService;
import com.khaled.Airline.System.Service.ReservationService;
import com.sun.el.lang.ELArithmetic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @Autowired
    ReservationJPA reservationJPA;

    @GetMapping
    public ResponseEntity<?> findAllReservations(){
        List<Reservation> reservations = reservationJPA.findAll();
        return new ResponseEntity<>(reservations,null, HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public Optional<Reservation> findReservationById(@PathVariable int id){
        Reservation reservation = reservationJPA.findById(id).orElse(null);
        if (reservation == null){
            throw  new GeneralException(ReservationException.OUT_OF_SEATS);
        }
        return reservationJPA.findById(id);
    }
    @PostMapping
    public ResponseEntity<?> addReservation(@RequestBody Reservation reservation){
        reservationJPA.save(reservation);
        return new ResponseEntity<>(reservation,null,HttpStatus.CREATED);
    }

//    @PostMapping
//    public ResponseEntity<?> addReservation(@RequestBody Reservation reservation){
//        reservationJPA.save(reservation);
//        return new ResponseEntity<>(reservation,null,HttpStatus.CREATED);
//    }

    @PutMapping
    public ResponseEntity<?> updateReservation(@RequestBody Reservation reservation){
        reservationJPA.save(reservation);
        return new ResponseEntity<>(reservation,null,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteReservationById(@PathVariable int id){
        boolean isRemoved = reservationJPA.deleteById(id);
        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(id,HttpStatus.OK);
    }



}
