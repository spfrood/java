/*
 *This program will convert measurements expreessed in inches,
feet, yards, or miles into each of the possible units of measure.
The measurement is input by the user, followed by the unit of 
measure. For example: "17 feet", "1 inch", or "1.73 mi". 
Abbreviations of: in, ft, yd, and mi will be accepted as units of
measure. The program will continue to run, reading and converting
measurements until the user inputs a value of 0 for the measurement.
 *
 */

package java_unit_converter;
import java.util.Scanner;


/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: June 17, 2019
 * 
 */
public class Java_Unit_Converter {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        double measurement; // value input by user
        String units; // the units of measure input by user
        
        double inches, feet, yards, miles; // To hold the converted values
        
        System.out.println("Enter a measurement in inches, feet, yards, or miles.");
	System.out.println("For example: '1 inch', '17 feet', or '2.73 miles'");
        System.out.println("You can use the abbreviations of: in, ft, yd, mi");
	System.out.println("I will convert your input into the other units.");
	System.out.println("of measure.");
	System.out.println();
        
        do {
            // Get input for units and convert to lower case
            
            System.out.print ("Enter your measurement, or 0 to end: ");
            measurement = cin.nextDouble();
            units = cin.nextLine();
            units = units.toLowerCase();
            units = units.trim();
            
            if (measurement > 0) {
                // convert input measurement to inches
		if (units.equals("inch") || units.equals("inches") || units.equals("in")) {
		inches = measurement;
                }
		else if (units.equals("foot") || units.equals("feet") || units.equals("ft")) {
                    inches = measurement * 12;
		}
		else if (units.equals("yard") || units.equals("yards") || units.equals("yd")) {
                    inches = measurement * 36;
		}
		else if (units.equals("mile") || units.equals("miles") || units.equals("mi")) {
                    inches = measurement * 12 * 5280;
		} 
		else {
                    System.out.println("Sorry, but I don't understand \"" + units + "\".");
                    continue;  // back to start of while loop since units is undefined
		}
			
		// convert measurement into yards, feet, and miles (inches is already done)
			
		feet = inches / 12;
		yards = inches / 36;
		miles = inches / (12 * 5280);
			
		// Output the measurement in each type of unit
			
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
            } else if (measurement < 0) {
                System.out.println("Enter a positive measurement!");
            }
            
        } while (measurement != 0);  // end of do...while
        
        System.out.println();
        System.out.println("OK! Bye for now!");
        
    } // end of main
    
} // end of program (class Java_Unit_Converter)
