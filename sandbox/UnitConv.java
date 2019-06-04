/*
	This program will convert measurements expressed in inches, feet, 
	yards, or miles into the other units. The measurement is input by
	the user, followed by the unit of measure. For example: "17 feet",
	"1 inch", or "2.73 mi". The abbreviations "in", "ft", "yd", and 
	"mi" are accepted. The program will continue to read and convert
	measurements until the user inputs a value of 0.
*/

/*
	Author:  Scott Parker
	Date: June 1, 2019
	IDE: Terminal 
*/


import java.util.Scanner;

public class UnitConv {
	public static void main (String[] args) {
	
		Scanner cin = new Scanner(System.in);
		
		double measurement; // Original measurement value input by user
		String units;  // The unit of measure for the input, also user specified
		
		double inches, feet, yards, miles; // Variables to hold the converted value of
										   // Measurement into the alternate types
		
		System.out.println("Enter a measurement in inches, feet, yards, or miles.");
		System.out.println("For example: '1 inch', '17 feet', or '2.73 miles'");
		System.out.println("You can use the abbreviations of: in, ft, yd, mi");
		System.out.println("I will convert your input into the other units.");
		System.out.println("of measure.");
		System.out.println();
		
		while (true) {
			/* Get user's input, convert units to lower case. */
			System.out.print("Enter your measurement, or 0 to exit:  ");
			measurement = cin.nextDouble();
			if (measurement == 0) {
				break; //exit since 0 was entered
			}
			units = cin.nextLine();
			units = units.toLowerCase(); //convert units to lower case
			units = units.trim();
			
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
			
		} // end of while loop
		
		System.out.println();
		System.out.println("OK! Bye for now.");
		
	} // end main()
} // end of class UnitConv


