package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp1 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("./hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();

        //building a session
        Session session = sessionFactory.openSession();

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("Roshan");
        teacher.setAddress("Timi");
        session.save(teacher);  //saves the teacher object to the memory only
        session.beginTransaction().commit();  //saves the teacher object to the database from memory
        session.close();

    }
}
