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
public class TaiKhoanDangNhap_Controller {


    public static TaiKhoanDangNhap getTK(String MaLP) {
        TaiKhoanDangNhap LP;
        LP = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            LP = (TaiKhoanDangNhap) session.get(TaiKhoanDangNhap.class, MaLP);

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return LP;
    }

    public static ArrayList<TaiKhoanDangNhap> getDSTK() {
        ArrayList<TaiKhoanDangNhap> dsLP = null;
       
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from TaiKhoanDangNhap";
            Query query = session.createQuery(sql);
            dsLP = (ArrayList<TaiKhoanDangNhap>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsLP;
    }

    public static boolean themTK(TaiKhoanDangNhap lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (TaiKhoanDangNhap_Controller.getTK(lp.getMaTK()) != null) {
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
    public TaiKhoanDangNhap_Controller() {
    }
    
    public static boolean xoaTK(String MaTK) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        TaiKhoanDangNhap lp = TaiKhoanDangNhap_Controller.getTK(MaTK);
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
    
    public static boolean capnhatTK(TaiKhoanDangNhap lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getTK(lp.getMaTK()) == null) {
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

   
