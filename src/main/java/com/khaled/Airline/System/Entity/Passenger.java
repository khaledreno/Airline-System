package com.khaled.Airline.System.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int passenger_id;

    @Column(name = "national_id",unique = true,nullable=false)
    @NotBlank(message = "* National ID is required")
    private int national_id;

    @Column(name = "FirstName",nullable=false)
    @NotBlank(message = "* First Name is required")
    private String FirstName;

    @Column(name = "LastName")
    private String LastName;

    @Column(name = "NumberOfFlights")
    private int NumberOfFlights;

    @Column(name = "Gender",nullable=false)
    private String Gender;

    @Column(name = "phone",unique = true)
    private String Phone;

    //mapping between ticket and passenger name
    //Unidirection is only in the entity that have the col

//    @OneToOne(mappedBy = "passenger", cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY, optional = false)
//    private Ticket Passngername;


    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public int getNational_id() {
        return national_id;
    }

    public void setNational_id(int national_id) {
        this.national_id = national_id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getNumberOfFlights() {
        return NumberOfFlights;
    }

    public void setNumberOfFlights(int numberOfFlights) {
        NumberOfFlights = numberOfFlights;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passenger_id=" + passenger_id +
                ", national_id=" + national_id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", NumberOfFlights=" + NumberOfFlights +
                ", Gender='" + Gender + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
