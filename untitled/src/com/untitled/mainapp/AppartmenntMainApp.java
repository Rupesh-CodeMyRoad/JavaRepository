package com.untitled.mainapp;

import com.untitled.roomdetails.Appartment;
import com.untitled.roomdetails.Room;

import java.util.ArrayList;

public class AppartmenntMainApp {
    public static void main(String[] args) {
        Appartment a1 = new Appartment("Galaxy","Baneshowr","20,00,000",new Room(1,"Single Bed","2,000"));
        Appartment a2 = new Appartment("Sunshine","Kalanki","30,00,000",new Room(2,"Double Bed","1,000"));
        Appartment a3 = new Appartment("Silver","Tinkune","10,00,000",new Room(3,"Single Bed","3,000"));
        Appartment a4 = new Appartment("KTM Apmt","New Road","50,00,000",new Room(4,"Double Bed","5,000"));
        Appartment a5 = new Appartment("Pokhara Apmt","Bancampus","200,00,000",new Room(5,"Single Bed","1,500"));

        ArrayList<Appartment> alist = new ArrayList<>();
        alist.add(a1);
        alist.add(a2);
        alist.add(a3);
        alist.add(a4);
        alist.add(a5);
        for(Appartment a : alist)
        {
            System.out.println(a);
        }
    }
}
