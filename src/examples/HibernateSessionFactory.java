/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Dell
 */
public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new 
                Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println("Initial SessionFactory creation failed."+ e.getMessage());
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
        
    }
}
