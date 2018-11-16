/*
 * Simulate choosing people at random and checking the day of the year
they were born. If the birthday is teh same as one that was seen previously,
stop, and output the number of people who were checked.
 */
package birthdayproblem;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: November 10, 2018
 * 
 */
public class Birthdayproblem {
    
    public static void main(String[] args) {
        boolean[] used; // For recording the possilble birthdays that have been seen so far.
                        // A value of true in used[i] means that a person who's birthday is 
                        // on the i (used[i]) then the value for that element in used is set
                        // to true. 
        int count;  // The number of people who have been checked so far.
        
        used = new boolean[365]; // Initially, all entries are false (value 0)
        
        count = 0; //no birthdays selected yet
        
        while (true) {
            // select a birthday at random, from 0 to 365. If already used, quit, 
            // otherwise record birthday (set iteration of used[i] to true) and 
            // repeat.
            
            int birthday; // the birthday randomly selected in this iteration
            birthday = (int)(Math.random()*365);
            count++;
            
            System.out.printf("Person %d has birthday number %d", count, birthday);
            System.out.println();
            
            if ( used[birthday] ) {
                // break out of loop when duplicate birthday found
                break;
            }
            
            used[birthday] = true;
            
        } // end while loop
        
        System.out.println();
        System.out.println("A duplicate birthday was found after " + count + " tries.");
        
    }
    
}
