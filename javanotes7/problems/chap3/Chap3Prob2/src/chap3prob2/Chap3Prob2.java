/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Chapter 3 Problem 2:
Which integer between 1 and 10000 has the largest number of divisors, and how many 
divisors does it have? Write a program to find the answers and print out the reuslts. 
It is possible that several integers in this range have the same, maximum number of 
divisors. Your program only has to print out one of them. An examples in Subsection 
3.4.2 discussed divisors. The source code for that example is CountDivisors.java.

You might need some hints abouty how to find a maximum value. The basic idea is to
go through all the integers, keeping track fo the largest number of divisors that 
you've seen SO FAR. Also, keep track of the integer that had that number of divisors.

 */
package chap3prob2;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans 8.2
 * Date: July 22, 2019
 * 
 */
public class Chap3Prob2 {

    /**
     * @param args the command line arguments
     */
    
    public static int countdivs (int num) {
        int tempdiv = 0;
        System.out.print(num + "'s divisors: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                tempdiv++;
                System.out.print(" " + i);
            }
        }
        System.out.print("      TOTAL: " + tempdiv);
        System.out.println();
        return tempdiv;
    }
    public static void main(String[] args) {
        
        int value = 0;
        int numdivs = 0;
        int ties = 1;
        
        for (int i = 1; i <= 5000; i++) {
            int temp = countdivs(i);
            if (temp > numdivs) {
                ties = 1;
            } else if (numdivs == temp) {
                ties++;
            }
            value = (numdivs <= temp) ? i : value;
            numdivs = (numdivs <= temp) ? temp : numdivs;
        }
        
        System.out.println("the number " + value + " has " + numdivs + " divisors.");
        System.out.println("There were " + ties + " numbers with the same number of divisors.");
    }
    
}
