/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Program to convert a measurement into alternate units of measure using
    a swith statement menu.
 *
 */
package lengthconverter;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans
 * Date: June 19, 2019
 * 
 */
public class LengthConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Scanner cin = new Scanner(System.in);
        
        String optionNumber; // option from menu to choose input units
        double measurement; // numerical measurement, input by user
        
        double inches, feet, yards, miles; // default that all units will be first converted
        
        do {
            
            Scanner cin = new Scanner(System.in);
            // Display menu (text to screen) to get user's input
        
            System.out.println("What unit is used for your measurement?");
            System.out.println();
            System.out.println("        1. inches");
            System.out.println("        2. feet");
            System.out.println("        3. yards");
            System.out.println("        4. miles");
            System.out.println();
            System.out.println("Enter the nubmer of your choice: ");
            optionNumber = cin.nextLine();
        
            // read user's measurement and convert it to inches
        
            switch ( optionNumber ) {
                case "1":
                case "inches":
                case "inch":
                case "in":
                    System.out.println("Enter the nubmer of inches: ");
                    measurement = cin.nextDouble();
                    inches = measurement;
                    break;
                case "2":
                case "feet":
                case "foot":
                case "ft":
                    System.out.println("Enter the number of feet: ");
                    measurement = cin.nextDouble();
                    inches = measurement * 12;
                    break;
                case "3": 
                case "yards":
                case "yard":
                case "yd":
                    System.out.println("Enter the number of yards: ");
                    measurement = cin.nextDouble();
                    inches = measurement * 36;
                    break;
                case "4":
                case "miles":
                case "mile":
                case "mi":
                    System.out.println("Enter the number of miles: ");
                    measurement = cin.nextDouble();
                    inches = measurement * 12 * 5280;
                    break;
                default:
                    System.out.println("Error! Illegal option number! I quit!");
                    System.out.println("The option: " + optionNumber + " :is not a valid input!");
                    measurement = 0;
                    inches = 0;
                    System.exit(1);
            } // end switch
            
            if (measurement == 0) {
                System.out.println("Goodbye for now!");
                break;
            }
        
            feet = inches / 12;
            yards = inches / 36;
            miles = inches / (12 * 5280);
        
            System.out.println();
            System.out.println("That is equivalent to:");
            System.out.printf("%12.5g", inches);
            System.out.println(" inches");
            System.out.printf("%12.5g", feet);
            System.out.println(" feet");
            System.out.printf("%12.5g", yards);
            System.out.println(" yards");
            System.out.printf("%12.5g", miles);
            System.out.println(" miles");
            System.out.println();
        
        } while (true);
    }
}
