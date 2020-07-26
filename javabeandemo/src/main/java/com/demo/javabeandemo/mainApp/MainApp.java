package com.demo.javabeandemo.mainApp;

import com.demo.javabeandemo.pojo.Teacher;

public class MainApp {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setTeacherId(1);
        t.setAddress("Baneshowr");
        t.setName("Rupesh");
        System.out.println(t);
    }
}
