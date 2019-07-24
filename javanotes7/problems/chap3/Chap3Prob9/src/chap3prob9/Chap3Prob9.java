/*
 * You have entered a maze, twisty little passages 
 * alike.
 * 
 * Often, some element of an animation repeats over and over, every so many frames. 
Some- times, the repetition is “cyclic,” meaning that at the end it jumps back to 
the start. Sometimes the repetition is “oscillating,” like a back-and-forth motion 
where the second half is the same as the first half played in reverse.

Write an animation that demonstrates both cyclic and oscillating motions at various 
speeds. For cyclic motion, you can use a square that moves across the drawing area, 
then jumps back to the start, and then repeats the same motion over and over. For 
oscillating motion, you can do something similar, but the square should move back 
and forth between the two edges of the drawing area; that is, it moves left-to-right 
during the first half of the animation and then backwards from right-to-left during 
the second half. To write the program, you can start with a copy of the sample program 
SimpleAnimationStarter.java.

A cyclic motion has to repeat every N frames for some value of N. What you draw 
in some frame of the animation depends on the frameNumber. The frameNumber just 
keeps increasing forever. To implement cyclic motion, what you really want is a 
“cyclic frame number” that takes on the values 0, 1, 2, ..., (N-1), 0, 1, 2, ..., 
(N-1), 0, 1, 2, .... You can derive the value that you need from frameNumber simply 
by saying 

    cyclicFrameNumber = frameNumber % N; 

Then, you just have to base what you draw on cyclicFrameNumber instead of on frameNumber. 
Similarly, for an oscillating animation, you need an “oscillation frame number” that 
takes on the values 0, 1, 2, ...(N-1), N, (N-1), (N-2), ...2, 1, 0, 1, 2, and so on, 
repeating the back and forth motion forever. You can compute the value that you need 
with

    oscilationFrameNumber = frameNumber % (2*N);
    if (oscillationFrameNumber > N)
        oscillationFrameNumber = (2*N) - oscillationFrameNumber;
 *
 */
package chap3prob9;

//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;

import javafx.animation.AnimationTimer;
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

public class Chap3Prob9 extends Application {

    /**
     * Draws one frame of an animation. This subroutine should be called
     * about 60 times per second.  It is responsible for redrawing the
     * entire drawing area. The parameter g is used for drawing. The frameNumber 
     * starts at zero and increases by 1 each time this subroutine is called.  
     * The parameter elapsedSeconds gives the number of seconds since the animation
     * was started.  By using frameNumber and/or elapsedSeconds in the drawing
     * code, you can make a picture that changes over time.  That's an animation.
     * The parameters width and height give the size of the drawing area, in pixels.  
     */
    public void drawFrame(GraphicsContext g, int frameNumber, double elapsedSeconds, int width, int height) {

        /* NOTE:  To get a different animation, just erase the contents of this 
         * subroutine and substitute your own. 
         */
        
        g.setFill(Color.WHITE);
        g.fillRect(0, 0, width, height); // First, fill the entire image with a background color!

        g.setFill(Color.BLACK);
        g.fillText( "Frame number " + frameNumber, 24, 340 );
        g.fillText( String.format("Elapsed Time: %1.1f seconds", elapsedSeconds), 200, 340);
        
        g.setStroke(Color.BLACK);
        g.setLineWidth(4);
        g.strokeLine(0, 0, 600, 0);
        g.strokeLine(0, 54, 600, 54);
        g.strokeLine(0, 108, 600, 108);
        g.strokeLine(0, 162, 600, 162);
        g.strokeLine(0, 216, 600, 216);
        g.strokeLine(0, 270, 600, 270);
        g.strokeLine(0, 324, 600, 324);
        
        // The cyclic moving rectangles
        
        // slow speed - 1 pixel per frame
        g.setFill(Color.AQUAMARINE);
        g.fillRect((frameNumber % 600), 2, 50, 50);
        
        // Faster speed - 2 pixels per frame
        g.setFill(Color.CORNSILK);
        g.fillRect((frameNumber*2 % 600), 56, 50,50);
        
        // fastest speed - 3 pixels per frame
        g.setFill(Color.DARKGREY);
        g.fillRect((frameNumber*3 % 600), 110, 50,50);
        
        // The oscilating moving rectangles
        int oscFrame;
        
        // oscillate at 1 pixel per frame
        oscFrame = frameNumber % 1200;
        if (oscFrame > 600) {
            oscFrame = 1200 - oscFrame;
        }
        g.setFill(Color.CYAN);
        g.fillRect(oscFrame, 164, 50, 50);
        
        // oscillate at 2 pixels per frame
        g.setFill(Color.DEEPPINK);
        oscFrame = frameNumber*2 % 1200;
        if (oscFrame > 600) {
            oscFrame = 1200 - oscFrame;
        }
        g.fillRect(oscFrame, 218, 50, 50);
        
        // oscillate at 3 pixels per frame
        g.setFill(Color.ORCHID);
        oscFrame = frameNumber*3 % 1200;
        if (oscFrame > 600) {
            oscFrame = 1200 - oscFrame;
        }
        g.fillRect(oscFrame, 272, 50, 50);
        
        
    }

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public void start(Stage stage) {
        int width = 600;   // The width of the image.  You can modify this value!
        int height = 348;  // The height of the image. You can modify this value!
        Canvas canvas = new Canvas(width,height);
        drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("cyclic vs oscilating"); // STRING APPEARS IN WINDOW TITLEBAR!
        stage.show();
        stage.setResizable(false);
        AnimationTimer anim = new AnimationTimer() {
            private int frameNum;
            private long startTime = -1;
            private long previousTime;
            public void handle(long now) {
                if (startTime < 0) {
                    startTime = previousTime = now;
                    drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
                }
                else if (now - previousTime > 0.95e9/60) {
                       // The test in the else-if is to guard against a bug that has shown
                       // up in some versions of JavaFX on some computers.  The bug allows
                       // the handle() method to be called many times more than the 60 times
                       // per second that is specified in the JavaFX documentation.
                    frameNum++;
                    drawFrame(canvas.getGraphicsContext2D(), frameNum, (now-startTime)/1e9, width, height);
                    previousTime = now;
                }
            }
        };
        anim.start();
    } 

    public static void main(String[] args) {
        launch();
    }
    
} // end SimpleAnimationStarter
