package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ticket {


    private String departure;
    private String destination;
    private boolean status;
    private long PNR;
    Flight flight = new Flight();
    Passenger passenger;
    private int price;

    public Ticket( String departure, String destination, boolean status, long pnrNumber,
                  Flight flight, Passenger passenger, int price) {
        this.PNR = pnrNumber;
        this.departure = departure;
        this.destination = destination;
        this.status = status;
        this.flight = flight;
        this.passenger = passenger;
        if (status == true)
            updateSeats();
        this.price = price;
    }

    public String TicketDetails() {
        return PNR + ", " + departure + ", " + destination;
    }

    public boolean getTicketStatus() {
        return status;
    }

    public Flight getFlight() {
        return flight;
    }
    public String durationOfJourney() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time1 = format.parse(flight.getTimeOfDeparture());
        Date time2 = format.parse(flight.getTimeOfArrival());

        long duration = Math.abs(time2.getTime() - time1.getTime());
        long diffSeconds = duration / 1000 % 60;
        long diffMinutes = duration / (60 * 1000) % 60;
        long diffHours = duration / (60 * 60 * 1000) % 24;
        return "Duration of journey : " + diffHours + " hours " + diffMinutes + " minutes " + diffSeconds + " seconds";
    }

    public void updateSeats() {
        if (status == true)
            flight.setNoOfSeatsBooked(flight.getNoOfSeatsBooked() + 1);
    }


    public void confirmTicket() {
        status = true;
        updateSeats();
    }
    public void cancelTicket() {
        status = false;
        flight.setNoOfSeatsBooked(flight.getNoOfSeatsBooked() - 1);
    }


    public long getPNR() {
        return PNR;
    }

    public void setPNR(long PNR) {
        this.PNR = PNR;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



}