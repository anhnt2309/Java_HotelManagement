/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class KhachHang {
    String MaKH;
    String TenKH;
    Date  NgSinhKH;
    String SDT;
    String QuocTich;
    String DiaChi;
    
      public KhachHang(String MaKH, String TenKH, Date NgSinhKH, String SDT, String QuocTich, String DiaChi) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.NgSinhKH = NgSinhKH;
        this.SDT = SDT;
        this.QuocTich = QuocTich;
        this.DiaChi = DiaChi;
    }

    public KhachHang() {
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public Date getNgSinhKH() {
        return NgSinhKH;
    }

    public void setNgSinhKH(Date NgSinhKH) {
        this.NgSinhKH = NgSinhKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

  
}
