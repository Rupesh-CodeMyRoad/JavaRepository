package com.demo.mainApp;

import com.demo.nameandsalary.Employee;
import com.demo.nameandsalary.Salary;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of emloyee");
        int emp = scan.nextInt();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for(int i=1;i<=emp;i++)
        {
            Employee e = new Employee();
            System.out.println("Enter id of "+ i +"th Employee");
            e.setE_id(scan.nextInt());
            scan.nextLine();
            System.out.println("Enter Name of Employee");
            e.setName(scan.nextLine());
            System.out.println("Enter Salary of Employee");
            e.setSalary(new Salary(scan.nextInt()));
            employees.add(e);
        }
            System.out.println(Salary);
    }
}
//use collection.sort