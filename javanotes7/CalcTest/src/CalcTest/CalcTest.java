/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcTest;

/**
 *
 * @author scott_r_parker
 */
public class CalcTest {
    
    public static void main(String[] args) {
        int cir = 22;
        int rad = 7;
        int temp;
        int counter = 2;
        int rounds = 0;
        
        System.out.print(cir/rad + ".");
        cir = cir % rad;
        while ((cir % rad != 0) && (rounds<118)) {
            System.out.print(cir*10/rad);
            cir = (cir*10) % rad;
            counter++;
            rounds++;
            if (counter==30) {
                counter=0;
                System.out.println();
            }
        }
        System.out.println();
    }
    
} //end of class CalcTest
