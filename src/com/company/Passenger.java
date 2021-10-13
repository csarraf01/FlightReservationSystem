package com.company;

public class Passenger {
    private int id;
    private static int counter;
    private class Address {
        String state;
        String city;
        String street;

        public Address(String state, String city, String street)
        {
            this.city=city;
            this.street=street;
            this.state=state;
        }
    }
    private Address address;
    private class Contact{

        String email,phonenno,name;

        public Contact(String email,String phonenno, String name)
        {
            this.email=email;
            this.name=name;
            this.phonenno=phonenno;
        }
    }
    private Contact contact;

    static {
        counter=0;
    }
    public Passenger(String nname, String pphoneno, String eemail, String sstreet,
                     String ccity, String sstate)
    {
        this.address = new Address(sstate,ccity,sstreet);
        this.contact = new Contact(eemail,pphoneno,nname);
        this.id = counter++;
    }

    public int getId() {
        return this.id;
    }

    public String getContactDetails() {
        return contact.name+ " , " + contact.phonenno + " , "  + contact.email;
    }

    public String getAddress() {
        return address.street+","+address.city+","+address.state;
    }
    public String getName()
    {
        return contact.name;
    }


}
