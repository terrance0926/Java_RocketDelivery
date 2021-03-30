package com.mycompany.courier_service_system;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

public class ManagerOrdersHomePage extends javax.swing.JFrame {

    public ManagerOrdersHomePage() {

        initComponents();
        this.setLocationRelativeTo(null);

        btnlogout4.setVisible(false);
        btnprofile.setVisible(false);

        loadtable();

        JTableHeader header = tblMO.getTableHeader();
        header.setBackground(Color.decode("#4F6367"));
        header.setForeground(Color.white);

        Profile p = new Profile();
        p.loadprofile(transferdata.getdata());

        lbltitle.setText("Welcome Back, " + p.getName().trim());

    }

    private void filterdata(String query) {

        DefaultTableModel loadtable = (DefaultTableModel) tblMO.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(loadtable);
        tblMO.setRowSorter(trs);

        trs.setRowFilter(RowFilter.regexFilter(query));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblwelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbltitle = new javax.swing.JLabel();
        txtsearch1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMO = new javax.swing.JTable();
        btnmore = new javax.swing.JButton();
        btnlogout4 = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnDelivered = new javax.swing.JButton();
        btnDelivering = new javax.swing.JButton();
        btnPending = new javax.swing.JButton();
        btnHP = new javax.swing.JButton();
        btnRIders = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();

        lblwelcome.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblwelcome.setText("Welcome Back, ");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        btnlogout.setText("Logout");
        btnlogout.setActionCommand("");

        txtsearch.setText("🔍 SEARCH");

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
        getContentPane().add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 45));

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
        getContentPane().add(txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 420, 50));

        tblMO.setBackground(new java.awt.Color(184, 216, 216));
        tblMO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMOMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMO);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, 480, 380));

        btnmore.setBackground(new java.awt.Color(241, 169, 160));
        btnmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/more1.png"))); // NOI18N
        btnmore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnmore, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 48, 41));

        btnlogout4.setBackground(new java.awt.Color(241, 169, 160));
        btnlogout4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout1.png"))); // NOI18N
        btnlogout4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnlogout4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogout4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 50, 41));

        btnprofile.setBackground(new java.awt.Color(241, 169, 160));
        btnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile1.png"))); // NOI18N
        btnprofile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        getContentPane().add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 50, 41));

        jButton1.setBackground(new java.awt.Color(184, 216, 216));
        jButton1.setText("↻");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 50, 50));

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelivered.setBackground(new java.awt.Color(184, 216, 216));
        btnDelivered.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnDelivered.setText("Delivered");
        btnDelivered.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 110, 60));

        btnDelivering.setBackground(new java.awt.Color(184, 216, 216));
        btnDelivering.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnDelivering.setText("Delivering");
        btnDelivering.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnDelivering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveringActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelivering, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 110, 60));

        btnPending.setBackground(new java.awt.Color(184, 216, 216));
        btnPending.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnPending.setText("Pending");
        btnPending.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingActionPerformed(evt);
            }
        });
        jPanel1.add(btnPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 120, 60));

        btnHP.setBackground(new java.awt.Color(184, 216, 216));
        btnHP.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnHP.setText("High-Priority");
        btnHP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHPActionPerformed(evt);
            }
        });
        jPanel1.add(btnHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 60));

        btnRIders.setBackground(new java.awt.Color(122, 158, 159));
        btnRIders.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRIders.setText("Riders");
        btnRIders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        btnRIders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRIdersActionPerformed(evt);
            }
        });
        jPanel1.add(btnRIders, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 250, 40));

        btnOrders.setBackground(new java.awt.Color(184, 216, 216));
        btnOrders.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnOrders.setText("Orders");
        btnOrders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jPanel1.add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRIdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRIdersActionPerformed

        ManagerRiderHomePage MRHP = new ManagerRiderHomePage();
        MRHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnRIdersActionPerformed

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed

        btnlogout4.setVisible(true);
        btnprofile.setVisible(true);

    }//GEN-LAST:event_btnmoreActionPerformed

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed

        ManagerProfile MP = new ManagerProfile();
        MP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnprofileActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        btnlogout4.setVisible(false);
        btnprofile.setVisible(false);

    }//GEN-LAST:event_formMouseClicked

    private void btnlogout4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout4ActionPerformed

        LoginForm LF = new LoginForm();
        LF.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnlogout4ActionPerformed

    private void btnHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHPActionPerformed

        String query = "High";
        filterdata(query);

    }//GEN-LAST:event_btnHPActionPerformed

    private void btnPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingActionPerformed

        String query = "Pending";
        filterdata(query);

    }//GEN-LAST:event_btnPendingActionPerformed

    private void btnDeliveringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveringActionPerformed

        String query = "Delivering";
        filterdata(query);

    }//GEN-LAST:event_btnDeliveringActionPerformed

    private void btnDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveredActionPerformed

        String query = "Delivered";
        filterdata(query);

    }//GEN-LAST:event_btnDeliveredActionPerformed

    private void txtsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch1KeyReleased

        try {

            BufferedReader br = new BufferedReader(new FileReader("Order.txt"));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");

            DefaultTableModel model = (DefaultTableModel) tblMO.getModel();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblMO.getModel();
        model.setRowCount(0);
        loadtable();

        DefaultTableModel loadtable = (DefaultTableModel) tblMO.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(loadtable);

        tblMO.setRowSorter(trs);

        trs.setRowFilter(RowFilter.regexFilter(""));
        txtsearch1.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMOMouseClicked

        int row = tblMO.rowAtPoint(evt.getPoint());
        String id = tblMO.getValueAt(row, 0).toString();

        transferdata.setoid(id);

        ManagerOrdersPage MOP = new ManagerOrdersPage(id);

        MOP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_tblMOMouseClicked

    private void loadtable() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");

            DefaultTableModel model = (DefaultTableModel) tblMO.getModel();
            model.setColumnIdentifiers(columnsName);

            tblMO.setRowHeight(30);
            tblMO.removeColumn(tblMO.getColumnModel().getColumn(5));
            tblMO.removeColumn(tblMO.getColumnModel().getColumn(6));
            tblMO.removeColumn(tblMO.getColumnModel().getColumn(6));

            int headerheight = 30;
            JTableHeader header = tblMO.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tblMO.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblMO.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblMO.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tblMO.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            tblMO.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            tblMO.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            tblMO.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);

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
            java.util.logging.Logger.getLogger(ManagerOrdersHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerOrdersHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerOrdersHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerOrdersHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerOrdersHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelivered;
    private javax.swing.JButton btnDelivering;
    private javax.swing.JButton btnHP;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnPending;
    private javax.swing.JButton btnRIders;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnlogout4;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnprofile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JTable tblMO;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch1;
    // End of variables declaration//GEN-END:variables
}
