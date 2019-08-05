/*
 * Program to divide two integers until they stop repeating or out to 118 places
 *
 */
//package CalcTest;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Ocotober 11, 2018
 * 
 */
public class CalcTest {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        int dividend = 1;
        int divisor = 1;
        int temp;
        int counter = 2;
        int rounds = 0;
        
        System.out.print("Enter the dividend (int only): ");
        dividend = cin.nextInt();
        System.out.println();
        System.out.print("Enter the divisor (int only): ");
        divisor = cin.nextInt();
        System.out.println();
        
        System.out.print(dividend/divisor + ".");
        dividend = dividend % divisor;
        while ((dividend % divisor != 0) && (rounds<118)) {
            System.out.print(dividend*10/divisor);
            dividend = (dividend*10) % divisor;
            counter++;
            rounds++;
            if (counter==30) {
                counter=0;
                System.out.println();
            }
        }
        System.out.println();
    }
    
} //end of class CalcTest