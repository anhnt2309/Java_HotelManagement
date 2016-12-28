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
public class ThuePhong_Controller {
    public ThuePhong_Controller() {
    }
    public static ThuePhong_POJO getThuePhong(String MaThuePhong) {
        ThuePhong_POJO TP;
        TP = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            TP = (ThuePhong_POJO) session.get(ThuePhong_POJO.class, MaThuePhong);
           
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return TP;
    }
    
    public static ArrayList<ThuePhong_POJO> getDSThuePhong() {
        ArrayList<ThuePhong_POJO> dsTP = null;
       
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from ThuePhong_POJO";
            Query query = session.createQuery(sql);
            dsTP = (ArrayList<ThuePhong_POJO>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsTP;
    }
    
    public static boolean themThuePhong(ThuePhong_POJO tp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (ThuePhong_Controller.getThuePhong(tp.getMaThuePhong()) != null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.save(tp);
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
    
    public static boolean xoaThuePhong(String MaLP) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        ThuePhong_POJO tp = ThuePhong_Controller.getThuePhong(MaLP);
        if (tp == null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.delete(tp);
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
    public static boolean capnhatTP(ThuePhong_POJO TP) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getThuePhong(TP.getMaThuePhong()) == null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.update(TP);
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
