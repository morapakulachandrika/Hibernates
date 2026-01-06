package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.setRollNo(6);
        s1.setsName("Asha");
        s1.setsAge(23);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Student1.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.persist(s1);
        tx.commit();

        session.close();
        sf.close();

        System.out.println("Saved: " + s1);
    }
}
