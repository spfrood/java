/*  
     A program to output characters from 0 to Z
     
     Author: Scott Parker
     Date: May 28, 2019
     IDE: Command Line
     
*/

public class ChPrint {
     public static void main (String[] args) {
     
     	  char ch;
          System.out.println("All characters from 0 to Z");
          
          for (ch = '0'; ch <= 'Z'; ch++) {
          	System.out.print(ch + " ");
          }
          System.out.println();
          
          ch = 0;
          System.out.println("All values for the ch datatype");
          do {
          	System.out.print (ch + " ");
          	ch++;
          } while (ch < 255);
          System.out.println();
          
     }
}  //End of class HelloWorld


