package com.khaled.Airline.System.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity(name = "airport")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int airportID;

    @Column(name = "AirportName")
    private String airportName;

    @Column(name = "AirportCountry")
    private String airportCountry;

    @Column(name = "AirportCapacity",columnDefinition = "integer default 0")
    private int airportCapacity;

    @Column(name = "NumberOfGates",columnDefinition = "integer default 0")
    private Integer GateNumber;

//    @ManyToMany(fetch = FetchType.LAZY , cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,
//            CascadeType.REFRESH})
//    @JoinTable(
//            name = "Plane_Airport",
//            joinColumns = @JoinColumn(name = "airportID"),
//            inverseJoinColumns = @JoinColumn(name = "plan_id")
//    )
//    private Set<Plane> planelist = new HashSet<>();
    //
//    public Set<Plane> getPlanelist() {
//        return planelist;
//    }
//
//    public void setPlanelist(Set<Plane> planelist) {
//        this.planelist = planelist;
//    }

//

    public Integer getGateNumber() {
        return GateNumber;
    }

    public void setGateNumber(Integer gateNumber) {
        GateNumber = gateNumber;
    }

    @OneToMany(mappedBy = "airport",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.PERSIST,CascadeType.REFRESH})
    private Set<Plane> plane = new HashSet<>();

    public Set<Plane> getPlane() {
        return plane;
    }

    public void setPlane(Set<Plane> plane) {
        this.plane = plane;
    }


    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCountry() {
        return airportCountry;
    }

    public void setAirportCountry(String airportCountry) {
        this.airportCountry = airportCountry;
    }

    public int getAirportCapacity() {
        return airportCapacity;
    }

    public void setAirportCapacity(int airportCapacity) {
        this.airportCapacity = airportCapacity;
    }



    @Override
    public String toString() {
        return "Airport{" +
                "airportID=" + airportID +
                ", airportName='" + airportName + '\'' +
                ", airportCountry='" + airportCountry + '\'' +
                ", airportCapacity=" + airportCapacity +
                '}';
    }
}

//    @OneToMany(mappedBy = "FlightFrom",cascade = CascadeType.ALL)
//    private Set<Flight> flightFr = new HashSet<>();

//    @OneToMany(mappedBy = "FlightTo",cascade = CascadeType.ALL)
//    private Set<Flight> flightTo = new HashSet<>();

//plane in set do the needful


//Unidirection is only in the entity that have the col
//    @OneToOne(mappedBy = "Gate", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private Ticket ticketGateNumber;



//    @Column(name = "AirportCountryFrom")
//    private String airportCountryFrom;
//
//    @Column(name = "AirportCountryTo")
//    private String airportCountryTo;




//    public Set<Flight> getFlightFr() {
//        return flightFr;
//    }
//
//    public void setFlightFr(Set<Flight> flightFr) {
//        this.flightFr = flightFr;
//    }
//
//    public Set<Flight> getFlightTo() {
//        return flightTo;
//    }
//
//    public void setFlightTo(Set<Flight> flightTo) {
//        this.flightTo = flightTo;
//    }













