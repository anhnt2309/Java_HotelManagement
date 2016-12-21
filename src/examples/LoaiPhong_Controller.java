/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import examples.LoaiPhong_POJO;
import java.awt.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Query;

/**
 *
 * @author Dell
 */
public class LoaiPhong_Controller {

    public LoaiPhong_Controller() {
    }
    
      public static LoaiPhong_POJO  getLoaiPhong(String MaLP){
        LoaiPhong_POJO  LP;
        LP = null;
        Session session =
                HibernateSessionFactory.getSessionFactory().openSession();
        try {
            LP =(LoaiPhong_POJO) session.get(LoaiPhong_POJO.class, MaLP);
            
        } catch (Exception e) {
            System.err.println(e);
        }
        finally{
            session.flush();
            session.close();
        }
        return LP;
    }
      public static ArrayList<LoaiPhong_POJO>  getDSLoaiPhong(){
        ArrayList<LoaiPhong_POJO>  dsLP = null;
        dsLP = null;
        Session session =
                HibernateSessionFactory.getSessionFactory().openSession();
        try {
            String sql="from LoaiPhong_POJO";           
            Query query = session.createQuery(sql);
            dsLP =(ArrayList<LoaiPhong_POJO>) query.list();
            
            
        } catch (Exception e) {
            System.err.println(e);
        }
        finally{
            session.flush();
            session.close();
        }
        return dsLP;
    }
}
