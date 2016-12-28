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
public class SDDichVu_POJO {
    private String MaSD;
    private String MaDV;
    private String MaNV;
    private String MaTP;
    private Date NgaySD;
    private int SoLuong;
    private long TienSD;

    public SDDichVu_POJO() {
    }

    public SDDichVu_POJO(String MaSD, String MaDV, String MaNV, String MaTP, Date NgaySD, int SoLuong, long TienSD) {
        this.MaSD = MaSD;
        this.MaDV = MaDV;
        this.MaNV = MaNV;
        this.MaTP = MaTP;
        this.NgaySD = NgaySD;
        this.SoLuong = SoLuong;
        this.TienSD = TienSD;
    }

    public String getMaSD() {
        return MaSD;
    }

    public void setMaSD(String MaSD) {
        this.MaSD = MaSD;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaTP() {
        return MaTP;
    }

    public void setMaTP(String MaTP) {
        this.MaTP = MaTP;
    }

    public Date getNgaySD() {
        return NgaySD;
    }

    public void setNgaySD(Date NgaySD) {
        this.NgaySD = NgaySD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getTienSD() {
        return TienSD;
    }

    public void setTienSD(long TienSD) {
        this.TienSD = TienSD;
    }   
}
