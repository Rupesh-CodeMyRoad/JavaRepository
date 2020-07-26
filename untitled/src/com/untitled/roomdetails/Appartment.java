package com.untitled.roomdetails;
import com.untitled.cardetails.Engine;

import java.io.Serializable;

public class Appartment implements Serializable {
    private static final long serialVersionUID = 1L;

    private String a_name;
    private String a_Location;
    private String a_price;
    private Room room;

    public Appartment() {
    }

    public Appartment(String a_name, String a_Location, String a_price, Room room) {
        this.a_name = a_name;
        this.a_Location = a_Location;
        this.a_price = a_price;
        this.room = room;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_Location() {
        return a_Location;
    }

    public void setA_Location(String a_Location) {
        this.a_Location = a_Location;
    }

    public String getA_price() {
        return a_price;
    }

    public void setA_price(String a_price) {
        this.a_price = a_price;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Appartment{" +
                "Appartment_Name='" + a_name + '\'' +
                ", Location='" + a_Location + '\'' +
                ", A_Price='" + a_price + '\'' +
                ", room=" + room +
                '}';
    }
}
