/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleGradingGUI;

import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author micojasmin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jTextFieldUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jButtonMin = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jCheckBoxSHOW = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabelshowpassword = new javax.swing.JLabel();
        jLabelDesign = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 90, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 140, 90, 20);

        jPasswordFieldPass.setBackground(new java.awt.Color(51, 51, 51));
        jPasswordFieldPass.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPasswordFieldPass);
        jPasswordFieldPass.setBounds(130, 130, 170, 30);

        jTextFieldUser.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUser.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldUser);
        jTextFieldUser.setBounds(130, 90, 170, 30);

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Serif", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Login your Account");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 60, 200, 24);

        jButtonExit.setBackground(new java.awt.Color(255, 51, 51));
        jButtonExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(204, 204, 204));
        jButtonExit.setText("X ");
        jButtonExit.setAlignmentY(0.0F);
        jButtonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExit.setIconTextGap(0);
        jButtonExit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit);
        jButtonExit.setBounds(330, 10, 50, 30);

        jButtonMin.setBackground(new java.awt.Color(51, 51, 255));
        jButtonMin.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonMin.setText("-");
        jButtonMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMin);
        jButtonMin.setBounds(280, 10, 50, 30);

        jButtonLogin.setBackground(new java.awt.Color(153, 153, 255));
        jButtonLogin.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin);
        jButtonLogin.setBounds(260, 220, 100, 26);

        jButtonCancel.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel);
        jButtonCancel.setBounds(50, 220, 90, 26);

        jCheckBoxSHOW.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBoxSHOW.setText("jCheckBox1");
        jCheckBoxSHOW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxSHOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSHOWActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxSHOW);
        jCheckBoxSHOW.setBounds(130, 180, 20, 20);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 180, 0, 0);

        jLabelshowpassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelshowpassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelshowpassword.setText("show password");
        jPanel1.add(jLabelshowpassword);
        jLabelshowpassword.setBounds(150, 180, 120, 20);

        jLabelDesign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SimpleGradingGUI/spring-rain-background-For-Widescreen-Wallpaper.jpg"))); // NOI18N
        jPanel1.add(jLabelDesign);
        jLabelDesign.setBounds(0, 0, 390, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        // TODO add your handling code here:
        this.setState(JFrame1.ICONIFIED);
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String uname = this.jTextFieldUser.getText().trim();
        String pass = this.jPasswordFieldPass.getText();
        
       
        
        if(uname.equalsIgnoreCase("Admin")&&pass.equals("Admin")){ // 2
            setVisible(false);
            
           new JFrame1().setVisible(true);
        
        
        }else{
            JOptionPane.showMessageDialog(rootPane, "Username or Password is Incorrect");
    }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jCheckBoxSHOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSHOWActionPerformed
         if(jCheckBoxSHOW.isSelected()){
             jPasswordFieldPass.setEchoChar((char)0);
         }else if(!jCheckBoxSHOW.isSelected()){
             jPasswordFieldPass.setEchoChar('*');
         }
    }//GEN-LAST:event_jCheckBoxSHOWActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JCheckBox jCheckBoxSHOW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDesign;
    private javax.swing.JLabel jLabelshowpassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
