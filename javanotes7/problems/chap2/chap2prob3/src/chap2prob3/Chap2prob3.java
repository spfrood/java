/*
Program to input user's name, conver to all upper case, then greet the 
user by name.
 */
package chap2prob3;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 10, 2018
 * 
 */
public class Chap2prob3 {

    public static void main(String[] args) {
        String name;
        Scanner cin= new Scanner(System.in); //enables input from user using Scanner
        
        System.out.print("Please enter your name: ");
        name = cin.nextLine(); //Get users name as input
        System.out.println();
        
        name = name.toUpperCase(); //convert user's name to all upper case
        System.out.println("Hello, " + name + ", nice to meet you!");
        
    }
    
}
