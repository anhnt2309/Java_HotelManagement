/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class TraPhong extends javax.swing.JPanel {

    String ngaysinh;
    Date SDNgaysinh;
    String sdngaysinh;
    Date NgSinh;
    //biến ngày den
    Date NgXai;
    String ngay;
    String ngayXai;

    /**
     * Creates new form TraPhong
     */
    public TraPhong() {
        initComponents();
        LoadDataToTable();
    }

    public String dateFormat(String x) {
        //convert date 

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        java.text.SimpleDateFormat myFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            NgSinh = myFormat.parse(x);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        //output converted date
        return ngayXai = sdf.format(NgSinh);
    }

    public void LoadTable_MaTP(String maTP) {
        ArrayList<SDDichVu_POJO> dsTP = new ArrayList<SDDichVu_POJO>();
        dsTP = SDDichVu_Controller.getDSSD();
        
         ArrayList<DichVu_POJO> dsDV = new ArrayList<DichVu_POJO>();
        dsDV = DichVu_Controller.getDSDichVu();
        
        DefaultTableModel model = (DefaultTableModel) Table_TraPhong.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < dsTP.size(); i++) {
            if (dsTP.get(i).getMaTP().equals(maTP) == true) {
                for (int j = 0 ; j< dsDV.size(); j++){
                    if (dsDV.get(j).getMaDV().equals(dsTP.get(i).getMaDV()) == true){
                           row[0] = dsDV.get(j).getTenDV();
                    }
                }
             
                row[1] = dsTP.get(i).getMaDV();
                row[2] = dsTP.get(i).getMaNV();
                row[3] = dateFormat(dsTP.get(i).getNgaySD().toString());
                row[4] = dsTP.get(i).getSoLuong();
                row[5] = dsTP.get(i).getTienSD();
                model.addRow(row);
            }
        }

    }

    public void LoadDataToTable() {

        ArrayList<ThuePhong_POJO> dsThuePhong = new ArrayList<ThuePhong_POJO>();
        dsThuePhong = ThuePhong_Controller.getDSThuePhong();

        for (int i = 0; i < dsThuePhong.size(); i++) {
            cbx_MaTP.addItem(dsThuePhong.get(i).getMaThuePhong());

        }
        cbx_MaTP.setSelectedIndex(0);

    }

    public static JComboBox getMaPhong() {
        return cbx_MaTP;
    }

    public void resetTable() {
        DefaultTableModel model = (DefaultTableModel) Table_TraPhong.getModel();
        model.setRowCount(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TenPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LoaiPhong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SoNgayO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Text_TienPhong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date_NgayTra = new com.lavantech.gui.comp.DateTimePicker();
        jLabel1 = new javax.swing.JLabel();
        cbx_MaTP = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Date_NgayDen = new com.lavantech.gui.comp.DateTimePicker();
        cbx_MaPhong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        text_TongTien = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_TraPhong = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(770, 540));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Phòng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên Phòng");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày Đến");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ngày Trả Phòng");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Loại Phòng");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số Ngày Ở");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Tiền Phòng :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tra phong.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Mã Thuê Phòng");

        Date_NgayDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Date_NgayDenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TenPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(LoaiPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(cbx_MaTP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_MaPhong))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SoNgayO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_TienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Date_NgayDen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(date_NgayTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date_NgayDen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(cbx_MaTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(cbx_MaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(date_NgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SoNgayO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(TenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_TienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/US Dollar_000000_25.png"))); // NOI18N
        jButton1.setText("Thanh Toán");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Tổng Tiền Cần Thanh Toán :");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Purchase Order_000000_25.png"))); // NOI18N
        jButton2.setText("In Hoá Đơn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_TongTien)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));
        jPanel3.setForeground(new java.awt.Color(0, 51, 153));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TRẢ PHÒNG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Table_TraPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ", "Mã dịch vụ", "Mã nhân viên", "Ngày sử dụng", "Số lượng", "Tiền sử dụng"
            }
        ));
        jScrollPane1.setViewportView(Table_TraPhong);

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN TRẢ PHÒNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN DỊCH VỤ SỬ DỤNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(682, 682, 682))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_MaPhong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_MaPhong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_MaPhong1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        resetTable();
        String matp = cbx_MaTP.getSelectedItem().toString();

        ArrayList<ThuePhong_POJO> dsThuePhong = new ArrayList<ThuePhong_POJO>();
        dsThuePhong = ThuePhong_Controller.getDSThuePhong();
        String maPhong = "";
        Date Ngaythue = null;
        for (int i = 0; i < dsThuePhong.size(); i++) {
            if (dsThuePhong.get(i).getMaThuePhong().equals(matp) == true) {
//                cbx_MaPhong.setSelectedItem(dsThuePhong.get(i).getMaPhong().toString());
                cbx_MaPhong.setText(dsThuePhong.get(i).getMaPhong().toString());
                maPhong = dsThuePhong.get(i).getMaPhong();

                String ngaythue = dsThuePhong.get(i).getNgayThue().toString();
                String dateformat = dateFormat(ngaythue);
                Ngaythue = new Date(dateformat);
                Date_NgayDen.setDate(Ngaythue);

            }
        }

        String maLP = "";
        ArrayList<Phong> dsPhong = new ArrayList<Phong>();
        dsPhong = Phong_Controller.getDSPhong();
        for (int j = 0; j < dsPhong.size(); j++) {
            if (dsPhong.get(j).getMaPhong().equals(maPhong)) {
                TenPhong.setText(dsPhong.get(j).getTenPhong());
                maLP = dsPhong.get(j).getMaLP();
            }
        }
        long giaPhong = 0;
        ArrayList<LoaiPhong_POJO> dsLP = new ArrayList<LoaiPhong_POJO>();
        dsLP = LoaiPhong_Controller.getDSLoaiPhong();
        for (int k = 0; k < dsLP.size(); k++) {
            if (dsLP.get(k).getMaLP().equals(maLP) == true) {
                LoaiPhong.setText(dsLP.get(k).getLoaiPhong());
                giaPhong = dsLP.get(k).getDonGia();
            }
        }
        // tinh ngay o
        long ngayDen = Ngaythue.getTime();
        long ngayTra = date_NgayTra.getDate().getTime();
        long miligiayNgayO = ngayTra - ngayDen;
        int dayNgayO = (int) (miligiayNgayO / (1000 * 60 * 60 * 24));
        SoNgayO.setText(String.valueOf(dayNgayO));
        //tien phong
        long TienPhong = giaPhong * dayNgayO;
        String str = String.format("%,d", TienPhong);
        Text_TienPhong.setText(str + " Đ");

        LoadTable_MaTP(matp);

        // lay tien dich vu
        DefaultTableModel model = (DefaultTableModel) Table_TraPhong.getModel();
        long total = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            total += Integer.parseInt(model.getValueAt(i, 5).toString());// 3rd column . row column indexes are 0 based
        }
        long TongTien = total + TienPhong;
        String tongTien = String.format("%,d", TongTien);
        text_TongTien.setText(tongTien+ " Đ");
    }//GEN-LAST:event_jButton1MouseClicked

    private void Date_NgayDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Date_NgayDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Date_NgayDenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.lavantech.gui.comp.DateTimePicker Date_NgayDen;
    private javax.swing.JTextField LoaiPhong;
    private javax.swing.JTextField SoNgayO;
    private javax.swing.JTable Table_TraPhong;
    private javax.swing.JTextField TenPhong;
    private javax.swing.JTextField Text_TienPhong;
    private javax.swing.JTextField cbx_MaPhong;
    public static javax.swing.JComboBox<String> cbx_MaTP;
    private com.lavantech.gui.comp.DateTimePicker date_NgayTra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField text_TongTien;
    // End of variables declaration//GEN-END:variables
}
