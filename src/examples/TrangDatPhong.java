/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author admin
 */
public class TrangDatPhong extends javax.swing.JPanel {

    /**
     * Creates new form TrangDatPhong
     */
    public TrangDatPhong() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busyPainter1 = new org.jdesktop.swingx.painter.BusyPainter();
        dateTimePickerBeanInfo1 = new com.lavantech.gui.comp.DateTimePickerBeanInfo();
        dateTimePickerBeanInfo2 = new com.lavantech.gui.comp.DateTimePickerBeanInfo();
        jXTitledSeparator1 = new org.jdesktop.swingx.JXTitledSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jXTitledSeparator2 = new org.jdesktop.swingx.JXTitledSeparator();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jXDatePicker4 = new org.jdesktop.swingx.JXDatePicker();
        dateTimePicker1 = new com.lavantech.gui.comp.DateTimePicker();
        dateTimePicker2 = new com.lavantech.gui.comp.DateTimePicker();
        dateTimePicker3 = new com.lavantech.gui.comp.DateTimePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(770, 540));
        setSize(new java.awt.Dimension(770, 540));

        jXTitledSeparator1.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jXTitledSeparator1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/School_000000_25.png"))); // NOI18N
        jXTitledSeparator1.setTitle("Thông Tin Đặt Phòng");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Phòng Đặt");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 17, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 13, 154, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Tên Khách Hàng");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, -1, -1));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 57, 154, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Ngày Nhận Phòng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Ngày Trả Phòng");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 83, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Số Người");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 242, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 238, 154, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Ngày Đặt Phòng");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 17, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Tiền Cọc");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 156, -1, -1));

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 151, 131, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        jPanel2.setName("PanelChucNang"); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Plus_000000_25.png"))); // NOI18N
        jButton1.setText("Thêm");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Minus_000000_25.png"))); // NOI18N
        jButton2.setText("Xoá");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Recycling_000000_25.png"))); // NOI18N
        jButton3.setText("Sửa");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Search_000000_25.png"))); // NOI18N
        jButton4.setText("Tìm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 189, -1, -1));

        jXTitledSeparator2.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jXTitledSeparator2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Police Station_000000_25.png"))); // NOI18N
        jXTitledSeparator2.setTitle("Đặt Phòng");
        jPanel1.add(jXTitledSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 764, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Tình Trạng");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 116, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 112, 131, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("Số Điện Thoại");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 106, -1, -1));

        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 101, 154, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setText("CMND");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 200, -1, -1));

        jTextField4.setText("jTextField4");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 195, 154, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setText("Ngày Sinh");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 156, -1, -1));
        jPanel1.add(jXDatePicker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 151, -1, -1));
        jPanel1.add(dateTimePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 200, -1));
        jPanel1.add(dateTimePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 200, -1));
        jPanel1.add(dateTimePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 200, -1));

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jXTable1);

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ĐẶT PHÒNG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(294, 294, 294))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel13)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTitledSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.painter.BusyPainter busyPainter1;
    private com.lavantech.gui.comp.DateTimePicker dateTimePicker1;
    private com.lavantech.gui.comp.DateTimePicker dateTimePicker2;
    private com.lavantech.gui.comp.DateTimePicker dateTimePicker3;
    private com.lavantech.gui.comp.DateTimePickerBeanInfo dateTimePickerBeanInfo1;
    private com.lavantech.gui.comp.DateTimePickerBeanInfo dateTimePickerBeanInfo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker4;
    private org.jdesktop.swingx.JXTable jXTable1;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator1;
    private org.jdesktop.swingx.JXTitledSeparator jXTitledSeparator2;
    // End of variables declaration//GEN-END:variables
}
