/*
 Program to simulate rolling a pair of dice. Output should look like:
  The first die comes up 3
  The second die comes up 5
  Your total roll is 8
 */
package chap2prob2;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 10, 2018
 * 
 */
public class Chap2prob2 {

    public static void main(String[] args) {
        int roll1 = (int)(Math.random()*6)+1;
        int roll2 = (int)(Math.random()*6)+1;
        System.out.println("The dice roll is...");
        System.out.println("The first die comes up " + roll1);
        System.out.println("The second die comes up " + roll2);
        System.out.println("Your total roll is " + (roll1+roll2));
        
    }
    
}
