/*
 *Program to test the book Java Notes 7 author's TextIO class to write to a file
 *and to test getting user input with the same author-created class
 */
package createprofile;

/**
 *
 * @author scott_r_parker
 * Created on: October 8, 2018
 * 
 */
public class CreateProfile {

    public static void main(String[] args) {
        String name;        //string to hold user's name
        String email;       //string to hold user's email address
        double income;      //double to hold user's annual income
        String favColor;    //string to hold the user's favorite color
        
        TextIO.putln("Good Afternoon!  This program will create");
        TextIO.putln("your profile file, if you will just answer");
        TextIO.putln("a few simple questions.");
        TextIO.putln();
        
        /* Get input from user */
        
        TextIO.put("What is your name?              ");
        name = TextIO.getln();
        TextIO.put("What is your email address?     ");
        email = TextIO.getln();
        TextIO.put("What is your yearly income?    $");
        income = TextIO.getlnDouble();
        TextIO.put("What is your favorite color?    ");
        favColor = TextIO.getln();
        
        /* Write the user's information to the file named profile.txt */
        
        TextIO.writeFile("yprofile.txt");  //Subsequent output is directed to the file
        TextIO.putln("Name:             " + name);
        TextIO.putln("Email:            " + email);
        TextIO.putln("Favorite Color:   " + favColor);
        TextIO.putf( "Yearly Income:$   %,1.2f%n", income);
        
        /* Print message to standard output. */
        
        TextIO.writeStandardOutput();
        TextIO.putln("Thank you. Your profile has been written to yprofile.txt.");
        
    }
    
}
