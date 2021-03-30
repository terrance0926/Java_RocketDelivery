package com.mycompany.courier_service_system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class CustomerFeedback extends javax.swing.JFrame {

    public CustomerFeedback() {

        initComponents();
        this.setLocationRelativeTo(null);

        jLabel2.setVisible(false);

        newid();

    }

    private void newid() {

        try {

            FileReader FR = new FileReader(new File("feedback.txt"));
            LineNumberReader LNR = new LineNumberReader(FR);

            int linecount = 0;

            while (LNR.readLine() != null) {

                linecount++;

            }

            FR.close();
            LNR.close();

            jLabel2.setText("f" + (Integer.toString(linecount)));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfeedback = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        btnsubmit.setBackground(new java.awt.Color(241, 169, 160));
        btnsubmit.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 240, 70));

        txtfeedback.setBackground(new java.awt.Color(184, 216, 216));
        txtfeedback.setColumns(20);
        txtfeedback.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtfeedback.setLineWrap(true);
        txtfeedback.setRows(1);
        txtfeedback.setText("Type Feedback Here........");
        txtfeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        txtfeedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfeedbackMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtfeedback);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 480, 330));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Feedback");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CustomerHomePage CHP = new CustomerHomePage();
        CHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfeedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfeedbackMouseClicked

        txtfeedback.setText("");

    }//GEN-LAST:event_txtfeedbackMouseClicked

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed

        Profile p = new Profile();
        p.loadprofile(transferdata.getdata());

        try {

            String d = txtfeedback.getText();

            if (d.equals("")) {

                JOptionPane.showMessageDialog(null, "Please do not leave blank!");

            } else {

                File file = new File("Feedback.txt");

                String fbdetail = txtfeedback.getText().trim();
                String cid = p.getId();
                String oid = transferdata.getoid();
                String fid = jLabel2.getText();

                try ( PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Feedback.txt", true)))) {

                    pw.append(fid + ",");
                    pw.append(fbdetail + ",");
                    pw.append(cid + ",");
                    pw.append(oid);

                    pw.append("\n");
                    pw.close();

                    JOptionPane.showMessageDialog(null, "Added Successfully");

                    dispose();
                    CustomerHomePage CHP = new CustomerHomePage();
                    CHP.setVisible(true);

                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Error");

        }

    }//GEN-LAST:event_btnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtfeedback;
    // End of variables declaration//GEN-END:variables
}
