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
public class LoaiPhong_POJO {
    private String MaLP;
    private String LoaiPhong;
    private int SoGiuong;
    private Double DonGia;
    private String GhiChu;

    public LoaiPhong_POJO() {
    }
    public LoaiPhong_POJO(String malp, String loaiphong, int sogiuong, double dongia,String ghichu){
        MaLP = malp;
        LoaiPhong = loaiphong;
        SoGiuong = sogiuong;
        DonGia=dongia;
        GhiChu=ghichu;
    }
    
    public void setMaLP(String MaLP) {
        this.MaLP = MaLP;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    public void setSoGiuong(int SoGiuong) {
        this.SoGiuong = SoGiuong;
    }

    public void setDonGia(Double DonGia) {
        this.DonGia = DonGia;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaLP() {
        return MaLP;
    }

    public int getSoGiuong() {
        return SoGiuong;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }
}
