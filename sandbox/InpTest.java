import java.util.Scanner;

/**
 *
 * @author scott_r_parker
 */

public class InpTest {

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
        
    }
    
}
