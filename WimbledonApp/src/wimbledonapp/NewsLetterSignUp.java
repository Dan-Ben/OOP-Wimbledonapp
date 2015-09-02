/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wimbledonapp;

import java.io.Serializable;

/**
 *
 * @author x13548867
 */


   public class NewsLetterSignUp implements Serializable{
    private String nameText;
    private String emailText;
    private String NameText;
    
    public NewsLetterSignUp(){
        nameText = new String();
        emailText = new String();
       
    }

    public String getNameText() {
        return nameText;
    }

    public void setNameText(String questionText) {
        this.nameText = nameText;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String answer) {
        this.emailText = emailText;
    }

   }