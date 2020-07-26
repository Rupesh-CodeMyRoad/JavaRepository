package com.demo.nameandsalary;

import java.io.Serializable;

public class Salary implements Serializable {
    private static final long serialVersionUID = 1L;

    private int salary;

    public Salary() {
    }

    public Salary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "" + salary ;
    }
}
