/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wimbledonapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class SearchList implements Serializable {
    private String searchField1;
    private String searchField2;
    private String searchField3;


 
    public SearchList() {
  
        searchField1 = new String();
        searchField2 = new String();
        searchField3 = new String();
       
    }
    public String Searchfield1() {
        return searchField1;
    }

    public void setSearchfield1(String Searchfield1) {
        this.searchField1 = Searchfield1;
    }

    public String getSearchfield2() {
        return searchField2;
    }

    public void setSearchfield2(String answer) {
        this.searchField2 = answer;
    }

    public String Searchfield3() {
        return searchField3;
    }

    public void setSearchfield3(String searchfield3) {
        this.searchField3 = searchField3;
    }
    
    
    
}
