package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Flight flight1 = new Flight("Abhimanyu", "Indigo", "07/Nov/2021", "07/Nov/2021",
                "09:10:00", "11::00", 200);
        Flight flight2 = new Flight("Shershah", "JettAirways", "14/oct/2021", "15/oct/2021",
                "09:00:00", "10:00:00", 300);
        Passenger passenger1 = new Passenger("Chirag", "8639113381", "chiragsarraf98@gmail.com",
                "Habsiguda", "Hyderabad", "Telangana");
        Passenger passenger2 = new Passenger("Vishal", "6546844577", "vishalsingh@gmail.com",
                "Srinivas Colony", "Hyderabad", "Telangana");
        String[] touristLocation = {"Gateway of India", "Elephant caves", "Taj Hotel", "Marine Drive>", "Haji Ali Dargah"};
        touristTicket ticket1 = new touristTicket(57811559L, "Rajiv Ghandi International airport",
                "Chatrapati Shivaji International Airport", true, flight1, passenger1, "Mumbai",
                touristLocation, 10000);
        regularTicket ticket2 = new regularTicket(311664651L, "Mumbai", "Boston",
                true, flight2, passenger2, "Veg Biryani", "Cocacola", "Chocolate biscuits", 40000);


        System.out.println(flight1.getFlightName());
        System.out.println(passenger1.getContactDetails());
        System.out.println(passenger2.getAddress());
        System.out.println(ticket1.cdurationOfJourney());
        System.out.println(ticket2.durationOfJourney());
        // System.out.println(ticket1.addTouristLocation(touristLocation));
        System.out.println(ticket2.getPNR());
        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPNR());
    }
}