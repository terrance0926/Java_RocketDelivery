package com.mycompany.courier_service_system;

public class CustomerCheckStatus extends javax.swing.JFrame {

    public CustomerCheckStatus() {

        initComponents();

    }

    public CustomerCheckStatus(String abc) {

        initComponents();
        this.setLocationRelativeTo(null);

        Order o = new Order();
        o.loaddata(abc);

        lblstatus.setText(o.getstatus().trim());
        lbloid.setText(o.getoid().trim());
        lblocd.setText(o.getocd().trim());
        lblodd.setText(o.getodd().trim());
        lblodt.setText(o.getodt().trim());
        lbloa.setText(o.getaddress().trim());
        lblrid.setText(o.getrid().trim());
        lblR.setText(o.getremarks().trim());
        try {

            Rider r = new Rider();
            r.loaddata(lblrid.getText());

            lblrname.setText(r.getrname().trim());
            lblrphone.setText(r.getrphone().trim());

        } catch (Exception e) {

        }

        String status = "Delivered";

        if (status.equals(lblstatus.getText())) {

            btnfeedback.setVisible(true);

        } else {

            btnfeedback.setVisible(false);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblstatus = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbloid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblocd = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblodd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbloa = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        lblodt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblrname = new javax.swing.JLabel();
        lblrphone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblrid = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblR = new javax.swing.JTextArea();
        btnfeedback = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();

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
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

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

        jPanel4.setBackground(new java.awt.Color(238, 245, 219));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel5.setText("<html>Order Created Date: </html>");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, -1));

        lblocd.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblocd.setText("jLabel3");
        jPanel2.add(lblocd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("<html>Order Delivered Date: </html>");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Order Address: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        lblodd.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblodd.setText("jLabel3");
        jPanel2.add(lblodd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jScrollPane1.setBorder(null);

        lbloa.setEditable(false);
        lbloa.setBackground(new java.awt.Color(122, 158, 159));
        lbloa.setColumns(20);
        lbloa.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lbloa.setLineWrap(true);
        lbloa.setRows(1);
        lbloa.setWrapStyleWord(true);
        lbloa.setBorder(null);
        jScrollPane1.setViewportView(lbloa);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 220, 70));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("<html>Order Delivered Time: </html>");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, -1));

        lblodt.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblodt.setText("jLabel3");
        jPanel2.add(lblodt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 500, 320));

        jPanel3.setBackground(new java.awt.Color(122, 158, 159));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("Rider Name: ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setText("Remarks: ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 123, -1));

        lblrname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblrname.setText("-");
        jPanel3.add(lblrname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 220, -1));

        lblrphone.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblrphone.setText("-");
        jPanel3.add(lblrphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 210, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setText("Rider ID: ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lblrid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblrid.setText("jLabel3");
        jPanel3.add(lblrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setText("<html>Rider Phone Number: </html>");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 123, -1));

        lblR.setEditable(false);
        lblR.setBackground(new java.awt.Color(122, 158, 159));
        lblR.setColumns(20);
        lblR.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblR.setLineWrap(true);
        lblR.setRows(1);
        lblR.setWrapStyleWord(true);
        lblR.setBorder(null);
        jPanel3.add(lblR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 220, 60));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 500, 240));

        btnfeedback.setBackground(new java.awt.Color(241, 169, 160));
        btnfeedback.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnfeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedback1.png"))); // NOI18N
        btnfeedback.setText("Add Feedback");
        btnfeedback.setToolTipText("");
        btnfeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnfeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfeedbackActionPerformed(evt);
            }
        });
        jPanel4.add(btnfeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 410, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 800));

        jScrollPane3.setBorder(null);
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 220, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CustomerHomePage CHP = new CustomerHomePage();
        CHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnfeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfeedbackActionPerformed

        CustomerFeedback CF = new CustomerFeedback();
        CF.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnfeedbackActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCheckStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfeedback;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea lblR;
    public javax.swing.JLabel lblid;
    private javax.swing.JTextArea lbloa;
    private javax.swing.JLabel lblocd;
    private javax.swing.JLabel lblodd;
    private javax.swing.JLabel lblodt;
    public javax.swing.JLabel lbloid;
    private javax.swing.JLabel lblrid;
    private javax.swing.JLabel lblrname;
    private javax.swing.JLabel lblrphone;
    private javax.swing.JLabel lblstatus;
    // End of variables declaration//GEN-END:variables
}
