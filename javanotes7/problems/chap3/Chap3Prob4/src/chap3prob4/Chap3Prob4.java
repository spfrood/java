/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Write a program that reads one line of input text and breaks it up into words.
The words should be output one per line. A word is defined to be a sequence of letters.
Any characters in the input that are not letters should be discarded. For example, 
if the user inputs the line
    He said, "That's not a good idea."
then the output should be
    He
    said
    That
    s
    not
    a
    good
    idea

An improved version of the program would list "that's" as a single word. An 
apostrophe can be considered to be part of a word if there is a letter on each 
side of the apostrophe. 
    To test whether a charater is a letter, you might use (ch >= 'a' && ch <= 'z') 
|| (ch >= 'A' && ch <= 'Z'). However, this only works in English and similar languages.
A better choice is to call the standard function Character.isLetter(ch), which returns
a boolean value of true if ch is a letter and false is not. This works for any Unicode
character.
 *
 */

package chap3prob4;
import java.util.Scanner;


/**
 *
 * @author scott_r_parker
 * IDE: NetBeans 8.2
 * Date: July 23, 2019
 * 
 */
public class Chap3Prob4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cin = new Scanner (System.in);
        
        String phrase;
        
        System.out.print("Enter a one-line phrase: ");
        phrase = cin.nextLine();
        System.out.println();
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isLetter(phrase.charAt(i))) {
                System.out.print(phrase.charAt(i));
            }  else if (phrase.charAt(i) == '\'') {
                System.out.print("'");
            } else {
                if (phrase.charAt(i) == ' ')  {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
    
}
