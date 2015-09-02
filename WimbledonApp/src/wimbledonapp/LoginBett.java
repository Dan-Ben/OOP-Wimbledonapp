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
public class LoginBett extends Login1{
    private int userCard;
    
    public LoginBett(String userName, String userSurname, String userEmail, int userCard){
        super(userName, userSurname, userEmail);
        this.userCard= userCard;
    }

    public double getUserCard() {
        return userCard;
    }

    public void setUserCard(int userCard) {
        this.userCard = userCard;
    }
    @Override
    public String getDetails(){
        return super.getDetails()+"\nAge: "+ userCard;
    }
}
