/*
This program will define two enum types... NOTE!!!
ENUM Must be defined OUTSIDE of the main() but still
inside the class!
 */
package enumdemo;

/**
 *
 * @author scott_r_parker
 * October 1, 2018
 * 
 */
public class EnumDemo {

    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
    
    public static void main(String[] args) {
        
        Day tgif; //declaring a variable of type Day... the enum we created
        Month libra; //declaring variable of the Month enum we created
        
        tgif = Day.FRIDAY; //Assign value of Friday to tgif
        libra = Month.OCT; //Assign OCT to libra
        
        System.out.print("My sign is libra, since I was born in ");
        System.out.println(libra); // The output value will be: OCT
        System.out.print("That's month number ");
        System.out.print( libra.ordinal() );
        System.out.println(" in the the year.");
        System.out.println("     (Counting from 0, of course!)");
        
        System.out.print("Isn't it nice to get to ");
        System.out.println(tgif); // Output value will be FRIDAY
        
        System.out.println( tgif + " is day number " + tgif.ordinal() + 
                " of the week.");
        System.out.println("     Starting at 0 for the first day!");
        
    }
    
}
