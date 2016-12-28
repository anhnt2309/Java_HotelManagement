/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dell
 */
public class Phong_Controller {


    public static Phong getPhong(String MaLP) {
        Phong LP;
        LP = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            LP = (Phong) session.get(Phong.class, MaLP);
           
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return LP;
    }

    public static ArrayList<Phong> getDSPhong() {
        ArrayList<Phong> dsLP = null;
       
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from Phong";
            Query query = session.createQuery(sql);
            dsLP = (ArrayList<Phong>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsLP;
    }

    public static boolean themPhong(Phong lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (Phong_Controller.getPhong(lp.getMaPhong()) != null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.save(lp);
            trans.commit();
            
        } catch (HibernateException ex) {
//Log the exception
            trans.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    public Phong_Controller() {
    }
    
    public static boolean xoaPhong(String MaLP) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        Phong lp = Phong_Controller.getPhong(MaLP);
        if (lp == null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.delete(lp);
            trans.commit();
        } catch (HibernateException ex) {
//Log the exception
            trans.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    public static boolean capNhatPhong(Phong lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getPhong(lp.getMaPhong()) == null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.update(lp);
            trans.commit();
        } catch (HibernateException ex) {
//Log the exception
            trans.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
}

   
