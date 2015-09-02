
package wimbledonapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *BSHC 1A
 *Group 2
 *@author Daniel Benhamou x13341086
 */
public class MultimediaQuiz extends javax.swing.JFrame {

    private String answerOne;
    private String answerTwo;
    private String answerThree;
    //declare array of Question objects
    private ArrayList <Quiz> qList;
    //declare count variable to keep track of how many objects are in array
    int count;
    
    
    
    /**
     * Creates new form MultimediaQuiz
     */
    public MultimediaQuiz() {
        initComponents();
        answerOne = new String();
        answerTwo = new String();
        answerThree = new String();
         qList = new ArrayList <Quiz>();
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
        answerFieldOne = new javax.swing.JTextField();
        answerFieldTwo = new javax.swing.JTextField();
        answerFieldThree = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        questionTextTwo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        questionTextOne = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        questionTextThree = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        displayAnswersBtn = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(98, 25, 122));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wimbledonapp/home1.jpg"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 67, 65));

        answerFieldOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldOneActionPerformed(evt);
            }
        });
        jPanel1.add(answerFieldOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 240, 30));

        answerFieldTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldTwoActionPerformed(evt);
            }
        });
        jPanel1.add(answerFieldTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 240, 30));

        answerFieldThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldThreeActionPerformed(evt);
            }
        });
        jPanel1.add(answerFieldThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 240, 30));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        questionTextTwo.setBackground(new java.awt.Color(204, 204, 204));
        questionTextTwo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionTextTwo.setForeground(new java.awt.Color(255, 255, 255));
        questionTextTwo.setText("Who won the ladie's singles championship in 2002?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionTextTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(questionTextTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 330, 40));

        jPanel3.setBackground(new java.awt.Color(51, 204, 0));

        questionTextOne.setBackground(new java.awt.Color(204, 204, 204));
        questionTextOne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionTextOne.setForeground(new java.awt.Color(255, 255, 255));
        questionTextOne.setText("  What is the main court at Wimbledon called?  ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(questionTextOne, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(questionTextOne, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 290, 40));

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        questionTextThree.setBackground(new java.awt.Color(204, 204, 204));
        questionTextThree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionTextThree.setForeground(new java.awt.Color(255, 255, 255));
        questionTextThree.setText(" Who won the gentleman's singles championship in 2002?");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(questionTextThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(questionTextThree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 40));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 50));

        displayAnswersBtn.setText("Display Answers");
        displayAnswersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAnswersBtnActionPerformed(evt);
            }
        });
        jPanel1.add(displayAnswersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        save.setText("Save Answers");
        save.setToolTipText("");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        MainProject myMainProject = new MainProject();
        myMainProject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void answerFieldOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldOneActionPerformed

    private void answerFieldTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldTwoActionPerformed

    private void answerFieldThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldThreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldThreeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
     answerOne = answerFieldOne.getText();
     answerTwo = answerFieldTwo.getText();
     answerThree = answerFieldThree.getText();
     
     
     
     
     if(answerOne.equalsIgnoreCase("Centre Court") && answerTwo.equalsIgnoreCase("Serena Williams") && answerThree.equalsIgnoreCase("Lleyton Hewitt")){
         JOptionPane.showMessageDialog(null, "Wohoo! You got all of them correct!");
     }
     
     //if one answer is wrong
     else if (answerOne!=("Centre Court") && answerTwo.equalsIgnoreCase("Serena Williams") && answerThree.equalsIgnoreCase("Lleyton Hewitt")) { JOptionPane.showMessageDialog (null, "Answer 1 is incorrect, answers 2 and 3 are correct");
     }
     
     else if (answerOne.equalsIgnoreCase("Centre Court") && answerTwo!=("Serena Williams") && answerThree.equalsIgnoreCase("Lleyton Hewitt")) { JOptionPane.showMessageDialog (null, "Answer 2 is incorrect, answers 1 and 3 are correct");
     }
     
     else if (answerOne.equalsIgnoreCase("Centre Court") && answerTwo.equalsIgnoreCase("Serena Williams") && answerThree!=("Lleyton Hewitt")) { JOptionPane.showMessageDialog (null, "Answer 3 is incorrect, answers 1 and 2 are correct");
     }
     
     
     //if two answers are wrong
      else if (answerOne.equalsIgnoreCase("Centre Court") && answerTwo!=("Serena Williams") && answerThree!=("Lleyton Hewitt")) { JOptionPane.showMessageDialog (null, "Answers 2 and 3 are incorrect, answer 1 is correct");
     }
     
      else if (answerOne!=("Centre Court") && answerTwo.equalsIgnoreCase("Serena Williams") && answerThree!=("Lleyton Hewitt")) { JOptionPane.showMessageDialog (null, "Answers 1 and 3 are incorrect, answer 2 is correct");
     }
     
      else if (answerOne!=("Centre Court") && answerTwo!=("Serena Williams") && answerThree.equalsIgnoreCase("Lleyton Hewitt")) { JOptionPane.showMessageDialog (null, "Answers 1 and 2 are incorrect, answer 3 is correct");
     }
     
      else { 
          JOptionPane.showMessageDialog (null, "you did not get any of answers correct.");
      }
     
     
     
     
      //create a new Question object
      Quiz q = new Quiz();
      
      
        //add contents of textfields to q
        q.setAnswerOne(answerOne);
        q.setAnswerTwo(answerTwo);
        q.setAnswerThree(answerThree);
        
        
         qList.add(q); 
         
         count++;       
    }//GEN-LAST:event_submitActionPerformed

    private void displayAnswersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAnswersBtnActionPerformed
        // TODO add your handling code here:
         File inFile;
        FileInputStream fStream;
         ObjectInputStream oStream;
        //use a try statement
      try{
            //create objects
        inFile = new File ("output.dat");
        fStream  = new FileInputStream(inFile);
        oStream = new ObjectInputStream(fStream);
            //read arrayList from file
        qList = (ArrayList<Quiz>)oStream.readObject();  //in order for us to pull the data back out, we need to make sure it comes back as an array list so we need to cast it
            //loop through the ArrayList
            for(Quiz x:qList) //temp label x, go into q list to find them, for every object in q list, do the following.
                JOptionPane.showMessageDialog(null, "Question One:"+x.getAnswerOne()+" Question Two:"+x.getAnswerTwo()+" Question Three:"+x.getAnswerThree());
            
      
      
      
              
            //close the stream
         oStream.close();
    }
        //catch IOException
       catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }
        
    }                                       

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
            java.util.logging.Logger.getLogger(MultimediaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultimediaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultimediaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultimediaQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultimediaQuiz().setVisible(true);
            }
        });
    
    }//GEN-LAST:event_displayAnswersBtnActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
             File outFile;
       FileOutputStream fStream;
       ObjectOutputStream oStream;
        
       
        //Use a try statement
      try{
          
        //create objects
        outFile = new File("output.dat");
        fStream = new FileOutputStream(outFile);
        oStream = new ObjectOutputStream(fStream);
        
        //write object to file
        
        oStream.writeObject(qList);
        
        //close stream
        oStream.close();  
      }
        //catch the IOException
        catch (IOException e){
          System.out.println(e);
        }

               
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerFieldOne;
    private javax.swing.JTextField answerFieldThree;
    private javax.swing.JTextField answerFieldTwo;
    private javax.swing.JButton displayAnswersBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel questionTextOne;
    private javax.swing.JLabel questionTextThree;
    private javax.swing.JLabel questionTextTwo;
    private javax.swing.JButton save;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
