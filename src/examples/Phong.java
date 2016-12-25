/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Dell
 */
public class Phong {
    String MaPhong;
    String MaLP;
    String TenPhong;
    String TinhTrang;

    public Phong() {
    }

    public Phong(String MaPhong, String MaLP, String TenPhong, String TinhTrang) {
        this.MaPhong = MaPhong;
        this.MaLP = MaLP;
        this.TenPhong = TenPhong;
        this.TinhTrang = TinhTrang;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getMaLP() {
        return MaLP;
    }

    public void setMaLP(String MaLP) {
        this.MaLP = MaLP;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
}
