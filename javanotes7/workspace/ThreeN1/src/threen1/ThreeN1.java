/*
 This program prints out a 3N+1 sequence starting with a positive 
 integer specified by the user. It also counts the number of 
 terms in the sequence, and prints out that number.
 */

package threen1;

import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 24, 2018
 * 
 */
public class ThreeN1 {
    
    public static void main(String[] args) {
        
        Scanner cin= new Scanner(System.in); //To get input from user using Scanner
        
        int N;     // for computing terms in the sequence
        int counter; // for counting the iterations
        
        System.out.print("Enter positive integer starting point for sequence: ");
        N = cin.nextInt();
        while (N <= 0) {
            System.out.print("Must enter a positive integer: ");
            N = cin.nextInt();
        }
        
        counter = 0; //initialize counter to zero
        while (N != 1) {
            if (N % 2 == 0) {
                N = N / 2;
                System.out.println("N = N / 2     : " + N);
            } 
            else {
                N = 3 * N + 1;
                System.out.println("N = 3 * N + 1 : " + N);
                if (N<=0) {
                    System.out.println("ERROR! OUT OF BOUNDS OF DATATYPE!");
                    N = 1;
                }
            }
            counter++;
        }
        
        System.out.println();
        System.out.println("There were " + counter + " terms in the sequence.");
        
    } //end of main
    
}
