package com.untitled.mainapp;
import com.untitled.pojo.Student;
import java.util.ArrayList;
import java.util.List;

/*
This class sets the student into list and print the values of arrayList later on.
@author Rupesh Regmi
 */
public class MainApp {
    public static void main(String[] args) {
        Student s = new Student(1,"Rupesh","Baneshowr","98467194444");
        Student s1 = new Student(2,"Roopak","Pokhara","9847956123");
        Student s2 = new Student(3,"Roshan","Butwal","9847812547");
        Student s3 = new Student(4,"Nitesh","Argakhachi","9848123695");

        //adding student data in list

        List<Student> studentlist = new ArrayList<>();
        studentlist.add(s);
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);

        //printing the values

        for (Student student : studentlist){
            System.out.println(student);
        }

    }

}
