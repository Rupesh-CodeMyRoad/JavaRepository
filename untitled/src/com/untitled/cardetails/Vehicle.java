package com.untitled.cardetails;
import java.io.Serializable;

public class Vehicle implements Serializable{
    private static final long serialVersionUID=1L;

    private int id;
    private String carname;
    private String carmodel;
    private String carprice;
    private Engine engine;

    public Vehicle() {
    }

    public Vehicle(int id, String carname, String carmodel, String carprice, Engine engine) {
        this.id = id;
        this.carname = carname;
        this.carmodel = carmodel;
        this.carprice = carprice;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getCarprice() {
        return carprice;
    }

    public void setCarprice(String carprice) {
        this.carprice = carprice;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Id=" + id +
                ", Car Name='" + carname + '\'' +
                ", C_Model='" + carmodel + '\'' +
                ", C_Price='" + carprice + '\'' +
                ", Engine=" + engine +
                '}';
    }
}
