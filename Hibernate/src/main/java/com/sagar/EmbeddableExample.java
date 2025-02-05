package com.sagar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableExample {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrand("Asus");
        laptop.setType("ROG");
        laptop.setRam(12);

        Alien alien = new Alien();
        alien.setTech("Java");
        alien.setaId(12);
        alien.setaName("Sagar");
        alien.setLaptop(laptop);

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
