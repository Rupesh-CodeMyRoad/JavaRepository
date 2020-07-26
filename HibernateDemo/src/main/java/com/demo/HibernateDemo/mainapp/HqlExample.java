package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HqlExample {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("./hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        //String hqlQuery = "From Teacher t WHERE t.id=:tId";       //id here is attributes of entity in teacher class
        //String hqlQuery = "From Teacher t ORDER BY t.salary DESC";       //id here is attributes of entity in teacher class
        String hqlQuery = "SELECT SUM(t.salary),t.address FROM Teacher t group by t.address";       //salary sum grouped by address

        Query<Teacher> query = session.createQuery(hqlQuery);    //session.list() ko jastai kaam ho but yesma hqlQuery rakhna milcha
        // query.setParameter("tId",4);    //hqlQuery ma bahira bata parameter pass garna
        List teacherList=query.list();
        session.close();

        //printing the teacher list
        /*for (Teacher teacher:teacherList)
        {
            System.out.println(teacher);
        }

         */
        for (int i=0;i<teacherList.size();i++)
        {
            Object[] row = (Object[]) teacherList.get(i);     //typecasting object
            System.out.println(row[0]+" "+row[1]);
        }
    }
}
