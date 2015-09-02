
package wimbledonapp;

/**
 *BSHC 1A
 *Group 2
 *@author Daniel Benhamou x13341086
 */
public class ImagePageTwo extends javax.swing.JFrame {

    /**
     * Creates new form ImagePageTwo
     */
    public ImagePageTwo() {
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
        homeBtn = new javax.swing.JButton();
        returnGallery = new javax.swing.JButton();
        imageTwo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(98, 25, 122));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/home1.jpg"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 407, 67, 65));

        returnGallery.setText("Return To Gallery");
        returnGallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnGalleryActionPerformed(evt);
            }
        });
        jPanel1.add(returnGallery, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 427, -1, -1));

        imageTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/Image2.jpg"))); // NOI18N
        imageTwo.setText("jLabel1");
        jPanel1.add(imageTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 370, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainProject myMainProject = new MainProject();
        myMainProject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void returnGalleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnGalleryActionPerformed
        // TODO add your handling code here:
        MultimediaImageGUI myMultimediaImageGUI= new MultimediaImageGUI();
        myMultimediaImageGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnGalleryActionPerformed

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
            java.util.logging.Logger.getLogger(ImagePageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImagePageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImagePageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImagePageTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImagePageTwo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel imageTwo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnGallery;
    // End of variables declaration//GEN-END:variables
}
