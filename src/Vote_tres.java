/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denis
 */
public class Vote_tres extends javax.swing.JFrame {

    /**
     * Creates new form vote
     */
    public Vote_tres() {
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

        jPanel2 = new javax.swing.JPanel();
        vote_p_lbl = new javax.swing.JLabel();
        p_separator = new javax.swing.JSeparator();
        p_skip_btn = new javax.swing.JButton();
        cp1_name = new javax.swing.JLabel();
        cp1_party = new javax.swing.JLabel();
        cp1_year = new javax.swing.JLabel();
        cp1_vote_btn = new javax.swing.JButton();
        cp1_pic1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cp2_name = new javax.swing.JLabel();
        cp2_party = new javax.swing.JLabel();
        cp2_year = new javax.swing.JLabel();
        cp2_vote = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(72, 99, 142));

        vote_p_lbl.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        vote_p_lbl.setForeground(new java.awt.Color(240, 240, 240));
        vote_p_lbl.setText("TREASURER");

        p_separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        p_skip_btn.setText("Skip");
        p_skip_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_skip_btnActionPerformed(evt);
            }
        });

        cp1_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cp1_name.setForeground(new java.awt.Color(179, 206, 249));
        cp1_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp1_name.setText("Name");

        cp1_party.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cp1_party.setForeground(new java.awt.Color(179, 206, 249));
        cp1_party.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp1_party.setText("Party");

        cp1_year.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cp1_year.setForeground(new java.awt.Color(179, 206, 249));
        cp1_year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp1_year.setText("Year - Course");

        cp1_vote_btn.setText("VOTE");
        cp1_vote_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp1_vote_btnActionPerformed(evt);
            }
        });

        cp1_pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placeholder.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placeholder.png"))); // NOI18N

        cp2_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cp2_name.setForeground(new java.awt.Color(179, 206, 249));
        cp2_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp2_name.setText("Name");

        cp2_party.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cp2_party.setForeground(new java.awt.Color(179, 206, 249));
        cp2_party.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp2_party.setText("Party");

        cp2_year.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cp2_year.setForeground(new java.awt.Color(179, 206, 249));
        cp2_year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cp2_year.setText("Year - Course");

        cp2_vote.setText("VOTE");
        cp2_vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp2_voteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(cp1_pic1)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cp1_party, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cp1_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cp1_year, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(p_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cp2_party, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cp2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cp1_vote_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(p_skip_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(cp2_year, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp2_vote, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(vote_p_lbl)
                .addGap(389, 389, 389))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cp2_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp2_party, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp2_year, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(vote_p_lbl)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cp1_pic1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cp1_name, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cp1_party, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cp1_year, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cp1_vote_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cp2_vote, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(p_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p_skip_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cp1_vote_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp1_vote_btnActionPerformed
       dispose();
            new ty().setVisible(true);
    }//GEN-LAST:event_cp1_vote_btnActionPerformed

    private void cp2_voteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp2_voteActionPerformed
       dispose();
            new ty().setVisible(true);
    }//GEN-LAST:event_cp2_voteActionPerformed

    private void p_skip_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_skip_btnActionPerformed
        dispose();
            new ty().setVisible(true);
    }//GEN-LAST:event_p_skip_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Vote_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vote_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vote_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vote_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vote_p().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cp1_name;
    private javax.swing.JLabel cp1_party;
    private javax.swing.JLabel cp1_pic1;
    private javax.swing.JButton cp1_vote_btn;
    private javax.swing.JLabel cp1_year;
    private javax.swing.JLabel cp2_name;
    private javax.swing.JLabel cp2_party;
    private javax.swing.JButton cp2_vote;
    private javax.swing.JLabel cp2_year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator p_separator;
    private javax.swing.JButton p_skip_btn;
    private javax.swing.JLabel vote_p_lbl;
    // End of variables declaration//GEN-END:variables
}
