/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wimbledonapp;

/**
 *BSHC 1A
 * Group 2
 * Student number 13114310
 * @author Dagnija Kaulina-Brante
 */
public class Login1 {
    private String userName;
    private String userSurname;
    private String userEmail;
    
    public Login1(String userName, String userSurname, String userEmail){
        this.userName= userName;
        this.userSurname= userSurname;
        this.userEmail=userEmail;
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getDetails(){
        return "Welcome!\n"+userName+ "\n"+ userSurname+"\n"+userEmail+"\n Is Your details correct?";
    }
}
