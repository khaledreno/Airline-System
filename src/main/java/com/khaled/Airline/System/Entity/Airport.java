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

    @Column(name = "AirportCapacity")
    private int airportCapacity;

    @Column(name = "AirportCountryFrom")
    private String airportCountryFrom;

    @Column(name = "AirportCountryTo")
    private String airportCountryTo;


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



@OneToMany(mappedBy = "airport",
        cascade = {CascadeType.DETACH,CascadeType.MERGE,
        CascadeType.PERSIST,CascadeType.REFRESH})
    private Set<Plane> plane = new HashSet<>();


    @OneToMany(mappedBy = "FlightFrom",cascade = CascadeType.ALL)
    private Set<Flight> flightFr = new HashSet<>();

    @OneToMany(mappedBy = "FlightTo",cascade = CascadeType.ALL)
    private Set<Flight> flightTo = new HashSet<>();


    @ManyToMany(fetch = FetchType.LAZY , cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(
            name = "Plane_Airport",
            joinColumns = @JoinColumn(name = "airportID"),
            inverseJoinColumns = @JoinColumn(name = "plan_id") //////////////////////////////////////////
    )
    private Set<Plane> planelist = new HashSet<>();


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
