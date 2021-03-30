package com.mycompany.courier_service_system;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdminViewOrderPage extends javax.swing.JFrame {

    public AdminViewOrderPage() {

        initComponents();

    }

    public AdminViewOrderPage(String abc) {

        initComponents();
        this.setLocationRelativeTo(null);

        btnsave.setVisible(false);
        btncancel.setVisible(false);

        txtOID.setBackground(Color.decode("#7A9E9F"));
        txtOCD.setBackground(Color.decode("#7A9E9F"));
        txtODD.setBackground(Color.decode("#7A9E9F"));
        txtOP.setBackground(Color.decode("#7A9E9F"));
        lblOA.setBackground(Color.decode("#7A9E9F"));

        Order o = new Order();
        o.loaddata(abc);

        txtOCD.setText(o.getocd().trim());
        txtODD.setText(o.getodd().trim());
        txtOP.setText(o.getpriority().trim());
        lblOA.setText(o.getaddress().trim());
        lblCID.setText(o.getcid().trim());
        lblRID.setText(o.getrid().trim());
        LBLstatus.setText(o.getstatus().trim());
        txtOID.setText(o.getoid().trim());

        try {

            Customer c = new Customer();
            c.loaddata(lblCID.getText());

            lblCN.setText(c.getcname().trim());
            lblCE.setText(c.getcemail().trim());
            lblCPN.setText(c.getcphone().trim());

        } catch (Exception e) {

        }

        try {

            Rider r = new Rider();
            r.loaddata(lblRID.getText());

            lblRN.setText(r.getrname().trim());
            lblRE.setText(r.getremail().trim());
            lblRPN.setText(r.getrphone().trim());

        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnVO = new javax.swing.JButton();
        btnVC = new javax.swing.JButton();
        btnVR = new javax.swing.JButton();
        pnlmain = new javax.swing.JPanel();
        pnlorder = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtOID = new javax.swing.JTextField();
        txtOCD = new javax.swing.JTextField();
        txtODD = new javax.swing.JTextField();
        txtOP = new javax.swing.JTextField();
        lblOA = new javax.swing.JTextArea();
        pnlcustomer = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblCID = new javax.swing.JLabel();
        lblCPN = new javax.swing.JLabel();
        lblCE = new javax.swing.JLabel();
        lblCN = new javax.swing.JLabel();
        pnlrider = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblRID = new javax.swing.JLabel();
        lblRN = new javax.swing.JLabel();
        lblRE = new javax.swing.JLabel();
        lblRPN = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LBLstatus = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnmodify = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(516, 698));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(184, 216, 216));
        btnBack.setText("↩");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 50, 50));

        btnVO.setBackground(new java.awt.Color(184, 216, 216));
        btnVO.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnVO.setText("Order");
        btnVO.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVOActionPerformed(evt);
            }
        });
        getContentPane().add(btnVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 533, 154, 47));

        btnVC.setBackground(new java.awt.Color(184, 216, 216));
        btnVC.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnVC.setText("Customer");
        btnVC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVCActionPerformed(evt);
            }
        });
        getContentPane().add(btnVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 533, 152, 47));

        btnVR.setBackground(new java.awt.Color(184, 216, 216));
        btnVR.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnVR.setText("Rider");
        btnVR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnVR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVRActionPerformed(evt);
            }
        });
        getContentPane().add(btnVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 533, 148, 46));

        pnlmain.setBackground(new java.awt.Color(255, 153, 153));
        pnlmain.setLayout(new java.awt.CardLayout());

        pnlorder.setBackground(new java.awt.Color(122, 158, 159));
        pnlorder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Order ID: ");
        jLabel4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel4PropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Order Created Date: ");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Order Delivered Date: ");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Order Priority: ");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("Order Address: ");

        txtOID.setEditable(false);
        txtOID.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtOID.setText("jTextField1");
        txtOID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 158, 159)));

        txtOCD.setEditable(false);
        txtOCD.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtOCD.setText("jTextField2");
        txtOCD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 158, 159)));

        txtODD.setEditable(false);
        txtODD.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtODD.setText("jTextField3");
        txtODD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 158, 159)));
        txtODD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtODDActionPerformed(evt);
            }
        });

        txtOP.setEditable(false);
        txtOP.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtOP.setText("jTextField4");
        txtOP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 158, 159)));
        txtOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOPActionPerformed(evt);
            }
        });

        lblOA.setEditable(false);
        lblOA.setBackground(new java.awt.Color(122, 158, 159));
        lblOA.setColumns(20);
        lblOA.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblOA.setLineWrap(true);
        lblOA.setRows(1);
        lblOA.setWrapStyleWord(true);
        lblOA.setBorder(null);

        javax.swing.GroupLayout pnlorderLayout = new javax.swing.GroupLayout(pnlorder);
        pnlorder.setLayout(pnlorderLayout);
        pnlorderLayout.setHorizontalGroup(
            pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlorderLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(175, 175, 175)
                        .addComponent(txtOID, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(82, 82, 82)
                        .addComponent(txtOCD, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(68, 68, 68)
                        .addComponent(txtODD, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(127, 127, 127)
                        .addComponent(lblOA, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(128, 128, 128)
                        .addComponent(txtOP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlorderLayout.setVerticalGroup(
            pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlorderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtOID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(txtOCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10))
                    .addComponent(txtODD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11))
                    .addComponent(txtOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        pnlmain.add(pnlorder, "card2");

        pnlcustomer.setBackground(new java.awt.Color(122, 158, 159));
        pnlcustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel18.setText("Customer ID: ");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel19.setText("Customer Name: ");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setText("Customer Email: ");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel21.setText("Customer Phone Number: ");

        lblCID.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCID.setText("jLabel4");

        lblCPN.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCPN.setText("jLabel4");

        lblCE.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCE.setText("jLabel4");

        lblCN.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCN.setText("jLabel4");

        javax.swing.GroupLayout pnlcustomerLayout = new javax.swing.GroupLayout(pnlcustomer);
        pnlcustomer.setLayout(pnlcustomerLayout);
        pnlcustomerLayout.setHorizontalGroup(
            pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcustomerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(lblCPN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        pnlcustomerLayout.setVerticalGroup(
            pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcustomerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblCID))
                .addGap(40, 40, 40)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblCN))
                .addGap(40, 40, 40)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblCE))
                .addGap(40, 40, 40)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblCPN))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pnlmain.add(pnlcustomer, "card2");

        pnlrider.setBackground(new java.awt.Color(122, 158, 159));
        pnlrider.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel22.setText("Rider ID: ");

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel23.setText("Rider Name: ");

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel28.setText("Rider Email: ");

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel29.setText("Rider Phone Number: ");

        lblRID.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblRID.setText("-");

        lblRN.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblRN.setText("-");

        lblRE.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblRE.setText("-");

        lblRPN.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblRPN.setText("-");

        javax.swing.GroupLayout pnlriderLayout = new javax.swing.GroupLayout(pnlrider);
        pnlrider.setLayout(pnlriderLayout);
        pnlriderLayout.setHorizontalGroup(
            pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlriderLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addGap(88, 88, 88)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRE, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(lblRN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRPN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        pnlriderLayout.setVerticalGroup(
            pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlriderLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lblRID))
                .addGap(40, 40, 40)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lblRN))
                .addGap(40, 40, 40)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblRE))
                .addGap(40, 40, 40)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblRPN))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pnlmain.add(pnlrider, "card2");

        getContentPane().add(pnlmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 224, -1, 300));

        jPanel3.setBackground(new java.awt.Color(238, 245, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(79, 99, 103));

        LBLstatus.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        LBLstatus.setForeground(new java.awt.Color(204, 204, 204));
        LBLstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLstatus.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(LBLstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LBLstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 500, 120));

        btnsave.setBackground(new java.awt.Color(241, 169, 160));
        btnsave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 95, 38));

        btncancel.setBackground(new java.awt.Color(184, 216, 216));
        btncancel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel3.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 94, 38));

        btndelete.setBackground(new java.awt.Color(241, 169, 160));
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 94, 38));

        btnmodify.setBackground(new java.awt.Color(184, 216, 216));
        btnmodify.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnmodify.setText("Modify");
        btnmodify.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });
        jPanel3.add(btnmodify, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 95, 38));

        lblTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblTitle.setText("Order Details");
        jPanel3.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 192, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVOActionPerformed

        pnlmain.removeAll();
        pnlmain.repaint();
        pnlmain.revalidate();

        pnlmain.add(pnlorder);
        pnlmain.repaint();
        pnlmain.revalidate();

    }//GEN-LAST:event_btnVOActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        AdminHomePage AHP = new AdminHomePage();
        AHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVCActionPerformed

        pnlmain.removeAll();
        pnlmain.repaint();
        pnlmain.revalidate();

        pnlmain.add(pnlcustomer);
        pnlmain.repaint();
        pnlmain.revalidate();

    }//GEN-LAST:event_btnVCActionPerformed

    private void btnVRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVRActionPerformed

        pnlmain.removeAll();
        pnlmain.repaint();
        pnlmain.revalidate();

        pnlmain.add(pnlrider);
        pnlmain.repaint();
        pnlmain.revalidate();

    }//GEN-LAST:event_btnVRActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        int option = JOptionPane.showConfirmDialog(this, "Are you sure to delete the data?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            String oid = txtOID.getText().trim();

            String order = ("order.txt");
            File a = new File(order);
            File tempdata = new File("temp.txt");

            try {
                FileWriter fw = new FileWriter(tempdata);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner sc = new Scanner(new File(order));
                sc.useDelimiter("[,\n]");

                while (sc.hasNext()) {
                    String oid2 = sc.next();
                    String ocd2 = sc.next();
                    String odd2 = sc.next();
                    String ODT2 = sc.next();
                    String OS2 = sc.next();
                    String OR2 = sc.next();
                    String op2 = sc.next();
                    String oa2 = sc.next();
                    String cid2 = sc.next();
                    String rid2 = sc.next();

                    if (!oid2.equals(oid)) {

                        pw.print(oid2 + ",");
                        pw.print(ocd2 + ",");
                        pw.print(odd2 + ",");

                        pw.print(ODT2 + ",");
                        pw.print(OS2 + ",");
                        pw.print(OR2 + ",");

                        pw.print(op2 + ",");
                        pw.print(oa2 + ",");
                        pw.print(cid2 + ",");
                        pw.print(rid2 + "\n");
                    }
                }
                sc.close();
                pw.flush();
                pw.close();
                bw.close();

                a.delete();
                tempdata.renameTo(a);

            } catch (IOException e) {

                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);

            }

            AdminHomePage AHP = new AdminHomePage();
            AHP.setVisible(true);
            this.dispose();

        } else {
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed

        btnmodify.setVisible(false);
        btndelete.setVisible(false);

        btnsave.setVisible(true);
        btncancel.setVisible(true);

        txtOCD.setEditable(true);
//        txtODD.setEditable(true);
        txtOP.setEditable(true);
        lblOA.setEditable(true);
        btnsave.setEnabled(true);

        txtOID.setBackground(Color.decode("#FFFFFF"));
        txtOCD.setBackground(Color.decode("#FFFFFF"));
        txtODD.setBackground(Color.decode("#FFFFFF"));
        txtOP.setBackground(Color.decode("#FFFFFF"));
        lblOA.setBackground(Color.decode("#FFFFFF"));

    }//GEN-LAST:event_btnmodifyActionPerformed

    private void jLabel4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel4PropertyChange
    }//GEN-LAST:event_jLabel4PropertyChange

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to save the changes?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            String oid = txtOID.getText().trim();
            String ocd = txtOCD.getText().trim();
            String odd = txtODD.getText().trim();
            String op = txtOP.getText().trim();
            String oa = lblOA.getText().trim();
            String cid = lblCID.getText().trim();
            String rid = lblRID.getText().trim();

            String order = ("order.txt");
            File a = new File(order);
            File tempdata = new File("temp.txt");

            try {
                FileWriter fw = new FileWriter(tempdata);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner sc = new Scanner(new File(order));
                sc.useDelimiter("[,\n]");

                while (sc.hasNext()) {
                    String oid2 = sc.next();
                    String ocd2 = sc.next();
                    String odd2 = sc.next();
                    String ODT2 = sc.next();
                    String OS2 = sc.next();
                    String OR2 = sc.next();
                    String op2 = sc.next();
                    String oa2 = sc.next();
                    String cid2 = sc.next();
                    String rid2 = sc.next();

                    if (oid2.equals(oid)) {

                        pw.print(oid + ",");
                        pw.print(ocd + ",");
                        pw.print(odd + ",");

                        pw.print(ODT2 + ",");
                        pw.print(OS2 + ",");
                        pw.print(OR2 + ",");

                        pw.print(op + ",");
                        pw.print(oa + ",");
                        pw.print(cid + ",");
                        pw.print(rid + "\n");

                    } else {
                        pw.print(oid2 + ",");
                        pw.print(ocd2 + ",");
                        pw.print(odd2 + ",");

                        pw.print(ODT2 + ",");
                        pw.print(OS2 + ",");
                        pw.print(OR2 + ",");

                        pw.print(op2 + ",");
                        pw.print(oa2 + ",");
                        pw.print(cid2 + ",");
                        pw.print(rid2 + "\n");

                    }
                }
                sc.close();
                pw.flush();
                pw.close();
                bw.close();

                a.delete();
                tempdata.renameTo(a);

            } catch (IOException e) {

                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);

            }

            AdminHomePage AH = new AdminHomePage();
            AH.setVisible(true);
            this.setVisible(false);

        } else {
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtODDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtODDActionPerformed
    }//GEN-LAST:event_txtODDActionPerformed

    private void txtOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOPActionPerformed
    }//GEN-LAST:event_txtOPActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to discard the changes?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            AdminHomePage AH = new AdminHomePage();
            AH.setVisible(true);
            this.dispose();

        } else {
        }

    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewOrderPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewOrderPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LBLstatus;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnVC;
    private javax.swing.JButton btnVO;
    private javax.swing.JButton btnVR;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnmodify;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCE;
    private javax.swing.JLabel lblCID;
    private javax.swing.JLabel lblCN;
    private javax.swing.JLabel lblCPN;
    private javax.swing.JTextArea lblOA;
    private javax.swing.JLabel lblRE;
    private javax.swing.JLabel lblRID;
    private javax.swing.JLabel lblRN;
    private javax.swing.JLabel lblRPN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlcustomer;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JPanel pnlorder;
    private javax.swing.JPanel pnlrider;
    private javax.swing.JTextField txtOCD;
    private javax.swing.JTextField txtODD;
    public javax.swing.JTextField txtOID;
    private javax.swing.JTextField txtOP;
    // End of variables declaration//GEN-END:variables
}
