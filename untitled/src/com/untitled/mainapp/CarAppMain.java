package com.untitled.mainapp;

import com.untitled.cardetails.Engine;
import com.untitled.cardetails.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarAppMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(1,"Hyundai","i10 Magna","30,00,000",new Engine(001,"MEC001","400HZ",new Date()));
        Vehicle v2 = new Vehicle(2,"Suzuki","Swift","29,00,000",new Engine(022,"MEC041","300HZ",new Date()));
        Vehicle v3 = new Vehicle(3,"Honda","City","40,00,000",new Engine(051,"MEC082","700HZ",new Date()));
        Vehicle v4 = new Vehicle(4,"Hyundai","i10 Magna","30,00,000",new Engine(071,"MEC551","900HZ",new Date()));
        Vehicle v5 = new Vehicle(5,"Tata","Sumo","50,00,000",new Engine(241,"MEC601","1200HZ",new Date()));
        Vehicle v6 = new Vehicle(6,"Mahendra","Scropio","40,00,000",new Engine(891,"MEC411","4000HZ",new Date()));
        List<Vehicle> vlist = new ArrayList<>();
        vlist.add(v1);
        vlist.add(v2);
        vlist.add(v3);
        vlist.add(v4);
        vlist.add(v5);
        vlist.add(v6);

        //printing the values

        for (Vehicle v : vlist){
            System.out.println(v);
        }
    }
}
