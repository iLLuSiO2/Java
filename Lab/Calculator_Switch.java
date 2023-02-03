/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_switch;

import java.util.Scanner;

/**
 *
 * @author Sam Sudar
 */
public class Calculator_Switch {

    
    public void CalC(int num1, int num2, int choice){
        int result = 0;
        switch(choice){
            case 1:
                result = num1+num2;
                break;
            case 2:
                result = num1-num2;
                break;
            case 3:
                result = num1*num2;
                break;
            case 4:
                result = num1/num2;
                break;
            default:
                System.out.print("Invalid Choice");
        }
        System.out.println(result);
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation u want to perform: \n 1] Addition \n 2] Subtraction \n 3] Multiply \n 4] Divide");
        int choice = sc.nextInt();
        
        Calculator_Switch obj = new Calculator_Switch();
        obj.CalC(num1, num2, choice);
    }
    
}
