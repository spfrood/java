/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Simulate choosing people at random and checking the day of the year they
 * were born. If the birthday is the same as one that was seen previously, 
 * stop and output the number of people who were checked.
 *
 */
package javabdayprob;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans 8.2
 * Date: 7/5/2019
 * 
 */

public class JavaBdayProb {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        boolean[] used = new boolean[365]; // declaring and initializing the array
                // all in one statement. Combines the following statements into one line:
                // boolean[] used;
                // used = new boolean[365];
                // values in boolean are false by default. When a random hits then 
                // the boolean at that location will be changed to true. When the 
                // random hits a location that is true (2nd hit... ie 2nd person with
                // that bday, then the 2nd person with that bday has been found.
        int count = 0; // initializing count and setting value to 0. This will keep 
                // track of how many random people have to be searched thorugh until 
                // duplicate birthdays are found. This method is same as using two
                // lines to deeclare. Combines int count; and count = 0; 
        
        while (true) {
            // select a birthday at random... ie a number from 0 to 364 (number of
            // days in the year disregarding leap years.
            
            int birthday; 
            birthday = (int)(Math.random()*365); // generate random number for birthday
            count++;
            
            System.out.printf("Person %d has birthday number %d", count, birthday);
            System.out.println();
            // System.out.println("Person " + count + " has birthday number " + birthday);
            if ( used[birthday] ) { // if the value of used is true... 
                break; // this means that a birthday was already found at this spot.
            } else {
                used[birthday] = true;
            }
        } // end of while loop
        
        System.out.println();
        System.out.printf("A duplicate birthday was found after %d tries.", count);
        System.out.println();
        // System.out.println("A duplicate birthday was found after " + count + " tries.");
    }
    
} // end of birtday problem
