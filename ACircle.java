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
public class ACircle extends Canvas {
   public void paint( Graphics g ){
    g.setColor(Color.green);
    g.fillOval(0,0,200,200);
    
}
   public static void main(String[] args){
       JFrame mawutor = new JFrame("This is a circle");
       mawutor.setSize(800,600);
       mawutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ACircle psalms = new ACircle();
       mawutor.add(psalms);
       mawutor.setVisible(true);
   }
}
