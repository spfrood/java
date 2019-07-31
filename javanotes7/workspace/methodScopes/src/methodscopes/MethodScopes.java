/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodscopes;

/**
 *
 * @author scott_r_parker
 */
public class MethodScopes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1 = 1111;
        String phrase1 = "Nantucket Shores";
        System.out.println("Values of variables before calling method:");
        System.out.println("Value of var1: " + var1);
        System.out.println("Value of phrase1: " + phrase1);
        scopeTest(var1, phrase1);
        System.out.println("Values of variables after calling method:");
        System.out.println("Value of var1: " + var1);
        System.out.println("Value of phrase1: " + phrase1);
        
    }
    
    static void scopeTest (int passed, String sPassed) {
        System.out.println("Values of variables/parameters inside the method: ");
        System.out.println("The value of passed is: " + passed);
        System.out.println("The value of sPassed is: " + sPassed);
        passed = 222; 
        sPassed = "Bellvue Reeves";
        System.out.println("passed is now: " + passed);
        System.out.println("sPassed is now: " + sPassed);
        
    }
    
}
