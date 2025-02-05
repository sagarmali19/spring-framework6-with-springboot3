package com.sagar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNo(28);
        student.setsName("Avishiri");
        student.setsAge(29);

        /*
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.sagar.Student.class);
        configuration.configure();
        */

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.sagar.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        // this is deprecated
        // session.save(student);
        session.persist(student);

        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();
        sf.close();

        System.out.println(student);
    }
}
