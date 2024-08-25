package com.example.bookingflights_dacs3;

import com.google.gson.annotations.SerializedName;

public class Ticket {
    private String time;

    private String airportcode;

    private String destinationcode;

    @SerializedName("planeid")
    private String plane_id;

    @SerializedName("imgplane")
    private String imgAirline;
    private String price;


    public String toString() {
        return "Ticket details: " +
                "Property1: " + imgAirline +
                ", Property2: " + plane_id +
                ", Property3: " + time +
                ", Property4: " + price;
    }

    public Ticket(String time, String plane_id, String imgAirline, String price) {
        this.time = time;
        this.plane_id = plane_id;
        this.imgAirline = imgAirline;
        this.price = price;
    }

    public Ticket(String airportcode, String destinationcode) {
        this.airportcode = airportcode;
        this.destinationcode = destinationcode;
    }

    public String getAirportcode() {
        return airportcode;
    }

    public void setAirportcode(String airportcode) {
        this.airportcode = airportcode;
    }

    public String getDestinationcode() {
        return destinationcode;
    }

    public void setDestinationcode(String destinationcode) {
        this.destinationcode = destinationcode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlane_id() {
        return plane_id;
    }

    public void setPlane_id(String plane_id) {
        this.plane_id = plane_id;
    }

    public String getImgAirline() {
        return imgAirline;
    }

    public void setImgAirline(String imgAirline) {
        this.imgAirline = imgAirline;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
