/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10528808;

/**
 *
 * @author Mawutor
 */
import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 400, 400, 50, 30 );
		drawBox( window, Color.BLUE,  200, 400, 200, 200 );
                drawBox( window, Color.GREEN,  240, 210, 70, 150 );
                drawBox( window, Color.CYAN,  400, 340, 90, 120 );
                drawBox( window, Color.ORANGE,  120, 270, 60, 50 );
                drawBox( window, Color.RED,  400, 190, 50, 550 );
                drawBox( window, Color.BLACK,  120, 230, 20, 100 );
                drawBox( window, Color.GRAY,  100, 200, 20, 350 );
                drawBox( window, Color.DARK_GRAY,  421, 420, 40, 70 );

		// draw six more boxes -- different colors, different places, different sizes
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
            window.setColor(c);
		window.fillRect(x,y,100,100);
		// add code to draw a WxH box in color c at (x,y)
                window.setColor(Color.CYAN);
		window.fillRect(x+10,y+10,80,80);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.blue);
		win.add( canvas );
		win.setVisible(true);
	}
}
