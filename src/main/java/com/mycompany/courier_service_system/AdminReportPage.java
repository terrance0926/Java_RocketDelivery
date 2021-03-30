package com.mycompany.courier_service_system;

import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AdminReportPage extends javax.swing.JFrame {

    public AdminReportPage() {

        initComponents();
        this.setLocationRelativeTo(null);

        JTableHeader header = tblreport.getTableHeader();
        header.setBackground(Color.decode("#4F6367"));
        header.setForeground(Color.white);

        Profile p = new Profile();
        p.loadprofile(transferdata.getdata());

        lblname.setText("Welcome Back, " + p.getName().trim());

        btnlogout.setVisible(false);
        btnprofile.setVisible(false);

        combotype.setModel(new DefaultComboBoxModel<>(new String[]{
            "--Select Type--", "User Report", "Order Report"
        }));

        combodetail.setModel(new DefaultComboBoxModel<>(new String[]{
            "-------------------"
        }));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnmore = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnprofile = new javax.swing.JButton();
        combodetail = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combotype = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnorders = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblreport = new javax.swing.JTable();

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

        jButton7.setBackground(new java.awt.Color(122, 158, 159));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton7.setText("Accounts");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 250, 40));

        jButton6.setBackground(new java.awt.Color(122, 158, 159));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton6.setText("Feedback");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, 250, 40));

        jButton8.setBackground(new java.awt.Color(184, 216, 216));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Report");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 660, 250, 40));

        btnmore.setBackground(new java.awt.Color(241, 169, 160));
        btnmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/more1.png"))); // NOI18N
        btnmore.setActionCommand("");
        btnmore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnmore, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 41));

        btnlogout.setBackground(new java.awt.Color(241, 169, 160));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout1.png"))); // NOI18N
        btnlogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 50, 41));

        btnprofile.setBackground(new java.awt.Color(241, 169, 160));
        btnprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile1.png"))); // NOI18N
        btnprofile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofileActionPerformed(evt);
            }
        });
        getContentPane().add(btnprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 50, 41));

        combodetail.setBackground(new java.awt.Color(184, 216, 216));
        combodetail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combodetail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        combodetail.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combodetailItemStateChanged(evt);
            }
        });
        getContentPane().add(combodetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 200, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Report Details: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Type of Report: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        combotype.setBackground(new java.awt.Color(184, 216, 216));
        combotype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combotype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        combotype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combotypeItemStateChanged(evt);
            }
        });
        getContentPane().add(combotype, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 200, 30));

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnorders.setBackground(new java.awt.Color(122, 158, 159));
        btnorders.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnorders.setText("Orders");
        btnorders.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        btnorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordersActionPerformed(evt);
            }
        });
        jPanel1.add(btnorders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 250, 40));

        jButton1.setBackground(new java.awt.Color(241, 169, 160));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setText("Generate Report");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 350, 80));

        tblreport.setBackground(new java.awt.Color(184, 216, 216));
        tblreport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblreport);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 980, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        AdminAccountsPage AAP = new AdminAccountsPage();
        AAP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        AdminFeedbackPage AFP = new AdminFeedbackPage();
        AFP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordersActionPerformed

        AdminHomePage AHP = new AdminHomePage();
        AHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnordersActionPerformed

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

    private void combotypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combotypeItemStateChanged

        String type = combotype.getSelectedItem().toString();

        if (type == "User Report") {

            combodetail.setModel(new DefaultComboBoxModel<>(new String[]{
                "--Select Details--", "All Users Report", "Manager Report", "Rider Report", "Customer Report"
            }));

            DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
            model.setRowCount(0);

            usertable();

        } else if (type == "Order Report") {

            combodetail.setModel(new DefaultComboBoxModel<>(new String[]{
                "--Select Details--", "All Orders Report", "Pending Orders Report", "Delivering Orders Report", "Delivered Orders Report", "High Priority Orders Report"
            }));

            DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
            model.setRowCount(0);

            ordertable();

        } else {
        }

    }//GEN-LAST:event_combotypeItemStateChanged

    private void combodetailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combodetailItemStateChanged

        try {

            String details = combodetail.getSelectedItem().toString();

            if (details == "Manager Report") {

                try {
                    BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

                    String firstLine = br.readLine().trim();
                    String columnsName = firstLine;

                    DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
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

            } else if (details == "All Users Report") {

                DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
                model.setRowCount(0);

                usertable();

            } else if (details == "Rider Report") {

                try {
                    BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

                    String firstLine = br.readLine().trim();
                    String columnsName = firstLine;

                    DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
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

            } else if (details == "Customer Report") {

                try {
                    BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

                    String firstLine = br.readLine().trim();
                    String columnsName = firstLine;

                    DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
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

            } else if (details == "All Orders Report") {

                DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
                model.setRowCount(0);

                ordertable();

            } else if (details == "Pending Orders Report") {

                try {
                    BufferedReader br = new BufferedReader(new FileReader("order.txt"));

                    String firstLine = br.readLine().trim();
                    String columnsName = firstLine;

                    DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
                    model.setRowCount(0);

                    Object[] tableLines = br.lines().toArray();

                    for (Object tableLine : tableLines) {

                        String line = tableLine.toString().trim();
                        String[] data = line.split(",");

                        if (data[4].equals("Pending")) {

                            model.addRow(data);

                        }
                    }

                    br.close();

                } catch (Exception e) {
                }

            } else if (details == "Delivering Orders Report") {

                try {
                    BufferedReader br = new BufferedReader(new FileReader("order.txt"));

                    String firstLine = br.readLine().trim();
                    String columnsName = firstLine;

                    DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
                    model.setRowCount(0);

                    Object[] tableLines = br.lines().toArray();

                    for (Object tableLine : tableLines) {

                        String line = tableLine.toString().trim();
                        String[] data = line.split(",");

                        if (data[4].equals("Delivering")) {

                            model.addRow(data);

                        }
                    }

                    br.close();

                } catch (Exception e) {
                }

            } else if (details == "Delivered Orders Report") {

                try {
                    BufferedReader br = new BufferedReader(new FileReader("order.txt"));

                    String firstLine = br.readLine().trim();
                    String columnsName = firstLine;

                    DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
                    model.setRowCount(0);

                    Object[] tableLines = br.lines().toArray();

                    for (Object tableLine : tableLines) {

                        String line = tableLine.toString().trim();
                        String[] data = line.split(",");

                        if (data[4].equals("Delivered")) {

                            model.addRow(data);

                        }
                    }

                    br.close();

                } catch (Exception e) {
                }

            } else if (details == "High Priority Orders Report") {

                try {
                    BufferedReader br = new BufferedReader(new FileReader("order.txt"));

                    String firstLine = br.readLine().trim();
                    String columnsName = firstLine;

                    DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
                    model.setRowCount(0);

                    Object[] tableLines = br.lines().toArray();

                    for (Object tableLine : tableLines) {

                        String line = tableLine.toString().trim();
                        String[] data = line.split(",");

                        if (data[6].equals("High")) {

                            model.addRow(data);

                        }
                    }

                    br.close();

                } catch (Exception e) {
                }

            } else {
            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_combodetailItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            String details = combodetail.getSelectedItem().toString();

            if (details == "Manager Report") {

                MessageFormat header = new MessageFormat("Manager Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "All Users Report") {

                MessageFormat header = new MessageFormat("All Users Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "Rider Report") {

                MessageFormat header = new MessageFormat("Rider Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "Customer Report") {

                MessageFormat header = new MessageFormat("Customer Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "All Orders Report") {

                MessageFormat header = new MessageFormat("All Orders Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "Pending Orders Report") {

                MessageFormat header = new MessageFormat("Pending Orders Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "Delivering Orders Report") {

                MessageFormat header = new MessageFormat("Delivering Orders Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "Delivered Orders Report") {

                MessageFormat header = new MessageFormat("Delivered Orders Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else if (details == "High Priority Orders Report") {

                MessageFormat header = new MessageFormat("High Priority Orders Report");

                try {

                    PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
                    set.add(OrientationRequested.LANDSCAPE);
                    tblreport.print(JTable.PrintMode.FIT_WIDTH, header, null, false, set, false);

                    JOptionPane.showMessageDialog(null, "Report Genereted");

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Please Try again");

                }

            } else {

                JOptionPane.showMessageDialog(null, "Please Select All Fields");

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void usertable() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));

            String firstline = br.readLine().trim();
            String[] columnName = firstline.split(",");

            DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
            model.setColumnIdentifiers(columnName);

            int headerheight = 30;
            JTableHeader header = tblreport.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            tblreport.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);

            Object[] lines = br.lines().toArray();

            tblreport.setRowHeight(30);

            for (int i = 0; i < lines.length; i++) {

                String[] row = lines[i].toString().split(",");
                model.addRow(row);

            }

            br.close();

        } catch (Exception ex) {
        }

    }

    private void ordertable() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("order.txt"));

            String firstline = br.readLine().trim();
            String[] columnName = firstline.split(",");
            DefaultTableModel model = (DefaultTableModel) tblreport.getModel();
            model.setColumnIdentifiers(columnName);

            int headerheight = 30;
            JTableHeader header = tblreport.getTableHeader();
            header.setPreferredSize(new Dimension(100, headerheight));

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            tblreport.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
            tblreport.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);

            Object[] lines = br.lines().toArray();

            tblreport.setRowHeight(30);

            for (int i = 0; i < lines.length; i++) {

                String[] row = lines[i].toString().split(",");
                model.addRow(row);

            }

            br.close();

        } catch (Exception ex) {
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
            java.util.logging.Logger.getLogger(AdminReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminReportPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminReportPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnorders;
    private javax.swing.JButton btnprofile;
    private javax.swing.JComboBox<String> combodetail;
    private javax.swing.JComboBox<String> combotype;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tblreport;
    // End of variables declaration//GEN-END:variables
}
