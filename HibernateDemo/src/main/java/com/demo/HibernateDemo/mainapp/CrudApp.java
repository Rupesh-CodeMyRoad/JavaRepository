package com.demo.HibernateDemo.mainapp;

import com.demo.HibernateDemo.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CrudApp {
    private SessionFactory sessionFactory;
    CrudApp(){
        Configuration configuration = new Configuration().configure("./hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        this.sessionFactory=sessionFactory;
    }
    public void delete(){
        Teacher teacher=new Teacher();
        teacher.setId(2);
        Session session=sessionFactory.openSession();
        session.beginTransaction().commit();
        session.close();
    }
    public List<Teacher> getAllTeacher(){
        Session session = sessionFactory.openSession();
        List<Teacher> teacherList = session.createCriteria(Teacher.class).list();
        session.close();
        return teacherList;
    }
    public void update(){
    Teacher teacher = new Teacher();
    teacher.setId(3);
    teacher.setName("Hari");
    teacher.setAddress("Pokhara");
    Session session = sessionFactory.openSession();
    session.update(teacher);
        System.out.println("Updated");
        session.beginTransaction().commit();
        session.close();
    }
    public void insert(){
        Teacher teacher = new Teacher();
        teacher.setName("Ram Krishna");
        teacher.setAddress("Gausala");
        Session session = sessionFactory.openSession();
        session.save(teacher);
        session.beginTransaction().commit();
        session.close();
    }

    public static void main(String[] args) {
        CrudApp crudApp = new CrudApp();
        //crudApp.insert();
        //crudApp.update();
        //crudApp.delete();
        List<Teacher> teacherList = crudApp.getAllTeacher();     //To see TeacherList
        for (Teacher teacher:teacherList)
        {
            System.out.println(teacher);
        }
    }
}

