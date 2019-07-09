/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Program to input integers, then to print them to the screen in the reverse
 * order they were input.
 * 
 */

package reverseinputorder;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans
 * Date: July 5, 2019
 * 
 */
public class ReverseInputOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin; // initialize scanner to handle input
        
        int[] numbers = new int[100];
        int count = 0; // number of itegers input by user 
        int num = 0; // new variable num to hold value input by user
        // int i; // for use in for loop
        
        System.out.println("Enter up to 100 positive integers; 0 to end.");
        
        do {
            System.out.print("Enter element " + count + ": ");
            cin = new Scanner(System.in);
            num = cin.nextInt();
            if (num <= 0) {
                break; // user entered exit key
            } else {
                numbers[count] = num; // set array element to equal num
                count++; // increment count to keep track of number of items in array
            }
        } while (num > 0 && count < 100);
        
        System.out.println("\nYour numbers in reverse order are:\n");
        
        for ( int i = count - 1; i >= 0; i-- ) {
            System.out.println("Element " + (i) + ": " + numbers[i]);
        }
        
    } // end main();
    
} // end class ReverseInputOrder
