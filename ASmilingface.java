/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10528808;

/**
 *
 * @author Mawutor
 */import javax.swing.JFrame;   
import java.awt.*;
public class ASmilingface extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
            g.setColor(Color.yellow);
            g.fillOval(0,0,300,300);
            g.setColor(Color.blue);
            g.fillOval(45,50,50,50);
            g.fillOval(200,50,50,50);
            g.setColor(Color.red);
            g.fillArc(100,200,100,15,180,180);
        }

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ASmilingface() );
		win.setVisible(true);
	}


}
