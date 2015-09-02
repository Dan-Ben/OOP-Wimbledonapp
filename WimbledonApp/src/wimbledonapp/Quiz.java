
package wimbledonapp;

import java.io.Serializable;

/**
 *BSHC 1A
 *Group 2
 *@author Daniel Benhamou x13341086
 */
public class Quiz implements Serializable{
    

    private String answerOne;
    private String answerTwo;
    private String answerThree;

    
    public Quiz(){
        answerOne = new String();
        answerTwo = new String();
        answerThree = new String();
  
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

     public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }
    
     public String getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }
                
    
    
    
}

    

