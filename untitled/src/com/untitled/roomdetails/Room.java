package com.untitled.roomdetails;
import java.io.Serializable;
import java.util.Date;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;

    private int roomid;
    private String rsize;
    private String rprice;

    public Room() {
    }

    public Room(int roomid, String rsize, String rprice) {
        this.roomid = roomid;
        this.rsize = rsize;
        this.rprice = rprice;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getRsize() {
        return rsize;
    }

    public void setRsize(String rsize) {
        this.rsize = rsize;
    }

    public String getRprice() {
        return rprice;
    }

    public void setRprice(String rprice) {
        this.rprice = rprice;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Room ID=" + roomid +
                ", Room Size='" + rsize + '\'' +
                ", Room Price='" + rprice + '\'' +
                '}';
    }
}