package com.untitled.pojo;
import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID=1L;

    private int id;
    private String name;
    private String address;
    private String phnno;

    public Student() {
    }

    public Student(int id, String name, String address, String phnno) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phnno = phnno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhnno() {
        return phnno;
    }

    public void setPhnno(String phnno) {
        this.phnno = phnno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phnno='" + phnno + '\'' +
                '}';
    }
}
