package com.khaled.Airline.System.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "plane")
 public class Plane {

    @Id
    @Column(name = "plan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int plan_id;

    @Column(name = "capacity",columnDefinition = "integer default 0")
    private int capacity;

    @Column(name = "PlaneName")
    private String PlaneName;

    @Column(name = "ManufactureYear",columnDefinition = "integer default 0")
    private int ManufactureYear;


//    private PlaneClasses PlaneClassesVar;
//    public enum PlaneClasses {
//        ClassA,
//        ClassB,
//        ClassC
//    }


    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,
    CascadeType.REFRESH})
    @JoinColumn(name = "CurrentAirportId",columnDefinition = "integer default 0")
    private Airport airport;


//
//    @ManyToMany(fetch = FetchType.LAZY , cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,
//    CascadeType.REFRESH})
//    @JoinTable(
//            name = "Plane_Airport",
//            joinColumns = @JoinColumn(name = "plan_id"),
//            inverseJoinColumns = @JoinColumn(name = "airportID")
//    )
//    private List<Airport> airportlist = new ArrayList<>();

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

//    public Airport getAirport() {
//        return airport;
//    }
//
//    public void setAirport(Airport airport) {
//        this.airport = airport;
//    }

//    public List<Airport> getAirportlist() {
//        return airportlist;
//    }
//
//    public void setAirportlist(List<Airport> airportlist) {
//        this.airportlist = airportlist;
//    }

     public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPlaneName() {
        return PlaneName;
    }

    public void setPlaneName(String planeName) {
        PlaneName = planeName;
    }

    public int getManufactureYear() {
        return ManufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        ManufactureYear = manufactureYear;
    }

//    public PlaneClasses getPlaneClassesVar() {
//        return PlaneClassesVar;
//    }
//
//    public void setPlaneClassesVar(PlaneClasses planeClassesVar) {
//        PlaneClassesVar = planeClassesVar;
//    }

//    @Override
//    public String toString() {
//        return "Plane{" +
//                "plan_id=" + plan_id +
//                ", capacity=" + capacity +
//                ", PlaneName='" + PlaneName + '\'' +
//                ", ManufactureYear=" + ManufactureYear +
//                ", airport=" + airport +
//                ", airportlist=" + airportlist +
//                '}';
//    }
}
