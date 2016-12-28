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
public class ThuePhong_POJO {
    private String MaThuePhong;
    private String MaPhong;
    private Date NgayThue;
    private Date NgayTra;
    private long TienDV;

    public ThuePhong_POJO() {
    }

    public ThuePhong_POJO(String MaThuePhong, String MaPhong, Date NgayThue, Date NgayTra, long TienDV) {
        this.MaThuePhong = MaThuePhong;
        this.MaPhong = MaPhong;
        this.NgayThue = NgayThue;
        this.NgayTra = NgayTra;
        this.TienDV = TienDV;
    }

    public String getMaThuePhong() {
        return MaThuePhong;
    }

    public void setMaThuePhong(String MaThuePhong) {
        this.MaThuePhong = MaThuePhong;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public Date getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(Date NgayThue) {
        this.NgayThue = NgayThue;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public long getTienDV() {
        return TienDV;
    }

    public void setTienDV(long TienDV) {
        this.TienDV = TienDV;
    } 
}
