package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Employee;
import com.demo.HibernateDemo.entity.Hotel;
import com.demo.HibernateDemo.entity.HotelType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneExample {
    public static void main(String[] args) {
        HotelType hotelType = new HotelType(null,"5 Star");
        Employee employee = new Employee(null,"Rupesh","CEO",null);
        Hotel hotel = new Hotel(null,"AGRG Hotel","Koteshowr",4,hotelType,null);

        Configuration configuration=new Configuration().configure("./hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();

        Session session=sessionFactory.openSession();
        session.save(hotel);
        session.save(hotelType);
        session.save(employee);
        session.beginTransaction().commit();
        session.close();

    }
}
