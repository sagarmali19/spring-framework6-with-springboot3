package com.sagar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateAndDelete {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRollNo(25);
        student.setsName("Pooja1");
        student.setsAge(23);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.sagar.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Student s1 = session.get(com.sagar.Student.class, 23);

        Transaction transaction = session.beginTransaction();

        session.remove(s1);

        session.merge(student);

        transaction.commit();

        session.close();
        sf.close();

        System.out.println(student);
    }
}
