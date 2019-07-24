/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Draw a checkerboard with scene width of 400 and scene height of 400. It should
have 8 rows and 8 columns. The colors of each square should alternate to make a 
checkerboard pattern.
 *
 */
package chap3prob8;

//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


/**
 *
 * @author scott_r_parker
 * IDE: NetBeans 8.2
 * Date: July 24, 2019
 * 
 */
public class Chap3Prob8 extends Application {

    /**
     * Draws a picture.  The parameters width and height give the size 
     * of the drawing area, in pixels.  
     */
    public void drawPicture(GraphicsContext g, int width, int height) {

        g.setFill(Color.WHITE);
        g.fillRect(0, 0, width, height); // First, fill the entire image with a background color.

        // As an example, draw a large number of colored disks.
        // To get a different picture, just erase this code, and substitute your own. 
        int i;
        int j;
        
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++ ) {
                if ((j + i) % 2 == 0) {
                    g.setFill(Color.SILVER);
                } else {
                    g.setFill(Color.BLACK);
                }
                g.fillRect((i*50), (j*50), 50, 50);
            }
        
        }

    } // end drawPicture()

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public void start(Stage stage) {
        int width = 400;   // The width of the image.  You can modify this value!
        int height = 400;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simple Graphics"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
    } 

    public static void main(String[] args) {
        launch();
    }

} // end SimpleGraphicsStarter
