/*
 * You have entered a maze, twisty little passages 
 * all alike.
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaswitch;

import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans 8.2
 * Date: June 4, 2019
 * 
 */
public class JavaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create util objects
        Scanner cin = new Scanner(System.in); // for getting scanner input
        
        //declare global variables and constants
        
        int optionNum = 0; // option for the switch statement
        double measurement = 0; // value of measurement entered by user
        double inches = 0; // base unit to convert all measurements
        double feet, yards, miles = 0; // Variables to hold final values
        
        // create menu and get default unit type
        System.out.println("What unit of measurement is your base input?");
        System.out.println();
        System.out.println("            1.  inches");
        System.out.println("            2.  feet");
        System.out.println("            3.  yards");
        System.out.println("            4.  miles");
        System.out.println();
        System.out.print("Enter the number of your choice: ");
        optionNum = cin.nextInt();
        
        // get users measurement for the unit type
        switch(optionNum) {
            case 1:
                System.out.print("Enter the number of inches: ");
                measurement = cin.nextDouble();
                inches = measurement;
                break;
            case 2:
                System.out.print("Enter the number of feet: ");
                measurement = cin.nextDouble();
                inches = measurement * 12;
                break;
            case 3: 
                System.out.print("Enter the number of yards: ");
                measurement = cin.nextDouble();
                inches = measurement * 36;
                break;
            case 4:
                System.out.print("Enter the number of miles: ");
                measurement = cin.nextDouble();
                inches = measurement * 12 * 5280;
                break;
            default:
                System.out.println("Error! Invalid option! Ending Operation!");
                System.exit(1); // This exits the program completely 
        } // end switch
        
        // Now to do the conversions
        feet = inches / 12;
	yards = inches / 36;
	miles = inches / (12 * 5280);
			
	// Output the measurement in each type of unit
			
	System.out.println();
	System.out.println("That is equivalent to:");
	System.out.printf("%12.5g", inches);
	System.out.println(" inches");
	System.out.printf("%12.5g", feet);
	System.out.println(" feet");
	System.out.printf("%12.5g", yards);
	System.out.println(" yards");
	System.out.printf("%12.5g", miles);
	System.out.println(" miles");
	System.out.println();
        
    } // end of main
    
} // end of class 
