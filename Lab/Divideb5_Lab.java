/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideb5_lab;

import java.util.Scanner;

/**
 *
 * @author Sam Sudar
 */
public class Divideb5_Lab {

    public void Divide(){
        for(int j = 1; j < 100 + 1; j++)//Loop that will iterate 100 times
    {
 
       
       if (j % 5 == 0 && j > 40) //condition
           System.out.print(j + " "); //print Statement
    }
    
    }
    
    
    public static void main(String[] args) {
        
        Divideb5_Lab obj = new Divideb5_Lab(); //creating an object and calling the method
        obj.Divide();
        
        
    }
    
}
