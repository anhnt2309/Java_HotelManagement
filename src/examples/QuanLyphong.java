package examples;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Long
 */
public class QuanLyphong extends javax.swing.JPanel {
    /** Creates new form QuanLyLoaiPhong */
    public QuanLyphong() {
        initComponents();
        LoadDataToTable();
    }
public void LoadDataToTable(){
        ArrayList<Phong> dsPhong = new ArrayList<Phong>();       
        dsPhong = Phong_Controller.getDSPhong();
        DefaultTableModel model = (DefaultTableModel) Table_Phong.getModel();
        Object[] row = new Object[5];
        for (int i = 0 ; i< dsPhong.size(); i++){
            row[0] = dsPhong.get(i).getMaPhong();
            row[1] = dsPhong.get(i).getMaLP();
            row[2] = dsPhong.get(i).getTenPhong();
            row[3] = dsPhong.get(i).getTinhTrang();
            model.addRow(row);
        }
        
        ArrayList<LoaiPhong_POJO>  dsLoaiPhong = new ArrayList<LoaiPhong_POJO>();       
        dsLoaiPhong = LoaiPhong_Controller.getDSLoaiPhong();
       
        for (int j =0 ; j < dsLoaiPhong.size(); j ++){
            Combo_MaLP.addItem( dsLoaiPhong.get(j).getMaLP());
        }          
   }
public void resetTable() {
        DefaultTableModel model = (DefaultTableModel) Table_Phong.getModel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Text_Phong_MaP = new javax.swing.JTextField();
        Text_Phong_TenP = new javax.swing.JTextField();
        Combo_MaLP = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        Button_ThemLP = new javax.swing.JButton();
        Button_XoaLP = new javax.swing.JButton();
        Button_SuaLP = new javax.swing.JButton();
        Button_NhapLaiLP = new javax.swing.JButton();
        Combo_TTP = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ComboBox_ChonTTP = new javax.swing.JComboBox<>();
        Text_NhapTTTKP = new javax.swing.JTextField();
        Button_TimP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Phong = new javax.swing.JTable();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
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

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ  PHÒNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN PHÒNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/qlphong.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã phòng");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tên phòng");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tình Trạng phòng ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mã loại phòng ");

        Text_Phong_MaP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Text_Phong_TenP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Button_ThemLP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_ThemLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Plus_000000_25.png"))); // NOI18N
        Button_ThemLP.setText("Thêm");
        Button_ThemLP.setPreferredSize(new java.awt.Dimension(100, 33));
        Button_ThemLP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ThemLPMouseClicked(evt);
            }
        });

        Button_XoaLP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_XoaLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancel_000000_25.png"))); // NOI18N
        Button_XoaLP.setText("Xóa");
        Button_XoaLP.setPreferredSize(new java.awt.Dimension(100, 33));
        Button_XoaLP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_XoaLPMouseClicked(evt);
            }
        });

        Button_SuaLP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_SuaLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Recycling_000000_25.png"))); // NOI18N
        Button_SuaLP.setText("Sửa");
        Button_SuaLP.setPreferredSize(new java.awt.Dimension(100, 33));
        Button_SuaLP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SuaLPMouseClicked(evt);
            }
        });
        Button_SuaLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SuaLPActionPerformed(evt);
            }
        });

        Button_NhapLaiLP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_NhapLaiLP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Edit_000000_25.png"))); // NOI18N
        Button_NhapLaiLP.setText("Nhập lại");
        Button_NhapLaiLP.setPreferredSize(new java.awt.Dimension(100, 33));
        Button_NhapLaiLP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_NhapLaiLPMouseClicked(evt);
            }
        });
        Button_NhapLaiLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NhapLaiLPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_ThemLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_XoaLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_SuaLP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_NhapLaiLP, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_ThemLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_XoaLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_SuaLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_NhapLaiLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Combo_TTP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Có Khách", "Trống", "Đặt Trước Trực Tiếp", "Đặt Trước online" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Text_Phong_MaP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Combo_MaLP, 0, 126, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Text_Phong_TenP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Combo_TTP, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Text_Phong_MaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Combo_MaLP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Text_Phong_TenP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Combo_TTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Tìm kiếm phòng theo:");

        ComboBox_ChonTTP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBox_ChonTTP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Phòng" }));

        Text_NhapTTTKP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Button_TimP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_TimP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search_000000_25.png"))); // NOI18N
        Button_TimP.setText("Tìm kiếm");

        Table_Phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã  phòng", "Mã loại phòng ", "Tên phòng", "Tình trạng phòng"
            }
        ));
        Table_Phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_PhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_Phong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ComboBox_ChonTTP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Text_NhapTTTKP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button_TimP)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ComboBox_ChonTTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_NhapTTTKP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_TimP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Button_SuaLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SuaLPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SuaLPActionPerformed

    private void Button_NhapLaiLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NhapLaiLPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_NhapLaiLPActionPerformed

    private void Table_PhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_PhongMouseClicked
                // TODO add your handling code here:
        int i = Table_Phong.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) Table_Phong.getModel();
        Text_Phong_MaP.setText(model.getValueAt(i, 0).toString());
        Combo_MaLP.setSelectedItem(model.getValueAt(i, 1).toString());
        Text_Phong_TenP.setText(model.getValueAt(i, 2).toString());
        Combo_TTP.setSelectedItem(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_Table_PhongMouseClicked

    private void Button_ThemLPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ThemLPMouseClicked
        // TODO add your handling code here:
        String MaPhong = Text_Phong_MaP.getText();
        String TenPhong = Text_Phong_TenP.getText();
        String MaLP = Combo_MaLP.getSelectedItem().toString();
        String TinhTrang = Combo_TTP.getSelectedItem().toString();
        Phong P = new Phong(MaPhong,MaLP,TenPhong,TinhTrang); 
        Phong_Controller.themPhong(P);
        JOptionPane.showMessageDialog(jPanel2, "Thêm Phòng Thành Công!!!");
        resetTable();
              

    }//GEN-LAST:event_Button_ThemLPMouseClicked

    private void Button_XoaLPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_XoaLPMouseClicked
        // TODO add your handling code here:
        String MaPhong = Text_Phong_MaP.getText();
         if (MaPhong.equals("") == true){
             return;
         }
         else{
         JOptionPane tbXoa = new JOptionPane();
         int t = tbXoa.showConfirmDialog(jPanel2, "Bạn có chắc chắn muốn xóa?", "XÓA",JOptionPane.OK_OPTION);
         if (t == 0){
              Phong_Controller.xoaPhong(MaPhong);
               JOptionPane.showMessageDialog(jPanel2, "Xóa Phòng Thành Công!!!");
               resetTable();
         }
         }
    }//GEN-LAST:event_Button_XoaLPMouseClicked

    private void Button_SuaLPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SuaLPMouseClicked
        // TODO add your handling code here:
        String MaPhong = Text_Phong_MaP.getText();
        String TenPhong = Text_Phong_TenP.getText();
        String MaLP = Combo_MaLP.getSelectedItem().toString();
        String TinhTrang = Combo_TTP.getSelectedItem().toString();
   
        Phong P = new Phong(MaPhong, MaLP, TenPhong, TinhTrang);
         JOptionPane tbSua = new JOptionPane();
         int t = tbSua.showConfirmDialog(jPanel2, "Bạn có chắc chắn muốn sửa?", "SỬA",JOptionPane.OK_OPTION);
         if (t == 0){
              Phong_Controller.capNhatPhong(P);
              JOptionPane.showMessageDialog(jPanel2, "Sửa Phòng Thành Công!!!","THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);             
              resetTable();
         }
         
         
    }//GEN-LAST:event_Button_SuaLPMouseClicked

    private void Button_NhapLaiLPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_NhapLaiLPMouseClicked
        // TODO add your handling code here:
        Text_Phong_MaP.setText("");
        Text_Phong_TenP.setText("");
        Combo_MaLP.setSelectedIndex(0);
        Combo_TTP.setSelectedIndex(0);
    }//GEN-LAST:event_Button_NhapLaiLPMouseClicked

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
                 this.revalidate();
        this.repaint();
    }//GEN-LAST:event_formAncestorAdded

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
         
         this.revalidate();
        this.repaint();
    }//GEN-LAST:event_formComponentShown

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        this.removeAll();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_NhapLaiLP;
    private javax.swing.JButton Button_SuaLP;
    private javax.swing.JButton Button_ThemLP;
    private javax.swing.JButton Button_TimP;
    private javax.swing.JButton Button_XoaLP;
    private javax.swing.JComboBox<String> ComboBox_ChonTTP;
    private javax.swing.JComboBox<String> Combo_MaLP;
    private javax.swing.JComboBox<String> Combo_TTP;
    private javax.swing.JTable Table_Phong;
    private javax.swing.JTextField Text_NhapTTTKP;
    private javax.swing.JTextField Text_Phong_MaP;
    private javax.swing.JTextField Text_Phong_TenP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
