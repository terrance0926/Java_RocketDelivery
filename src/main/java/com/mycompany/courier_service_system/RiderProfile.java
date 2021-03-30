package com.mycompany.courier_service_system;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RiderProfile extends javax.swing.JFrame {

    public RiderProfile() {

        initComponents();
        this.setLocationRelativeTo(null);

        Profile p = new Profile();
            p.loadprofile(transferdata.getdata());

        lblid.setText(p.getId().trim());
        lblname1.setText(p.getName().trim());
        lblemail1.setText(p.getEmail().trim());
        lblphone1.setText(p.getContact().trim());
        txtusername.setText(p.getusername().trim());
        txtpassword.setText(p.getpass().trim());

        lblname1.setBackground(Color.decode("#7A9E9F"));
        lblemail1.setBackground(Color.decode("#7A9E9F"));
        lblphone1.setBackground(Color.decode("#7A9E9F"));

        jPanel3.setVisible(false);

        btnsave.setVisible(false);
        btncancel.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblphone1 = new javax.swing.JTextField();
        lblname1 = new javax.swing.JTextField();
        lblemail1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnmodify = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 50, 50));

        jPanel1.setBackground(new java.awt.Color(122, 158, 159));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("ID: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Email: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Phone Number: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Name: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        lblid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblid.setText("jLabel4");
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 190, -1));

        lblphone1.setEditable(false);
        lblphone1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblphone1.setText("jTextField1");
        lblphone1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));
        jPanel1.add(lblphone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 200, -1));

        lblname1.setEditable(false);
        lblname1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblname1.setText("jTextField1");
        lblname1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));
        jPanel1.add(lblname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, -1));

        lblemail1.setEditable(false);
        lblemail1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblemail1.setText("jTextField1");
        lblemail1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));
        jPanel1.add(lblemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, 480, 220));

        jPanel2.setBackground(new java.awt.Color(238, 245, 219));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsave.setBackground(new java.awt.Color(241, 169, 160));
        btnsave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 200, 50));

        btncancel.setBackground(new java.awt.Color(184, 216, 216));
        btncancel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btncancel.setText("Cancel");
        btncancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 200, 50));

        btnmodify.setBackground(new java.awt.Color(184, 216, 216));
        btnmodify.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnmodify.setText("Modify");
        btnmodify.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });
        jPanel2.add(btnmodify, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 200, 50));

        jPanel3.setBackground(new java.awt.Color(122, 158, 159));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Username: ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("Password: ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtusername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));
        jPanel3.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 200, 30));

        txtpassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));
        jPanel3.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 200, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 480, 180));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Profile");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        RiderHomePage RHP = new RiderHomePage();
        RHP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to save this changes?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            AllUsers au = new AllUsers();
            au.loaddata(lblid.getText());

            String id = lblid.getText().trim();
            String name = lblname1.getText().trim();
            String email = lblemail1.getText().trim();
            String phone = lblphone1.getText().trim();
            String username = txtusername.getText().trim();
            String pass = txtpassword.getText().trim();

            String data = "UserData.txt";

            File dd = new File(data);
            File temp = new File("tempUserData.txt");

            try {

                FileWriter fw = new FileWriter(temp);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                Scanner sc = new Scanner(dd);

                sc.useDelimiter("[,\n]");

                while (sc.hasNext()) {

                    String username2 = sc.next();
                    String pass2 = sc.next();
                    String role2 = sc.next();
                    String id2 = sc.next();
                    String name2 = sc.next();
                    String email2 = sc.next();
                    String phone2 = sc.next();

                    if (id2.equals(id)) {

                        pw.print(username + ",");
                        pw.print(pass + ",");
                        pw.print(role2 + ",");
                        pw.print(id2 + ",");
                        pw.print(name + ",");
                        pw.print(email + ",");
                        pw.print(phone + "\n");

                    } else {

                        pw.print(username2 + ",");
                        pw.print(pass2 + ",");
                        pw.print(role2 + ",");
                        pw.print(id2 + ",");
                        pw.print(name2 + ",");
                        pw.print(email2 + ",");
                        pw.print(phone2 + "\n");

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

                    transferdata.setdata(txtusername.getText());

                    RiderHomePage RHP = new RiderHomePage();
                    RHP.setVisible(true);
                    this.dispose();

                }

            } catch (IOException e) {

                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } else {
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to cancel this changes?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            RiderHomePage RHP = new RiderHomePage();
            RHP.setVisible(true);
            this.dispose();

        } else {
        }

    }//GEN-LAST:event_btncancelActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed

        btnmodify.setVisible(false);
        btnsave.setVisible(true);
        btncancel.setVisible(true);

        lblname1.setEditable(true);
        lblemail1.setEditable(true);
        lblphone1.setEditable(true);

        jPanel3.setVisible(true);

        lblname1.setBackground(Color.decode("#FFFFFF"));
        lblemail1.setBackground(Color.decode("#FFFFFF"));
        lblphone1.setBackground(Color.decode("#FFFFFF"));

    }//GEN-LAST:event_btnmodifyActionPerformed

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
            java.util.logging.Logger.getLogger(RiderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiderProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiderProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnmodify;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lblemail1;
    public javax.swing.JLabel lblid;
    private javax.swing.JTextField lblname1;
    private javax.swing.JTextField lblphone1;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
