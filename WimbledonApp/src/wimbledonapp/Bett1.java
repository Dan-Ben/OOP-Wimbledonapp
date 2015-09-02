/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wimbledonapp;

import java.io.Serializable;

/**
 * BSHC 1A
 * Group 2
 * Student number: 13114310
 * @author Dagnija Kaulina-Brante
 * section more
 */


public class Bett1 implements Serializable{
     private String game;
     private double stake; 
     private double win; 
public Bett1(String game, double stake){
        this.game = game;
        this.stake= stake;
        
    } 
    public double getStake() {
        return stake;
    }

    public void setStake(Double stake) {
        this.stake = stake;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String name) {
  
    }

    public double getWin() {
        return win;
    }

    public void setWin(double win) {
        this.win = win;
    }
 
}
