/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputtest;

import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 */
public class InputTest {

    public static void main(String[] args) {
        
        Scanner cin= new Scanner(System.in); //enables input from user using Scanner
        
        String word; 
        int number; 
        double decNum;
        
        System.out.println("Using the Scanner function and System.in to handle user input!\n");
        System.out.print("Enter a word or text: ");
        word = cin.nextLine();
        
        System.out.print("Enter a whole number (integer): ");
        number = cin.nextInt();
        
        System.out.print("Enter a number with a decimal point: ");
        decNum = cin.nextDouble();
        
        System.out.println("You entered the name: " + word);
        System.out.println("You entered the number: " + number);
        System.out.println("You entered the decimal point number: " + decNum);
        
        
        /* More Scanner info:
        To create an object of Scanner class, we usually pass the predefined 
            object System.in, which represents the standard input stream. 
            We may pass an object of class File if we want to read input 
            from a file.
        To read numerical values of a certain data type XYZ, the function to 
            use is nextXYZ(). For example, to read a value of type short, we 
            can use nextShort()
        To read strings, we use nextLine().
        To read a single character, we use next().charAt(0). next() function 
            returns the next token/word in the input as a string and charAt(0) 
            funtion returns the first character in that string.
        */
  
        // Character input 
        System.out.print("Enter a character (letter): ");
        char letter = cin.next().charAt(0); 

        System.out.println("Input charactyer: "+letter);  
        
        
        /* 
        Sometimes, we have to check if the next value we read is of a 
            certain type or if the input has ended (EOF marker encountered).
        
        Then, we check if the scanner’s input is of the type we want with the 
            help of hasNextXYZ() functions where XYZ is the type we are 
            interested in. The function returns true if the scanner has a 
            token of that type, otherwise false. For example, in the above 
            code, we have used hasNextInt().To check for a string, we use 
            hasNextLine(). Similarly, to check for a single character, we 
            use hasNext().charAt(0).
        
        Let us look at the code snippet to read some numbers from console and 
            print their mean.
        */
        
        // Initialize sum and count of input elements 
        int sum = 0, count = 0; 
  
        System.out.println("Enter integers to be added and the mean determined: ");
        System.out.println("     (Enter a non-integer value to cease input)");
        // Check if an int value is available 
        while (cin.hasNextInt()) 
        { 
            // Read an int value 
            int num = cin.nextInt(); 
            sum += num; 
            count++; 
        } 
        int mean = sum / count; 
        System.out.println("Mean: " + mean); 
    }
    
}