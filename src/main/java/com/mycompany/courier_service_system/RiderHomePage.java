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

public class RiderHomePage extends javax.swing.JFrame {

    public RiderHomePage() {

        initComponents();
        this.setLocationRelativeTo(null);

        Profile p = new Profile();
            p.loadprofile(transferdata.getdata());

        lblwelcome1.setText("Welcome Back, " + p.getName().trim());

        table();

        JTableHeader header = tblorder.getTableHeader();
        header.setBackground(Color.decode("#4F6367"));
        header.setForeground(Color.white);

        btnlogout4.setVisible(false);
        btnprofile.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lblwelcome = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblwelcome1 = new javax.swing.JLabel();
        btnmore = new javax.swing.JButton();
        btnlogout4 = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtsearch1 = new javax.swing.JTextField();
        btnall = new javax.swing.JButton();
        btndelivering = new javax.swing.JButton();
        btndelivered = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setSize(new java.awt.Dimension(500, 700));

        lblwelcome.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblwelcome.setText("Welcome Back, ");

        btnlogout.setText("Logout");
        btnlogout.setActionCommand("");

        txtsearch.setText("🔍 SEARCH");

        jButton1.setText("Pending");

        jButton2.setText("Delivered");

        jButton3.setText("Picked-up");

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtsearch)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(lblwelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblwelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblwelcome1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblwelcome1.setText("Welcome Back, ");
        getContentPane().add(lblwelcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 282, 41));

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

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsearch1.setBackground(new java.awt.Color(122, 158, 159));
        txtsearch1.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsearch1.setText("🔍 SEARCH");
        txtsearch1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        txtsearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearch1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtsearch1MousePressed(evt);
            }
        });
        txtsearch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearch1KeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 420, 50));

        btnall.setBackground(new java.awt.Color(184, 216, 216));
        btnall.setText("↻");
        btnall.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallActionPerformed(evt);
            }
        });
        jPanel1.add(btnall, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 50, 50));

        btndelivering.setBackground(new java.awt.Color(184, 216, 216));
        btndelivering.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btndelivering.setText("Delivering");
        btndelivering.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btndelivering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveringActionPerformed(evt);
            }
        });
        jPanel1.add(btndelivering, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 60));

        btndelivered.setBackground(new java.awt.Color(184, 216, 216));
        btndelivered.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btndelivered.setText("Delivered");
        btndelivered.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btndelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveredActionPerformed(evt);
            }
        });
        jPanel1.add(btndelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 240, 60));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblorderMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tblorder);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 480, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

            tblorder.removeColumn(tblorder.getColumnModel().getColumn(1));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(4));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(4));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(4));
            tblorder.removeColumn(tblorder.getColumnModel().getColumn(5));

            int headerheight = 30;
            JTableHeader header = tblorder.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tblorder.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblorder.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblorder.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tblorder.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            tblorder.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

            Object[] lines = br.lines().toArray();

            tblorder.setRowHeight(30);

            Profile p = new Profile();
            p.loadprofile(transferdata.getdata());

            for (int i = 0; i < lines.length; i++) {

                String query = p.getId();
                filterdata(query);

                String[] row = lines[i].toString().split(",");
                model.addRow(row);

            }

            br.close();

        } catch (Exception ex) {
        }

    }

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed

        btnlogout4.setVisible(true);
        btnprofile.setVisible(true);

    }//GEN-LAST:event_btnmoreActionPerformed

    private void btnlogout4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogout4ActionPerformed

        LoginForm LF = new LoginForm();
        LF.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnlogout4ActionPerformed

    private void btnprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofileActionPerformed

        RiderProfile RP = new RiderProfile();

        RP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnprofileActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        btnlogout4.setVisible(false);
        btnprofile.setVisible(false);

        txtsearch1.setText("🔍 SEARCH");

    }//GEN-LAST:event_formMouseClicked

    private void btnallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
        model.setRowCount(0);

        table();

    }//GEN-LAST:event_btnallActionPerformed

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

                if (data[4].equals("Delivered") && data[9].equals(p.getId())) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btndeliveredActionPerformed

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

                if (data[4].equals("Delivering") && data[9].equals(p.getId())) {

                    model.addRow(data);

                }
            }

            br.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_btndeliveringActionPerformed

    private void txtsearch1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearch1MousePressed

    }//GEN-LAST:event_txtsearch1MousePressed

    private void txtsearch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearch1KeyReleased

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstLine = br.readLine().trim();
            String columnsName = firstLine;
            DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
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

    private void tblorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderMouseClicked

        int row = tblorder.rowAtPoint(evt.getPoint());
        String oid = tblorder.getValueAt(row, 0).toString();

        transferdata.setoid(oid);

        RiderCheckOrder rco = new RiderCheckOrder(oid);

        rco.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_tblorderMouseClicked

    private void tblorderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblorderMouseEntered
    }//GEN-LAST:event_tblorderMouseEntered

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
            java.util.logging.Logger.getLogger(RiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiderHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiderHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnall;
    private javax.swing.JButton btndelivered;
    private javax.swing.JButton btndelivering;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnlogout4;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnprofile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JLabel lblwelcome1;
    public javax.swing.JTable tblorder;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch1;
    // End of variables declaration//GEN-END:variables
}
