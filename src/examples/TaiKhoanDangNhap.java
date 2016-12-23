/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

// con java.util.Date
import java.sql.Date;

/**
 *
 * @author Dell
 */
public class TaiKhoanDangNhap {
  private String MaTK;
  private String MaNV;
  private String LoaiTK;
  private String User;
  private String PassWord;
  private Date NgayTao;

    public TaiKhoanDangNhap() {
    }

    public TaiKhoanDangNhap(String MaTK, String MaNV, String LoaiTK, String User, String PassWord, Date NgayTao) {
        this.MaTK = MaTK;
        this.MaNV = MaNV;
        this.LoaiTK = LoaiTK;
        this.User = User;
        this.PassWord = PassWord;
        this.NgayTao = NgayTao;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getLoaiTK() {
        return LoaiTK;
    }

    public void setLoaiTK(String LoaiTK) {
        this.LoaiTK = LoaiTK;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }
  
   

}
