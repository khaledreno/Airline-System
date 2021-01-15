package com.khaled.Airline.System.Entity;

import javax.persistence.*;

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
