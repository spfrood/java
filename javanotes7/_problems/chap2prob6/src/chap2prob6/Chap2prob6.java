/*
 * program to separate first and last name into two different strings
 */
package chap2prob6;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 10, 2018
 * 
 */
public class Chap2prob6 {

    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        String fullName, firstName, lastName, initials;
        int indPoint;
        
        System.out.println("Please enter your first and last nmae, separated by a space");
        fullName = cin.nextLine();
        indPoint = fullName.indexOf(' ');
        firstName = fullName.substring(0, indPoint);
        lastName = fullName.substring(indPoint+1);
        
        System.out.println();
        System.out.println("Your first name is " + firstName + ", which has " + 
                firstName.length() + " characters.");
        System.out.println("Your last name is " + lastName + ", which has " + 
                lastName.length() + " characters.");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
        
        System.out.println();
    }
    
}
