/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Playing around with command line arguments in NetBeans
 *
 */
package javacommandline;

/**
 *
 * @author scott_r_parker
 * IDE: Netbeans 8.2
 * Date: July 31, 2019
 * 
 */
public class JavaCommandLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("You entered " + args.length + " command-line arguments.");
        if (args.length > 0) {
            System.out.println("They were: ");
            for (int i = 0; i < args.length; i++) {
                System.out.println("\t" + args[i]);
            }
        } //endif
    } //end main()
    
} //end class JavaCommandLine
