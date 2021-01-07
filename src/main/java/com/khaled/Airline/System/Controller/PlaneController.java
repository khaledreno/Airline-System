package com.khaled.Airline.System.Controller;

import com.khaled.Airline.System.DAO.PlaneJPA;
import com.khaled.Airline.System.Entity.Plane;
import com.khaled.Airline.System.Exceptions.GeneralException;
import com.khaled.Airline.System.Exceptions.PlaneException;
import com.khaled.Airline.System.Service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/planes")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @Autowired
    PlaneJPA planeJPA;

    @GetMapping
    public ResponseEntity<?> findAllplanes(){
        List<Plane> planes = planeJPA.findAll();
        return new ResponseEntity<>(planes,null,HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public Optional<Plane> getPlaneById(@PathVariable int id){
    Plane p = planeJPA.findById(id).orElse(null);
    if (p == null){
        throw new GeneralException(PlaneException.CANNOT_FIND_PLANE);
    }
    return planeJPA.findById(id);
    }

    @PostMapping
    public ResponseEntity<?> addPlane(@RequestBody Plane p){
        planeJPA.save(p);
        return new ResponseEntity<>(p,null,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updatePlane(@RequestBody Plane p){
        planeJPA.save(p);
        return new ResponseEntity<>(p,null,HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePlaneByID(@PathVariable int id){
        boolean isRemoved = planeJPA.deleteById(id);

        if (!isRemoved){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/capacity/{capacity}")
    public ResponseEntity<?> getPlanesByCapacity(@PathVariable int capacity){
        return new ResponseEntity<>(planeJPA.findByCapacity(capacity),null,HttpStatus.FOUND);
    }

}
