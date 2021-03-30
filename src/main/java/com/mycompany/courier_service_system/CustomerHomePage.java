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

public class CustomerHomePage extends javax.swing.JFrame {

    public CustomerHomePage() {

        initComponents();
        this.setLocationRelativeTo(null);

        Profile p = new Profile();
        p.loadprofile(transferdata.getdata());

        lblname.setText("<html>Welcome Back, " + p.getName().trim() + "</html>");

        table();

        JTableHeader header = tblorder.getTableHeader();
        header.setBackground(Color.decode("#4F6367"));
        header.setForeground(Color.white);

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

    }

    private void filterdata(String query) {

        DefaultTableModel table = (DefaultTableModel) tblorder.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(table);
        tblorder.setRowSorter(trs);

        trs.setRowFilter(RowFilter.regexFilter(query));

    }

    private void table() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstline = br.readLine().trim();
            String[] columnName = firstline.split(",");
            DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
            model.setColumnIdentifiers(columnName);

            tblorder.removeColumn(tblorder.getColumnModel().getColumn(2));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(2));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(3));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(3));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(4));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(4));

            int headerheight = 30;
            JTableHeader header = tblorder.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tblorder.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblorder.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblorder.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);

            Object[] lines = br.lines().toArray();

            tblorder.setRowHeight(30);

            Profile p = new Profile();
            p.loadprofile(transferdata.getdata());

            for (int i = 0; i < lines.length; i++) {

                String query = p.getId().trim();
                filterdata(query);

                String[] row = lines[i].toString().split(",");
                model.addRow(row);

            }

        } catch (Exception ex) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btndelivered = new javax.swing.JButton();
        btndelivering = new javax.swing.JButton();
        btnpending = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnmore = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        btnall = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 700));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblorder.setBackground(new java.awt.Color(184, 216, 216));
        tblorder.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblorderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblorder);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, 480, 420));

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndelivered.setBackground(new java.awt.Color(184, 216, 216));
        btndelivered.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btndelivered.setText("Delivered");
        btndelivered.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btndelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveredActionPerformed(evt);
            }
        });
        jPanel1.add(btndelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 140, 60));

        btndelivering.setBackground(new java.awt.Color(184, 216, 216));
        btndelivering.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btndelivering.setText("Delivering");
        btndelivering.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btndelivering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveringActionPerformed(evt);
            }
        });
        jPanel1.add(btndelivering, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, 60));

        btnpending.setBackground(new java.awt.Color(184, 216, 216));
        btnpending.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnpending.setText("Pending");
        btnpending.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnpending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpendingActionPerformed(evt);
            }
        });
        jPanel1.add(btnpending, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 60));

        btnlogout.setBackground(new java.awt.Color(241, 169, 160));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout1.png"))); // NOI18N
        btnlogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 50, 41));

        btnmore.setBackground(new java.awt.Color(241, 169, 160));
        btnmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/more1.png"))); // NOI18N
        btnmore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoreActionPerformed(evt);
            }
        });
        jPanel1.add(btnmore, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 50, 41));

        btnprofile.setBackground(new java.awt.Color(241, 169, 160));
        btnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile1.png"))); // NOI18N
        btnprofile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        jPanel1.add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 50, 41));

        btnall.setBackground(new java.awt.Color(184, 216, 216));
        btnall.setText("↻");
        btnall.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnall.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallActionPerformed(evt);
            }
        });
        jPanel1.add(btnall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 50, 50));

        txtsearch.setBackground(new java.awt.Color(122, 158, 159));
        txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsearch.setText("🔍 SEARCH");
        txtsearch.setToolTipText("");
        txtsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtsearchMousePressed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 420, 50));

        lblname.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblname.setText("Welcome Back, ");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 41));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed

        btnlogout.setVisible(true);
        btnprofile.setVisible(true);

    }//GEN-LAST:event_btnmoreActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed

        LoginForm LF = new LoginForm();
        LF.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnlogoutActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

        txtsearch.setText("🔍 SEARCH");

    }//GEN-LAST:event_formMouseClicked

    private void btnpendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpendingActionPerformed

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;

            DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
            model.setRowCount(0);

            Object[] tableLines = br.lines().toArray();

            Profile p = new Profile();
            p.loadprofile(transferdata.getdata());

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (data[4].equals("Pending") && data[8].equals(p.getId())) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnpendingActionPerformed

    private void btndeliveringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliveringActionPerformed

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;

            DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
            model.setRowCount(0);

            Object[] tableLines = br.lines().toArray();

            Profile p = new Profile();
            p.loadprofile(transferdata.getdata());

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (data[4].equals("Delivering") && data[8].equals(p.getId())) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btndeliveringActionPerformed

    private void btndeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliveredActionPerformed

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;

            DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
            model.setRowCount(0);

            Object[] tableLines = br.lines().toArray();

            Profile p = new Profile();
            p.loadprofile(transferdata.getdata());

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (data[4].equals("Delivered") && data[8].equals(p.getId())) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btndeliveredActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void btnallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
        model.setRowCount(0);

        table();

    }//GEN-LAST:event_btnallActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped

    }//GEN-LAST:event_txtsearchKeyTyped

    private void txtsearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMousePressed

        txtsearch.setText("");

    }//GEN-LAST:event_txtsearchMousePressed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;

            DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
            model.setRowCount(0);

            String word = txtsearch.getText().toString().trim();
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

    }//GEN-LAST:event_txtsearchKeyReleased

    private void tblorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderMouseClicked

        int row = tblorder.rowAtPoint(evt.getPoint());
        String oid = tblorder.getValueAt(row, 0).toString();

        CustomerCheckStatus CCS = new CustomerCheckStatus(oid);

        transferdata.setoid(oid);

        CCS.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_tblorderMouseClicked

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed

        CustomerProfile CP = new CustomerProfile();
        CP.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnprofileActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnall;
    private javax.swing.JButton btndelivered;
    private javax.swing.JButton btndelivering;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnpending;
    private javax.swing.JButton btnprofile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tblorder;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
