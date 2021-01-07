package com.khaled.Airline.System.Entity;

import javax.persistence.*;

@Entity
public class Plane {

    @Id
    @Column(name = "plan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int plan_id;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "PlaneName")
    private String PlaneName;

    @Column(name = "ManufactureYear")
    private int ManufactureYear;

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

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
}
