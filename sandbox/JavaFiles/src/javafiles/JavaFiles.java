/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafiles;
import java.io.*;

/**
 *
 * @author scott_r_parker
 * IDE: NetBeans
 * Date: June 25, 2019
 * 
 */
public class JavaFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The name of the file to open. The file
        // is located in the main project directory
        String fileName = "texttest.txt";

        // This will reference one line at a time
        String fline = null;
        System.out.println("Reading File: " + fileName);
        System.out.println();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fRead = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fRead);

            while((fline = bufferedReader.readLine()) != null) {
                System.out.println(fline);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        System.out.println();
        
        // Text file lorem is located in the javafiles directory in project
        // This is specific to netbeans. The file is in the same directoyr as
        // the projects main .java file
        fileName = "src/javafiles/lorem.txt";
        System.out.println("Reading file: " + fileName);
        System.out.println();

        try {
            // FileReader reads text files in the default encoding.
            FileReader fRead = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fRead);

            while((fline = bufferedReader.readLine()) != null) {
                System.out.println(fline);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    
}
