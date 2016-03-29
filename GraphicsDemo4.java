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
import java.awt.Polygon;

public class GraphicsDemo4 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.black);
		g.drawString("Hey, a triangle!", 50, 50);
		
		Polygon tri = new Polygon();
		tri.addPoint(100, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);
		
		g.setColor(Color.blue);
		g.fillPolygon(tri);
		
		Polygon pent = new Polygon();
		pent.addPoint(450, 200);
		pent.addPoint(500, 250);
		pent.addPoint(475, 350);
		pent.addPoint(425, 350);
		pent.addPoint(400, 250);
		
		g.setColor(Color.green);
		g.fillPolygon(pent);

		Polygon hex = new Polygon();
				
		// use trig to make a regular hexagon
		int radius = 100; // pixels
		int xCenter = 200;
		int yCenter = 500;
		for ( double ang = 0; ang<2*Math.PI; ang=ang+(2*Math.PI)/6.0)
		{
			double xDelta = radius * Math.cos(ang);
			double yDelta = -radius * Math.sin(ang);
			hex.addPoint(xCenter+(int)xDelta, yCenter+(int)yDelta);
		}

		g.setColor(Color.black);
		g.fillPolygon(hex);
	}
	
	public static void main(String[] args)
	{
		JFrame win = new JFrame("Polygon Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new GraphicsDemo4() );
		win.setVisible(true);
	}

}

