package com.mycompany.courier_service_system;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AdminAccountsPage extends javax.swing.JFrame {

    public AdminAccountsPage() {

        initComponents();
        this.setLocationRelativeTo(null);

        Profile p = new Profile();
        p.loadprofile(transferdata.getdata());

        lblname.setText("Welcome Back, " + p.getName().trim());

        table();

        JTableHeader header = tblaccounts.getTableHeader();
        header.setBackground(Color.decode("#4F6367"));
        header.setForeground(Color.white);

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

    }

    private void table() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstline = br.readLine().trim();
            String[] columnName = firstline.split(",");
            DefaultTableModel model = (DefaultTableModel) tblaccounts.getModel();
            model.setColumnIdentifiers(columnName);

            tblaccounts.removeColumn(tblaccounts.getColumnModel().getColumn(0));
            tblaccounts.removeColumn(tblaccounts.getColumnModel().getColumn(0));
            tblaccounts.removeColumn(tblaccounts.getColumnModel().getColumn(4));

            int headerheight = 30;
            JTableHeader header = tblaccounts.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            tblaccounts.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblaccounts.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblaccounts.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

            Object[] lines = br.lines().toArray();

            tblaccounts.setRowHeight(30);

            for (int i = 0; i < lines.length; i++) {

                String[] row = lines[i].toString().split(",");
                model.addRow(row);

            }

            br.close();

        } catch (Exception ex) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnmore = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnall = new javax.swing.JButton();
        txtsearch1 = new javax.swing.JTextField();
        btncustomer = new javax.swing.JButton();
        btnmanager = new javax.swing.JButton();
        btnrider = new javax.swing.JButton();
        btnnewuser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblaccounts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblname.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblname.setText("Welcome Back, ");
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, -1, 41));

        jButton5.setBackground(new java.awt.Color(122, 158, 159));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton5.setText("Orders");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 125, 40));

        jButton8.setBackground(new java.awt.Color(122, 158, 159));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton8.setText("Report");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 660, 125, 40));

        jButton6.setBackground(new java.awt.Color(122, 158, 159));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton6.setText("Feedback");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 125, 40));

        jButton7.setBackground(new java.awt.Color(184, 216, 216));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Accounts");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 660, 125, 40));

        btnprofile.setBackground(new java.awt.Color(241, 169, 160));
        btnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile1.png"))); // NOI18N
        btnprofile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        getContentPane().add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 10, 50, 41));

        btnlogout.setBackground(new java.awt.Color(241, 169, 160));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout1.png"))); // NOI18N
        btnlogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 50, 41));

        btnmore.setBackground(new java.awt.Color(241, 169, 160));
        btnmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/more1.png"))); // NOI18N
        btnmore.setActionCommand("");
        btnmore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnmore, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 41));

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnall.setBackground(new java.awt.Color(184, 216, 216));
        btnall.setText("↻");
        btnall.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallActionPerformed(evt);
            }
        });
        jPanel1.add(btnall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 50, 50));

        txtsearch1.setBackground(new java.awt.Color(122, 158, 159));
        txtsearch1.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsearch1.setText("🔍 SEARCH");
        txtsearch1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        txtsearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearch1MouseClicked(evt);
            }
        });
        txtsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch1KeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 420, 50));

        btncustomer.setBackground(new java.awt.Color(184, 216, 216));
        btncustomer.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btncustomer.setText("Customer");
        btncustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btncustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 150, 60));

        btnmanager.setBackground(new java.awt.Color(184, 216, 216));
        btnmanager.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnmanager.setText("Manager");
        btnmanager.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagerActionPerformed(evt);
            }
        });
        jPanel1.add(btnmanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 60));

        btnrider.setBackground(new java.awt.Color(184, 216, 216));
        btnrider.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnrider.setText("Rider");
        btnrider.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnrider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriderActionPerformed(evt);
            }
        });
        jPanel1.add(btnrider, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, 60));

        btnnewuser.setBackground(new java.awt.Color(241, 169, 160));
        btnnewuser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnnewuser.setText("New User");
        btnnewuser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnnewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewuserActionPerformed(evt);
            }
        });
        jPanel1.add(btnnewuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 140, 50));

        tblaccounts.setBackground(new java.awt.Color(184, 216, 216));
        tblaccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblaccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaccountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblaccountsMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tblaccounts);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 480, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewuserActionPerformed

        AdminNewUserPage ANUP = new AdminNewUserPage();
        ANUP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnnewuserActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        AdminReportPage ARP = new AdminReportPage();
        ARP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        AdminFeedbackPage AFP = new AdminFeedbackPage();
        AFP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        AdminHomePage AHP = new AdminHomePage();
        AHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed

        AdminProfile AP = new AdminProfile();
        AP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnprofileActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed

        LoginForm LF = new LoginForm();
        LF.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed

        btnlogout.setVisible(true);
        btnprofile.setVisible(true);

    }//GEN-LAST:event_btnmoreActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

        DefaultTableModel model = (DefaultTableModel) tblaccounts.getModel();
        model.setRowCount(0);

        table();

        txtsearch1.setText("🔍 SEARCH");


    }//GEN-LAST:event_formMouseClicked

    private void btnallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblaccounts.getModel();
        model.setRowCount(0);

        table();

    }//GEN-LAST:event_btnallActionPerformed

    private void btnmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagerActionPerformed

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;

            DefaultTableModel model = (DefaultTableModel) tblaccounts.getModel();
            model.setRowCount(0);

            Object[] tableLines = br.lines().toArray();

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (data[2].equals("manager")) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnmanagerActionPerformed

    private void btnriderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriderActionPerformed

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;

            DefaultTableModel model = (DefaultTableModel) tblaccounts.getModel();
            model.setRowCount(0);

            Object[] tableLines = br.lines().toArray();

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (data[2].equals("rider")) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnriderActionPerformed

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;

            DefaultTableModel model = (DefaultTableModel) tblaccounts.getModel();
            model.setRowCount(0);

            Object[] tableLines = br.lines().toArray();

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (data[2].equals("customer")) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btncustomerActionPerformed

    private void txtsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch1KeyReleased

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;
            DefaultTableModel model = (DefaultTableModel) tblaccounts.getModel();
            model.setRowCount(0);

            String word = txtsearch1.getText().toString().trim();
            Object[] tableLines = br.lines().toArray();

            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtsearch1KeyReleased

    private void txtsearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch1MouseClicked

        txtsearch1.setText("");

    }//GEN-LAST:event_txtsearch1MouseClicked

    private void tblaccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaccountsMouseClicked

        int row = tblaccounts.rowAtPoint(evt.getPoint());
        String id = tblaccounts.getValueAt(row, 1).toString();

        AdminViewAccountsPage AVAP = new AdminViewAccountsPage(id);

        transferdata.setoid(id);

        AVAP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_tblaccountsMouseClicked

    private void tblaccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaccountsMouseEntered
    }//GEN-LAST:event_tblaccountsMouseEntered

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
            java.util.logging.Logger.getLogger(AdminAccountsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAccountsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAccountsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAccountsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAccountsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnall;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmanager;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnnewuser;
    private javax.swing.JButton btnprofile;
    private javax.swing.JButton btnrider;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblname;
    public javax.swing.JTable tblaccounts;
    private javax.swing.JTextField txtsearch1;
    // End of variables declaration//GEN-END:variables
}
