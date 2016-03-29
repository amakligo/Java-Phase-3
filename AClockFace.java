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
public class AClockFace extends Canvas
{
    public void paint( Graphics g )
	{
        g.setColor(Color.WHITE);
        g.fillOval(0,0,300,300);
        g.setColor(Color.black);
        g.drawString("12",150,10 );
        g.drawString("9",0,150 );
        g.drawString("3",290,150 );
        g.drawString("6",150,290 );
        g.fillOval(150, 150, 5, 5);
        g.drawString("1",230,40 );
        g.drawString("2",270,90 );
        g.drawString("4",270,220 );
        g.drawString("5",230,270 );
        g.drawString("8",20,220 );
        g.drawString("7",70,270 );
        g.drawString("11",50,45 );
        g.drawString("10",15,95 );
        g.drawRect(152, 150, 0, 120);
        g.drawRect(152, 100, 0, 60);
        
	}

	

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("A Clock Face");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new AClockFace() );
		win.setVisible(true);
	}

}
