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
import javax.swing.*;
/**
 *
 * @author admin
 */
public class TrangChu extends javax.swing.JFrame {
 JSeparator jSeparator3 ;
 JSeparator jSeparator4 ;
 JSeparator jSeparator5 ;

//Component[] innerFrameComponents;

TrangDatPhong trangDatPhong = new TrangDatPhong();
TraPhong traPhong = new TraPhong();
TinhTrangPhong tinhTrangPhong = new TinhTrangPhong();
    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        AddLabelTinhTrangPhong();
        AddLabelSuDungDichVu();
        AddLabelDatPhong();
        AddLabelTraPhong();
      
        
    }
public void AddLabelTinhTrangPhong(){
     jSeparator3 = new JSeparator();
     //add tình trạng phòng component to jxtaskpane
        final JLabel lb_TrinhTrangPhong = new JLabel("Tình Trạng Phòng");
        lb_TrinhTrangPhong.setSize(228, 150);
        lb_TrinhTrangPhong.setIcon(new ImageIcon("/Users/admin/NetbeansProjects/QLKS/Resources/Icon/Hotel_000000_25.png"));
        jXTaskPane4.add(lb_TrinhTrangPhong);
           
        jXTaskPane4.add(jSeparator3);
        
     //set listener
     lb_TrinhTrangPhong.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
              jLayeredPane1.add(tinhTrangPhong);
               tinhTrangPhong.setVisible(true);
                traPhong.setVisible(false);
               trangDatPhong.setVisible(false);
               
//                int i =jLayeredPane1.getLayer(tinhTrangPhong);
//                jLayeredPane1.getComponent(i).setVisible(true);
//              jLayeredPane1.moveToFront(tinhTrangPhong);
         }
          @Override
             public void mouseEntered(MouseEvent e) {
                lb_TrinhTrangPhong.setFont(new Font(lb_TrinhTrangPhong.getFont().getName(),Font.ITALIC, lb_TrinhTrangPhong.getFont().getSize()));
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
    jSeparator4 = new JSeparator();
    //Sử dụng dịch vụ 
        final  JLabel lb_SuDungDichVu = new JLabel("Sử Dụng Dịch ");
        lb_SuDungDichVu.setIcon(new ImageIcon("/Users/admin/NetbeansProjects/QLKS/Resources/Icon/Service Bell_000000_25.png"));
        jXTaskPane4.add(lb_SuDungDichVu);
        
         jXTaskPane4.add(jSeparator4);
         
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
      jSeparator5 = new JSeparator();
      //Dat phong  tru
        final JLabel lb_DatPhong = new JLabel("Đặt Phòng  ");
        lb_DatPhong.setIcon(new ImageIcon("/Users/admin/NetbeansProjects/QLKS/Resources/Icon/Police Station_000000_25.png"));
        jXTaskPane4.add(lb_DatPhong);
        
         jXTaskPane4.add(jSeparator5);
         
             //gan listener
        lb_DatPhong.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               
//               innerFrameComponents = jLayeredPane1.getComponents();
////            
//               for (Component component:innerFrameComponents){
//                  component.setVisible(false);
//              }      
                 
                 jLayeredPane1.add(trangDatPhong);
                 trangDatPhong.setVisible(true);
                
                  traPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
//                int i =jLayeredPane1.getLayer(trangDatPhong);
//                jLayeredPane1.getComponent(i).setVisible(true);
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
        lb_TraPhong.setIcon(new ImageIcon("/Users/admin/NetbeansProjects/QLKS/Resources/Icon/Paid Parking_000000_25.png"));
        jXTaskPane4.add(lb_TraPhong);
       
     //set listener
     lb_TraPhong.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                jLayeredPane1.add(traPhong);
               traPhong.setVisible(true);
               trangDatPhong.setVisible(false);
               tinhTrangPhong.setVisible(false);
//                int i =jLayeredPane1.getLayer(traPhong);
//                jLayeredPane1.getComponent(i).setVisible(true);

//                jLayeredPane1.moveToFront(traPhong);
//                innerFrameComponents = jLayeredPane1.getComponents();
//               
//               for (Component component:innerFrameComponents){
//                   if (component.get){
//                       component.setVisible(true);
//                   }
//                  component.setVisible(false);
//              }  
               
               
               
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
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jXTaskPane4 = new org.jdesktop.swingx.JXTaskPane();
        jXTaskPane5 = new org.jdesktop.swingx.JXTaskPane();
        jXTaskPane6 = new org.jdesktop.swingx.JXTaskPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 730));

        jToolBar2.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User_000000_25.png"))); // NOI18N
        jButton2.setText("Xem Tài Khoản");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(10);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton2);
        jToolBar2.add(jSeparator1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Key_000000_25.png"))); // NOI18N
        jButton1.setText("Đổi Mật Khẩu");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(10);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);
        jToolBar2.add(jSeparator2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Shutdown_000000_25.png"))); // NOI18N
        jButton3.setText("Đăng Xuất");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(10);
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
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tài Khoản Của Tôi", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1005, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản Lý Tài Khoản", jPanel2);

        jSplitPane1.setDividerLocation(250);
        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSplitPane1.setFocusable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setMaximumSize(new java.awt.Dimension(244, 515));

        jXTaskPane4.setAutoscrolls(true);
        jXTaskPane4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jXTaskPane4.setTitle("Sử Dụng Phòng");

        jXTaskPane5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jXTaskPane5.setTitle("Quản Lý");

        jXTaskPane6.setCollapsed(true);
        jXTaskPane6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jXTaskPane6.setTitle("Báo Cáo");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jXTaskPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(jXTaskPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXTaskPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jXTaskPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXTaskPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 747, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel7);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jLayeredPane1.setToolTipText("");
        jLayeredPane1.setLayout(new java.awt.BorderLayout());
        jSplitPane1.setRightComponent(jLayeredPane1);

        fileMenu.setIcon(new javax.swing.ImageIcon("/Users/admin/Documents/Icon/Home_000000_25.png")); // NOI18N
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
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar2;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane4;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane5;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane6;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
