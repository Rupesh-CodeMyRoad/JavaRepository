package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CriteriaExample1 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("./hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();

        Teacher teacher=new Teacher(0,"Rupesh","Baneshowr",250000L);
        Teacher teacher1=new Teacher(0,"Suraj","Thimi",45000L);
        Teacher teacher2=new Teacher(0,"Kabita","Mid baneshowr",35000L);
        Teacher teacher3=new Teacher(0,"Ashok","Buspark",100000L);

        //session start

        Session session = sessionFactory.openSession();
        session.save(teacher);
        session.save(teacher1);
        session.save(teacher2);
        session.save(teacher3);
        session.beginTransaction().commit();
        session.close();
    }
}
