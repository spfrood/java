/*
 * Program to compute dollar value of change with the number of each coin 
 * input.
 */
package chap2prob4;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: 10/10/2018
 */

public class Chap2prob4 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in); //enables input from user using Scanner
        
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        int total;
        
        System.out.println("Please enter how many of each type of coin you have...");
        System.out.println("(only numerical input recognized)");
        System.out.println("How many quarters do you have? ");
        quarters = cin.nextInt();
        System.out.println("How many dimes do you have?" );
        dimes = cin.nextInt();
        System.out.println("How many nickles do you have?");
        nickles = cin.nextInt();
        System.out.println("How many pennies do you have?");
        pennies = cin.nextInt();
        
        System.out.println();
        total = quarters*25 + dimes*10 + nickles*5 + pennies;
        System.out.print("You have " + total/100 + " dollars and " + total%100 + " cents.");
        System.out.println();
        
    }
    
}
