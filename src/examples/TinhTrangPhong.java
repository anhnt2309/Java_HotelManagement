/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

/**
 *
 * @author admin
 */
public class TinhTrangPhong extends javax.swing.JPanel {

    String phongTrong_url = "D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Structural_000000_25.png";
    String phongDatTruocTT_url = "D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Fire Station_000000_25.png";
    String phongDatTruocOnl_url = "D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Police Station_000000_25.png";
    String phongDaCoKhach_url = "D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Hotel_000000_25.png";

    JButton[] buttons;

    JPopupMenu menu_Btn;

    JMenuItem m1, m2;

//    TrangDatPhong trangDatPhong = new TrangDatPhong();
//TraPhong traPhong = new TraPhong();
//TinhTrangPhong tinhTrangPhong = new TinhTrangPhong();
//QuanLyDichVu quanLyDichVu = new QuanLyDichVu();
//QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
//QuanLyLoaiPhong quanLyLoaiPhong = new QuanLyLoaiPhong();
//QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
    /**
     * Creates new form TinhTrangPhong
     */
    public TinhTrangPhong() {
        initComponents();
       
        LoadPhong();
    }

    class MenuActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
           if (e.getSource() == m1) {
                String MaPhong = m1.getName();
                JPanel suDungDichVu = TrangChu.getSuDungDV();
                JLayeredPane pn = TrangChu.getPanel();
                pn.add(suDungDichVu);
                             
                suDungDichVu.setVisible(true);
                setVisible(false);
                              
               
                  ArrayList<ThuePhong_POJO> dsTP = new ArrayList<ThuePhong_POJO>();
                  dsTP = ThuePhong_Controller.getDSThuePhong();
                   String MaTP = "";
                  for (int i = 0 ; i < dsTP.size(); i ++){
                      if (dsTP.get(i).getMaPhong().equals(MaPhong) == true){
                          MaTP = dsTP.get(i).getMaThuePhong();
                      }
                  }
                
                JComboBox<Object> comboBox = SuDungDichVu.getMaTP();
                comboBox.setSelectedItem(MaTP);
            }
            if (e.getSource() == m2) {
                String MaPhong = m2.getName();
                JPanel trangTraPhong = TrangChu.getTraPhong();
                JLayeredPane pn = TrangChu.getPanel();
                pn.add(trangTraPhong);

                trangTraPhong.setVisible(true);
                setVisible(false);

                JComboBox<Object> comboBox = TraPhong.getMaPhong();
                comboBox.setSelectedItem(MaPhong);
            }
        }
    }

    public void LoadPhong() {
        m1 = new JMenuItem("Sử Dụng Dịch Vụ", new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Service Bell_000000_25.png"));
        m2 = new JMenuItem("Trả Phòng", new ImageIcon("D:\\V Semester\\Java\\qlks\\Java_HotelManagement\\Resources\\Icon\\Paid Parking_000000_25.png"));

        //add listener
        m1.addActionListener(new MenuActionListener());
        m2.addActionListener(new MenuActionListener());

        menu_Btn = new JPopupMenu();

        // add menu item to menu 
        menu_Btn.add(m1);
        menu_Btn.add(m2);

        final ArrayList<Phong> dsTK = Phong_Controller.getDSPhong();
//        dsTK = Phong_Controller.getDSPhong();
        buttons = new JButton[dsTK.size()];
        for (int i = 0; i < dsTK.size(); i++) {
            buttons[i] = new JButton(dsTK.get(i).getTenPhong());
            if (dsTK.get(i).getTinhTrang().equals("Có Khách")) {
                buttons[i].setIcon(new ImageIcon(phongDaCoKhach_url));
            }
            if (dsTK.get(i).getTinhTrang().equals("Trống")) {
                buttons[i].setIcon(new ImageIcon(phongTrong_url));
            }
            if (dsTK.get(i).getTinhTrang().equals("Đặt Trước Trực Tiếp")) {
                buttons[i].setIcon(new ImageIcon(phongDatTruocTT_url));
            }
            if (dsTK.get(i).getTinhTrang().equals("Đặt Trước online")) {
                buttons[i].setIcon(new ImageIcon(phongDatTruocOnl_url));
            }
            buttons[i].setHorizontalTextPosition(SwingConstants.CENTER);
            buttons[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            buttons[i].setName(dsTK.get(i).getMaPhong());
            final String TinhTrang = dsTK.get(i).getTinhTrang();
            final String MaPhong = dsTK.get(i).getMaPhong().toString();
            buttons[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (TinhTrang.equals("Trống")) {
                        JPanel trangDatPhong = TrangChu.getDatPhong();
                        if (trangDatPhong.isVisible() == true) {
                            trangDatPhong.setVisible(false);
                        }

                        JLayeredPane pn = TrangChu.getPanel();
                        pn.add(trangDatPhong);

                        trangDatPhong.setVisible(true);
                        JComboBox<Object> comboBox =TrangDatPhong.getComboBox_Phong();
                        comboBox.setSelectedItem(MaPhong);
                        setVisible(false);

                    }
                    if (TinhTrang.equals("Có Khách")) {
                         m2.setName(MaPhong);
                        m1.setName(MaPhong);
                        
                        //Get button position
                        Component b = (Component) e.getSource();
                        Point p = b.getLocationOnScreen();

                        // this - represents current frame
                        // 0,0 is the co ordinate where the popup
                        // is shown
                        menu_Btn.show(b, 0, 0);
                        // Now set the location of the JPopupMenu
                        // This location is relative to the screen
                        menu_Btn.setLocation(p.x, p.y + b.getHeight());
                    }

                }
            });
            Panel_Phong.add(buttons[i]);
            buttons[i].setVisible(true);

        }
    }

    public void HienThiPhong() {
        JButton btnew2 = new JButton("Phòng new ");
        btnew2.setIcon(new ImageIcon(phongTrong_url));
        btnew2.setHorizontalTextPosition(SwingConstants.CENTER);
        btnew2.setVerticalTextPosition(SwingConstants.BOTTOM);
        Panel_Phong.add(btnew2);
        btnew2.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXTitledSeparator1 = new org.jdesktop.swingx.JXTitledSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Panel_Phong = new javax.swing.JPanel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 5, 20, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Police Station_000000_25.png"))); // NOI18N
        jLabel1.setText("Đặt Trước Online");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Fire Station_000000_25.png"))); // NOI18N
        jLabel2.setText("Đặt Trước Trực Tiếp");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Structural_000000_25.png"))); // NOI18N
        jLabel3.setText("Phòng Trống");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Hotel_000000_25.png"))); // NOI18N
        jLabel4.setText("Có Khách");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4);

        Panel_Phong.setLayout(new java.awt.GridLayout(4, 4, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Phong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        this.validate();
        this.repaint();
    }//GEN-LAST:event_formFocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        this.validate();
        this.repaint();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Phong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator1;
    // End of variables declaration//GEN-END:variables
}
