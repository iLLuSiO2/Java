/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd_lab;

/**
 *
 * @author Sam Sudar
 */
public class EvenOdd_Lab {

    public void Even(){
        System.out.println("Even nos: ");
        for(int j = 1; j <= 200; j++)
    {
 
       // Short-circuit operator is used
       if (j % 2 == 0)
           System.out.print(j + " ");
    }
        System.out.print("\n");
    }
    public void Odd(){
        System.out.println("Odd nos: ");
        for(int l = 1; l <= 200; l++)
    {
 
       // Short-circuit operator is used
       if (l % 2 != 0)
           System.out.print(l + " ");
    }
        System.out.print("\n");
    }
    public void Sum(){
        System.out.println("Odd nos: ");
        int result = 0;
        for(int num = 1; num <= 200; num++)
    {
 
       // Short-circuit operator is used
       
           
           result = result + num;
    }
        System.out.print("Sum of natural numbers: " + result + "\n");
    }
    
    
    public static void main(String[] args) {
        EvenOdd_Lab obj = new EvenOdd_Lab();
        obj.Even();
        obj.Odd();
        obj.Sum();
    }
    
}
