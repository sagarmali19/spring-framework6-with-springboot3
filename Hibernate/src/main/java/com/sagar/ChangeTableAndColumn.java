package com.sagar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChangeTableAndColumn {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setaId(1);
        alien.setaName("Sagar");
        alien.setTech("Java");

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.sagar.Alien.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        session.persist(alien);

        Transaction transaction = session.beginTransaction();
        transaction.commit();

        session.close();
        sf.close();

        System.out.println(alien);
    }
}
