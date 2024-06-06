/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhaskar
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    Connection conn = null;
    Statement smt = null;
    ResultSet rs = null;

    public test() {
        super("Login");
        initComponents();
        conn = DatabaseConn.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        addDetailPanel = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        classWisePanel = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addDetailPanel2 = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addDetailPanel3 = new keeptoo.KGradientPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addDetailPanel4 = new keeptoo.KGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addDetailPanel5 = new keeptoo.KGradientPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        addDetailPanel6 = new keeptoo.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        addDetailPanel7 = new keeptoo.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(557, 380));
        setPreferredSize(new java.awt.Dimension(557, 380));

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setOpaque(false);
        titlePanel.setPreferredSize(new java.awt.Dimension(400, 100));
        titlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SMSLogo.png"))); // NOI18N
        jLabel1.setText("Student Management System");
        jLabel1.setFocusable(false);
        jLabel1.setIconTextGap(0);
        titlePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 583, 100));

        logoutPanel.setBackground(new java.awt.Color(178, 201, 254));
        logoutPanel.setOpaque(false);
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });
        logoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Logout.png"))); // NOI18N
        logoutPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(178, 201, 254));
        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel4.setText("Logout");
        logoutPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        titlePanel.add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 90, 70));

        getContentPane().add(titlePanel, java.awt.BorderLayout.NORTH);

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 102, 255));
        kGradientPanel1.setkGradientFocus(0);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 135));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addDetailPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDetailPanel.setkEndColor(new java.awt.Color(59, 178, 184));
        addDetailPanel.setkGradientFocus(50);
        addDetailPanel.setkStartColor(new java.awt.Color(66, 230, 149));
        addDetailPanel.setPreferredSize(new java.awt.Dimension(160, 160));
        addDetailPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailPanelMouseClicked(evt);
            }
        });
        addDetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add Administrator_5.png"))); // NOI18N
        addDetailPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add Detail");
        addDetailPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(addDetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        classWisePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        classWisePanel.setkEndColor(new java.awt.Color(243, 129, 129));
        classWisePanel.setkGradientFocus(60);
        classWisePanel.setkStartColor(new java.awt.Color(252, 227, 138));
        classWisePanel.setPreferredSize(new java.awt.Dimension(160, 160));
        classWisePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classWisePanelMouseClicked(evt);
            }
        });
        classWisePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Teacher_2.png"))); // NOI18N
        classWisePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Class Wise Detail");
        classWisePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(classWisePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        addDetailPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDetailPanel2.setkEndColor(new java.awt.Color(23, 234, 217));
        addDetailPanel2.setkGradientFocus(50);
        addDetailPanel2.setkStartColor(new java.awt.Color(96, 120, 234));
        addDetailPanel2.setPreferredSize(new java.awt.Dimension(160, 160));
        addDetailPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailPanel2MouseClicked(evt);
            }
        });
        addDetailPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search Account_1.png"))); // NOI18N
        addDetailPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Search Detail");
        addDetailPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(addDetailPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        addDetailPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDetailPanel3.setkEndColor(new java.awt.Color(255, 118, 118));
        addDetailPanel3.setkGradientFocus(100);
        addDetailPanel3.setkStartColor(new java.awt.Color(245, 78, 162));
        addDetailPanel3.setkTransparentControls(false);
        addDetailPanel3.setPreferredSize(new java.awt.Dimension(160, 160));
        addDetailPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailPanel3MouseClicked(evt);
            }
        });
        addDetailPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Remove Administrator.png"))); // NOI18N
        addDetailPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Delete Detail");
        addDetailPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(addDetailPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        addDetailPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDetailPanel4.setkEndColor(new java.awt.Color(115, 110, 254));
        addDetailPanel4.setkGradientFocus(100);
        addDetailPanel4.setkStartColor(new java.awt.Color(94, 252, 232));
        addDetailPanel4.setPreferredSize(new java.awt.Dimension(160, 160));
        addDetailPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailPanel4MouseClicked(evt);
            }
        });
        addDetailPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit Account.png"))); // NOI18N
        addDetailPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Edit Detail");
        addDetailPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(addDetailPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        addDetailPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDetailPanel5.setkEndColor(new java.awt.Color(238, 154, 229));
        addDetailPanel5.setkGradientFocus(100);
        addDetailPanel5.setkStartColor(new java.awt.Color(89, 97, 249));
        addDetailPanel5.setPreferredSize(new java.awt.Dimension(160, 160));
        addDetailPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailPanel5MouseClicked(evt);
            }
        });
        addDetailPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Password_1.png"))); // NOI18N
        addDetailPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Change Password");
        addDetailPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(addDetailPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        addDetailPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDetailPanel6.setkEndColor(new java.awt.Color(250, 112, 154));
        addDetailPanel6.setkGradientFocus(50);
        addDetailPanel6.setkStartColor(new java.awt.Color(254, 225, 64));
        addDetailPanel6.setPreferredSize(new java.awt.Dimension(160, 160));
        addDetailPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailPanel6MouseClicked(evt);
            }
        });
        addDetailPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Info.png"))); // NOI18N
        addDetailPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("About Us");
        addDetailPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(addDetailPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        addDetailPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDetailPanel7.setkEndColor(new java.awt.Color(234, 96, 96));
        addDetailPanel7.setkGradientFocus(80);
        addDetailPanel7.setkStartColor(new java.awt.Color(113, 23, 234));
        addDetailPanel7.setPreferredSize(new java.awt.Dimension(160, 160));
        addDetailPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDetailPanel7MouseClicked(evt);
            }
        });
        addDetailPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iMac Exit.png"))); // NOI18N
        addDetailPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 109, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Exit");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addDetailPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        kGradientPanel1.add(addDetailPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1028, 842));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logoutPanelMouseClicked
        setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }// GEN-LAST:event_logoutPanelMouseClicked

    private void addDetailPanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addDetailPanelMouseClicked
        setVisible(false);
        AddDetail add = new AddDetail();
        add.setVisible(true);
    }// GEN-LAST:event_addDetailPanelMouseClicked

    private void classWisePanelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_classWisePanelMouseClicked
        setVisible(false);
        ClassWiseInfo info = new ClassWiseInfo();
        info.setVisible(true);
    }// GEN-LAST:event_classWisePanelMouseClicked

    private void addDetailPanel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addDetailPanel2MouseClicked
        setVisible(false);
        SearchDetail search = new SearchDetail();
        search.setVisible(true);
    }// GEN-LAST:event_addDetailPanel2MouseClicked

    private void addDetailPanel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addDetailPanel3MouseClicked
        setVisible(false);
        DeleteDetail delete = new DeleteDetail();
        delete.setVisible(true);
    }// GEN-LAST:event_addDetailPanel3MouseClicked

    private void addDetailPanel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addDetailPanel4MouseClicked
        setVisible(false);
        EditDetail edit = new EditDetail();
        edit.setVisible(true);
    }// GEN-LAST:event_addDetailPanel4MouseClicked

    private void addDetailPanel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addDetailPanel5MouseClicked
        setVisible(false);
        changePassword fee = new changePassword();
        fee.setVisible(true);
    }// GEN-LAST:event_addDetailPanel5MouseClicked

    private void addDetailPanel6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addDetailPanel6MouseClicked
        setVisible(false);
        AboutUs about = new AboutUs();
        about.setVisible(true);
    }// GEN-LAST:event_addDetailPanel6MouseClicked

    private void addDetailPanel7MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_addDetailPanel7MouseClicked
        System.exit(0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }// GEN-LAST:event_addDetailPanel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel addDetailPanel;
    private keeptoo.KGradientPanel addDetailPanel2;
    private keeptoo.KGradientPanel addDetailPanel3;
    private keeptoo.KGradientPanel addDetailPanel4;
    private keeptoo.KGradientPanel addDetailPanel5;
    private keeptoo.KGradientPanel addDetailPanel6;
    private keeptoo.KGradientPanel addDetailPanel7;
    private keeptoo.KGradientPanel classWisePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
