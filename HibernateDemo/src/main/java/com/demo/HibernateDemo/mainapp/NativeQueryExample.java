package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import javax.persistence.Query;
import java.util.List;


public class NativeQueryExample {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("./hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        // ***Update ko lagi Native query
        String sqlUpdate = "update test_teacher set salary=:sal where teacher_id=:id";
        NativeQuery<Teacher> query = session.createNativeQuery(sqlUpdate);
        query.setParameter("sal",35000);
        query.setParameter("id",2);

        Transaction transaction = session.beginTransaction();
        int value = query.executeUpdate();               //gives status of operation
        transaction.commit();
        System.out.println(value);


        /* ***Delete ko lagi Native query
        String sqlDelete = "delete from test_teacher where teacher_id=:id";
        NativeQuery<Teacher> query = session.createNativeQuery(sqlDelete);
        query.setParameter("id",3);

        Transaction transaction = session.beginTransaction();
        int value = query.executeUpdate();               //gives status of operation
        transaction.commit();
        System.out.println(value);

         */


        /* ***Insert ko lagi Native Query
        String sqlInsert = "insert into test_teacher(teacher_id,teacher_address,teacher_name,salary) values(0,:address,:name,:salary)";
        NativeQuery<Teacher> query = session.createNativeQuery(sqlInsert);
        query.setParameter("address","Pokhara");
        query.setParameter("name","Roopak");
        query.setParameter("salary",5000000);

        Transaction transaction = session.beginTransaction();
        int value = query.executeUpdate();               //gives status of operation
        transaction.commit();
        System.out.println(value);
         */

      /* ***Select ko Native query ko lagi
        String sql = "select * from test_teacher where teacher_id=:id";
        SQLQuery query = session.createSQLQuery(sql);
        NativeQuery<Teacher> query = session.createSQLQuery(sql);
        query.addEntity(Teacher.class);
        query.setParameter("id",3);

        List<Teacher> teacherList=query.getResultList();
        session.close();

        for (Teacher teacher:teacherList)
        {
            System.out.println(teacher);
        }
       */

    }
}
