package com.khaled.Airline.System.Controller;

import com.khaled.Airline.System.DAO.TicketJPA;
import com.khaled.Airline.System.Entity.Ticket;
import com.khaled.Airline.System.Exceptions.GeneralException;
import com.khaled.Airline.System.Exceptions.ReservationException;
import com.khaled.Airline.System.Service.ReservationService;
import com.khaled.Airline.System.Service.TicketService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    ReservationService reservationService;

    @Autowired
    TicketJPA ticketJPA;

    @Autowired
    TicketService  ticketService;


    @GetMapping
    public ResponseEntity<?> findAllTickets(){
        List<Ticket> tickets = ticketJPA.findAll();
        return new ResponseEntity<>(tickets,null, HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public Optional<Ticket> findTicketById(@PathVariable int id){
        Ticket ticket = ticketJPA.findById(id).orElse(null);
        if (ticket == null){
            throw  new GeneralException(ReservationException.OUT_OF_SEATS);
        }
        return ticketJPA.findById(id);
    }
    @PostMapping
    public ResponseEntity<?> addTicket(@RequestBody Ticket ticket){
        ticketJPA.save(ticket);
        return new ResponseEntity<>(ticket,null,HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<?> updateTicket(@RequestBody Ticket ticket){
        ticketJPA.save(ticket);
        return new ResponseEntity<>(ticket,null,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTicketById(@PathVariable int id){
        boolean isRemoved = ticketJPA.deleteById(id);
        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else
            return new ResponseEntity<>(id,HttpStatus.OK);
    }

    @GetMapping("/getTime/{id}")
    public LocalTime CalcGateCloseTime(@PathVariable int id){
       // return "the gate close time for flight ID "+id+" is "+ticketService.closeGateFun(id).toString();
        return ticketService.closeGateFun(id);
    }



}
