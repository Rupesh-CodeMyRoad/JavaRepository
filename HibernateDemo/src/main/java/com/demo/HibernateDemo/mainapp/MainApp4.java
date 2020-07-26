package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import com.demo.javabeandemo.HibernateConfig;
import org.hibernate.Session;

public class MainApp4 {
    public static void main(String[] args) {
        Session session = HibernateConfig.getSessionFactory().openSession();

        Teacher teacher = new Teacher();
        teacher.setId(2);              //selecting ID to update in object
        teacher.setName("Salman Khan");     //editing data
        teacher.setAddress("Thapathali");   //editing data

        session.update(teacher);            //updating  object
        System.out.println("Data Updated");
        session.beginTransaction().commit();
        session.close();
    }
}
