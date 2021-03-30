package com.mycompany.courier_service_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ManagerOrdersPage extends javax.swing.JFrame {

    public ManagerOrdersPage() {

        initComponents();

    }

    public ManagerOrdersPage(String abc) {

        initComponents();
        this.setLocationRelativeTo(null);

        jLabel1.setVisible(false);

        Order o = new Order();
        o.loaddata(abc);

        lbloid.setText(o.getoid().trim());
        lblocd.setText(o.getocd().trim());
        lblodd.setText(o.getodd().trim());
        lblop.setText(o.getpriority().trim());
        lbloa.setText(o.getaddress().trim());
        lblcid.setText(o.getcid().trim());
        jComboBox1.addItem(o.getrid().trim());
        jLabel1.setText(o.getrid().trim());
        lblstatus.setText(o.getstatus().trim());

        try {

            Customer c = new Customer();
            c.loaddata(lblcid.getText());

            lblcn.setText(c.getcname().trim());
            lblce.setText(c.getcemail().trim());
            lblcpn.setText(c.getcphone().trim());

        } catch (Exception e) {

        }

        try {

            Rider r = new Rider();
            r.loaddata(jLabel1.getText());

            lblrn.setText(r.getrname().trim());
            lblre.setText(r.getremail().trim());
            lblrpn.setText(r.getrphone().trim());

        } catch (Exception e) {
        }

        loaddataform();

        btnassign.setVisible(false);

    }

    public void loaddataform() {

        String a = "-";

        if (a.equals(jLabel1.getText())) {

            try {

                String role = "rider";

                BufferedReader reader = new BufferedReader(new FileReader("UserData.txt"));

                Object[] tableLines = reader.lines().toArray();
                reader.close();

                for (Object tableLine : tableLines) {

                    String line = tableLine.toString().trim();
                    String[] data = line.split(",");

                    if (role.equals(data[2])) {

                        jComboBox1.addItem(data[3]);

                    }
                }

            } catch (Exception e) {
            }

        } else {

            jComboBox1.setEnabled(false);
            btnassign.setVisible(false);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblstatus = new javax.swing.JLabel();
        pnlmain = new javax.swing.JPanel();
        pnlcustomer = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblcpn = new javax.swing.JLabel();
        lblce = new javax.swing.JLabel();
        lblcn = new javax.swing.JLabel();
        lblcid = new javax.swing.JLabel();
        pnlrider = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblrpn = new javax.swing.JLabel();
        lblre = new javax.swing.JLabel();
        lblrn = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        pnlorder = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbloid = new javax.swing.JLabel();
        lblodd = new javax.swing.JLabel();
        lblop = new javax.swing.JLabel();
        lblocd = new javax.swing.JLabel();
        lbloa = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnassign = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(184, 216, 216));
        jButton1.setText("↩");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 50, 50));

        jPanel1.setBackground(new java.awt.Color(79, 99, 103));

        lblstatus.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(204, 204, 204));
        lblstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblstatus.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 100));

        pnlmain.setBackground(new java.awt.Color(255, 153, 153));
        pnlmain.setLayout(new java.awt.CardLayout());

        pnlcustomer.setBackground(new java.awt.Color(122, 158, 159));
        pnlcustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel18.setText("Customer ID: ");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel19.setText("Customer Name: ");

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel20.setText("Customer Email: ");

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel21.setText("<html>Customer Phone Number: </html>");

        lblcpn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblcpn.setText("jLabel4");

        lblce.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblce.setText("jLabel4");

        lblcn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblcn.setText("jLabel4");

        lblcid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblcid.setText("jLabel4");

        javax.swing.GroupLayout pnlcustomerLayout = new javax.swing.GroupLayout(pnlcustomer);
        pnlcustomer.setLayout(pnlcustomerLayout);
        pnlcustomerLayout.setHorizontalGroup(
            pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcustomerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlcustomerLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(lblcid, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlcustomerLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(lblcn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlcustomerLayout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(lblcpn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlcustomerLayout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(lblce, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        pnlcustomerLayout.setVerticalGroup(
            pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcustomerLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lblcid))
                .addGap(39, 39, 39)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(lblcn))
                .addGap(39, 39, 39)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(lblce))
                .addGap(28, 28, 28)
                .addGroup(pnlcustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcpn))
                .addContainerGap(49, Short.MAX_VALUE))
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
        jLabel29.setText("<html>Rider   Phone Number: </html>");

        lblrpn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblrpn.setText("jLabel4");

        lblre.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblre.setText("jLabel4");

        lblrn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblrn.setText("jLabel4");

        jComboBox1.setBackground(new java.awt.Color(79, 99, 103));
        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlriderLayout = new javax.swing.GroupLayout(pnlrider);
        pnlrider.setLayout(pnlriderLayout);
        pnlriderLayout.setHorizontalGroup(
            pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlriderLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlriderLayout.createSequentialGroup()
                        .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblrpn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblrn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlriderLayout.setVerticalGroup(
            pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlriderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lblrn))
                .addGap(39, 39, 39)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlriderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlriderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblrpn)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlmain.add(pnlrider, "card2");

        pnlorder.setBackground(new java.awt.Color(122, 158, 159));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Order ID: ");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("<html>Order Created Date: </html>");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("<html>Order Delivered Date: </html>");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Order Priority: ");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("Order Address: ");

        lbloid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbloid.setText("jLabel4");

        lblodd.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblodd.setText("jLabel4");

        lblop.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblop.setText("jLabel4");

        lblocd.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblocd.setText("jLabel4");

        lbloa.setEditable(false);
        lbloa.setBackground(new java.awt.Color(122, 158, 159));
        lbloa.setColumns(20);
        lbloa.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbloa.setLineWrap(true);
        lbloa.setRows(1);
        lbloa.setWrapStyleWord(true);
        lbloa.setBorder(null);

        javax.swing.GroupLayout pnlorderLayout = new javax.swing.GroupLayout(pnlorder);
        pnlorder.setLayout(pnlorderLayout);
        pnlorderLayout.setHorizontalGroup(
            pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlorderLayout.createSequentialGroup()
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlorderLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(lblodd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlorderLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(90, 90, 90)
                                .addComponent(lblop, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlorderLayout.createSequentialGroup()
                                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(100, 100, 100)
                                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbloid, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(lblocd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12)
                        .addGap(90, 90, 90)
                        .addComponent(lbloa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlorderLayout.setVerticalGroup(
            pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlorderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbloid))
                .addGap(11, 11, 11)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblocd)))
                .addGap(15, 15, 15)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblodd)))
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblop))
                    .addGroup(pnlorderLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbloa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        pnlmain.add(pnlorder, "card2");

        getContentPane().add(pnlmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 173, -1, 300));

        jPanel3.setBackground(new java.awt.Color(238, 245, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(184, 216, 216));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton3.setText("Order");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 150, 50));

        jButton4.setBackground(new java.awt.Color(184, 216, 216));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton4.setText("Rider");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 150, 50));

        jButton2.setBackground(new java.awt.Color(184, 216, 216));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton2.setText("Customer");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 160, 50));

        btnassign.setBackground(new java.awt.Color(241, 169, 160));
        btnassign.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnassign.setText("Assign rider");
        btnassign.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        btnassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignActionPerformed(evt);
            }
        });
        jPanel3.add(btnassign, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 340, 80));

        lblTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblTitle.setText("Orders Details");
        jPanel3.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        pnlmain.removeAll();
        pnlmain.repaint();
        pnlmain.revalidate();

        pnlmain.add(pnlorder);
        pnlmain.repaint();
        pnlmain.revalidate();

        btnassign.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ManagerOrdersHomePage MOHP = new ManagerOrdersHomePage();
        MOHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        pnlmain.removeAll();
        pnlmain.repaint();
        pnlmain.revalidate();

        pnlmain.add(pnlcustomer);
        pnlmain.repaint();
        pnlmain.revalidate();

        btnassign.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        pnlmain.removeAll();
        pnlmain.repaint();
        pnlmain.revalidate();

        pnlmain.add(pnlrider);
        pnlmain.repaint();
        pnlmain.revalidate();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String RN = "";
        String RE = "";
        String RPN = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader("UserData.txt"));
            Object[] tableLines = br.lines().toArray();
            br.close();

            for (Object tableLine : tableLines) {

                String line = tableLine.toString().trim();
                String[] data = line.split(",");

                if (jComboBox1.getSelectedItem().toString().equals(data[3])) {

                    RN = data[4];
                    RE = data[5];
                    RPN = data[6];

                }
            }

        } catch (Exception e) {
        }

        lblrn.setText(RN);
        lblre.setText(RE);
        lblrpn.setText(RPN);

        if (!String.valueOf(jComboBox1.getSelectedItem()).equals("-")) {

            btnassign.setVisible(true);

        } else {

            btnassign.setVisible(false);

        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to save the changes?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            String oid = lbloid.getText();
            String rid = String.valueOf(jComboBox1.getSelectedItem());
            String os = "Delivering";
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

                        pw.print(oid2 + ",");
                        pw.print(ocd2 + ",");
                        pw.print(odd2 + ",");

                        pw.print(ODT2 + ",");
                        pw.print(os + ",");
                        pw.print(OR2 + ",");

                        pw.print(op2 + ",");
                        pw.print(oa2 + ",");
                        pw.print(cid2 + ",");
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

            ManagerOrdersHomePage MOHP = new ManagerOrdersHomePage();
            MOHP.setVisible(true);
            this.setVisible(false);

        } else {
        }

    }//GEN-LAST:event_btnassignActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(ManagerOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerOrdersPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerOrdersPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnassign;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblce;
    private javax.swing.JLabel lblcid;
    private javax.swing.JLabel lblcn;
    private javax.swing.JLabel lblcpn;
    private javax.swing.JTextArea lbloa;
    private javax.swing.JLabel lblocd;
    private javax.swing.JLabel lblodd;
    public javax.swing.JLabel lbloid;
    private javax.swing.JLabel lblop;
    private javax.swing.JLabel lblre;
    private javax.swing.JLabel lblrn;
    private javax.swing.JLabel lblrpn;
    public javax.swing.JLabel lblstatus;
    private javax.swing.JPanel pnlcustomer;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JPanel pnlorder;
    private javax.swing.JPanel pnlrider;
    // End of variables declaration//GEN-END:variables
}
