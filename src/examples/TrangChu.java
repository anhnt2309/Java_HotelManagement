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
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class TrangChu extends javax.swing.JFrame {
 JSeparator jSeparator_SD1 ;
 JSeparator jSeparator_SD2 ;
 JSeparator jSeparator_SD3 ;
 
 JSeparator jSeparator_QL1 ;
 JSeparator jSeparator_QL2 ;
 JSeparator jSeparator_QL3;
 JSeparator jSeparator_QL4;
 
 JSeparator jSeparator_BC1;
 JSeparator jSeparator_BC2;

//Component[] innerFrameComponents;
//Create các panel
TrangDatPhong trangDatPhong = new TrangDatPhong();
TraPhong traPhong = new TraPhong();
TinhTrangPhong tinhTrangPhong = new TinhTrangPhong();
QuanLyDichVu quanLyDichVu = new QuanLyDichVu();
QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
QuanLyLoaiPhong quanLyLoaiPhong = new QuanLyLoaiPhong();
QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        //add các menu item ben trai
        //Su Dung phong
        AddLabelTinhTrangPhong();
        AddLabelSuDungDichVu();
        AddLabelDatPhong();
        AddLabelTraPhong();
        
        //Quan Ly Phong
        AddLabelQLLoaiPhong();
        AddLabelQLNhanVien();
        AddLabelQLDichVu();
        AddLabelQLKhachHang();
        
        //Bao Cao
        AddLabelBCKhachHang();
        AddLabelBCNhanVien();
        AddLabelBCDoanhThu();
        
        
        
        ArrayList<LoaiPhong_POJO>  dsLP = new ArrayList<LoaiPhong_POJO>();
        
        dsLP = LoaiPhong_Controller.getDSLoaiPhong();
        for (int i = 0 ; i< dsLP.size(); i++){
        System.out.println("Malp: "+ dsLP.get(i).getMaLP());
        System.out.println("Loai Phong: " + dsLP.get(i).getLoaiPhong());
        System.out.println("So Giuong: "+dsLP.get(i).getSoGiuong());
        System.out.println("Don Gia: "+dsLP.get(i).getDonGia());
    }
    }
//Su Dung
public void AddLabelTinhTrangPhong(){
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
            
              LayerPane_Trai.add(tinhTrangPhong);
               tinhTrangPhong.setVisible(true);
                traPhong.setVisible(false);
               trangDatPhong.setVisible(false);
               quanLyDichVu.setVisible(false);
               quanLyLoaiPhong.setVisible(false);
               quanLyNhanVien.setVisible(false);
               quanLyKhachHang.setVisible(false);
               
//                int i =jLayeredPane1.getLayer(tinhTrangPhong);
//                jLayeredPane1.getComponent(i).setVisible(true);
//              jLayeredPane1.moveToFront(tinhTrangPhong);
         }
          @Override
             public void mouseEntered(MouseEvent e) {
                lb_TrinhTrangPhong.setFont(new Font(lb_TrinhTrangPhong.getFont().getName(),Font.ITALIC, 20));
                lb_TrinhTrangPhong.setForeground(Color.red);
                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_TrinhTrangPhong.setFont(new Font(lb_TrinhTrangPhong.getFont().getName(),Font.PLAIN, lb_TrinhTrangPhong.getFont().getSize()));
                 lb_TrinhTrangPhong.setForeground(Color.black);
            }
         
});
}
public void AddLabelSuDungDichVu(){
    jSeparator_SD2 = new JSeparator();
    //Sử dụng dịch vụ 
        final  JLabel lb_SuDungDichVu = new JLabel("Sử Dụng Dịch ");
        lb_SuDungDichVu.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Service Bell_000000_25.png"));
        jXTaskPane_SDPhong.add(lb_SuDungDichVu);
        
         jXTaskPane_SDPhong.add(jSeparator_SD2);
         
    // set listener
    lb_SuDungDichVu.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e); //To change body of generated methods, choose Tools | Templates.
        }
         @Override
             public void mouseEntered(MouseEvent e) {
                lb_SuDungDichVu.setFont(new Font(lb_SuDungDichVu.getFont().getName(),Font.ITALIC, lb_SuDungDichVu.getFont().getSize()));
                lb_SuDungDichVu.setForeground(Color.red);
                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_SuDungDichVu.setFont(new Font(lb_SuDungDichVu.getFont().getName(),Font.PLAIN, lb_SuDungDichVu.getFont().getSize()));
                 lb_SuDungDichVu.setForeground(Color.black);
            }
    });
}
public void AddLabelDatPhong(){
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
               
                 LayerPane_Trai.add(trangDatPhong);
                 trangDatPhong.setVisible(true);             
                  traPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
               quanLyLoaiPhong.setVisible(false);
               quanLyNhanVien.setVisible(false);
               quanLyKhachHang.setVisible(false);

            }
             @Override
             public void mouseEntered(MouseEvent e) {
                lb_DatPhong.setFont(new Font(lb_DatPhong.getFont().getName(),Font.ITALIC, lb_DatPhong.getFont().getSize()));
                lb_DatPhong.setForeground(Color.red);
                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_DatPhong.setFont(new Font(lb_DatPhong.getFont().getName(),Font.PLAIN, lb_DatPhong.getFont().getSize()));
                 lb_DatPhong.setForeground(Color.black);
            }
    });
}
public void AddLabelTraPhong(){
     //Tra Phon
        final JLabel lb_TraPhong = new JLabel("Trả Phòng  ");
        lb_TraPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_SDPhong.add(lb_TraPhong);
       
     //set listener
     lb_TraPhong.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                LayerPane_Trai.add(traPhong);
               traPhong.setVisible(true);
               trangDatPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
               quanLyLoaiPhong.setVisible(false);
               quanLyNhanVien.setVisible(false);
               quanLyKhachHang.setVisible(false);
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_TraPhong.setFont(new Font(lb_TraPhong.getFont().getName(),Font.ITALIC, lb_TraPhong.getFont().getSize()));
                lb_TraPhong.setForeground(Color.red);
                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_TraPhong.setFont(new Font(lb_TraPhong.getFont().getName(),Font.PLAIN, lb_TraPhong.getFont().getSize()));
                 lb_TraPhong.setForeground(Color.black);
            }        
    });
        
}

//Quan ly
//chua co panel
public void AddLabelQLPhong(){
    jSeparator_QL1 = new JSeparator();
     // Phong
        final JLabel lb_QLPhong = new JLabel("Quản lý Phòng  ");
        lb_QLPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_QuanLy.add(lb_QLPhong);
        jXTaskPane_QuanLy.add(jSeparator_QL1);
       
     //set listener
     lb_QLPhong.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                LayerPane_Trai.add(traPhong);
               traPhong.setVisible(true);
               trangDatPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);                
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_QLPhong.setFont(new Font(lb_QLPhong.getFont().getName(),Font.ITALIC, lb_QLPhong.getFont().getSize()));
                lb_QLPhong.setForeground(Color.red);
                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_QLPhong.setFont(new Font(lb_QLPhong.getFont().getName(),Font.PLAIN, lb_QLPhong.getFont().getSize()));
                 lb_QLPhong.setForeground(Color.black);
            }        
    });
        
}

public void AddLabelQLLoaiPhong(){
    jSeparator_QL2 = new JSeparator();
    // QL Loai Phong
        final JLabel lb_QLLoaiPhong = new JLabel("Quản Lý Loại Phòng  ");
        lb_QLLoaiPhong.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_QuanLy.add(lb_QLLoaiPhong);
        jXTaskPane_QuanLy.add(jSeparator_QL2);
       
     //set listener
     lb_QLLoaiPhong.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                LayerPane_Trai.add(quanLyLoaiPhong);
               traPhong.setVisible(false);
               trangDatPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
               quanLyLoaiPhong.setVisible(true);
               quanLyNhanVien.setVisible(false);    
               quanLyKhachHang.setVisible(false);
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_QLLoaiPhong.setFont(new Font(lb_QLLoaiPhong.getFont().getName(),Font.ITALIC, lb_QLLoaiPhong.getFont().getSize()));
                lb_QLLoaiPhong.setForeground(Color.red);                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_QLLoaiPhong.setFont(new Font(lb_QLLoaiPhong.getFont().getName(),Font.PLAIN, lb_QLLoaiPhong.getFont().getSize()));
                 lb_QLLoaiPhong.setForeground(Color.black);
            }        
    });
}
public void AddLabelQLNhanVien(){
    jSeparator_QL3 = new JSeparator();
      // QL nhan vien
        final JLabel lb_QLNhanVien = new JLabel("Quản Lý Nhân Viên  ");
        lb_QLNhanVien.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_QuanLy.add(lb_QLNhanVien);
        jXTaskPane_QuanLy.add(jSeparator_QL3);
       
     //set listener
     lb_QLNhanVien.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                LayerPane_Trai.add(quanLyNhanVien);
               traPhong.setVisible(false);
               trangDatPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(false);
               quanLyLoaiPhong.setVisible(false);
               quanLyNhanVien.setVisible(true);              
               quanLyKhachHang.setVisible(false);
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_QLNhanVien.setFont(new Font(lb_QLNhanVien.getFont().getName(),Font.ITALIC, lb_QLNhanVien.getFont().getSize()));
                lb_QLNhanVien.setForeground(Color.red);                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_QLNhanVien.setFont(new Font(lb_QLNhanVien.getFont().getName(),Font.PLAIN, lb_QLNhanVien.getFont().getSize()));
                 lb_QLNhanVien.setForeground(Color.black);
            }        
    });
}
public void AddLabelQLDichVu(){
    jSeparator_QL4 = new JSeparator();
    // QL Dich Vu
        final JLabel lb_QLDichVu = new JLabel("Quản Lý Dịch Vụ  ");
        lb_QLDichVu.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_QuanLy.add(lb_QLDichVu);
        jXTaskPane_QuanLy.add(jSeparator_QL4);
     //set listener
     lb_QLDichVu.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                LayerPane_Trai.add(quanLyDichVu);
               traPhong.setVisible(true);
               trangDatPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(true);
               quanLyLoaiPhong.setVisible(false);
               quanLyNhanVien.setVisible(false); 
               quanLyKhachHang.setVisible(false);
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_QLDichVu.setFont(new Font(lb_QLDichVu.getFont().getName(),Font.ITALIC, lb_QLDichVu.getFont().getSize()));
                lb_QLDichVu.setForeground(Color.red);                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_QLDichVu.setFont(new Font(lb_QLDichVu.getFont().getName(),Font.PLAIN, lb_QLDichVu.getFont().getSize()));
                 lb_QLDichVu.setForeground(Color.black);
            }        
    });
}
public void AddLabelQLKhachHang(){
     // QL Khach Hang
        final JLabel lb_QLKhachHang = new JLabel("Quản Lý Khách Hàng  ");
        lb_QLKhachHang.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_QuanLy.add(lb_QLKhachHang);
       
     //set listener
     lb_QLKhachHang.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                LayerPane_Trai.add(quanLyKhachHang);
               traPhong.setVisible(true);
               trangDatPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
                quanLyDichVu.setVisible(true);
               quanLyLoaiPhong.setVisible(false);
               quanLyNhanVien.setVisible(false);   
               quanLyKhachHang.setVisible(true);
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_QLKhachHang.setFont(new Font(lb_QLKhachHang.getFont().getName(),Font.ITALIC, lb_QLKhachHang.getFont().getSize()));
                lb_QLKhachHang.setForeground(Color.red);                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_QLKhachHang.setFont(new Font(lb_QLKhachHang.getFont().getName(),Font.PLAIN, lb_QLKhachHang.getFont().getSize()));
                 lb_QLKhachHang.setForeground(Color.black);
            }        
    });
}

//Bao cao
public void AddLabelBCKhachHang(){
    jSeparator_BC1 = new JSeparator();
     // QL Loai Phong
        final JLabel lb_BCKhachHang = new JLabel("Báo Cáo Khách Hàng  ");
        lb_BCKhachHang.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_BaoCao.add(lb_BCKhachHang);
        jXTaskPane_BaoCao.add(jSeparator_BC1);
     //set listener
     lb_BCKhachHang.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
             //Xuất báo cáo           
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_BCKhachHang.setFont(new Font(lb_BCKhachHang.getFont().getName(),Font.ITALIC, lb_BCKhachHang.getFont().getSize()));
                lb_BCKhachHang.setForeground(Color.red);                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_BCKhachHang.setFont(new Font(lb_BCKhachHang.getFont().getName(),Font.PLAIN, lb_BCKhachHang.getFont().getSize()));
                 lb_BCKhachHang.setForeground(Color.black);
            }        
    });
}
public void AddLabelBCNhanVien(){
    jSeparator_BC2 = new JSeparator();
     // QL Loai Phong
        final JLabel lb_BCNhanVien = new JLabel("Báo Cáo Nhân Viên ");
        lb_BCNhanVien.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_BaoCao.add(lb_BCNhanVien);
        jXTaskPane_BaoCao.add(jSeparator_BC2);
       
     //set listener
     lb_BCNhanVien.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
             //Xuất báo cáo           
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_BCNhanVien.setFont(new Font(lb_BCNhanVien.getFont().getName(),Font.ITALIC, lb_BCNhanVien.getFont().getSize()));
                lb_BCNhanVien.setForeground(Color.red);                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_BCNhanVien.setFont(new Font(lb_BCNhanVien.getFont().getName(),Font.PLAIN, lb_BCNhanVien.getFont().getSize()));
                 lb_BCNhanVien.setForeground(Color.black);
            }        
    });
}
public void AddLabelBCDoanhThu(){
    // QL Loai Phong
        final JLabel lb_BCDoanhThu = new JLabel("Báo Cáo Doanh Thu ");
        lb_BCDoanhThu.setIcon(new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));
        jXTaskPane_BaoCao.add(lb_BCDoanhThu);
       
     //set listener
     lb_BCDoanhThu.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
             //Xuất báo cáo           
             }

             @Override
             public void mouseEntered(MouseEvent e) {
                lb_BCDoanhThu.setFont(new Font(lb_BCDoanhThu.getFont().getName(),Font.ITALIC, lb_BCDoanhThu.getFont().getSize()));
                lb_BCDoanhThu.setForeground(Color.red);                
             }

            @Override
            public void mouseExited(MouseEvent e) {
                 lb_BCDoanhThu.setFont(new Font(lb_BCDoanhThu.getFont().getName(),Font.PLAIN, lb_BCDoanhThu.getFont().getSize()));
                 lb_BCDoanhThu.setForeground(Color.black);
            }        
    });
}
   /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_DoiMatKhau = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_QuenMatKhau = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_QLTaiKhoan = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jXTaskPane_SDPhong = new org.jdesktop.swingx.JXTaskPane();
        jXTaskPane_QuanLy = new org.jdesktop.swingx.JXTaskPane();
        jXTaskPane_BaoCao = new org.jdesktop.swingx.JXTaskPane();
        LayerPane_Trai = new javax.swing.JLayeredPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Khách Sạn");
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

        btn_QuenMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Re-Enter Pincode_48px.png"))); // NOI18N
        btn_QuenMatKhau.setText("Quên Mật Khẩu");
        btn_QuenMatKhau.setFocusable(false);
        btn_QuenMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_QuenMatKhau.setIconTextGap(5);
        btn_QuenMatKhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_QuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuenMatKhauMouseClicked(evt);
            }
        });
        jToolBar2.add(btn_QuenMatKhau);
        jToolBar2.add(jSeparator3);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Safe Out_48px.png"))); // NOI18N
        jButton3.setText("Đăng Xuất");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(5);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tài Khoản Của Tôi", jPanel1);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản Lý Tài Khoản", jPanel2);

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setFocusable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setMaximumSize(new java.awt.Dimension(244, 515));

        jXTaskPane_SDPhong.setAutoscrolls(true);
        jXTaskPane_SDPhong.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jXTaskPane_SDPhong.setTitle("Sử Dụng Phòng");

        jXTaskPane_QuanLy.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jXTaskPane_QuanLy.setTitle("Quản Lý");

        jXTaskPane_BaoCao.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jXTaskPane_BaoCao.setTitle("Báo Cáo");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPane_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPane_BaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 747, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel7);

        jSplitPane1.setLeftComponent(jScrollPane1);

        LayerPane_Trai.setToolTipText("");
        LayerPane_Trai.setLayout(new java.awt.BorderLayout());
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
            .addComponent(jTabbedPane1)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       
                new QuanLyTaiKhoan().setVisible(true);
               
    }//GEN-LAST:event_btn_QLTaiKhoanMouseClicked

    private void btn_DoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DoiMatKhauMouseClicked
        // TODO add your handling code here:
        new DoiMatKhau().setVisible(true);
    }//GEN-LAST:event_btn_DoiMatKhauMouseClicked

    private void btn_QuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuenMatKhauMouseClicked
        // TODO add your handling code here:\
        new QuenMatKhau().setVisible(true);
        
    }//GEN-LAST:event_btn_QuenMatKhauMouseClicked
 
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
    private javax.swing.JLayeredPane LayerPane_Trai;
    private javax.swing.JButton btn_DoiMatKhau;
    private javax.swing.JButton btn_QLTaiKhoan;
    private javax.swing.JButton btn_QuenMatKhau;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
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
