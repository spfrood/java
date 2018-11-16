/*
 * Simulate choosing people at random and checking the day of the year
they were born. If the birthday is teh same as one that was seen previously,
stop, and output the number of people who were checked.
 */
package birthdayprobbet;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: November 10, 2018
 * 
 */
public class Birthdayprobbet {
    
    public static void main(String[] args) {
        boolean[] used; // For recording the possilble birthdays that have been seen so far.
                        // A value of true in used[i] means that a person who's birthday is 
                        // on the i (used[i]) then the value for that element in used is set
                        // to true. 
        int[] totals;
        boolean dupe;
        
        used = new boolean[365]; // Initially, all entries are false (value 0)
        totals = new int[365];
        dupe = false;
        
        for (int i = 0; i < 100000; i++) {
            int count = 0;
            used = new boolean[365];
            while (!dupe) {
                // select a birthday at random, from 0 to 365. If already used, quit, 
                // otherwise record birthday (set iteration of used[i] to true) and 
                // repeat.
                int birthday; // the birthday randomly selected in this iteration
                birthday = (int)(Math.random()*365);
                count++;
                
                if ( used[birthday] ) {
                    dupe = true;
                } else {
                    used[birthday] = true;
                }
            } // end while loop
            totals[count]++;
            System.out.println("Iteration number: " + i);
            dupe = false;
        }
        System.out.println();
        for (int i = 0; i < 365; i++ ) {
            if ( totals[i] != 0 ) {
                System.out.println(i + " occured " + totals[i] + " times.");
            };
        }
    }
}
