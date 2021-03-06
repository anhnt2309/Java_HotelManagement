package examples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Long
 */
public class QuanLyDichVu extends javax.swing.JPanel {

    /** Creates new form QuanLyLoaiPhong */
    public QuanLyDichVu() {
        initComponents();
        LoadDataToTable();
    }
    public void LoadDataToTable() {
        ArrayList<DichVu_POJO> dsDV = new ArrayList<DichVu_POJO>();
        dsDV = DichVu_Controller.getDSDichVu();

        DefaultTableModel model = (DefaultTableModel) Table_DichVu.getModel();
        Object[] row = new Object[4];

        //code gọi
        DichVu_Controller dv = new DichVu_Controller();
        String madv = dv.LayMaDV();
        ////set vào textbox
        Text_MaDV.setText(madv);
        
        for (int i = 0; i < dsDV.size(); i++) {
            row[0] = dsDV.get(i).getMaDV();
            row[1] = dsDV.get(i).getTenDV();
            row[2] = dsDV.get(i).getGiaDV();
            row[3] = dsDV.get(i).getDVT();
            model.addRow(row);
        }
    }
    public void resetTable() {
        DefaultTableModel model = (DefaultTableModel) Table_DichVu.getModel();
        model.setRowCount(0);
        LoadDataToTable();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Text_MaDV = new javax.swing.JTextField();
        Text_GiaTien = new javax.swing.JTextField();
        Text_TenDV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Button_ThemDV = new javax.swing.JButton();
        Button_XoaDV = new javax.swing.JButton();
        Button_SuaDV = new javax.swing.JButton();
        Button_NhapLaiDV = new javax.swing.JButton();
        Combo_DVT = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ComboBox_ChonDV = new javax.swing.JComboBox<>();
        Text_NhapTTDV = new javax.swing.JTextField();
        Button_TimDV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_DichVu = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ DỊCH VỤ\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("QUẢN LÝ DỊCH VỤ \n");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN DỊCH VỤ ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã dịch vụ");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên dịch vụ ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Đơn Giá");

        Text_MaDV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Text_MaDV.setEnabled(false);
        Text_MaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_MaDVActionPerformed(evt);
            }
        });

        Text_GiaTien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Text_TenDV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Đơn vị tính");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Customer-service-icon.png")); // NOI18N

        Button_ThemDV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_ThemDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Plus_000000_25.png"))); // NOI18N
        Button_ThemDV.setText("Thêm");
        Button_ThemDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ThemDVMouseClicked(evt);
            }
        });

        Button_XoaDV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_XoaDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancel_000000_25.png"))); // NOI18N
        Button_XoaDV.setText("Xóa");
        Button_XoaDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_XoaDVMouseClicked(evt);
            }
        });
        Button_XoaDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_XoaDVActionPerformed(evt);
            }
        });

        Button_SuaDV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_SuaDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Recycling_000000_25.png"))); // NOI18N
        Button_SuaDV.setText("Sửa");
        Button_SuaDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SuaDVMouseClicked(evt);
            }
        });

        Button_NhapLaiDV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_NhapLaiDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Edit_000000_25.png"))); // NOI18N
        Button_NhapLaiDV.setText("Nhập lại");
        Button_NhapLaiDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_NhapLaiDVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_ThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(Button_XoaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Button_SuaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_NhapLaiDV)
                .addGap(9, 9, 9))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_SuaDV)
                    .addComponent(Button_XoaDV)
                    .addComponent(Button_ThemDV)
                    .addComponent(Button_NhapLaiDV))
                .addGap(29, 29, 29))
        );

        Combo_DVT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "Lần", "Chiếc", "Ly", "Chai", "Lon", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Text_MaDV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Text_GiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_TenDV, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(Combo_DVT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Text_MaDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Text_GiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_TenDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Combo_DVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Tìm kiếm dịch vụ theo:");

        ComboBox_ChonDV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBox_ChonDV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Text_NhapTTDV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Button_TimDV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_TimDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search_000000_25.png"))); // NOI18N
        Button_TimDV.setText("Tìm kiếm");
        Button_TimDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TimDVActionPerformed(evt);
            }
        });

        Table_DichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Đơn giá", "Đơn vị tính"
            }
        ));
        Table_DichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_DichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_DichVu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComboBox_ChonDV, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Text_NhapTTDV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_TimDV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboBox_ChonDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_NhapTTDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_TimDV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_XoaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_XoaDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_XoaDVActionPerformed

    private void Text_MaDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_MaDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_MaDVActionPerformed

    private void Button_TimDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TimDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_TimDVActionPerformed

    private void Table_DichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_DichVuMouseClicked
        // TODO add your handling code here:
        int i = Table_DichVu.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) Table_DichVu.getModel();
        Text_MaDV.setText(model.getValueAt(i, 0).toString());
        Text_TenDV.setText(model.getValueAt(i, 1).toString());
        Combo_DVT.setSelectedItem(model.getValueAt(i, 3).toString());
        Text_GiaTien.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_Table_DichVuMouseClicked

    private void Button_ThemDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ThemDVMouseClicked
        // TODO add your handling code here:
        String MaDV = Text_MaDV.getText();
        String TenDV = Text_TenDV.getText();
        String DVT = Combo_DVT.getSelectedItem().toString();
        long GiaDV = Long.parseLong(Text_GiaTien.getText());
        DichVu_POJO DV = new DichVu_POJO(MaDV, TenDV, GiaDV, DVT);
        DichVu_Controller.themDichVu(DV);
        JOptionPane.showMessageDialog(jPanel2, "Thêm Dịch Vụ Thành Công!!!");
        resetTable();
    }//GEN-LAST:event_Button_ThemDVMouseClicked

    private void Button_XoaDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_XoaDVMouseClicked
        // TODO add your handling code here:
        String maDV = Text_MaDV.getText();
        if (maDV.equals("") == true) {
            return;
        } else {
            JOptionPane tbXoa = new JOptionPane();
            int t = tbXoa.showConfirmDialog(jPanel2, "Bạn có chắc chắn muốn xóa?", "XÓA", JOptionPane.OK_OPTION);
            if (t == 0) {
                DichVu_Controller.xoaDichVu(maDV);
                JOptionPane.showMessageDialog(jPanel2, "Xóa Dịch Vụ Thành Công!!!");
                resetTable();
    }//GEN-LAST:event_Button_XoaDVMouseClicked
        }
    }
    private void Button_SuaDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SuaDVMouseClicked
        // TODO add your handling code here:
        String MaDV = Text_MaDV.getText();
        String TenDV = Text_TenDV.getText();
        String DVT = Combo_DVT.getSelectedItem().toString();
        long GiaDV = Long.parseLong(Text_GiaTien.getText());
        DichVu_POJO DV = new DichVu_POJO(MaDV, TenDV, GiaDV, DVT);

        JOptionPane tbSua = new JOptionPane();
        int t = tbSua.showConfirmDialog(jPanel2, "Bạn có chắc chắn muốn sửa?", "SỬA", JOptionPane.OK_OPTION);
        if (t == 0) {
            DichVu_Controller.capnhatDichVu(DV);
            JOptionPane.showMessageDialog(jPanel2, "Sửa Dịch Vụ Thành Công!!!", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
            resetTable();
        }
    }//GEN-LAST:event_Button_SuaDVMouseClicked

    private void Button_NhapLaiDVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_NhapLaiDVMouseClicked
        // TODO add your handling code here:
        Text_TenDV.setText("");
        Text_GiaTien.setText("");
        Combo_DVT.setSelectedIndex(0);
    }//GEN-LAST:event_Button_NhapLaiDVMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_NhapLaiDV;
    private javax.swing.JButton Button_SuaDV;
    private javax.swing.JButton Button_ThemDV;
    private javax.swing.JButton Button_TimDV;
    private javax.swing.JButton Button_XoaDV;
    private javax.swing.JComboBox<String> ComboBox_ChonDV;
    private javax.swing.JComboBox<String> Combo_DVT;
    private javax.swing.JTable Table_DichVu;
    private javax.swing.JTextField Text_GiaTien;
    private javax.swing.JTextField Text_MaDV;
    private javax.swing.JTextField Text_NhapTTDV;
    private javax.swing.JTextField Text_TenDV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
