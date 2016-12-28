/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.*;
import static java.awt.PageAttributes.MediaType.D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.V;
import javax.imageio.ImageIO;
import javax.swing.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public class TrangChu extends javax.swing.JFrame {

    JSeparator jSeparator_SD1;
    JSeparator jSeparator_SD2;
    JSeparator jSeparator_SD3;
    JSeparator jSeparator_SD4;

    JSeparator jSeparator_QL1;
    JSeparator jSeparator_QL2;
    JSeparator jSeparator_QL3;
    JSeparator jSeparator_QL4;
    JSeparator jSeparator_QL5;

    JSeparator jSeparator_BC1;
    JSeparator jSeparator_BC2;

//Component[] innerFrameComponents;
//Create các panel
    static TrangDatPhong trangDatPhong = new TrangDatPhong();
    static TraPhong traPhong = new TraPhong();
    static TinhTrangPhong tinhTrangPhong =  new TinhTrangPhong(); ;
    QuanLyDichVu quanLyDichVu = new QuanLyDichVu();
    QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
    QuanLyLoaiPhong quanLyLoaiPhong = new QuanLyLoaiPhong();
    QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
    QuanLyphong quanLyPhong = new QuanLyphong();
    QuanLyThuephong quanLyThuephong = new QuanLyThuephong();
    static SuDungDichVu suDungDichVu = new SuDungDichVu();
    XuatBaoCaoDoanhThu xuatBaoCaoDoanhThu = new XuatBaoCaoDoanhThu();

//creat Frame
    JFrame DMK = new DoiMatKhau();
    JFrame TKQL = new QuanLyTaiKhoan();

// user
    static TaiKhoanDangNhap tkTC;

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
         
       
    }

    public void Display(int i) {
        if (i == 0) {
            //add các menu item ben trai
            //Su Dung phong
            AddLabelTinhTrangPhong();
            AddLabelThuePhong();
            AddLabelSuDungDichVu();
            AddLabelDatPhong();
            AddLabelTraPhong();

            //Quan Ly Phong
            AddLabelQLLoaiPhong();
            AddLabelQLPhong();
            AddLabelQLNhanVien();
            AddLabelQLDichVu();
            AddLabelQLKhachHang();

            //Bao Cao
            AddLabelBCKhachHang();
            AddLabelBCNhanVien();
            AddLabelBCDoanhThu();
        }
        if (i == 1) {
            //add các menu item ben trai
            //Su Dung phong
            AddLabelTinhTrangPhong();
            AddLabelSuDungDichVu();
            AddLabelDatPhong();
            AddLabelTraPhong();

            Tab_tk.remove(QLTK);

        }

    }

    public static void SetCurrentUser(TaiKhoanDangNhap tk) {
        tkTC = new TaiKhoanDangNhap();
        tkTC.setMaTK(tk.getMaTK());
        tkTC.setMaNV(tk.getMaNV());
        tkTC.setLoaiTK(tk.getLoaiTK());
        tkTC.setUser(tk.getUser());
        tkTC.setPassWord(tk.getPassWord());
        tkTC.setNgayTao(tk.getNgayTao());
    }

    public static TaiKhoanDangNhap GetCurrentUser() {
        return tkTC;
    }
//Su Dung

    public void AddLabelTinhTrangPhong() {
        jSeparator_SD1 = new JSeparator();
        //add tình trạng phòng component to jxtaskpane
        final JLabel lb_TrinhTrangPhong = new JLabel("Tình Trạng Phòng");
        lb_TrinhTrangPhong.setSize(228, 150);
        lb_TrinhTrangPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Hotel_000000_25.png"));
        jXTaskPane_SDPhong.add(lb_TrinhTrangPhong);

        jXTaskPane_SDPhong.add(jSeparator_SD1);

        //set listener
        lb_TrinhTrangPhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              
                

//                LayerPane_Trai.add(tinhTrangPhong);
//                tinhTrangPhong.setVisible(true);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
            
                  LayerPane_Trai.add(tinhTrangPhong);
                tinhTrangPhong.setVisible(true);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);

//                int i =jLayeredPane1.getLayer(tinhTrangPhong);
//                jLayeredPane1.getComponent(i).setVisible(true);
//              jLayeredPane1.moveToFront(tinhTrangPhong);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_TrinhTrangPhong.setFont(new Font(lb_TrinhTrangPhong.getFont().getName(), Font.ITALIC, lb_TrinhTrangPhong.getFont().getSize()));
                lb_TrinhTrangPhong.setForeground(Color.red);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_TrinhTrangPhong.setFont(new Font(lb_TrinhTrangPhong.getFont().getName(), Font.PLAIN, lb_TrinhTrangPhong.getFont().getSize()));
                lb_TrinhTrangPhong.setForeground(Color.black);
            }

        });
    }

    public void AddLabelSuDungDichVu() {
        jSeparator_SD2 = new JSeparator();
        //Sử dụng dịch vụ
        final JLabel lb_SuDungDichVu = new JLabel("Sử Dụng Dịch Vụ");
        lb_SuDungDichVu.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Service Bell_000000_25.png"));
        jXTaskPane_SDPhong.add(lb_SuDungDichVu);

        jXTaskPane_SDPhong.add(jSeparator_SD2);

        // set listener
        lb_SuDungDichVu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                 LayerPane_Trai.add(suDungDichVu);
//                suDungDichVu.setVisible(true);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
                
                LayerPane_Trai.add(suDungDichVu);
                tinhTrangPhong.setVisible(false);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(true);
                xuatBaoCaoDoanhThu.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_SuDungDichVu.setFont(new Font(lb_SuDungDichVu.getFont().getName(), Font.ITALIC, lb_SuDungDichVu.getFont().getSize()));
                lb_SuDungDichVu.setForeground(Color.red);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_SuDungDichVu.setFont(new Font(lb_SuDungDichVu.getFont().getName(), Font.PLAIN, lb_SuDungDichVu.getFont().getSize()));
                lb_SuDungDichVu.setForeground(Color.black);
            }
        });
    }

    public void AddLabelDatPhong() {
        jSeparator_SD3 = new JSeparator();
        //Dat phong  tru
        final JLabel lb_DatPhong = new JLabel("Đặt Phòng  ");
        lb_DatPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Police Station_000000_25.png"));
        jXTaskPane_SDPhong.add(lb_DatPhong);

        jXTaskPane_SDPhong.add(jSeparator_SD3);

        //gan listener
        lb_DatPhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                 LayerPane_Trai.add(trangDatPhong);
//                trangDatPhong.setVisible(true);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
                
                LayerPane_Trai.add(trangDatPhong);
                trangDatPhong.setVisible(true);
                traPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_DatPhong.setFont(new Font(lb_DatPhong.getFont().getName(), Font.ITALIC, lb_DatPhong.getFont().getSize()));
                lb_DatPhong.setForeground(Color.red);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_DatPhong.setFont(new Font(lb_DatPhong.getFont().getName(), Font.PLAIN, lb_DatPhong.getFont().getSize()));
                lb_DatPhong.setForeground(Color.black);
            }
        });
    }

    public void AddLabelTraPhong() {
        //Tra Phon
        final JLabel lb_TraPhong = new JLabel("Trả Phòng  ");
        lb_TraPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\traphong.png"));
        jXTaskPane_SDPhong.add(lb_TraPhong);

        //set listener
        lb_TraPhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                 LayerPane_Trai.add(traPhong);
//                traPhong.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
                
                LayerPane_Trai.add(traPhong);
                traPhong.setVisible(true);
                trangDatPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_TraPhong.setFont(new Font(lb_TraPhong.getFont().getName(), Font.ITALIC, lb_TraPhong.getFont().getSize()));
                lb_TraPhong.setForeground(Color.red);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_TraPhong.setFont(new Font(lb_TraPhong.getFont().getName(), Font.PLAIN, lb_TraPhong.getFont().getSize()));
                lb_TraPhong.setForeground(Color.black);
            }
        });

    }

    public void AddLabelThuePhong() {
        jSeparator_SD4 = new JSeparator();
        //thue Phon
        final JLabel lb_ThuePhong = new JLabel("Thuê Phòng  ");
        lb_ThuePhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\thuephong.png"));
        jXTaskPane_SDPhong.add(lb_ThuePhong);
        jXTaskPane_SDPhong.add(jSeparator_SD4);
        //set listener
        lb_ThuePhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                LayerPane_Trai.add(quanLyThuephong);
//                quanLyThuephong.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
//                
                LayerPane_Trai.add(quanLyThuephong);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(true);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_ThuePhong.setFont(new Font(lb_ThuePhong.getFont().getName(), Font.ITALIC, lb_ThuePhong.getFont().getSize()));
                lb_ThuePhong.setForeground(Color.red);

            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_ThuePhong.setFont(new Font(lb_ThuePhong.getFont().getName(), Font.PLAIN, lb_ThuePhong.getFont().getSize()));
                lb_ThuePhong.setForeground(Color.black);
            }
        });
    }

//Quan ly
//chua co panel
    public void AddLabelQLLoaiPhong() {
        jSeparator_QL2 = new JSeparator();
        // QL Loai Phong
        final JLabel lb_QLLoaiPhong = new JLabel("Quản Lý Loại Phòng  ");
        lb_QLLoaiPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\loaiphong.png"));
        jXTaskPane_QuanLy.add(lb_QLLoaiPhong);
        jXTaskPane_QuanLy.add(jSeparator_QL2);

        //set listener
        lb_QLLoaiPhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                  LayerPane_Trai.add(quanLyLoaiPhong);
//                quanLyLoaiPhong.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
                
                LayerPane_Trai.add(quanLyLoaiPhong);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(true);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_QLLoaiPhong.setFont(new Font(lb_QLLoaiPhong.getFont().getName(), Font.ITALIC, lb_QLLoaiPhong.getFont().getSize()));
                lb_QLLoaiPhong.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_QLLoaiPhong.setFont(new Font(lb_QLLoaiPhong.getFont().getName(), Font.PLAIN, lb_QLLoaiPhong.getFont().getSize()));
                lb_QLLoaiPhong.setForeground(Color.black);
            }

        });
    }

    public void AddLabelQLNhanVien() {
        jSeparator_QL3 = new JSeparator();
        // QL nhan vien
        final JLabel lb_QLNhanVien = new JLabel("Quản Lý Nhân Viên  ");
        lb_QLNhanVien.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\nhanvien.png"));
        jXTaskPane_QuanLy.add(lb_QLNhanVien);
        jXTaskPane_QuanLy.add(jSeparator_QL3);

        //set listener
        lb_QLNhanVien.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                  LayerPane_Trai.add(quanLyNhanVien);
//                quanLyNhanVien.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
//                
                LayerPane_Trai.add(quanLyNhanVien);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(true);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_QLNhanVien.setFont(new Font(lb_QLNhanVien.getFont().getName(), Font.ITALIC, lb_QLNhanVien.getFont().getSize()));
                lb_QLNhanVien.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_QLNhanVien.setFont(new Font(lb_QLNhanVien.getFont().getName(), Font.PLAIN, lb_QLNhanVien.getFont().getSize()));
                lb_QLNhanVien.setForeground(Color.black);
            }
        });
    }

    public void AddLabelQLDichVu() {
        jSeparator_QL4 = new JSeparator();
        // QL Dich Vu
        final JLabel lb_QLDichVu = new JLabel("Quản Lý Dịch Vụ  ");
        lb_QLDichVu.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\dichvu.png"));
        jXTaskPane_QuanLy.add(lb_QLDichVu);
        jXTaskPane_QuanLy.add(jSeparator_QL4);
        //set listener
        lb_QLDichVu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                   LayerPane_Trai.add(quanLyDichVu);
//                quanLyDichVu.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
                
                LayerPane_Trai.add(quanLyDichVu);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(true);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_QLDichVu.setFont(new Font(lb_QLDichVu.getFont().getName(), Font.ITALIC, lb_QLDichVu.getFont().getSize()));
                lb_QLDichVu.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_QLDichVu.setFont(new Font(lb_QLDichVu.getFont().getName(), Font.PLAIN, lb_QLDichVu.getFont().getSize()));
                lb_QLDichVu.setForeground(Color.black);
            }
        });
    }

    public void AddLabelQLKhachHang() {
        // QL Khach Hang
        final JLabel lb_QLKhachHang = new JLabel("Quản Lý Khách Hàng  ");
        lb_QLKhachHang.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\quanlynv.png"));
        jXTaskPane_QuanLy.add(lb_QLKhachHang);

        //set listener
        lb_QLKhachHang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                    LayerPane_Trai.add(quanLyKhachHang);
//                quanLyKhachHang.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyPhong);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
                
                LayerPane_Trai.add(quanLyKhachHang);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(true);
                quanLyPhong.setVisible(false);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_QLKhachHang.setFont(new Font(lb_QLKhachHang.getFont().getName(), Font.ITALIC, lb_QLKhachHang.getFont().getSize()));
                lb_QLKhachHang.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_QLKhachHang.setFont(new Font(lb_QLKhachHang.getFont().getName(), Font.PLAIN, lb_QLKhachHang.getFont().getSize()));
                lb_QLKhachHang.setForeground(Color.black);
            }
        });
    }

    public void AddLabelQLPhong() {
        jSeparator_QL5 = new JSeparator();
        // QL Khach Hang
        final JLabel lb_QLPhong = new JLabel("Quản Lý Phòng ");
        lb_QLPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\phong.png"));
        jXTaskPane_QuanLy.add(lb_QLPhong);
        jXTaskPane_QuanLy.add(jSeparator_QL5);

        //set listener
        lb_QLPhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                LayerPane_Trai.add(quanLyPhong);
//                quanLyPhong.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(xuatBaoCaoDoanhThu);
                
                LayerPane_Trai.add(quanLyPhong);
                traPhong.setVisible(false);
                trangDatPhong.setVisible(false);
                tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
                quanLyLoaiPhong.setVisible(false);
                quanLyNhanVien.setVisible(false);
                quanLyKhachHang.setVisible(false);
                quanLyPhong.setVisible(true);
                quanLyThuephong.setVisible(false);
                suDungDichVu.setVisible(false);
                xuatBaoCaoDoanhThu.setVisible(false);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_QLPhong.setFont(new Font(lb_QLPhong.getFont().getName(), Font.ITALIC, lb_QLPhong.getFont().getSize()));
                lb_QLPhong.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_QLPhong.setFont(new Font(lb_QLPhong.getFont().getName(), Font.PLAIN, lb_QLPhong.getFont().getSize()));
                lb_QLPhong.setForeground(Color.black);
            }
        });
    }

//Bao cao
    public void AddLabelBCKhachHang() {
        jSeparator_BC1 = new JSeparator();
        // QL Loai Phong
        final JLabel lb_BCKhachHang = new JLabel("Báo Cáo Khách Hàng  ");
        lb_BCKhachHang.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\customer.png"));
        jXTaskPane_BaoCao.add(lb_BCKhachHang);
        jXTaskPane_BaoCao.add(jSeparator_BC1);
        //set listener
        lb_BCKhachHang.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Xuất báo cáo
                try {

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection("jdbc:sqlserver://TUAN_ANH:49612;databaseName=QLKS", "sa", "123456");
                    JasperReport jr = JasperCompileManager.compileReport("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\src\\examples\\khachhang.jrxml");
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                    JasperViewer.viewReport(jp, false);
                } catch (Exception f) {
                    System.out.print(f);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_BCKhachHang.setFont(new Font(lb_BCKhachHang.getFont().getName(), Font.ITALIC, lb_BCKhachHang.getFont().getSize()));
                lb_BCKhachHang.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_BCKhachHang.setFont(new Font(lb_BCKhachHang.getFont().getName(), Font.PLAIN, lb_BCKhachHang.getFont().getSize()));
                lb_BCKhachHang.setForeground(Color.black);
            }
        });
    }

    public void AddLabelBCNhanVien() {
        jSeparator_BC2 = new JSeparator();
        // QL Loai Phong
        final JLabel lb_BCNhanVien = new JLabel("Báo Cáo Nhân Viên ");
        lb_BCNhanVien.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\bcnhanvien.png"));
        jXTaskPane_BaoCao.add(lb_BCNhanVien);
        jXTaskPane_BaoCao.add(jSeparator_BC2);

        //set listener
        lb_BCNhanVien.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                //Xuất báo cáo
                try {
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                    java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection("jdbc:sqlserver://TUAN_ANH:49612;databaseName=QLKS", "sa", "123456");
                    JasperReport jr = JasperCompileManager.compileReport("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\src\\examples\\report1.jrxml");
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                    JasperViewer.viewReport(jp, false);
                } catch (Exception f) {
                    System.out.print(f);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_BCNhanVien.setFont(new Font(lb_BCNhanVien.getFont().getName(), Font.ITALIC, lb_BCNhanVien.getFont().getSize()));
                lb_BCNhanVien.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_BCNhanVien.setFont(new Font(lb_BCNhanVien.getFont().getName(), Font.PLAIN, lb_BCNhanVien.getFont().getSize()));
                lb_BCNhanVien.setForeground(Color.black);
            }
        });
    }

    public void AddLabelBCDoanhThu() {
        // QL Loai Phong
        final JLabel lb_BCDoanhThu = new JLabel("Báo Cáo Doanh Thu ");
        lb_BCDoanhThu.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\bcdoanhthu.png"));
        jXTaskPane_BaoCao.add(lb_BCDoanhThu);

        //set listener
        lb_BCDoanhThu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Xuất báo cáo
                //Xuất báo cáo
//                 LayerPane_Trai.add(xuatBaoCaoDoanhThu);
//                xuatBaoCaoDoanhThu.setVisible(true);
//                LayerPane_Trai.remove(trangDatPhong);
//                LayerPane_Trai.remove(suDungDichVu);
//                LayerPane_Trai.remove(quanLyNhanVien);
//                LayerPane_Trai.remove(quanLyThuephong);
//                LayerPane_Trai.remove(quanLyLoaiPhong);
//                LayerPane_Trai.remove(quanLyDichVu);
//                LayerPane_Trai.remove(quanLyKhachHang);
//                LayerPane_Trai.remove(traPhong);
//                LayerPane_Trai.remove(tinhTrangPhong);
//                LayerPane_Trai.remove(quanLyPhong);
                
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                lb_BCDoanhThu.setFont(new Font(lb_BCDoanhThu.getFont().getName(), Font.ITALIC, lb_BCDoanhThu.getFont().getSize()));
                lb_BCDoanhThu.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lb_BCDoanhThu.setFont(new Font(lb_BCDoanhThu.getFont().getName(), Font.PLAIN, lb_BCDoanhThu.getFont().getSize()));
                lb_BCDoanhThu.setForeground(Color.black);
            }
        });
    }

    public static JLayeredPane getPanel() {
        return LayerPane_Trai;
    }

    public static JPanel getTraPhong() {
        return traPhong;
    }

    public static JPanel getDatPhong() {
        return trangDatPhong;
    }

    public static JPanel getTinhTrangPhong() {
        return tinhTrangPhong;
    }
    public static JPanel getSuDungDV(){
        return suDungDichVu;
    } 
    
   
//public static JPanel getSuDungPhong(){
//    return SuDungDichVu;
//}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab_tk = new javax.swing.JTabbedPane();
        TK = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_DoiMatKhau = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_DangXuat = new javax.swing.JButton();
        QLTK = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_QLTaiKhoan = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jXTaskPane_SDPhong = new org.jdesktop.swingx.JXTaskPane();
        jXTaskPane_QuanLy = new org.jdesktop.swingx.JXTaskPane();
        jXTaskPane_BaoCao = new org.jdesktop.swingx.JXTaskPane();
        LayerPane_Trai = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Khách Sạn");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 730));

        jToolBar2.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Circled User Male_48px.png"))); // NOI18N
        jButton2.setText("Xem Tài Khoản");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(5);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton2);
        jToolBar2.add(jSeparator1);

        btn_DoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Data Encryption_48px.png"))); // NOI18N
        btn_DoiMatKhau.setText("Đổi Mật Khẩu");
        btn_DoiMatKhau.setFocusable(false);
        btn_DoiMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_DoiMatKhau.setIconTextGap(5);
        btn_DoiMatKhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_DoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DoiMatKhauMouseClicked(evt);
            }
        });
        jToolBar2.add(btn_DoiMatKhau);
        jToolBar2.add(jSeparator2);

        btn_DangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Safe Out_48px.png"))); // NOI18N
        btn_DangXuat.setText("Đăng Xuất");
        btn_DangXuat.setFocusable(false);
        btn_DangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_DangXuat.setIconTextGap(5);
        btn_DangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DangXuatMouseClicked(evt);
            }
        });
        jToolBar2.add(btn_DangXuat);

        javax.swing.GroupLayout TKLayout = new javax.swing.GroupLayout(TK);
        TK.setLayout(TKLayout);
        TKLayout.setHorizontalGroup(
            TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );
        TKLayout.setVerticalGroup(
            TKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
        );

        Tab_tk.addTab("Tài Khoản Của Tôi", TK);

        jToolBar1.setRollover(true);

        btn_QLTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Change User Male_48px.png"))); // NOI18N
        btn_QLTaiKhoan.setText("Quản Lý Tài Khoản");
        btn_QLTaiKhoan.setFocusable(false);
        btn_QLTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_QLTaiKhoan.setIconTextGap(5);
        btn_QLTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_QLTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QLTaiKhoanMouseClicked(evt);
            }
        });
        jToolBar1.add(btn_QLTaiKhoan);

        javax.swing.GroupLayout QLTKLayout = new javax.swing.GroupLayout(QLTK);
        QLTK.setLayout(QLTKLayout);
        QLTKLayout.setHorizontalGroup(
            QLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );
        QLTKLayout.setVerticalGroup(
            QLTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        Tab_tk.addTab("Quản Lý Tài Khoản", QLTK);

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setFocusable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setMaximumSize(new java.awt.Dimension(244, 515));

        jXTaskPane_SDPhong.setAutoscrolls(true);
        jXTaskPane_SDPhong.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        jXTaskPane_QuanLy.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        jXTaskPane_BaoCao.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXTaskPane_SDPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jXTaskPane_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTaskPane_BaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jXTaskPane_SDPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jXTaskPane_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXTaskPane_BaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 747, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel7);

        jSplitPane1.setLeftComponent(jScrollPane1);

        LayerPane_Trai.setToolTipText("");
        LayerPane_Trai.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/untitled folder/hinh2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        LayerPane_Trai.add(jLabel2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(LayerPane_Trai);

        fileMenu.setMnemonic('f');

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab_tk)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Tab_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btn_QLTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QLTaiKhoanMouseClicked
        // TODO add your handling code here:
        if (!TKQL.isVisible()) {
            TKQL.setVisible(true);
        } else {
            TKQL.setAlwaysOnTop(true);
        }


    }//GEN-LAST:event_btn_QLTaiKhoanMouseClicked

    private void btn_DoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DoiMatKhauMouseClicked
        // TODO add your handling code here:
        if (!DMK.isVisible()) {
            DMK.setVisible(true);
        } else {
            DMK.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_btn_DoiMatKhauMouseClicked

    private void btn_DangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DangXuatMouseClicked
        // TODO add your handling code here:
        new DangNhap().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_DangXuatMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLayeredPane LayerPane_Trai;
    private javax.swing.JPanel QLTK;
    private javax.swing.JPanel TK;
    private javax.swing.JTabbedPane Tab_tk;
    private javax.swing.JButton btn_DangXuat;
    private javax.swing.JButton btn_DoiMatKhau;
    private javax.swing.JButton btn_QLTaiKhoan;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane_BaoCao;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane_QuanLy;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane_SDPhong;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
