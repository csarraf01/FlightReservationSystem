package com.company;


public class touristTicket extends Ticket {
    private String hotelLocation;
    private String[] touristspot;

    public touristTicket(long PNR, String departure, String destination, boolean status,
                         Flight flight, Passenger passenger, String hotelLocation, String[] touristLocation, int price) {

        super( departure, destination, status, PNR,flight, passenger, price);
        this.hotelLocation = hotelLocation;
        this.touristspot = touristLocation;
    }

    void addTouristLocation(String location1) {
        touristspot[0] = location1;
    }

    void addTouristLocation(String location1, String location2) {
        touristspot[0] = location1;
        touristspot[1] = location2;
    }

    void addTouristLocation(String location1, String location2, String location3) {
        touristspot[0] = location1;
        touristspot[1] = location2;
        touristspot[2] = location3;
    }

    void addTouristLocation(String location1, String location2, String location3, String location4) {
        touristspot[0] = location1;
        touristspot[1] = location2;
        touristspot[2] = location3;
        touristspot[3] = location4;
    }

    void addTouristLocation(String location1, String location2, String location3, String location4, String location5) {
        touristspot[0] = location1;
        touristspot[1] = location2;
        touristspot[2] = location3;
        touristspot[3] = location4;
        touristspot[4] = location5;
    }

    public void removeLocation(String location1) {
        for (int i = 0; i < touristspot.length; i++)
            if (touristspot[i].equals(location1))
                touristspot[i] = null;
    }

    public void removeLocation(String location1, String location2) {
        for (int i = 0; i < touristspot.length; i++)
            if (touristspot[i].equals(location1) || touristspot[i].equals(location2))
                touristspot[i] = null;
    }

    public void removeLocation(String location1, String location2, String location3) {
        for (int i = 0; i < touristspot.length; i++)
            if (touristspot[i].equals(location1) || touristspot[i].equals(location2) || touristspot[i].equals(location3))
                touristspot[i] = null;
    }

    public void removeLocation(String location1, String location2, String location3, String location4) {
        for (int i = 0; i < touristspot.length; i++)
            if (touristspot[i].equals(location1) || touristspot[i].equals(location2) ||
                    touristspot[i].equals(location3) || touristspot[i].equals(location4))
                touristspot[i] = null;
    }

    public void removeLocation(String location1, String location2, String location3, String location4, String location5) {
        for (int i = 0; i < touristspot.length; i++)
            if (touristspot[i].equals(location1) || touristspot[i].equals(location2) || touristspot[i].equals(location3)
                    || touristspot[i].equals(location4) || touristspot[i].equals(location5))
                touristspot[i] = null;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }
}