
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getage;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class GetAge {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        
        int age = currentYear - birthYear;
        
        System.out.println("You are" + age + "years old.");
        scanner.close();
    }
    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
    }
    
}
