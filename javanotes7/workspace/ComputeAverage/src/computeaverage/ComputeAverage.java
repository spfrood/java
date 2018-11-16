/*
This program reads a sequence of positive integers input
by the user, and it will print out the average of those
integers. The user is prompted to enter one integer at a
time. The user must enter a 0 to mark the end of the 
data. (The zero is not counted as part of the data to 
be averaged.) The program does not check whether the
user's input is positive, so it will actually add up
both positive and negative input values.
 */
package computeaverage;

import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 24, 2018
 * 
 */
public class ComputeAverage {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in); // New Scanner object to accept inputs
        
        int inputNumber; // Integer input by the user
        int sum; // The sum of the integers input
        int count; // The number if integers input
        double average; // The average of the integers
        
        /* Initialize the summation and counting variables. */
        
        sum = 0;
        count = 0;
        
        /* Read and process the user's input. */
        
        System.out.print ("Enter your first positive integer: ");
        inputNumber = cin.nextInt();
        
        while (inputNumber != 0) {
            sum += inputNumber; // Set sum to be the current value plus value of the input number
            count++;  // increment count after an integer is successfully input
            System.out.print("Enter your next positive integer, or 0 to exit: ");
            inputNumber = cin.nextInt();
        }
        
        /* Display the result. */
        
        if (count == 0) {
            System.out.println("You didn't enter any data!");
        }
        else {
            average = ((double)sum) / count;  // Casting sum as a double to avoid potential division error
            System.out.println();
            System.out.println("You entered " + count + " positive integers.");
            System.out.printf("Their average is %1.3f.\n", average);
        }
        
    } // end main()
    
} // end class ComputAverage
