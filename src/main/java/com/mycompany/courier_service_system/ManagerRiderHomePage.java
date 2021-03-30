package com.mycompany.courier_service_system;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ManagerRiderHomePage extends javax.swing.JFrame {

    public ManagerRiderHomePage() {

        initComponents();
        this.setLocationRelativeTo(null);

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

        loadtable1();
        loadtable2();

        JTableHeader header = tblRI.getTableHeader();
        header.setBackground(Color.decode("#4F6367"));
        header.setForeground(Color.white);

        JTableHeader header1 = tblR_O.getTableHeader();
        header1.setBackground(Color.decode("#4F6367"));
        header1.setForeground(Color.white);

        Profile p = new Profile();
        p.loadprofile(transferdata.getdata());

        lbltitle.setText("Welcome Back, " + p.getName().trim());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbltitle = new javax.swing.JLabel();
        txtsearch1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRI = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblR_O = new javax.swing.JTable();
        btnmore = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        txtsearch2 = new javax.swing.JTextField();
        btnReload1 = new javax.swing.JButton();
        btnReload2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        btnorder = new javax.swing.JButton();
        btnRiders = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitle.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbltitle.setText("jLabel1");
        getContentPane().add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 50));

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
        getContentPane().add(txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 421, 50));

        tblRI.setBackground(new java.awt.Color(184, 216, 216));
        tblRI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblRI);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 480, 170));

        tblR_O.setBackground(new java.awt.Color(184, 216, 216));
        tblR_O.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblR_O);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 435, 480, 180));

        btnmore.setBackground(new java.awt.Color(241, 169, 160));
        btnmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/more1.png"))); // NOI18N
        btnmore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnmore, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 41));

        btnlogout.setBackground(new java.awt.Color(241, 169, 160));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout1.png"))); // NOI18N
        btnlogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 50, 41));

        btnprofile.setBackground(new java.awt.Color(241, 169, 160));
        btnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile1.png"))); // NOI18N
        btnprofile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        getContentPane().add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 50, 41));

        txtsearch2.setBackground(new java.awt.Color(122, 158, 159));
        txtsearch2.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsearch2.setText("🔍 SEARCH");
        txtsearch2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        txtsearch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearch2MouseClicked(evt);
            }
        });
        txtsearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch2KeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 381, 421, 50));

        btnReload1.setBackground(new java.awt.Color(184, 216, 216));
        btnReload1.setText("↻");
        btnReload1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnReload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReload1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnReload1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 111, 50, 50));

        btnReload2.setBackground(new java.awt.Color(184, 216, 216));
        btnReload2.setText("↻");
        btnReload2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnReload2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReload2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnReload2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 381, 50, 50));

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setBackground(new java.awt.Color(238, 245, 219));
        label1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        label1.setText("Rider Information");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        label2.setBackground(new java.awt.Color(238, 245, 219));
        label2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        label2.setText("Parcel status");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 124, -1));

        btnorder.setBackground(new java.awt.Color(122, 158, 159));
        btnorder.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnorder.setText("Orders");
        btnorder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });
        jPanel1.add(btnorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 250, 40));

        btnRiders.setBackground(new java.awt.Color(184, 216, 216));
        btnRiders.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRiders.setForeground(new java.awt.Color(255, 255, 255));
        btnRiders.setText("Riders");
        btnRiders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnRiders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRidersActionPerformed(evt);
            }
        });
        jPanel1.add(btnRiders, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRidersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRidersActionPerformed

    }//GEN-LAST:event_btnRidersActionPerformed

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed

        ManagerOrdersHomePage MOHP = new ManagerOrdersHomePage();
        MOHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnorderActionPerformed

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed

        btnlogout.setVisible(true);
        btnprofile.setVisible(true);

    }//GEN-LAST:event_btnmoreActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed

        LoginForm LF = new LoginForm();
        LF.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed

        ManagerProfile MP = new ManagerProfile();
        MP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnprofileActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

    }//GEN-LAST:event_formMouseClicked

    private void txtsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch1KeyReleased

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");

            DefaultTableModel model = (DefaultTableModel) tblRI.getModel();
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

    private void txtsearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch2KeyReleased

        try {

            BufferedReader br = new BufferedReader(new FileReader("Order.txt"));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");

            DefaultTableModel model = (DefaultTableModel) tblR_O.getModel();
            model.setRowCount(0);

            String word = txtsearch2.getText().toString().trim();
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

    }//GEN-LAST:event_txtsearch2KeyReleased

    private void txtsearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch1MouseClicked

        txtsearch1.setText("");

    }//GEN-LAST:event_txtsearch1MouseClicked

    private void txtsearch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch2MouseClicked

        txtsearch2.setText("");

    }//GEN-LAST:event_txtsearch2MouseClicked

    private void btnReload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReload1ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblRI.getModel();
        model.setRowCount(0);

        loadtable1();

        txtsearch1.setText("🔍 SEARCH");

    }//GEN-LAST:event_btnReload1ActionPerformed

    private void btnReload2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReload2ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblR_O.getModel();
        model.setRowCount(0);

        loadtable2();

        txtsearch2.setText("🔍 SEARCH");

    }//GEN-LAST:event_btnReload2ActionPerformed

    private void loadtable1() {

        try {

            String role = "rider";
            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");

            DefaultTableModel model = (DefaultTableModel) tblRI.getModel();
            model.setColumnIdentifiers(columnsName);

            int headerheight = 30;
            JTableHeader header = tblRI.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tblRI.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblRI.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblRI.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

            Object[] tableLines = br.lines().toArray();

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (role.equals(data[2])) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

        tblRI.setRowHeight(30);
        tblRI.removeColumn(tblRI.getColumnModel().getColumn(0));
        tblRI.removeColumn(tblRI.getColumnModel().getColumn(0));
        tblRI.removeColumn(tblRI.getColumnModel().getColumn(0));

    }

    private void loadtable2() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) tblR_O.getModel();
            model.setColumnIdentifiers(columnsName);

            tblR_O.setRowHeight(30);
            tblR_O.removeColumn(tblR_O.getColumnModel().getColumn(1));
            tblR_O.removeColumn(tblR_O.getColumnModel().getColumn(1));
            tblR_O.removeColumn(tblR_O.getColumnModel().getColumn(1));
            tblR_O.removeColumn(tblR_O.getColumnModel().getColumn(2));
            tblR_O.removeColumn(tblR_O.getColumnModel().getColumn(2));
            tblR_O.removeColumn(tblR_O.getColumnModel().getColumn(2));
            tblR_O.removeColumn(tblR_O.getColumnModel().getColumn(2));

            int headerheight = 30;
            JTableHeader header = tblR_O.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            tblR_O.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblR_O.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblR_O.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

            Object[] tableLines = br.lines().toArray();

            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }

            br.close();

        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(ManagerRiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerRiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerRiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerRiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerRiderHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReload1;
    private javax.swing.JButton btnReload2;
    private javax.swing.JButton btnRiders;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnprofile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTable tblRI;
    private javax.swing.JTable tblR_O;
    private javax.swing.JTextField txtsearch1;
    private javax.swing.JTextField txtsearch2;
    // End of variables declaration//GEN-END:variables
}
