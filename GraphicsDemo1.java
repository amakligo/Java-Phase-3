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
public class GraphicsDemo1 extends Canvas {
    
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.drawRect(50, 120,100,200);// draw a rectangle
        g.fillOval(160,20,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20);
        g.drawOval(200,4300,200,100);
        g.setColor(Color.red);
        g.fillOval(500, 350, 100, 200);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.",500,100 );
        int x  = getWidth() /2;
        int y  = getHeight()/ 2;
        g.drawString("The first letter if this sting is  at (" + x + "," +y + ")",x,y );
        
   }           
    public static void main(String[] args){
        JFrame  mawutor  = new JFrame("yes");
        mawutor.setSize(800,600);
        mawutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 psalms  = new GraphicsDemo1();
        mawutor.add(psalms);
        mawutor.setVisible(true);
    }
     
    }      
