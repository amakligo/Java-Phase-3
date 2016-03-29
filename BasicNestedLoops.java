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

public class BasicNestedLoops 
{
    public static void  main(String[] arg)
    {
        for(int i =0;i<=5;i++)
        {
            for(int y=0;y<=i;y++)
            {
                System.out.println("("+i+","+y+")");
            }
        }
    }
}
