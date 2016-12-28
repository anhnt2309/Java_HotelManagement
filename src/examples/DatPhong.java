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
public class DatPhong {
    String MaDK;
    String MaNV;
    String MaPhong;
    String MaKH;
    Date NgayDK;
    Date NgayDen;
    int SoNguoi;

    public DatPhong() {
    }

    
    public DatPhong(String MaDK, String MaNV, String MaPhong, String MaKH, Date NgayDK, Date NgayDen, int SoNguoi) {
        this.MaDK = MaDK;
        this.MaNV = MaNV;
        this.MaPhong = MaPhong;
        this.MaKH = MaKH;
        this.NgayDK = NgayDK;
        this.NgayDen = NgayDen;
        this.SoNguoi = SoNguoi;
    }

    
    public String getMaDK() {
        return MaDK;
    }

    public void setMaDK(String MaDK) {
        this.MaDK = MaDK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public Date getNgayDK() {
        return NgayDK;
    }

    public void setNgayDK(Date NgayDK) {
        this.NgayDK = NgayDK;
    }

    public Date getNgayDen() {
        return NgayDen;
    }

    public void setNgayDen(Date NgayDen) {
        this.NgayDen = NgayDen;
    }

    public int getSoNguoi() {
        return SoNguoi;
    }

    public void setSoNguoi(int SoNguoi) {
        this.SoNguoi = SoNguoi;
    }

   
    
}
