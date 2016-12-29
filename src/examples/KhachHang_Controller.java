/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import static examples.NhanVien_Controller.NextID;
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
public class KhachHang_Controller {


    public static KhachHang getKH(String MaKH) {
        KhachHang KH;
        KH = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            KH = (KhachHang) session.get(KhachHang.class, MaKH);

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return KH;
    }

    public static ArrayList<KhachHang> getDSKH() {
        ArrayList<KhachHang> dsKH = null;
       
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from KhachHang";
            Query query = session.createQuery(sql);
            dsKH = (ArrayList<KhachHang>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsKH;
    }

    public static boolean themKH(KhachHang lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (KhachHang_Controller.getKH(lp.getMaKH()) != null) {
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
    public KhachHang_Controller() {
    }
    
    public static boolean xoaKH(String MaKH) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        KhachHang lp = KhachHang_Controller.getKH(MaKH);
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
    
    public static boolean capnhatKH(KhachHang kh) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getKH(kh.getMaKH()) == null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.update(kh);
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
    //hàm lấy id
        public String LayMaKH()
        {
        ArrayList<KhachHang>  dsKH = new ArrayList<KhachHang>();       
        dsKH = KhachHang_Controller.getDSKH();
        dsKH.get(dsKH.size()-1).getMaKH();
            return NextID(dsKH.get(dsKH.size()-1).getMaKH(), "KH");
        }
}

   
