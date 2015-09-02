/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wimbledonapp;



/**
 * BSHC 1A
 * Group 2
 * Student number: 13114310
 * @author Dagnija Kaulina-Brante
 * section more
 */




public class Bett {
     private String name;
     private double win; 
     private double stake;
   

    public double getWin() {
        return win;
    }

public Bett(String name, double stake){
        this.name = name;
        this.stake= stake;
        
    }    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
      
       
	this.name = name;
       
      
    }


    public double getStake() {
        return stake;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }



}
