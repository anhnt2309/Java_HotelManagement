/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;
import static examples.NhanVien_Controller.NextID;
import static examples.ThuePhong_Controller.getThuePhong;
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
public class SDDichVu_Controller {
    public static SDDichVu_POJO getSDDV(String MaSDDV) {
        SDDichVu_POJO SD;
        SD = null;
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            SD = (SDDichVu_POJO) session.get(SDDichVu_POJO.class, MaSDDV);

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return SD;
    }
public static ArrayList<SDDichVu_POJO> getDSSD() {
        ArrayList<SDDichVu_POJO> dsSDDV = null;
       
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from SDDichVu_POJO";
            Query query = session.createQuery(sql);
            dsSDDV = (ArrayList<SDDichVu_POJO>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsSDDV;
    }
public static boolean themSDDV(SDDichVu_POJO sddv) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (SDDichVu_Controller.getSDDV(sddv.getMaSD()) != null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.save(sddv);
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
public static boolean xoaSDDV(String MaSD) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        SDDichVu_POJO sddv = SDDichVu_Controller.getSDDV(MaSD);
        if (sddv == null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.delete(sddv);
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
public static boolean capnhatSDDV(SDDichVu_POJO sddv) {
        Session session
                = HibernateSessionFactory.getSessionFactory().openSession();
        if (getSDDV(sddv.getMaSD()) == null) {
            return false;
        }
        Transaction trans = null;
        try {
            trans = session.beginTransaction();
            session.update(sddv);
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
        public String LayMaSD()
        {
             ArrayList<SDDichVu_POJO>  dsSD = new ArrayList<SDDichVu_POJO>();       
        dsSD = SDDichVu_Controller.getDSSD();
        dsSD.get(dsSD.size()-1).getMaSD();
            return NextID(dsSD.get(dsSD.size()-1).getMaSD(), "SD");
        }


public static ArrayList<SDDichVu_POJO> getDSSDTheoMa(String x,String MaSD) {
        ArrayList<SDDichVu_POJO> dsSD = null;
        Session session;
        session = HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql = "from SDDichVu_POJO where "+x+" = '"+MaSD+"'";
            Query query = session.createQuery(sql);
            dsSD = (ArrayList<SDDichVu_POJO>) query.list();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            session.flush();
            session.close();
        }
        return dsSD;
    }    
}
