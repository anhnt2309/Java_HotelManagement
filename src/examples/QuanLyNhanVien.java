package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class QuanLyNhanVien extends javax.swing.JPanel {
    //biến ngày sinh
    String ngaysinh;
    Date SDNgaysinh;
    String sdngaysinh;
    Date NgSinh;
    //biến ngày vào làm
    Date NgXai;
    String ngay;
    String ngayXai;
    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien() {
        initComponents();
        LoadDataToTable();
    }
    public void LoadDataToTable(){
       ArrayList<Tblnhanvien>  dsNV = new ArrayList<Tblnhanvien>();       
        dsNV = NhanVien_Controller.getDSNV();
        
        //code gọi
        NhanVien_Controller dgBUS = new NhanVien_Controller();
        String madg = dgBUS.LayMaDG();
        
        Text_MaNV.setText(madg);
        DefaultTableModel model = (DefaultTableModel) Table_NV.getModel();
        Object[] row = new Object[7];
        for (int i = 0 ; i< dsNV.size(); i++){
            row[0] = dsNV.get(i).getManv();
            row[1] = dsNV.get(i).getTennv();
            row[2] = dsNV.get(i).getNgvl();
            row[3] = dsNV.get(i).getDiachinv();
            row[4] = dsNV.get(i).getNgsinhnv();
            row[5] = dsNV.get(i).getSdtnv();
            row[6] = dsNV.get(i).getEmailNv();
            model.addRow(row);
        } 
   }
    public void resetTable() {
        DefaultTableModel model = (DefaultTableModel) Table_NV.getModel();
        model.setRowCount(0);
        LoadDataToTable();
    }
    public String dateFormat(String x){
        //convert date 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            NgSinh = myFormat.parse(x);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLyKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        //output converted date
        return ngayXai = sdf.format(NgSinh); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Text_MaNV = new javax.swing.JTextField();
        Text_TenNV = new javax.swing.JTextField();
        Text_SDT = new javax.swing.JTextField();
        Text_DiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Text_Email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Button_ThemNV = new javax.swing.JButton();
        Button_XoaNV = new javax.swing.JButton();
        Button_SuaNV = new javax.swing.JButton();
        Button_NhapLaiNV = new javax.swing.JButton();
        Date_NSNV = new org.jdesktop.swingx.JXDatePicker();
        Date_NGVL = new org.jdesktop.swingx.JXDatePicker();
        jLabel11 = new javax.swing.JLabel();
        Combo_ChonTTNV = new javax.swing.JComboBox<>();
        Text_NhapTTNV = new javax.swing.JTextField();
        Button_TraCuuNV = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_NV = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(770, 540));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(205, 205, 205))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN NHÂN VIÊN ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã Nhân Viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Họ Tên Nhân Viên ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ngày sinh");

        Text_MaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Text_MaNV.setEnabled(false);

        Text_TenNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Text_SDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Text_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Email");

        Text_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Text_Email.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ngày vào làm");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N

        Button_ThemNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_ThemNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Plus_000000_25.png"))); // NOI18N
        Button_ThemNV.setText("Thêm");
        Button_ThemNV.setPreferredSize(new java.awt.Dimension(100, 33));
        Button_ThemNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_ThemNVMouseClicked(evt);
            }
        });

        Button_XoaNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_XoaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cancel_000000_25.png"))); // NOI18N
        Button_XoaNV.setText("Xóa");
        Button_XoaNV.setPreferredSize(new java.awt.Dimension(100, 33));
        Button_XoaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_XoaNVMouseClicked(evt);
            }
        });

        Button_SuaNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_SuaNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Recycling_000000_25.png"))); // NOI18N
        Button_SuaNV.setText("Sửa");
        Button_SuaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_SuaNVMouseClicked(evt);
            }
        });
        Button_SuaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SuaNVActionPerformed(evt);
            }
        });

        Button_NhapLaiNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_NhapLaiNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Edit_000000_25.png"))); // NOI18N
        Button_NhapLaiNV.setText("Nhập lại");
        Button_NhapLaiNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_NhapLaiNVMouseClicked(evt);
            }
        });
        Button_NhapLaiNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NhapLaiNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Button_ThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_XoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_SuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button_NhapLaiNV)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_ThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_XoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_SuaNV)
                    .addComponent(Button_NhapLaiNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_SDT)
                                    .addComponent(Text_MaNV)
                                    .addComponent(Text_TenNV)
                                    .addComponent(Date_NSNV, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(48, 48, 48)
                                .addComponent(Text_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date_NGVL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Text_DiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(Text_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Text_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(Date_NGVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Date_NSNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel11.setText("Tìm kiếm nhân viên theo:");

        Combo_ChonTTNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Combo_ChonTTNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên" }));
        Combo_ChonTTNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo_ChonTTNVActionPerformed(evt);
            }
        });

        Text_NhapTTNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Button_TraCuuNV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_TraCuuNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search_000000_25.png"))); // NOI18N
        Button_TraCuuNV.setText("Tra cứu");
        Button_TraCuuNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_TraCuuNVMouseClicked(evt);
            }
        });

        Table_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Ngày vào làm", "Địa chỉ", "Ngày sinh", "Điện thoại", "Email"
            }
        ));
        Table_NV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_NVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table_NV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_ChonTTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Text_NhapTTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(Button_TraCuuNV)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_NhapTTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_ChonTTNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_TraCuuNV)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Combo_ChonTTKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_ChonTTKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_ChonTTKHActionPerformed

    private void Combo_ChonTTNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo_ChonTTNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo_ChonTTNVActionPerformed

    private void Button_SuaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SuaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_SuaNVActionPerformed

    private void Button_NhapLaiNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NhapLaiNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_NhapLaiNVActionPerformed

    private void Table_NVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_NVMouseClicked
        // TODO add your handling code here:
        int i = Table_NV.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) Table_NV.getModel();
        Text_MaNV.setText(model.getValueAt(i, 0).toString());
        Text_TenNV.setText(model.getValueAt(i, 1).toString());
        // get date from table
        ngay = model.getValueAt(i, 2).toString();
        //convert date ngày vào làm 
        ngayXai =dateFormat(ngay);
        NgXai = new Date(ngayXai);
        Date_NGVL.setDate(NgXai);
        ///
        Text_DiaChi.setText(model.getValueAt(i, 3).toString());
        ///convert date ngày sinh
        ngaysinh = model.getValueAt(i, 4).toString();
        sdngaysinh = dateFormat(ngaysinh);
        SDNgaysinh = new Date(sdngaysinh);
        Date_NSNV.setDate(SDNgaysinh);
        ///
        Text_SDT.setText(model.getValueAt(i, 5).toString());
        Text_Email.setText(model.getValueAt(i, 6).toString());
        Button_ThemNV.setEnabled(false);
    }//GEN-LAST:event_Table_NVMouseClicked

    private void Button_ThemNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_ThemNVMouseClicked
        // TODO add your handling code here:
        String MaNV = Text_MaNV.getText();
        String TenNV = Text_TenNV.getText();
        Date NgVL = Date_NGVL.getDate();
        Date NgSinh = Date_NSNV.getDate();
        String SDT = Text_SDT.getText();
        String DiaChi = Text_DiaChi.getText();
        String Email = Text_Email.getText();
        Tblnhanvien NV = new Tblnhanvien(MaNV, TenNV,NgVL,DiaChi,NgSinh,SDT,Email); 
        NhanVien_Controller.themNV(NV);
        JOptionPane.showMessageDialog(jPanel4, "Thêm nhân viên Thành Công!!!");
        resetTable();
        Text_TenNV.setText("");
        Text_SDT.setText("");
        Text_Email.setText("");
        Text_DiaChi.setText("");
        System.out.println("date " + Date_NSNV.getDate());
        Date d = new Date("01/01/2016");
        Date_NSNV.setDate(d);
        System.out.println("date " + Date_NGVL.getDate());
        Date dt = new Date("01/01/2016");
        Date_NSNV.setDate(dt);
    }//GEN-LAST:event_Button_ThemNVMouseClicked

    private void Button_XoaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_XoaNVMouseClicked
        // TODO add your handling code here:
        String MaNV = Text_MaNV.getText();
         if (MaNV.equals("") == true){
             return;
         }
         else{
         JOptionPane tbXoa = new JOptionPane();
         int t = tbXoa.showConfirmDialog(jPanel4, "Bạn có chắc chắn muốn xóa?", "XÓA",JOptionPane.OK_OPTION);
         if (t == 0){
              NhanVien_Controller.xoaNV(MaNV);
               JOptionPane.showMessageDialog(jPanel4, "Xóa Nhân Viên Thành Công!!!");
               resetTable();
               Button_ThemNV.setEnabled(true);
         }
         }
    }//GEN-LAST:event_Button_XoaNVMouseClicked

    private void Button_SuaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_SuaNVMouseClicked
        // TODO add your handling code here:
        String MaNV = Text_MaNV.getText();
        String TenNV = Text_TenNV.getText();
        Date NgVL = Date_NGVL.getDate();
        String DiaChi = Text_DiaChi.getText();
        Date NgSinh = Date_NSNV.getDate();
        String DienThoai = Text_SDT.getText();
        String Email = Text_Email.getText();
        Tblnhanvien NV = new Tblnhanvien(MaNV, TenNV, NgVL, DiaChi,NgSinh, DienThoai,Email);
         JOptionPane tbSua = new JOptionPane();
         int t = tbSua.showConfirmDialog(jPanel4, "Bạn có chắc chắn muốn sửa?", "SỬA",JOptionPane.OK_OPTION);
         if (t == 0){
              NhanVien_Controller.capnhatNV(NV);
              JOptionPane.showMessageDialog(jPanel4, "Sửa Nhân Viên Thành Công!!!","THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);             
              resetTable();
              Button_ThemNV.setEnabled(true);
         }
    }//GEN-LAST:event_Button_SuaNVMouseClicked

    private void Button_NhapLaiNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_NhapLaiNVMouseClicked
        // TODO add your handling code here:
        Text_TenNV.setText("");
        Text_SDT.setText("");
        Text_Email.setText("");
        Text_DiaChi.setText("");
        System.out.println("date " + Date_NSNV.getDate());
        Date d = new Date("01/01/2016");
        Date_NSNV.setDate(d);
        System.out.println("date " + Date_NGVL.getDate());
        Date dt = new Date("01/01/2016");
        Date_NSNV.setDate(dt);
        Button_ThemNV.setEnabled(true);
    }//GEN-LAST:event_Button_NhapLaiNVMouseClicked

    private void Button_TraCuuNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_TraCuuNVMouseClicked
        // TODO add your handling code here:
        if (Text_NhapTTNV.getText().equals("") == true) {
            resetTable();

        } else {
            if (Combo_ChonTTNV.getSelectedItem().equals("Mã nhân viên") == true) {
                String MaNV = Text_NhapTTNV.getText();
                ArrayList<Tblnhanvien>  dsNV = new ArrayList<Tblnhanvien>();       
             
                dsNV = NhanVien_Controller.getDSNhanVienTheoMa("manv", MaNV);
                if (dsNV.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Không Có Nhân Viên Nào", "Lỗi", JOptionPane.ERROR_MESSAGE);
                } else {
                    DefaultTableModel model = (DefaultTableModel) Table_NV.getModel();
                    Object[] row = new Object[5];
                    model.setRowCount(0);
                    for (int i = 0; i < dsNV.size(); i++) {
                        row[0] = dsNV.get(i).getManv();
                        row[1] = dsNV.get(i).getTennv();
                        row[2] = dsNV.get(i).getNgvl();
                        row[3] = dsNV.get(i).getDiachinv();
                        row[4] = dsNV.get(i).getNgsinhnv();
                        row[4] = dsNV.get(i).getSdtnv();
                        row[4] = dsNV.get(i).getEmailNv();
                        
                        model.addRow(row);

                    }
                    JOptionPane.showMessageDialog(jPanel2, "Tìm Thấy Nhân Viên!!!", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_Button_TraCuuNVMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_NhapLaiNV;
    private javax.swing.JButton Button_SuaNV;
    private javax.swing.JButton Button_ThemNV;
    private javax.swing.JButton Button_TraCuuNV;
    private javax.swing.JButton Button_XoaNV;
    private javax.swing.JComboBox<String> Combo_ChonTTNV;
    private org.jdesktop.swingx.JXDatePicker Date_NGVL;
    private org.jdesktop.swingx.JXDatePicker Date_NSNV;
    private javax.swing.JTable Table_NV;
    private javax.swing.JTextField Text_DiaChi;
    private javax.swing.JTextField Text_Email;
    private javax.swing.JTextField Text_MaNV;
    private javax.swing.JTextField Text_NhapTTNV;
    private javax.swing.JTextField Text_SDT;
    private javax.swing.JTextField Text_TenNV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
