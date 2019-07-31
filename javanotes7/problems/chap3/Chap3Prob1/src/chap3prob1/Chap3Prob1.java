/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Problem 1:
How many times do you have to roll a pair of dice before they come up snake eyes? 
You could do the experiment by rolling dice by hand. Write a computer program that 
simulates the experiment. The program should report the number of rolls that it makes
before the dice come up snake eyes. (Note: "Snake eyes" means that both dice show a
value of 1.) 

 */
package chap3prob1;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans 8.2
 * Date: July 22, 2019
 * 
 */
public class Chap3Prob1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int count = 0;
        int die1 = 0;
        int die2 = 0;
        
        while ((die1 != 1) || (die2 != 1)) {
            System.out.println("Attempt number " + count + "    Die 1: " + die1 + "    Die 2: " + die2 + " was rolled.");
            die1 = (int)(6*Math.random()+1);
            die2 = (int)(6*Math.random()+1);
            count++;
        }
        
        System.out.println("It took " + count + " tries for Snake Eyes to come up.");
        System.out.println("Die 1: " + die1 + " and Die 2: " + die2 + " came up Snake Eyes!");
        
    }
    
}
