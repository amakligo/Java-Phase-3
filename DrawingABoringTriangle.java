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

public class DrawingABoringTriangle extends Canvas
{
    public void paint ( Graphics g)
    {
        Polygon tri = new Polygon();
		tri.addPoint(100, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);
                g.setColor(Color.cyan);
		g.fillPolygon(tri);
		
    }
    public static void main(String[] args)
	{
		JFrame win = new JFrame("Polygon Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new DrawingABoringTriangle() );
		win.setVisible(true);
	}
    
}
