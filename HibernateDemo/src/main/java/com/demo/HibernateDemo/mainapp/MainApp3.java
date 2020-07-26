package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import com.demo.javabeandemo.HibernateConfig;
import org.hibernate.Session;

public class MainApp3 {
    public static void main(String[] args) {
        Session session = HibernateConfig.getSessionFactory().openSession();

        Teacher teacher = new Teacher();
        teacher.setId(4);      //selecting ID to delete and putting in object
        session.delete(teacher);   //deleting that object to delete data
        System.out.println("Data Deleted");
        session.beginTransaction().commit();
        session.close();
    }
}
