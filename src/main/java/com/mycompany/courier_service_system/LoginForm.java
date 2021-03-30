package com.mycompany.courier_service_system;

import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {

        initComponents();

        this.setSize(500, 700);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Logbtn = new javax.swing.JButton();
        Nametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Passtxt = new javax.swing.JPasswordField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 245, 219));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(238, 245, 219));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 700));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logbtn.setBackground(new java.awt.Color(241, 169, 160));
        Logbtn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Logbtn.setText("LOG IN");
        Logbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));
        Logbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Logbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 350, 70));

        Nametxt.setBackground(new java.awt.Color(122, 158, 159));
        Nametxt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Nametxt.setForeground(new java.awt.Color(255, 255, 255));
        Nametxt.setText("    ENTER USERNAME");
        Nametxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        Nametxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NametxtMouseClicked(evt);
            }
        });
        jPanel1.add(Nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 270, 45));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ROCKET");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel7.setText("DELIVERY");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logogif.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 240, 110));

        Passtxt.setBackground(new java.awt.Color(122, 158, 159));
        Passtxt.setForeground(new java.awt.Color(255, 255, 255));
        Passtxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 99, 103), 2, true));
        jPanel1.add(Passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 270, 45));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogbtnActionPerformed

        Login a = new Login();

        a.setusername(Nametxt.getText());
        a.setpass(Passtxt.getText());

        if (a.login() == true && a.getRole().equals("admin")) {

            transferdata.setdata(Nametxt.getText());

            AdminHomePage AH = new AdminHomePage();
            AH.setVisible(true);
            this.dispose();

        } else if (a.login() == true && a.getRole().equals("manager")) {

            transferdata.setdata(Nametxt.getText());

            ManagerOrdersHomePage MOHP = new ManagerOrdersHomePage();
            MOHP.setVisible(true);
            this.dispose();

        } else if (a.login() == true && a.getRole().equals("customer")) {

            transferdata.setdata(Nametxt.getText());

            CustomerHomePage CHP = new CustomerHomePage();
            CHP.setVisible(true);
            this.dispose();

        } else if (a.login() == true && a.getRole().equals("rider")) {

            transferdata.setdata(Nametxt.getText());

            RiderHomePage RHP = new RiderHomePage();
            RHP.setVisible(true);
            this.dispose();

        } else {

            JOptionPane.showMessageDialog(null, "Wrong Password");

        }

    }//GEN-LAST:event_LogbtnActionPerformed

    private void NametxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NametxtMouseClicked

        Nametxt.setText("");

    }//GEN-LAST:event_NametxtMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

        Nametxt.setText("    ENTER USERNAME");

    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logbtn;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JPasswordField Passtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
