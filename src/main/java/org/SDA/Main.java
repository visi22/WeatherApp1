package org.SDA;

import org.SDA.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = HibernateConfig.getSessionFactory();
        Session session = factory.openSession();
    }

}