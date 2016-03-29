/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10528808;

import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Mawutor
 */
public class DrawingRandomRightTriangles 
{
     Random r= new Random();
    int x= r.nextInt(500)+100;
    int y=r.nextInt(500)+100;
    int color=r.nextInt(3);
     public void paint ( Graphics g)
    {
        int n =0;
        while(n==0)
        {
            
    Random r= new Random();
    int x= r.nextInt(500)+100;
    int y=r.nextInt(500)+100;
    int color=r.nextInt(3);
    n++;
        Polygon tri = new Polygon();
		tri.addPoint(100+y, 100+y);
		tri.addPoint(100+y, 300+y);
		tri.addPoint(200+y, 300+y);
                
                if(color==1){
                        g.setColor(Color.red);
                        g.fillPolygon(tri);
                        }
                else if(color==2){
                        g.setColor(Color.yellow);
                        g.fillPolygon(tri);
                        }
                else if(color==3){
                        g.setColor(Color.blue);
                        g.fillPolygon(tri);
                        }
                  else if(color==0){
                        g.setColor(Color.cyan);
                        g.fillPolygon(tri);
                        }
                   
        }
		
    }
      public static void main(String[] args)
	{
            
		JFrame win = new JFrame("Polygon Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new DrawingRandomTriangles() );
		win.setVisible(true);
	}
}
