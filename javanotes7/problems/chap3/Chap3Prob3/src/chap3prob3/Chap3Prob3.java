/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Write a program that will evaluate simple expressions such as 17 + 3 and 3.1415 * 4.7.
The expressions are to be typed in by the user. The input always consists of a number, 
followed by an operator, followed by another number. The operators that are allowed are
+, -, *, and /. Your program should read an expression, print its value, read another
expression, print its value, and so on. The program should end when the user enters 0 as
the first number on the line.
 *
 */

package chap3prob3;
import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans 8.2
 * Date: July 23, 2019
 * 
 */
public class Chap3Prob3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1;
        double num2;
        double total;
        char oper;
        
        while (true) {
            System.out.println("Only use +, -, *, or / for operators. Format must be: ");
            System.out.println(" 'number1 * number2' or 'number1 / number2' etc  ");
            System.out.print("Enter your expression to be evaluated, or 0 to exit: ");
            
            Scanner cin = new Scanner(System.in);
            num1 = cin.nextDouble();
            if (num1 == 0) {
                break;
            }
            oper = cin.next(".").charAt(0);
 //           System.out.println("OPERATOR IS " + oper);
            if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
                System.out.println("Parsing buffer to find operator");
                while (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
                    oper = cin.next(".").charAt(0);
                }
            }
            num2 = cin.nextDouble();
//            
//            switch ( oper ) {
//                case '+':
//                    total = num1 + num2;
//                    break;
//                case '-':
//                    total = num1 - num2;
//                    break;
//                case '*':
//                    total = num1 * num2;
//                    break;
//                case '/':
//                    total = num1 / num2;
//                    break;
//                default:
//                    System.out.println("Invalid Operator! Use +, -, *, or / only!");
//                    total = 0;
//                    continue;
//            } // end switch
//
//
            if (oper == '*') {
                total = num1 * num2;
                System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
            } else if (oper == '+') {
                total = num1 + num2;
                System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
            } else if (oper == '-') {
                total = num1 - num2;
                System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
            } else if (oper == '/') {
                total = num1 / num2;
                System.out.println(num1 + " " + oper + " " + num2 + " = " + total);
            } else {
                System.out.println("Invalid Operator! Use +, -, *, or / only!");
                total = 0;
            }
        }
    }        
}
