package com.company;

public class Flight {

    private String fname;
    private String airline;
    private String deptdate;
    private String arrdate;
    private String arrtime;
    private String depttime;
    private int capacity;
    private int seatsbooked = 0;

    public Flight(String fname,  String airline, String deptdate,
                  String arrdate, String arrtime,String depttime, int capacity) {
        this.fname = fname;
        this.airline = airline;
        this.deptdate = deptdate;
        this.arrdate = arrdate;
        this.arrtime = arrtime;
        this.capacity = capacity;
        this.depttime = depttime;
    }

    public Flight(Flight flight) {
        this(flight.fname , flight.airline, flight.deptdate, flight.arrdate, flight.arrtime, flight.depttime, flight.capacity);
    }

    public Flight() {

    }

    public String getFlightName() {
        return fname;
    }

    public void setFlightName(String flightName) {
        this.fname = flightName;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfSeatsBooked() {
        return seatsbooked;
    }

    public void setNoOfSeatsBooked(int noOfSeatsBooked) {
        this.seatsbooked = noOfSeatsBooked;
    }

    public String getDateOfDeparture() {
        return deptdate;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.deptdate = dateOfDeparture;
    }

    public int seatavailable() {
        return capacity - seatsbooked;
    }

    public String getTimeOfDeparture() {
        return depttime;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.deptdate = timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return arrtime;
    }

    public void setTimeOfArrival(String arrtime) {
        this.arrtime = arrtime;
    }

    public String getFlightInfo() {
        return "Flight Name: " + fname + ", Airline Name: " + airline +  ". Total Number of Seats: " +
                capacity + ", No of seats available: " + seatavailable();
    }
}