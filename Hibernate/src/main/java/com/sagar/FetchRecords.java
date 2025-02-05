package com.sagar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchRecords {
    public static void main(String[] args) {
        Student student = null;
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(com.sagar.Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        student = session.get(Student.class, 21);

        session.close();
        sessionFactory.close();

        System.out.println(student);
    }
}
