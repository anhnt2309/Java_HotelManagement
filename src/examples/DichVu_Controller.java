/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;
import static examples.NhanVien_Controller.NextID;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dell
 */
public class DichVu_Controller {
    public DichVu_Controller() {
    }

    public static DichVu_POJO getDichVu(String MaDV) {
        DichVu_POJO DV;
        DV = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            DV = (DichVu_POJO) session.get(DichVu_POJO.class, MaDV);
           
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return DV;
    }
    public static ArrayList<DichVu_POJO> getDSDichVu() {
        ArrayList<DichVu_POJO> dsDV = null;
       
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from DichVu_POJO";
            Query query = session.createQuery(sql);
            dsDV = (ArrayList<DichVu_POJO>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsDV;
    }
    public static boolean themDichVu(DichVu_POJO lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (DichVu_Controller.getDichVu(lp.getMaDV()) != null) {
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
    public static boolean xoaDichVu(String MaDV) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        DichVu_POJO lp = DichVu_Controller.getDichVu(MaDV);
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
    public static boolean capnhatDichVu(DichVu_POJO lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getDichVu(lp.getMaDV()) == null) {
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
        public String LayMaDV()
        {
        ArrayList<DichVu_POJO>  dsDV = new ArrayList<DichVu_POJO>();       
        dsDV = DichVu_Controller.getDSDichVu();
        dsDV.get(dsDV.size()-1).getMaDV();
            return NextID(dsDV.get(dsDV.size()-1).getMaDV(), "DV");
        }
}
