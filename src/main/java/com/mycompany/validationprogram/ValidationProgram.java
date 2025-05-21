/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validationprogram;
import java.util.regex.*;
import javax.swing.JOptionPane;


/**
 *
 * @author RC_Student_lab
 */
public class ValidationProgram {

    
   public int add(int a, int b) 
   {
        return a + b;
    } 
  public static Boolean CheckCharacter(String Password){
   
    
    Pattern pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    
    Matcher matcher = pattern.matcher(Password);
    
    return matcher.find();
  }
    public static void main(String[] args)
    {
        Boolean  pass =CheckCharacter("@Password");
       
        
        if (pass== true)
        {
        
            JOptionPane.showMessageDialog(null, "Your password " + pass + " is  strong");
        }
        else 
        {
        JOptionPane.showMessageDialog(null, "Your password " + pass + "  is  weak");
        }
        
    }
}
