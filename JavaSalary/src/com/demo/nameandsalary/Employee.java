package com.demo.nameandsalary;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int e_id;
    private String name;
    private Salary salary;

    public Employee() {
    }

    public Employee(int e_id, String name, Salary salary) {
        this.e_id = e_id;
        this.name = name;
        this.salary = salary;
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary(int j) {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "e_id=" + e_id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
