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
public class NhanVien_Controller {


    public static Tblnhanvien getNV(String MaNV) {
        Tblnhanvien NV;
        NV = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            NV = (Tblnhanvien) session.get(Tblnhanvien.class, MaNV);

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return NV;
    }

    public static ArrayList<Tblnhanvien> getDSNV() {
        ArrayList<Tblnhanvien> dsLP = null;
       
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from Tblnhanvien";
            Query query = session.createQuery(sql);
            dsLP = (ArrayList<Tblnhanvien>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsLP;
    }

    public static boolean themNV(Tblnhanvien lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (TaiKhoanDangNhap_Controller.getTK(lp.getManv()) != null) {
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
    public NhanVien_Controller() {
    }
    
    public static boolean xoaNV(String MaNV) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        Tblnhanvien lp = NhanVien_Controller.getNV(MaNV);
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
    
    public static boolean capnhatNV(Tblnhanvien lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getNV(lp.getManv()) == null) {
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

   
