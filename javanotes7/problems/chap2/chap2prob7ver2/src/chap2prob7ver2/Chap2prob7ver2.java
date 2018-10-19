/*
 * VERSION 2 USING SCANNER
 * program to use TextIO to read data from a 3-line file:
 * String
 * integer
 * integer
 * integer
 * 
 * The program will then output to standard output the student's 
 * name (the string) and the average of the 3 integers (test scores)
 * 
 */
package chap2prob7ver2;

import java.io.File;
import java.util.Scanner;

/**
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 10, 2018
 **/

public class Chap2prob7ver2 {

    public static void main(String[] args) {
        try {
            
            String name;
            int test1, test2, test3;
            double average;
        
            File file = new File("jstestdata.txt");
            Scanner fileIn = new Scanner(file);
       
            name = fileIn.nextLine();
            test1 = fileIn.nextInt();
            test2 = fileIn.nextInt();
            test3 = fileIn.nextInt();
                
            average = (test1 + test2 + test3)/3.0;
            System.out.printf("The average grade for %s was %1.2f", name, average);
            System.out.println();
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
