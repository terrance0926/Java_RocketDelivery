package com.mycompany.courier_service_system;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class AdminHomePage extends javax.swing.JFrame {

    public AdminHomePage() {

        initComponents();
        this.setLocationRelativeTo(null);

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

        loadtable();

        JTableHeader header = tblAO.getTableHeader();
        header.setBackground(Color.decode("#4F6367"));
        header.setForeground(Color.white);

        Profile p = new Profile();
        p.loadprofile(transferdata.getdata());

        lblGreet.setText("Welcome Back, " + p.getName().trim());
    }

    private void filterdata(String query) {

        DefaultTableModel loadtable = (DefaultTableModel) tblAO.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(loadtable);

        tblAO.setRowSorter(trs);

        trs.setRowFilter(RowFilter.regexFilter(query));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        lblGreet = new javax.swing.JLabel();
        txtsearch1 = new javax.swing.JTextField();
        btnPending = new javax.swing.JButton();
        btnHP = new javax.swing.JButton();
        btnDelivering = new javax.swing.JButton();
        btnDelivered = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAO = new javax.swing.JTable();
        btnOrders = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        btnAccounts = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnmore = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        btnreload = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnANO = new javax.swing.JButton();

        jButton9.setText("jButton6");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGreet.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblGreet.setText("jLabel1");
        getContentPane().add(lblGreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 18, -1, -1));

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearch1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch1KeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 420, 50));

        btnPending.setBackground(new java.awt.Color(184, 216, 216));
        btnPending.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnPending.setText("Pending");
        btnPending.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendingActionPerformed(evt);
            }
        });
        getContentPane().add(btnPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 110, 60));

        btnHP.setBackground(new java.awt.Color(184, 216, 216));
        btnHP.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnHP.setText("High-Priority");
        btnHP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHPActionPerformed(evt);
            }
        });
        getContentPane().add(btnHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 60));

        btnDelivering.setBackground(new java.awt.Color(184, 216, 216));
        btnDelivering.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnDelivering.setText("Delivering");
        btnDelivering.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnDelivering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveringActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelivering, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 110, 60));

        btnDelivered.setBackground(new java.awt.Color(184, 216, 216));
        btnDelivered.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnDelivered.setText("Delivered");
        btnDelivered.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveredActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 110, 60));

        tblAO.setBackground(new java.awt.Color(184, 216, 216));
        tblAO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAOMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAO);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 207, 480, 358));

        btnOrders.setBackground(new java.awt.Color(184, 216, 216));
        btnOrders.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnOrders.setText("Orders");
        btnOrders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 125, 40));

        btnFeedback.setBackground(new java.awt.Color(122, 158, 159));
        btnFeedback.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnFeedback.setText("Feedback");
        btnFeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 125, 40));

        btnAccounts.setBackground(new java.awt.Color(122, 158, 159));
        btnAccounts.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAccounts.setText("Accounts");
        btnAccounts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        btnAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 660, 125, 40));

        btnReport.setBackground(new java.awt.Color(122, 158, 159));
        btnReport.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnReport.setText("Report");
        btnReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 660, 125, 40));

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

        btnlogout.setBackground(new java.awt.Color(241, 169, 160));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout1.png"))); // NOI18N
        btnlogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 10, 50, 41));

        btnprofile.setBackground(new java.awt.Color(241, 169, 160));
        btnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile1.png"))); // NOI18N
        btnprofile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        getContentPane().add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 10, 50, 41));

        btnreload.setBackground(new java.awt.Color(184, 216, 216));
        btnreload.setText("↻");
        btnreload.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnreload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreloadActionPerformed(evt);
            }
        });
        getContentPane().add(btnreload, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 50, 50));

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnANO.setBackground(new java.awt.Color(241, 169, 160));
        btnANO.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnANO.setText("New Order");
        btnANO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANOActionPerformed(evt);
            }
        });
        jPanel1.add(btnANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, 140, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed

        AdminFeedbackPage AFP = new AdminFeedbackPage();
        AFP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountsActionPerformed

        AdminAccountsPage AAP = new AdminAccountsPage();
        AAP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAccountsActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        AdminReportPage ARP = new AdminReportPage();
        ARP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnReportActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANOActionPerformed

        AdminNewOrderPage ANOP = new AdminNewOrderPage();
        ANOP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnANOActionPerformed

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
    }//GEN-LAST:event_btnOrdersActionPerformed

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

        AdminProfile AP = new AdminProfile();
        AP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnprofileActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

    }//GEN-LAST:event_formMouseClicked

    private void btnPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendingActionPerformed

        String query = "Pending";
        filterdata(query);

    }//GEN-LAST:event_btnPendingActionPerformed

    private void btnHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHPActionPerformed

        String query = "High";
        filterdata(query);

    }//GEN-LAST:event_btnHPActionPerformed

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

            DefaultTableModel model = (DefaultTableModel) tblAO.getModel();
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

    private void tblAOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAOMouseClicked

        int row = tblAO.getSelectedRow();
        String id = tblAO.getValueAt(row, 0).toString();

        transferdata.setoid(id);

        AdminViewOrderPage AVOP = new AdminViewOrderPage(id);

        AVOP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_tblAOMouseClicked

    private void txtsearch1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch1KeyPressed

    }//GEN-LAST:event_txtsearch1KeyPressed

    private void btnreloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreloadActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblAO.getModel();
        model.setRowCount(0);
        loadtable();

        DefaultTableModel loadtable = (DefaultTableModel) tblAO.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(loadtable);
        tblAO.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(""));

    }//GEN-LAST:event_btnreloadActionPerformed

    private void loadtable() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");

            DefaultTableModel model = (DefaultTableModel) tblAO.getModel();
            model.setColumnIdentifiers(columnsName);

            tblAO.setRowHeight(30);

            tblAO.removeColumn(tblAO.getColumnModel().getColumn(5));
            tblAO.removeColumn(tblAO.getColumnModel().getColumn(6));
            tblAO.removeColumn(tblAO.getColumnModel().getColumn(6));

            int headerheight = 30;

            JTableHeader header = tblAO.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            tblAO.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblAO.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblAO.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tblAO.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            tblAO.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            tblAO.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            tblAO.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnANO;
    private javax.swing.JButton btnAccounts;
    private javax.swing.JButton btnDelivered;
    private javax.swing.JButton btnDelivering;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnHP;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnPending;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnprofile;
    private javax.swing.JButton btnreload;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGreet;
    private javax.swing.JTable tblAO;
    private javax.swing.JTextField txtsearch1;
    // End of variables declaration//GEN-END:variables
}
