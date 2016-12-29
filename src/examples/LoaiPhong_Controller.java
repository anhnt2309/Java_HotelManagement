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
public class LoaiPhong_Controller {


    public static LoaiPhong_POJO getLoaiPhong(String MaLP) {
        LoaiPhong_POJO LP;
        LP = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            LP = (LoaiPhong_POJO) session.get(LoaiPhong_POJO.class, MaLP);
           
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return LP;
    }

    public static ArrayList<LoaiPhong_POJO> getDSLoaiPhong() {
        ArrayList<LoaiPhong_POJO> dsLP = null;
       
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from LoaiPhong_POJO";
            Query query = session.createQuery(sql);
            dsLP = (ArrayList<LoaiPhong_POJO>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsLP;
    }
public static ArrayList<LoaiPhong_POJO> getDSLoaiPhongTheoMa(String x,String maLP) {
        ArrayList<LoaiPhong_POJO> dsLP = null;
       
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from LoaiPhong_POJO where "+x+" = '"+maLP+"'";
            Query query = session.createQuery(sql);
            dsLP = (ArrayList<LoaiPhong_POJO>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsLP;
    }
    public static boolean themLoaiPhong(LoaiPhong_POJO lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (LoaiPhong_Controller.getLoaiPhong(lp.getMaLP()) != null) {
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
    public LoaiPhong_Controller() {
    }
    
    public static boolean xoaLoaiPhong(String MaLP) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        LoaiPhong_POJO lp = LoaiPhong_Controller.getLoaiPhong(MaLP);
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
    
    public static boolean capNhatLoaiPhong(LoaiPhong_POJO lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getLoaiPhong(lp.getMaLP()) == null) {
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
    //hàm lấy id
        public String LayMaLP()
        {
        ArrayList<LoaiPhong_POJO>  dsLP = new ArrayList<LoaiPhong_POJO>();       
        dsLP = LoaiPhong_Controller.getDSLoaiPhong();
        dsLP.get(dsLP.size()-1).getMaLP();
            return NextID(dsLP.get(dsLP.size()-1).getMaLP(), "LP");
        }
}

   
