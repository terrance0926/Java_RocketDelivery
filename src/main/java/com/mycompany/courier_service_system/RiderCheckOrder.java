package com.mycompany.courier_service_system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RiderCheckOrder extends javax.swing.JFrame {

    public RiderCheckOrder() {

        initComponents();

    }

    public RiderCheckOrder(String abc) {

        initComponents();
        this.setLocationRelativeTo(null);

        lbldeli.setVisible(false);

        Order o = new Order();
        o.loaddata(abc);

        lbloid.setText(o.getoid().trim());
        lbloa.setText(o.getaddress().trim());
        lblcid.setText(o.getcid().trim());
        lblstatus.setText(o.getstatus().trim());
        lblremark.setText(o.getremarks().trim());

        try {

            Customer c = new Customer();
            c.loaddata(lblcid.getText());

            lblcname.setText(c.getcname().trim());
            lblcphone.setText(c.getcphone().trim());

        } catch (Exception e) {

        }

        String status = "Delivered";

        if (status.equals(lblstatus.getText())) {

            btnupdate.setVisible(false);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblstatus = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        lbldeli = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbloid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblcid = new javax.swing.JLabel();
        lblcname = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblcphone = new javax.swing.JLabel();
        lbloa = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblremark = new javax.swing.JTextArea();

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

        lblid.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lblid.setText("Order Details");
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 32, -1, -1));

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
                .addGap(46, 46, 46)
                .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, -1, -1));

        btnupdate.setBackground(new java.awt.Color(241, 169, 160));
        btnupdate.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnupdate.setText("Update order's status to DELIVERED");
        btnupdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 480, 70));

        lbldeli.setText("Delivered");
        lbldeli.setEnabled(false);
        getContentPane().add(lbldeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 32, 55, -1));

        jPanel3.setBackground(new java.awt.Color(238, 245, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(122, 158, 159));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("Order ID: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lbloid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbloid.setText("jLabel3");
        jPanel2.add(lbloid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Order Address: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Customer ID: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Customer Name: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblcid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblcid.setText("jLabel3");
        jPanel2.add(lblcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        lblcname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblcname.setText("jLabel3");
        jPanel2.add(lblcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("<html>Customer Phone Number: </html>");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, -1));

        lblcphone.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblcphone.setText("jLabel3");
        jPanel2.add(lblcphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        lbloa.setEditable(false);
        lbloa.setBackground(new java.awt.Color(122, 158, 159));
        lbloa.setColumns(20);
        lbloa.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbloa.setLineWrap(true);
        lbloa.setRows(1);
        lbloa.setWrapStyleWord(true);
        lbloa.setBorder(null);
        jPanel2.add(lbloa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 220, 80));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 159, 500, 310));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("Remarks: ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        lblremark.setBackground(new java.awt.Color(184, 216, 216));
        lblremark.setColumns(20);
        lblremark.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblremark.setRows(1);
        lblremark.setText("-");
        lblremark.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        jScrollPane1.setViewportView(lblremark);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 480, 80));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        RiderHomePage RHP = new RiderHomePage();
        RHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to update status?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");

            LocalDateTime now = LocalDateTime.now();

            String odd = dtf.format(now);
            String odt = dtf1.format(now);
            String status = lbldeli.getText().trim();
            String oid = lbloid.getText().trim();
            String remark = lblremark.getText().trim();

            String data = "order.txt";

            File dd = new File(data);
            File temp = new File("temp.txt");

            try {

                FileWriter fw = new FileWriter(temp);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                Scanner sc = new Scanner(dd);

                sc.useDelimiter("[,\n]");

                while (sc.hasNext()) {

                    String oid2 = sc.next();
                    String ocd2 = sc.next();
                    String odd2 = sc.next();
                    String odt2 = sc.next();
                    String status2 = sc.next();
                    String remark2 = sc.next();
                    String priority2 = sc.next();
                    String address2 = sc.next();
                    String cid2 = sc.next();
                    String rid2 = sc.next();

                    if (oid2.equals(oid)) {

                        pw.print(oid + ",");
                        pw.print(ocd2 + ",");
                        pw.print(odd + ",");
                        pw.print(odt + ",");
                        pw.print(status + ",");
                        pw.print(remark + ",");
                        pw.print(priority2 + ",");
                        pw.print(address2 + ",");
                        pw.print(cid2 + ",");
                        pw.print(rid2 + "\n");

                    } else {

                        pw.print(oid2 + ",");
                        pw.print(ocd2 + ",");
                        pw.print(odd2 + ",");
                        pw.print(odt2 + ",");
                        pw.print(status2 + ",");
                        pw.print(remark2 + ",");
                        pw.print(priority2 + ",");
                        pw.print(address2 + ",");
                        pw.print(cid2 + ",");
                        pw.print(rid2 + "\n");

                    }
                }

                sc.close();
                pw.flush();
                pw.close();
                bw.close();

                dd.delete();
                temp.renameTo(dd);

                int ok = JOptionPane.showConfirmDialog(null, "Update Successfully", "", JOptionPane.DEFAULT_OPTION);

                if (ok == JOptionPane.OK_OPTION) {

                    RiderHomePage RHP = new RiderHomePage();
                    RHP.setVisible(true);
                    this.dispose();

                }

            } catch (IOException e) {

                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
        }

    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(RiderCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiderCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiderCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiderCheckOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiderCheckOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcid;
    private javax.swing.JLabel lblcname;
    private javax.swing.JLabel lblcphone;
    private javax.swing.JLabel lbldeli;
    public javax.swing.JLabel lblid;
    private javax.swing.JTextArea lbloa;
    private javax.swing.JLabel lbloid;
    private javax.swing.JTextArea lblremark;
    private javax.swing.JLabel lblstatus;
    // End of variables declaration//GEN-END:variables
}
