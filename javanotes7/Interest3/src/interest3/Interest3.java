/*
 * Simple program to compute compunded interest earned on an investment over 
 * 5 years using a while loop.
 */
package interest3;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 12, 2018
 * 
 */
public class Interest3 {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        double principal; //starting balance
        double iRate;  //APR interest rate
        
        //Get rate and principal data from user
        
        System.out.print("Enter the principal/intitial investment value: ");
        principal = cin.nextDouble();
        System.out.println();
        
        System.out.print("Enter the annual interest rate (as a decimal not a %): ");
        iRate = cin.nextDouble();
        System.out.println();
        
        //Simulate 5 years of investment
        
        int years = 0; //The counter variable for the investment
        while (years < 5) {
            double interest = principal * iRate; //accumulated interest for the year
            principal = principal + interest;  //New principal after accumulated interest
            years++;
            System.out.print("The value of the interest after ");
            System.out.print(years);
            System.out.print(" years is $ ");
            System.out.printf("%1.2f", principal);
            System.out.println();
            
        } //End of while loop
        
    } // End of main()
    
} // End of class Interest3
