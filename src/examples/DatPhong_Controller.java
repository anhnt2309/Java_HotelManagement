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
public class DatPhong_Controller {


    public static DatPhong getDP(String MaKH) {
        DatPhong KH;
        KH = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            KH = (DatPhong) session.get(DatPhong.class, MaKH);

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return KH;
    }

    public static ArrayList<DatPhong> getDSDP() {
        ArrayList<DatPhong> dsKH = null;
       
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from DatPhong";
            Query query = session.createQuery(sql);
            dsKH = (ArrayList<DatPhong>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsKH;
    }

    public static boolean themDP(DatPhong lp) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (DatPhong_Controller.getDP(lp.getMaKH()) != null) {
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
    public DatPhong_Controller() {
    }
    
    public static boolean xoaDP(String MaKH) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        DatPhong lp = DatPhong_Controller.getDP(MaKH);
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
    
    public static boolean capnhatDP(DatPhong kh) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getDP(kh.getMaDK()) == null) {
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
        public String LayMaDP()
        {
        ArrayList<DatPhong>  dsDP = new ArrayList<DatPhong>();       
        dsDP = DatPhong_Controller.getDSDP();
        dsDP.get(dsDP.size()-1).getMaDK();
            return NextID(dsDP.get(dsDP.size()-1).getMaDK(), "DK");
        }


public static ArrayList<DatPhong> getDSDatPhongTheoMa(String x,String MaDP) {
        ArrayList<DatPhong> dsDP = null;
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from DatPhong where "+x+" = '"+MaDP+"'";
            Query query = session.createQuery(sql);
            dsDP = (ArrayList<DatPhong>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsDP;
    }    
}

   
