package wimbledonapp;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x13548867
 */
public class Scores1 extends javax.swing.JFrame {

    /**
     * Creates new form News
     */
    public Scores1() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jComboBox1 = new javax.swing.JComboBox();
        homePanel = new javax.swing.JPanel();
        bannerScores = new javax.swing.JPanel();
        logolb = new javax.swing.JLabel();
        scoresLB = new javax.swing.JLabel();
        ScoresPanel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LinkHome = new javax.swing.JButton();
        backlb = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(98, 25, 100));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        homePanel.setBackground(new java.awt.Color(98, 25, 122));

        bannerScores.setBackground(new java.awt.Color(1, 103, 55));

        logolb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/logologo1.jpg"))); // NOI18N

        scoresLB.setBackground(new java.awt.Color(255, 255, 255));
        scoresLB.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        scoresLB.setForeground(new java.awt.Color(255, 255, 255));
        scoresLB.setText("Scores");

        javax.swing.GroupLayout bannerScoresLayout = new javax.swing.GroupLayout(bannerScores);
        bannerScores.setLayout(bannerScoresLayout);
        bannerScoresLayout.setHorizontalGroup(
            bannerScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerScoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(scoresLB, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        bannerScoresLayout.setVerticalGroup(
            bannerScoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerScoresLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bannerScoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoresLB, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tim", "6", "6", "Dagnija", "6", "6"},
                {"Fabio", "5", "5", "Tim", "5", "1"},
                {"", null, null, null, null, null},
                {"Dan", "4", "0", "Dan", "6", "6"},
                {"Dagnija", "6", "6", "Fabio", "3", null}
            },
            new String [] {
                "", "Match 1", "", "", "Match 2", ""
            }
        ));
        ScoresPanel.setViewportView(jTable1);

        LinkHome.setBackground(new java.awt.Color(1, 103, 55));
        LinkHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LinkHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/home1.jpg"))); // NOI18N
        LinkHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkHomeActionPerformed(evt);
            }
        });

        backlb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/back real.png"))); // NOI18N
        backlb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backlbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addComponent(bannerScores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(backlb, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(LinkHome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addComponent(bannerScores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(LinkHome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homePanelLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(backlb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 402, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       
        MainProject myMainProjectGUI= new MainProject();
        myMainProjectGUI.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_jLabel12MouseClicked

    private void LinkHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkHomeActionPerformed
        MainProject myMainProjectGUI= new MainProject();
        myMainProjectGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LinkHomeActionPerformed

    private void backlbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backlbActionPerformed
        News myNews= new News();
        myNews.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backlbActionPerformed

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
            java.util.logging.Logger.getLogger(Scores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scores1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Scores1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LinkHome;
    private javax.swing.JScrollPane ScoresPanel;
    private javax.swing.JButton backlb;
    private javax.swing.JPanel bannerScores;
    private javax.swing.JPanel homePanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logolb;
    private javax.swing.JLabel scoresLB;
    // End of variables declaration//GEN-END:variables

   
    
        }

