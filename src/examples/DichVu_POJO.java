/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
public class DichVu_POJO {
    private String MaDV;
    private String TenDV;
    private long GiaDV;
    private String DVT;
    
    public DichVu_POJO() {
    }
    
    public DichVu_POJO(String MaDV, String TenDV, long GiaDV, String DVT) {
        this.MaDV = MaDV;
        this.TenDV = TenDV;
        this.GiaDV = GiaDV;
        this.DVT = DVT;
    }
    public String getMaDV() {
        return MaDV;
    }
    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }
    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public long getGiaDV() {
        return GiaDV;
    }

    public void setGiaDV(long GiaDV) {
        this.GiaDV = GiaDV;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }
}
