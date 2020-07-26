package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import com.demo.javabeandemo.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class MainApp2 {
    public static void main(String[] args) {

        //building a session
        Session session = HibernateConfig.getSessionFactory().openSession();

        List<Teacher> teacherList = session.createCriteria(Teacher.class).list();
        session.close();

        //list of teacher from school
        for (Teacher t:teacherList)
        {
            System.out.println(t);
        }
    }
}
