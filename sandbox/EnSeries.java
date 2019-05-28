import java.util.Scanner;

/*  
     Program to test algorithm development using the description on P93 of
     Java Notes 7.
     
     Written by:  Scott Parker
     Date:   May 28, 2019
     API:  Console text
     
*/

public class EnSeries {

     public static void main (String[] args) {
     
     	  //global variables
     	  
     	  Scanner cin = new Scanner(System.in); // to be able to get input from user
     	  int inputN = 0;
     	  int counter = 0;
     	  
          System.out.println("Input a positive integer as starting point:  ");
          inputN = cin.nextInt();
          
          System.out.print("The complete sequence is: " + inputN + ", ");
          while (inputN > 0 && inputN != 1) {
             if (inputN % 2 == 0) 
             	inputN = inputN / 2;
             else 
             	inputN = (inputN * 3) + 1;
             counter++;
             System.out.print(inputN + ", ");
          }
          
          System.out.println("");
          System.out.println("The total number of terms was: " + counter);
          
     }
}  //End of class EnSeries


