/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import examples.TaiKhoanDangNhap_Controller;
import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Collections;
/**
 *
 * @author ezrealan
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form QuanLy
     */
    public DangNhap() {
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

        password = new javax.swing.JPasswordField();
        text_user = new JTextFieldPersonalizado.JCTextField();
        lb_DangNhap = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setPreferredSize(new java.awt.Dimension(960, 620));
        getContentPane().setLayout(null);

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("11111111");
        password.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                passwordMouseDragged(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(380, 300, 170, 40);

        text_user.setPlaceholder("User Name");
        text_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_userFocusLost(evt);
            }
        });
        getContentPane().add(text_user);
        text_user.setBounds(380, 240, 170, 40);

        lb_DangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sign in.jpg"))); // NOI18N
        lb_DangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_DangNhapMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_DangNhapMousePressed(evt);
            }
        });
        lb_DangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lb_DangNhapKeyPressed(evt);
            }
        });
        getContentPane().add(lb_DangNhap);
        lb_DangNhap.setBounds(350, 370, 240, 70);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(370, 360, 80, 20);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Quên mật khẩu?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 344, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 650));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 0, 1140, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_DangNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DangNhapMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_DangNhapMousePressed

    private void lb_DangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_DangNhapMouseClicked
      
        ArrayList<TaiKhoanDangNhap>  dsTK = new ArrayList<TaiKhoanDangNhap>();       
        dsTK = TaiKhoanDangNhap_Controller.getDSTK();
        int flag =0;
        for (int i =0 ; i<dsTK.size(); i++){
            if(text_user.getText().equals(dsTK.get(i).getUser()) == true 
                    && password.getText().equals(dsTK.get(i).getPassWord()) == true){
                flag =1;
                if (dsTK.get(i).getLoaiTK().equals("Admin")){
                    int k = 0;
                    JOptionPane.showMessageDialog(null, "ADMIN Đăng Nhập Thành Công!!!");
                       
                     TrangChu tc = new TrangChu();
                     TrangChu.SetCurrentUser(dsTK.get(i));
                    tc.Display(k);
                     this.dispose();                  
                     tc.setVisible(true);
                }
                if (dsTK.get(i).getLoaiTK().equals("Tiếp Tân") == true){
                    int j =1 ;
                  JOptionPane.showMessageDialog(null, "TIẾP TÂN Đăng Nhập Thành Công!!!");
                     TrangChu tc = new TrangChu();
                     TrangChu.SetCurrentUser(dsTK.get(i));
                    tc.Display(j);
                     this.dispose();                   
                     tc.setVisible(true);
                }
            }     
        }
      if (flag == 0){
          JOptionPane.showMessageDialog(null, "Không Tìm Thấy Tài Khoản");
      }
        
    }//GEN-LAST:event_lb_DangNhapMouseClicked

    private void lb_DangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lb_DangNhapKeyPressed
        // TODO add your handling code here:
       

        
    }//GEN-LAST:event_lb_DangNhapKeyPressed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        // TODO add your handling code here:
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void passwordMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseDragged
        // TODO add your handling code here:
         password.setText("");
    }//GEN-LAST:event_passwordMouseDragged

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:       
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
               ArrayList<TaiKhoanDangNhap>  dsTK = new ArrayList<TaiKhoanDangNhap>();       
        dsTK = TaiKhoanDangNhap_Controller.getDSTK();
        int flag =0;
        for (int i =0 ; i<dsTK.size(); i++){
            if(text_user.getText().equals(dsTK.get(i).getUser()) == true 
                    && password.getText().equals(dsTK.get(i).getPassWord()) == true){
                flag =1;
                if (dsTK.get(i).getLoaiTK().equals("Admin")){
                    int k = 0;
                    JOptionPane.showMessageDialog(null, "ADMIN Đăng Nhập Thành Công!!!");

                     TrangChu tc = new TrangChu();
                    tc.Display(k);
                     this.dispose();                  
                     tc.setVisible(true);
                }
                if (dsTK.get(i).getLoaiTK().equals("Tiếp Tân") == true){
                    int j =1 ;
                  JOptionPane.showMessageDialog(null, "TIẾP TÂN Đăng Nhập Thành Công!!!");
                     TrangChu tc = new TrangChu();
                    tc.Display(j);
                     this.dispose();                   
                     tc.setVisible(true);
                }
            }     
        }
      if (flag == 0){
          JOptionPane.showMessageDialog(null, "Không Tìm Thấy Tài Khoản");
      }
    }
    }//GEN-LAST:event_passwordKeyPressed

    private void text_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_userFocusLost
        // TODO add your handling code here:
          password.setText("");
    }//GEN-LAST:event_text_userFocusLost

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_DangNhap;
    private javax.swing.JPasswordField password;
    private JTextFieldPersonalizado.JCTextField text_user;
    // End of variables declaration//GEN-END:variables
}
