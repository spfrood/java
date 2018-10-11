/*  
     A program to test using TextIO class as input method from console
     The stereotypical first program "Hello World!" printed to the screen
*/


/*   Written by Scott Parker
	 Date:  October 9, 2018
	 IDE: Console/terminal
*/

public class TxtIOTest {

	public static void main (String[] args) {
	
		String someText;  // A string variable
		String moreText;  // An additional string variable
		int someNum;      // An int variable
		double someDec;   // A double variable
		
		System.out.println("Input a string longer than one word:");
		someText = TextIO.getln();  // Check to see if TextIO grabs the entire line
		System.out.println("Input a string longer than one word to see what is grabbed:");
		moreText = TextIO.getlnWord();
		TextIO.putln("Enter an int type number:");
		someNum = TextIO.getInt();
		TextIO.putln("Enter a double type number:");
		someDec = TextIO.getlnDouble();
		
		TextIO.putln("You entered the string: " + someText);
		System.out.println("You entered the word: " + moreText);
		TextIO.putln("The integer was: " + someNum);
		System.out.printf("The decimal number was: %,1.4f %n", someDec);
				
	}
}  //End of class TxtIOTest


