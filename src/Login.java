
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denis
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        usernamef = new javax.swing.JTextField();
        lbl_pass = new javax.swing.JLabel();
        passwordf = new javax.swing.JPasswordField();
        loginb = new javax.swing.JButton();
        signupb = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(133, 156, 191));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 99, 142));
        jLabel3.setText("VOTING SYSTEM");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/votebox.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(72, 99, 142));

        lbl_user.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("USERNAME");

        usernamef.setBackground(new java.awt.Color(72, 99, 142));
        usernamef.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usernamef.setForeground(new java.awt.Color(255, 255, 255));
        usernamef.setBorder(null);
        usernamef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernamefFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernamefFocusLost(evt);
            }
        });
        usernamef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefActionPerformed(evt);
            }
        });

        lbl_pass.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbl_pass.setForeground(new java.awt.Color(51, 51, 51));
        lbl_pass.setText("PASSWORD");

        passwordf.setBackground(new java.awt.Color(72, 99, 142));
        passwordf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passwordf.setForeground(new java.awt.Color(255, 255, 255));
        passwordf.setBorder(null);
        passwordf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordfFocusLost(evt);
            }
        });
        passwordf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfActionPerformed(evt);
            }
        });

        loginb.setBackground(new java.awt.Color(255, 255, 255));
        loginb.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        loginb.setForeground(new java.awt.Color(133, 156, 191));
        loginb.setText("LOGIN");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });

        signupb.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        signupb.setForeground(new java.awt.Color(133, 156, 191));
        signupb.setText("SIGN UP");
        signupb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signupb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 232, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pass)
                    .addComponent(lbl_user)
                    .addComponent(usernamef, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(passwordf)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamef, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lbl_pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(loginb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(95, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(175, 175, 175))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefActionPerformed

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed
        String username = usernamef.getText();
        String password = passwordf.getText();
        
        if (username.equals("admin")&& password.equals("1234"))
        {
            JOptionPane.showMessageDialog(null,"Login Successful");
            dispose();
            new AdminPanel().setVisible(true);
        }
        else if (username.equals("user1")&& password.equals("1234"))
        {
            JOptionPane.showMessageDialog(null,"Login Successful");
            dispose();
            new Vote_p().setVisible(true);
        }
        else 
        {
           JOptionPane.showMessageDialog(null,"Login Failed");
           usernamef.setText(null);
           passwordf.setText(null);
        }
       
    }//GEN-LAST:event_loginbActionPerformed

    private void passwordfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfActionPerformed

    private void passwordfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfFocusGained
        lbl_pass.setForeground(new Color(240,240,240));
        jSeparator2.setBackground(new Color(149,165,166));
    }//GEN-LAST:event_passwordfFocusGained

    private void passwordfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfFocusLost
        lbl_pass.setForeground(new Color(33,33,33));
        jSeparator2.setBackground(new Color(33,33,33));
    }//GEN-LAST:event_passwordfFocusLost

    private void usernamefFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefFocusGained
        lbl_user.setForeground(new Color(240,240,240));
        jSeparator1.setBackground(new Color(149,165,166));
    }//GEN-LAST:event_usernamefFocusGained

    private void usernamefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernamefFocusLost
        lbl_user.setForeground(new Color(33,33,33));
        jSeparator1.setBackground(new Color(33,33,33));
    }//GEN-LAST:event_usernamefFocusLost

    private void signupbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbActionPerformed
        dispose();
            new SignUp().setVisible(true);
    }//GEN-LAST:event_signupbActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JButton loginb;
    private javax.swing.JPasswordField passwordf;
    private javax.swing.JButton signupb;
    private javax.swing.JTextField usernamef;
    // End of variables declaration//GEN-END:variables
}
