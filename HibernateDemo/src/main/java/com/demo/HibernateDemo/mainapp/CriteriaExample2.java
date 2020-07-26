package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class CriteriaExample2 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure("./hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();

        Session session=sessionFactory.openSession();

        //List<Teacher> teacherList=session.createCriteria(Teacher.class).list();
        Criteria criteria=session.createCriteria(Teacher.class);


        /*
        //Sorting the salary in ascending order
        criteria.addOrder(Order.asc("salary"));

        //restrict the value of salary less than 20000
        criteria.add(Restrictions.gt("salary",20000L));

        List<Teacher> teacherList= criteria.list();
        session.close();

        //print the teacher list

        for(Teacher teacher: teacherList){
            System.out.println(teacher);
        }
        */
        criteria.setProjection(Projections.property("name"));   //"name" java ko ho database ko hoaina
        List<String> nameList = criteria.list();
        session.close();

        for (String name:nameList)
        {
            System.out.println(name);
        }
    }
}
