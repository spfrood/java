/*
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
package chap2prob7;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans
 * Date: October 10, 2018
 * 
 */
public class Chap2prob7 {

    public static void main(String[] args) {
        String name;
        int test1, test2, test3;
        double average;
        
        TextIO.readFile("mstestdata.txt");  // Read from the file.
        name = TextIO.getln();
        test1 = TextIO.getlnInt();
        test2 = TextIO.getlnInt();
        test3 = TextIO.getlnInt();
        
        average = (test1 + test2 + test3)/3.0;
        
        System.out.printf("The average grade for %s was %1.2f", name, average);
        System.out.println();
        
    }
    
}
