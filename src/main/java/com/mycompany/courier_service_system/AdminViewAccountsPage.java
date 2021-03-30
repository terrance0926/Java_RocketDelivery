package com.mycompany.courier_service_system;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdminViewAccountsPage extends javax.swing.JFrame {

    public AdminViewAccountsPage() {

        initComponents();

    }

    public AdminViewAccountsPage(String abc) {

        initComponents();
        this.setLocationRelativeTo(null);

        AllUsers au = new AllUsers();
        au.loaddata(abc);

        txtid.setText(au.getid().trim());
        txtname.setText(au.getname().trim());
        txtemail.setText(au.getemail().trim());
        txtphone.setText(au.getcontact().trim());
        lblrole.setText(au.getrole().trim());
        txtusername.setText(au.getun().trim());
        txtpassword.setText(au.getpass().trim());

        txtid.setBackground(Color.decode("#7A9E9F"));
        txtname.setBackground(Color.decode("#7A9E9F"));
        txtemail.setBackground(Color.decode("#7A9E9F"));
        txtphone.setBackground(Color.decode("#7A9E9F"));
        txtusername.setBackground(Color.decode("#7A9E9F"));
        txtpassword.setBackground(Color.decode("#7A9E9F"));

        btnsave.setVisible(false);
        btncancel.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblrole = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        btnmodify = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Accounts");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 32, -1, -1));

        jPanel1.setBackground(new java.awt.Color(122, 158, 159));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("ID: ");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setText("Email: ");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Phone Number: ");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Name: ");

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));

        txtemail.setEditable(false);
        txtemail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtemail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));

        txtphone.setEditable(false);
        txtphone.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtphone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("Role: ");

        lblrole.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblrole.setText("Role");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtphone, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblrole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, 500, -1));

        jPanel3.setBackground(new java.awt.Color(238, 245, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsave.setBackground(new java.awt.Color(241, 169, 160));
        btnsave.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 200, 50));

        jPanel2.setBackground(new java.awt.Color(122, 158, 159));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Username: ");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("Password: ");

        txtusername.setEditable(false);
        txtusername.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));

        txtpassword.setEditable(false);
        txtpassword.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 1, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 376, 500, 180));

        btnmodify.setBackground(new java.awt.Color(184, 216, 216));
        btnmodify.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnmodify.setText("Modify");
        btnmodify.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });
        jPanel3.add(btnmodify, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 200, 50));

        btndelete.setBackground(new java.awt.Color(241, 169, 160));
        btndelete.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 200, 50));

        btncancel.setBackground(new java.awt.Color(184, 216, 216));
        btncancel.setText("Cancel");
        btncancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(122, 158, 159), 2, true));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel3.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 200, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AdminAccountsPage AAP = new AdminAccountsPage();
        AAP.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed

        btnmodify.setVisible(false);
        btndelete.setVisible(false);
        btnsave.setVisible(true);
        btncancel.setVisible(true);

        txtname.setEditable(true);
        txtemail.setEditable(true);
        txtphone.setEditable(true);
        txtusername.setEditable(true);
        txtpassword.setEditable(true);

        txtname.setBackground(Color.decode("#FFFFFF"));
        txtemail.setBackground(Color.decode("#FFFFFF"));
        txtphone.setBackground(Color.decode("#FFFFFF"));
        txtusername.setBackground(Color.decode("#FFFFFF"));
        txtpassword.setBackground(Color.decode("#FFFFFF"));

    }//GEN-LAST:event_btnmodifyActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete this data?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            String id = txtid.getText().trim();

            String ud = ("UserData.txt");
            File dd = new File(ud);
            File temp = new File("temp.txt");

            try {

                FileWriter fw = new FileWriter(temp);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                Scanner sc = new Scanner(new File(ud));
                sc.useDelimiter("[,\n]");

                while (sc.hasNext()) {
                    String username2 = sc.next();
                    String pass2 = sc.next();
                    String role2 = sc.next();
                    String id2 = sc.next();
                    String name2 = sc.next();
                    String email2 = sc.next();
                    String phone2 = sc.next();

                    if (!id2.equals(id)) {

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

                int ok = JOptionPane.showConfirmDialog(null, "Delete Successfully", "", JOptionPane.DEFAULT_OPTION);

                if (ok == JOptionPane.OK_OPTION) {

                    AdminAccountsPage AAP = new AdminAccountsPage();
                    AAP.setVisible(true);
                    this.dispose();

                }

            } catch (IOException e) {

                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } else {
        }


    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Are you sure to save this changes?", "WARNING", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            String username = txtusername.getText().trim();
            String pass = txtpassword.getText().trim();
            String role = lblrole.getText().trim();
            String id = txtid.getText().trim();
            String name = txtname.getText().trim();
            String email = txtemail.getText().trim();
            String phone = txtphone.getText().trim();

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
                        pw.print(role + ",");
                        pw.print(id + ",");
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

                    AdminAccountsPage AAP = new AdminAccountsPage();
                    AAP.setVisible(true);
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

            AdminAccountsPage AAP = new AdminAccountsPage();
            AAP.setVisible(true);
            this.dispose();

        } else {
        }

    }//GEN-LAST:event_btncancelActionPerformed

    static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AdminViewAccountsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewAccountsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewAccountsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewAccountsPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewAccountsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnmodify;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblrole;
    private javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
