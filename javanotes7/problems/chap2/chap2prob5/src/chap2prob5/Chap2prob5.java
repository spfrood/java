/*
 * program to convert number of eggs into how many gross, dozen, and loose eggs
 */
package chap2prob5;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 10, 2018
 * 
 */
public class Chap2prob5 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    
        int total;
        
        System.out.println("Enter the number of eggs you have...");
        total = cin.nextInt();
        System.out.println();
        System.out.print("Your number of eggs is " + total/144 + " gross, ");
        total = total%144;
        System.out.print(total/12 + " dozen, "); 
        total = total%12; 
        System.out.print("and " + total);
        System.out.println();
    }
    
}
